/* 3 : Write a Java program to create a Book class with the data members title, author,
and price. Use a parameterized constructor to initialize the details of the first
book. Then, use a copy constructor to create a new Book object by copying the
details of the first book. Display the details of both objects. */

// Ans)

class Book {
    String title,author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void bookDetails() {
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Price : "+this.price);
    }
}

public class Code_3_BookClass {
    public static void main(String[] args) {
        System.out.println("Original Book");
        Book b1 = new Book("Data Structures","Thomas",350);
        b1.bookDetails();
        System.out.println("\nCopy of the Original Book");
        Book b2 = new Book(b1);
        b2.bookDetails();
    }
}