/* Create a Java program for an online shopping system using method
overloading. Create a class ShoppingCart with multiple addProduct()
methods that allow adding a product using different combinations of
information, such as product name, product name with quantity, and
product name with quantity and price. */

class shoppingCart {
    void addProduct(String name) {
        System.out.println("Product Name : "+name);
    }

    void addProduct(String name, double quantity) {
        System.out.println("\nProduct Details : ");
        System.out.println("Product Name : "+name);
        System.out.println("Product Quantity : "+quantity);
    }

    void addProduct(String name, double quantity, double price) {
        System.out.println("\nProduct Details : ");
        System.out.println("Product Name : "+name);
        System.out.println("Product Quantity : "+quantity);
        System.out.println("Product Price : "+price);
    }
}

public class Code_11_shoppingCart {
    public static void main(String[] args) {
        shoppingCart sc1 = new shoppingCart();

        sc1.addProduct("Trolley bag");
        sc1.addProduct("Book",2);
        sc1.addProduct("Laptop", 1, 75000);
    }
}
