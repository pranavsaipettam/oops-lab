#include<iostream>
#include<string>
using namespace std;

struct person{
    string name;
    double income;
    double tax;

    void input(){
        cout<<"enter name: "<<endl;
        cin>>name;
        cout<<"enter income: "<<endl;
        cin>>income;
    }

    double computeTax(){
        
        if(income<=100000) return tax=0;
        else if(income<=150000) return tax= (income-100000)*0.1;
        else if(income<=200000) return tax= 0.1*150000 + (income-150000)*0.2;
        else return tax= 0.1*50000 + 0.2*50000 + (income-200000)*0.3;
    }
    void output(){
        cout<<"the name is"<<name<<endl;
        cout<<"the taxasish amount is "<<tax<<endl;
    }
};

int main(){
    struct person x;
    x.input();
    x.computeTax();
    x.output();

    return 0;
}