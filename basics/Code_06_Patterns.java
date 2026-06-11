public class Code_06_Patterns {
    public static void main(String[] args) {
        // 1) Print a pattern:
        // Solid Rectangle
        // *****
        // *****
        // *****
        // *****
        int rows = 4;
        int columns = 5;
        System.out.println("Pattern-1");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++)
                System.out.print("*");
            System.out.println();
        }

        // 2) Print a pattern:
        // Hollow Rectangle
        // *****
        // *   *
        // *   *
        // *****
        int m = 4; // rows
        int n = 5; // columns
        System.out.println("\nPattern-2");
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // print border stars + remaining stars
                if (i == 1 || j == 1 || j == n || i == m)
                    System.out.print("*");
                else
                    System.out.print(" "); // inner spaces
            }
            System.out.println();
        }

        // 3) Print the below pattern:
        // Half Pyramid
        // *
        // **
        // ***
        // ****
        System.out.println("\nPattern-3");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // 4) Print the below pattern:
        // Inverted Half Pyramid
        // ****
        // ***
        // **
        // *
        System.out.println("\nPattern-4");
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--)
                System.out.print("*");
            System.out.println();
        }

        // 5) Print the below pattern:
        // Inverted Half Pyramid (rotated by 180 degree)
        //    *
        //   **
        //  ***
        // ****
        System.out.println("\nPattern-5");
        n = 4;
        for (int i = 1; i <= n; i++) {
            // (or) for(int spaces = n-i; spaces >= 1; spaces--)
            for (int spaces = 1; spaces <= n-i; spaces++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // 6) Print the below pattern:
        // Half Pyramid with numbers
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        System.out.println("\nPattern-6");
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }

        // 7) Print the below pattern:
        // Inverted Half Pyramid with numbers
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2 
        // 1
        System.out.println("\nPattern-7");
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
        // (or)
        // n = 5;
        // for(int i = 1; i <= n; i++) {
        //     for(int j = 1; j <= n-i+1; j++)
        //         System.out.print(j+" ");
        //     System.out.println();
        // }

        // 8) Print the below pattern:
        // Half Pyramid with numbers
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        System.out.println("\nPattern-8");
        int num;
        for(int i = 1; i <= 5; i++) {
            num = 1;
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        
        // 9) Print the below pattern:
        // Floyd's Triangle
        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15

        System.out.println("\nPattern-9");
        num = 1;
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

        // 10) Print the below pattern:
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        System.out.println("\nPattern-10");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                // Try to write the pattern in matrix form 
                if((i+j)%2 == 0) // even
                    System.out.print("1 ");
                else // odd
                    System.out.print("0 ");
            }
            System.out.println();
        }

        // 11) Print the below pattern:
        // Butterfly Pattern
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        System.out.println("\nPattern-11");
        n = 5;
        // top part
        for(int i = 1; i <= n; i++) {
            // first part of stars
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            // spaces placed in between 1st and 2nd parts
            for(int spaces = 1; spaces <= 2*(n-i)+1; spaces++)
                System.out.print(" ");
            // second part of stars
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        // bottom part
        for(int i = n; i >= 1; i--) {
            // first part of stars
            for(int j = i; j >= 1; j--) // (or) for(int j = 1; j <= i; j++)
                System.out.print("*");
            // spaces placed in between 1st and 2nd parts => spaces are same
            for(int spaces = 1; spaces <= 2*(n-i)+1; spaces++)
                System.out.print(" ");
            // second part of stars
            for(int j = i; j >= 1; j--) // (or) for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // 12) Print the below pattern:
        // Solid Rhombus
        //     *****
        //    *****
        //   *****
        //  *****
        // *****
        n = 5;
        System.out.println("\nPattern-12");
        for(int i = 1; i <= n; i++) {
            // Prints spaces
            for(int j = 1 ; j <= n-i; j++)
                System.out.print(" ");
            // Prints stars
            for(int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }

        // 13) Print the below pattern:
        // Number pyramid
        //     1 
        //    2 2 
        //   3 3 3 
        //  4 4 4 4 
        // 5 5 5 5 5 
        System.out.println("\nPattern-13");
        n = 5;
        for(int i = 1; i <= n; i++) {
            for(int spaces = 1; spaces <= n-i; spaces++)
                System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print(i+ " ");
            System.out.println();
        }

        // 14) Print the below pattern:
        // Palindrome pattern
        //     1
        //    212
        //   32123
        //  4321234
        // 543212345
        n = 5;
        System.out.println("\nPattern-14");
        for(int i = 1; i <= n; i++) {
            // starting spaces
            for(int spaces = 0; spaces < n-i; spaces++)
                System.out.print(" ");
            // first half of numbers => E.g :- 21
            for(int j = i; j >= 1; j--)
                System.out.print(j);
            // second half of numbers => E.g :- 2
            for(int j = 2; j <= i; j++)
                System.out.print(j);
            System.out.println();
        }

        // 15) Print the below pattern:
        // Diamond Pattern
        //    *
        //   ***
        //  *****
        // *******
        // *******
        //  *****
        //   ***
        //    *
        System.out.println("\nPattern-15");
        n = 4;
        // first half
        for(int i = 1; i <= n; i++) {
            // Printing starting spaces
            for(int spaces = 0; spaces < n-i; spaces++)
                System.out.print(" ");
            // Printing stars
            for(int j = 1; j <= 2*i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        // second half
        for(int i = n; i >= 1 ; i--) {
            // Printing starting spaces
            for(int spaces = 0; spaces < n-i; spaces++)
                System.out.print(" ");
            // Printing stars
            for(int j = 1; j <= 2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
