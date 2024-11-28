#include <iostream>
using namespace std;

class Integer{

    int value = 0;

public:
    friend istream& operator >> (istream& in, Integer& I);
    friend ostream& operator << (ostream& out ,const Integer& I);    
};

istream& operator >>(istream& in, Integer& I){
    in >> I.value;
    return in;
}

ostream& operator <<(ostream& out,const Integer& I){
    out << I.value;
    return out;
}

int main() {
    
   Integer I;
   cin >> I ;
   cout << I;

    return 0;
}