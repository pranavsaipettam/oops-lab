#include <iostream>
using namespace std;

class Integer
{
private:
    int value;

public:
    Integer(int val = 0) : value(val) {}

    friend Integer operator+(const Integer &int1, const Integer &int2)
    {
        return Integer(int1.value + int2.value);
    }

    friend ostream &operator<<(ostream &os, const Integer &obj)
    {
        os << obj.value;
        return os;
    }

    friend istream &operator>>(istream &is, Integer &obj)
    {
        is >> obj.value;
        return is;
    }
};

int main()
{
    Integer a, b;
    cout << "Enter first integer: ";
    cin >> a;
    cout << "Enter second integer: ";
    cin >> b;
    Integer sum = a + b;
    cout << "Sum: " << sum << endl;
    return 0;
}