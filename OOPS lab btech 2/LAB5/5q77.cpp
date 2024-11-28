#include <iostream>
#include <vector>
using namespace std;

class Employee {
private:
    int emp_id;
    string emp_name;
    int age;

public:
    // Constructor
    Employee(int id, string name, int age) : emp_id(id), emp_name(name), age(age) {}

    // Getter functions
    int getEmpID() const { return emp_id; }
    string getEmpName() const { return emp_name; }
    int getAge() const { return age; }

    // Display function
    void display() const {
        cout << "Employee ID: " << emp_id << ", Name: " << emp_name << ", Age: " << age << endl;
    }
};

class EmployeeRecords {
private:
    vector<Employee> employees;

public:
    // Function to add an employee
    void addEmployee(int id, string name, int age) {
        employees.emplace_back(id, name, age);
    }

    // Function to search for an employee by emp_id
    void searchEmployee(int id) const {
        for (const auto& emp : employees) {
            if (emp.getEmpID() == id) {
                cout << "Employee found:" << endl;
                emp.display();
                return;
            }
        }
        cout << "Employee with ID " << id << " not found." << endl;
    }
};

int main() {
    EmployeeRecords records;

    // Adding 10 employee records
    records.addEmployee(101, "John Doe", 25);
    records.addEmployee(102, "Jane Smith", 30);
    records.addEmployee(103, "Sam Brown", 28);
    records.addEmployee(104, "Lisa White", 35);
    records.addEmployee(105, "Tom Black", 26);
    records.addEmployee(106, "Nancy Green", 29);
    records.addEmployee(107, "Chris Blue", 32);
    records.addEmployee(108, "Kelly Yellow", 31);
    records.addEmployee(109, "Paul Red", 27);
    records.addEmployee(110, "Megan Purple", 33);

    // Searching for an employee by ID
    int search_id;
    cout << "Enter the employee ID to search: ";
    cin >> search_id;

    records.searchEmployee(search_id);

    return 0;
}