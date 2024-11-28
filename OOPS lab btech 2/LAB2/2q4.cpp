#include<iostream>
#include<string>
using namespace std;

class Student{
    private:
    int admno;
    string name;
    float marksEng;
    float marksMath;
    float marksSci;
    float total;
    void compute(){
        total= marksEng+ marksMath +marksSci;
        cout<<"total is"<<total<<endl;
            }
    public:
    void readData(){
        cout<<"Enter admNo: "<<endl;
        cin>>admno;
        cout<<"Enter name: "<<endl;
        cin>>name;
        cout<<"Enter marksEng: "<<endl;
        cin>>marksEng;
        cout<<"Enter marksMath: "<<endl;
        cin>>marksMath;
        cout<<"Enter marksSci: "<<endl;
        cin>>marksSci;
        

    }
    void showData(){
        cout<<" admNo: "<<admno<<endl;
        
        cout<<" name: "<<name<<endl;
       
        cout<<"marksEng: "<<marksEng<<endl;
        
        cout<<" marksMath: "<<marksMath<<endl;
        
        cout<<" marksSci: "<<marksSci<<endl;
        compute();
    }

};
int main(){
    Student s1;
    s1.readData();
    s1.showData();
}