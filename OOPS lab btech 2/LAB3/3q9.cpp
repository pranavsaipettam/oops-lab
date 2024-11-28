#include<bits/stdc++.h>
using namespace std;
int n;
class book{
    private:
    vector<string>name;
    vector<int>cost;
    public:
    book(){
        cout<<"enter total number of books: "<<endl;
        cin>>n;
        name.resize(n);
        cost.resize(n);
        for(int i=0;i<n;i++){
            cout<<"enter name: "<<endl;
            cin>>name[i];
            cout<<"enter cost: "<<endl;
            cin>>cost[i];
        }
    }
    void cheapest(){
        int index=0;
        int min=cost[0];
        for(int i=1;i<n;i++){
            if(min>cost[i]){
                min=cost[i];
                index=i;
            }
        }
        cout<<"name of cheapest book is "<<name[index]<<" and cost"<<cost[index]<<endl;
    }
};
int main(){
    book b;
    b.cheapest();
return 0;
}