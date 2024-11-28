#include <iostream>
#include <string>
using namespace std;

class BankAccount
{

private:
    string Name;
    double AccNumber;
    string AccType;
    double Balance;

public:
    void InpRecord()
    {
        cout << "Enter name:" << endl;
        cin >> Name;
        cout << "Enter AccNumber:" << endl;
        cin >> AccNumber;
        cout << "Enter AccType:" << endl;
        cin >> AccType;
    }

    BankAccount(double initialBalance = 2000)
    {
        Balance = initialBalance;
    }

    void deposit(double amount)
    {
        Balance += amount;
        cout << "Deposited--> " << amount << endl;
        cout << "Balance-->" << Balance<<endl;
    }

    void withdraw(double amount)
    {
        if (Balance >= amount)
        {
            Balance -= amount;
            cout << "Withdrawn--> " << amount << endl;
        }
        else
        {
            cout << "Insufficient balance" << endl;
        }
    }

    void OutRecord()
    {
        cout << "Name-->>" << Name << endl;
        cout << "AccNumber-->" << AccNumber << endl;
        cout << "AccType-->" << AccType << endl;
        cout << "Avail Balace-->" << Balance << endl;
    }
};

int main()
{

    BankAccount account;

    // Input data
    account.InpRecord();

    int amount;
    cout << "enter amount to deposit:";
    cin >> amount;

    // Deposit money
    account.deposit(amount);

    cout << "enter amount to withdraw:";
    cin >> amount;

    // Withdraw money
    account.withdraw(amount);

    // Output data
    account.OutRecord();

    return 0;
}
