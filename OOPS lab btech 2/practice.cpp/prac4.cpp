#include<iostream>
#include<string>
using namespace std;

class complex{
    int a,b;
    friend complex sum(complex o1,complex o2);
    public:
    void getNumber(int n1, int n2){
        a=n1;
        b=n2;
    }
    void print(){
        cout<<"complex number is"<<a<<" + "<<b<<"i"<<endl;
    }
};
complex sum(complex o1,complex o2){
    complex o3;
    o3.getNumber((o1.a+o2.a),(o1.b+o2.b));
    return o3;
}
int main(){
    complex c1,c2,c;
    c1.getNumber(5,2);
    c1.print();
    c1.getNumber(6,3);
    c1.print();

    c=sum(c1,c2);
    c.print();
    
}