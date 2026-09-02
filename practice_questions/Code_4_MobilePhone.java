/* 4 : Design a Java program for a MobilePhone class containing brand, model, and
price. Use a default constructor to create a phone with default values, a
parameterized constructor to create a phone with user-specified values, and a
copy constructor to create a new phone object using the details of an existing
phone. Display the details of new phone. */

// Ans)

class MobilePhone {
    String brand, model;
    double price;

    MobilePhone() {
        brand = "Realme";
        model = "GT";
        price = 35000;
    }

    MobilePhone(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    MobilePhone(MobilePhone mp) {
        brand = mp.brand;
        model = mp.model;
        price = mp.price;
    }

    void phoneDetails() {
        System.out.println("Brand Name : "+brand);
        System.out.println("Model : "+model);
        System.out.println("Price : "+price);
    }
};

public class Code_4_MobilePhone {
    public static void main(String[] args) {
        System.out.println("Mobile-1 : ");
        MobilePhone m1 = new MobilePhone();
        m1.phoneDetails();
        System.out.println("\nMobile-2 : ");
        MobilePhone m2 = new MobilePhone("Redmi","Note",17000);
        m2.phoneDetails();
        System.out.println("\nMobile-3 (Copy of m2 mobile) : ");
        MobilePhone m3 = new MobilePhone(m2);
        m3.phoneDetails();
    }
}