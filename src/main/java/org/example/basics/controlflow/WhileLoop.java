package src.main.java.org.example.basics.controlflow;

/*
In while loop we won't do the initialization like for loop it will run the loop until the condition becomes false

In do while loop the condition will get executed once even if the condition is true or false
 */

public class WhileLoop {

    public static void main(String[] args) {
        int j = 1;

        while(j >= 1) {
            System.out.println(j);
            if(j == 5) {
                break; // loop will stop once it reaches 5
            }
            j++;
        }
    }

}
