public class Code_06_Patterns {
    public static void main(String[] args) {
        // 1) Print a pattern:
        // *****
        // *****
        // *****
        // *****

        // Ans)
        int rows = 4;
        int columns = 5;
        System.out.println("Pattern-1");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2) Print a pattern:
        // *****
        // *   *
        // *   *
        // *****

        // Ans)
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
    }
}
