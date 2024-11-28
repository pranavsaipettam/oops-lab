#include<iostream>
using namespace std;

struct rates{
    float cost;
    float limit;
};

float price(struct rates r[], int n, float weight){
    float total;
    if(weight <0){
        total=0;
    }
    else if(weight<=r[0].limit){
        total=r[0].cost*weight;
    }
    else if(weight<=r[1].limit){
        total= 50*r[0].cost + (weight-50)*r[1].cost;
    }
    else if(weight<=r[2].limit){
        total=50*r[0].cost + 100*r[1].cost + (weight-150)*r[2].cost ;
    }
    else{
        total= 50*r[0].cost + 100*r[1].cost + 250*r[2].cost; 
        total+=(weight-400)/1000*r[3].cost;
    }
    return total;
}

int main(){
    struct rates r[4]={
        {0.5/10,50},
        {0.4/10,150},
        {0.25/10,400},
        {25,400},
    };

    float weight=500;
    // cout<<"Enter the weight: "<<endl;
    // cin>>weight;
    cout<<price(r,4,weight)<<endl;
    return 0;
}