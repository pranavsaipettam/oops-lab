#include<bits/stdc++.h>
using namespace std;
class B;

class A{
    int a;
    friend int mean(A,B);
    public:
    A (int n):a(n){}
    /*{ 
        a=n;
    }*/
};
class B{
    int b;
    friend int mean(A,B);
    public:
    B (int n):b(n){}
};

int mean(A o1,B o2){
    return (o1.a+ o2.b)/2;
}

int main(){
    A a(10);
    B b(20);
    cout<<"mean is "<<mean(a,b)<<endl;
return 0;
}