package src.main.java.org.example.basics.controlflow;

public class DoWhileLoop {

    public static void main(String[] args) {
        int j = 0;
        do {
            System.out.println("From do while loop");
            j++;
            if(j == 4) {
                continue;
            }
            System.out.println(j);
            if(j == 5) {
                break;
            }
        } while (j >= 1);
    }

}
