#include<iostream>
using namespace std;

int n,m,p;
struct items{
   int mi=1500;
   int t=200;
   int fans=450;
}c;
float total(struct items s){
    float price=((n*s.mi)*0.95) + ((m*s.t)*0.9) + ((p*s.fans)*0.85);
    price= price + price*0.1;
    return price;
}

int main(){
    n=10;
    m=5;
    p=6;
    cout<<total(c)<<endl;

}
