#include<iostream>
#include<string>
using namespace std;

class Person{
    public:
    string name;
    int age;

    
};


class Student : public Person{
    public:
        int rollno;

    Student(string name,int age,int rollno){
        this->age=age;
        this->name=name;
        this->rollno=rollno;
    }

    void getInfo(){
        cout<<"the name is: "<<name<<endl;
        cout<<"the age is: "<<age<<endl;
        cout<<"the rollno: "<<rollno<<endl;

    }
};

int main(){
    Student s1("nani",20,58);
    s1.getInfo();

}