#include<bits/stdc++.h>
using namespace std;
class Employee{
    public:
    string name;
    double earnings;
    double bonus;

    void input(string name,double earnings){
        this->name=name;
        this->earnings=earnings;
    }
    void computeBonus(){
        double bonus;
        
        if(earnings>=2000){
            bonus= (0.1)*(earnings);
            cout<<"bonus is "<<bonus<<endl;
        }
        else{
            cout<<"no bonus is provided"<<endl;
        }
        
        
    }
    void print(){
        
        cout<<"name is "<<name<<endl;
        cout<<"earnings is "<<earnings<<endl;
        computeBonus();
    }
};

int main(){
Employee e;
e.input("ashish",100000);
e.print(); 
return 0;
}