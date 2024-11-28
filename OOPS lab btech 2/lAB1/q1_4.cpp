#include<iostream>
#include<string>
using namespace std;

struct person{
    string name;
    int calls;
    float cost;

    void details(){
        cout<<"enter name: "<<endl;
        cin>>name;
        cout<<"enter calls: "<<endl;
        cin>>calls;
    }

    double bill(){
        
        if(calls<=100) return cost=200;
        else if(calls<=150) return cost= 200+ (calls-100)*0.6;
        else if(calls<=200) return cost= 200+ 0.6*50 + (calls-150)*0.5;
        else return cost= 200+ 50*0.6 + 50*0.5+ (calls-200)*0.4;
    }
    void output(){
        cout<<"the name is"<<name<<endl;
        cout<<"the bill amount is "<<cost<<endl;
    }
};

int main(){
    struct person x;
    x.details();
    x.bill();
    x.output();

    return 0;




}