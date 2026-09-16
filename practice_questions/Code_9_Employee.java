/* Write a Java program to demonstrate hierarchical inheritance using a superclass Employee and
two subclasses Faculty and Staff. (USE INTERFACES)
• Employee should contain a method showEmployee().
• Faculty should contain a method teach().
• Staff should contain a method manage().
Create objects of both subclasses and demonstrate the inherited and specialized methods. */

interface Employee {
    void showEmployee();
}

class Faculty implements Employee {
    public void showEmployee() {
        System.out.println("Employee: Faculty");
    }

    void teach() {
        System.out.println("Faculty is teaching");
    }
}

class Staff implements Employee {
    public void showEmployee() {
        System.out.println("Employee: Staff");
    }

    void manage() {
        System.out.println("Staff is managing");
    }
}

public class Code_9_Employee {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Staff staff = new Staff();

        faculty.showEmployee();
        faculty.teach();

        staff.showEmployee();
        staff.manage();
    }
}
