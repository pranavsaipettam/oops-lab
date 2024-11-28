#include<iostream>
#include<string>
using namespace std;

class Bank{
    private:
    string name;
    int accno;
    double balance;

    public:
    Bank(string name,int accno, double balance){
        this->name=name;
        this->accno=accno;
        this->balance=balance;
    }

    void showBalance(){
        cout<<"balance is: "<<balance<<endl;
    }

    void deposit(double amount){
        balance+=amount;
    }
    void withdrawl(double amount){
        if(balance<amount){
            cout<<"insufficent funds"<<endl;
        }
        else{
            balance=balance-amount;
        }
    }
};
int main(){
    Bank b1("nan",1234,1000);
    b1.deposit(5000);
    b1.showBalance();
    b1.deposit(10000);
    b1.showBalance();
    b1.withdrawl(2000);
    b1.showBalance();



}