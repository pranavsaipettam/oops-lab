#include <iostream>
#include <vector>
using namespace std;

class Vector{
    vector<int> x;
public:
    friend istream& operator >> (istream& in, Vector& V);
    friend ostream& operator << (ostream& out ,const Vector& V);     

};

istream& operator >> (istream& in, Vector& V){
    int size , temp;
    cout << "Enter size of list : " ;
    cin >> size;
    
    for(int i =0 ; i < size ; i++){
        in >> temp;
        V.x.push_back(temp);
    }

    return in;
}

ostream& operator << (ostream& out ,const Vector& V){
    for(auto i:V.x){
        cout << i << " ";
    }
    cout << endl;
    return out;
}

int main (){
    Vector V;
    cin >> V;
    cout << V;

    return 0;
}