#include <iostream>
#include <string>
using namespace std;

class Integer {
private:
    int value;

public:
    Integer(int val = 0) : value(val) {}

    bool operator==(const string& str) const {
        return to_string(value) == str;
    }

    bool operator!=(const string& str) const {
        return !(*this == str);
    }

    bool operator<(const string& str) const {
        return to_string(value) < str;
    }

    bool operator>(const string& str) const {
        return to_string(value) > str;
    }

    bool operator<=(const string& str) const {
        return to_string(value) <= str;
    }

    bool operator>=(const string& str) const {
        return to_string(value) >= str;
    }
};

int main() {
    int num;
    string str;

    cout << "Enter an integer: ";
    cin >> num;

    Integer a(num);

    cout << "Enter a string: ";
    cin >> str;

    cout << boolalpha;
    cout << "a == str: " << (a == str) << endl;
    cout << "a != str: " << (a != str) << endl;
    cout << "a < str: " << (a < str) << endl;
    cout << "a > str: " << (a > str) << endl;
    cout << "a <= str: " << (a <= str) << endl;
    cout << "a >= str: " << (a >= str) << endl;

    return 0;
}