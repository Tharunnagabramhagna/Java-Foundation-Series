/* Create a class Box with overloaded constructors:
• a no-argument constructor,
• a constructor accepting one value for a cube,
• a constructor accepting length, breadth, and height.
Write a program to calculate and display the volume for objects created using each constructor. */

class Box {
    double length, breadth, height;

    Box() {
        length = breadth = height = 0;
    }

    Box(double side) {
        length = breadth = height = side;
    }

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double volume() {
        return length * breadth * height;
    }
}

public class Code_8_Box {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(4, 5, 6);

        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Cube: " + box2.volume());
        System.out.println("Volume of Box 3: " + box3.volume());
    }
}
