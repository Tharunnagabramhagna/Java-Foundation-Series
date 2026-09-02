/* 1: Write a Java program to create a Student class with the data members (id,
name, age, gender, branch, city, year) . Use a default constructor to initialize the
values and display the student details (upto five students). */

// Ans)

import java.util.Scanner;

class Student {
    int id, age, year;
    String name, gender, branch, city;
    Scanner sc = new Scanner(System.in);

    Student() {
        System.out.print("Enter the id : ");
        this.id = sc.nextInt();
        System.out.print("Enter the age : ");
        this.age = sc.nextInt();
        System.out.print("Enter the year of graduation : ");
        this.year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name : ");
        this.name = sc.nextLine();
        System.out.print("Enter your gender : ");
        this.gender = sc.nextLine();
        System.out.print("Enter your branch : ");
        this.branch = sc.nextLine();
        System.out.print("Enter your city : ");
        this.city = sc.nextLine();
    }

    void printDetails() {
        System.out.println("\nStudent Details : ");
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Branch : " + this.branch);
        System.out.println("Year : " + this.year);
        System.out.println("Gender : " + this.gender);
        System.out.println("City  : " + this.city);
    }
};

public class Code_1_classes {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println("\nEnter the Details of Student-"+i+" : ");
            Student s = new Student();
            s.printDetails();
        }
    }
}