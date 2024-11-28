#include<iostream>
#include<string>
using namespace std;

class Store{    // creating the class
    private:
    const int miners=1500, toasters=200, fans=450;
    double mi,to,fa;

    public:
    Store(int mi,int to,int fa){   //creating a constructor
        this->mi=mi;
        this->to=to;
        this->fa=fa;
    }
    const void bill(){     //creating a fun to calculate bill
        double cost;
        cost= (mi*miners)*0.95 + 0.85*(fa*fans)+ 0.9*to*toasters;
        cost= cost + cost*0.1;
        
        cout<<"The total cost is: "<<cost<<endl;
    }
    
};
int main(){
    // cout<<"Enter the no. of miners, toasters, fans respectively"<<endl;
    // cin>>mi>>to>>fa>>endl;
    // int mi,to,fan;
    Store p1(30,20,30);
    p1.bill();
    return 0;

}