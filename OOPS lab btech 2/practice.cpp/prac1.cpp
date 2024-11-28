#include<iostream>
#include<string>
using namespace std;

class Person{
    private:
    int miners=1000,toasters=200,fans=100;

    public:
    int mi,to,fan;
    float cost;

    void getData(){
        cout<<"enter mi,to,fan"<<endl;
        cin>>mi>>to>>fan;
    }
    void total(){
        cost=mi*miners + to*toasters + fans*fan;
        cout<<"cost is "<<cost<<endl;
    }
};
int main(){
    Person p1;
    p1.getData();
    p1.total();
    return 0;
    
}