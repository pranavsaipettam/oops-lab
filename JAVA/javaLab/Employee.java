public class Employee {
    //instance variables
    private String name;
    private String lastname;
    private double monthlysalary;

    //constructor
    public Employee(String name, String lastname, double monthlysalary ){
        this.name=name;
        this.lastname= lastname;
        setMonthlySalary(monthlysalary); //use setter to validate salary

    
    }

    //getter and setter for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //for lastname
    public String getLastName(){
        return lastname;
    }
    public void setLastName(String lastname){
        this.lastname=lastname;
    }

    //getter and setter for monthly salary
    public double getMonthlySalary(){
        return monthlysalary;
    }
    public void setMonthlySalary(double monthlysalary){
        if(monthlysalary>0){
            this.monthlysalary=monthlysalary;
        }
        else{
            this.monthlysalary=0;
        }
    }

    public double getYearlySalary(){
        return monthlysalary*12;
    }

    public void applySalaryHike(double percentage){
        if(percentage>0){
            monthlysalary+= monthlysalary*(percentage/100);
        }
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1= new Employee("ashish","vishwakarma",100000);
        Employee emp2= new Employee("anurag","pankaj",100000);

        System.out.printf("year salary %s %s: %f%n",emp1.getName(),emp1.getLastName(),emp1.getYearlySalary());
        System.out.printf("year salary %s %s: %f%n",emp2.getName(),emp2.getLastName(),emp2.getYearlySalary());

        emp1.applySalaryHike(15);
        emp2.applySalaryHike(15);

        System.out.printf("year salary %s %s: $%.2f%n",emp1.getName(),emp1.getLastName(),emp1.getYearlySalary());
        System.out.printf("year salary %s %s: $%.2f%n",emp2.getName(),emp2.getLastName(),emp2.getYearlySalary());
    }
}
