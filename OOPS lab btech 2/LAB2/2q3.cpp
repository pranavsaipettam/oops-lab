#include<iostream>
#include<string>
using namespace std;

class Data{
    private:
    int day,month,year;
    public:
    Data(){
        cout<<"Non parameterized constructor"<<endl;
        this->day=12;
        this->month=3;
        this->year=1993;
    }
    Data(int day, int month,int year){
        cout<<"parameterized constructor"<<endl;
        this->day=day;
        this->month=month;
        this->year=year;
    }
    Data(Data &D){
        cout<<" A copy constructer is used "<<endl;
        this->day=D.day;
        this->month=D.month;
        this->year=D.year;
    }
    void print(){
        cout<<"Date is: "<<day<<"-"<<month<<"-"<<year<<endl;
        }
};

int main(){
    Data D1;
    D1.print();
    Data D2(12,10,2000);
    D2.print();
    Data D3(D2);
    D3.print();


}