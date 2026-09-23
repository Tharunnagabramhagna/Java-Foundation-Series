/* Create a Java program with a parent class Employee containing a
method calculateSalary(). Create child classes PermanentEmployee and
ContractEmployee that override the method according to their salary
calculation methods. Use a parent class reference to demonstrate runtime
polymorphism. */

class Employee {
    double calculateSalary(double workHours) {
        return workHours * 2000;
    }
}

class PermanentEmployee extends Employee {
    @Override 
    double calculateSalary(double workHours) {
        return workHours * 2500;
    }
}

class ContractEmployee extends Employee {
    @Override 
    double calculateSalary(double workHours) {
        return workHours * 1000;
    }
}

public class Code_13_EmploySal {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("General Employee Salary : "+e1.calculateSalary(10));
        PermanentEmployee p1 = new PermanentEmployee();
        System.out.println("Permanent Employee Salary : "+p1.calculateSalary(12));
        ContractEmployee c1 = new ContractEmployee();
        System.out.println("Contract Employee Salary : "+c1.calculateSalary(5));
    }
}
