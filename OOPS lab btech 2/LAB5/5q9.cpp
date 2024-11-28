#include <iostream>
using namespace std;

class Complex{
    int real , complex ;

public:
    Complex(int a = 0,int b=0){
        real = a ;
        complex = b ;
    };

    void display(){
        cout << real<<"+i(" << complex <<")" ;
    }

    Complex multiply(Complex& O){
        Complex C;
        int a1 = this->real , b1 = this->complex ;
        int a2 = O.real , b2 = O.complex ;
        C.real = a1*a2 - (b1*b2) ;
        C.complex = a1*b2 + a2*b1;
        return C;
    }
};

int main() {
    Complex c1(3,4);
    Complex c2(4,5);

    Complex C = c1.multiply(c2) ;
    C.display();

    return 0;
}