#include<iostream>
#include<string>
using namespace std;

class Teacher{
    private:
    double salary;

    public:
        Teacher(){      //non parameterized
            dept="docse";
        }

        Teacher(string name,string dept,string subject,double salary){
            this->name=name;
            this->dept=dept;
            this->subject=subject;
            this->salary=salary;
        }

        //copy constructor
        Teacher(Teacher &orgObj){
            cout<<"Iam custom copy contructor..."<<endl;
            this->name= orgObj.name;
            this->dept= orgObj.dept;
            this->subject= orgObj.subject;
            this->salary= orgObj.salary;
        }
        void getInfo(){
            cout<<"enter name:"<<name<<endl;
            cout<<"enter dept:"<<dept<<endl;
            cout<<"enter name:"<<subject<<endl;
            
        }
    string name;   //properties or attributes
    string dept;
    string subject;
    
    void changeDept(string newDept){  //method/member func
        dept = newDept;
    }

    void setSalary(double s){  //setter
        salary=s;
    }
    double getSalary(){       //getter
        return salary;
    }
};

int main(){
    Teacher t1;
    t1.name="nani";
    t1.dept="me";

    Teacher t2("ssjaj","doai","c++",40000);
    t2.getInfo();

    t1.setSalary(25000);
    cout<< t1.name<<endl;
    cout<<t1.getSalary()<<endl;

    Teacher t3(t2); //copy constructor

    
    return 0; 
}