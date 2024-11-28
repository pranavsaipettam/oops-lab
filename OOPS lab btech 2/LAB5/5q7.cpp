#include<bits/stdc++.h>
using namespace std;

class Cuboid{
    int l,b,h;
    public:
    Cuboid(int l,int b,int h){
        this->l=l;
        this->b=b;
        this->h=h;
    }
    float sArea(){
        
        return 2*(l*b+b*h+h*l);
    }
};

class cube{
    float side;
    public:
    void output(Cuboid c){
        float areaCubiod= c.sArea();
        side=sqrt(areaCubiod/6);

        cout<<"side of cube is: "<<side<<endl;
    }
};
int main(){
    Cuboid c1(2,3,4);
    cube c2;
    c2.output(c1);
    
return 0;
}