public class PatternINEURON {
    public static void main(String[] args) {
        int n = 7; // Size of the pattern
        for (int i = 0; i < n; i++) {
            // Print I
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Print N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Print E
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Print U
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != n - 1 || i == n - 1 && j != 0 && j != n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Print R
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == 0 || i == n / 2) && j < n - 1 || j == n - 1 && i < n / 2 || i - j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Print O
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 && j != n - 1 || i == n - 1 && j != 0 && j != n - 1 || j == 0 && i != 0 && i != n - 1 || j == n - 1 && i != 0 && i != n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");

            // Print N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    

