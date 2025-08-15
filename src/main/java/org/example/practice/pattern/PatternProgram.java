package src.main.java.org.example.practice.pattern;

public class PatternProgram {

    public static void main(String[] args) {
        pattern1(5);
        printDashes();
        pattern2(5);
        printDashes();
        pattern3(5);
        printDashes();
        pattern4(5);
        printDashes();
        pattern5(5);
        printDashes();
        pattern6(5);
        printDashes();
        pattern7(5);
        printDashes();
        pattern8(6);
        printDashes();
    }

    private static void printDashes() {
        System.out.println("-".repeat(30));
    }

    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int row = 1; row < 2 * n; row++) {
            if (row <= n) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
            } else {
                for (int col = 2 * n; col > row; col--) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = 1; col <= (n - row) + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for(int col = n; col >= 1; col--) {
                if(col > row) {
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
