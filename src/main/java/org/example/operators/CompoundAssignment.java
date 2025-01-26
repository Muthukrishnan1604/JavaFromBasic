package src.main.java.org.example.operators;

/*
  Compound Assignment is the short hand way for performing the addition and other operators operation

  result = result + 1; / Normal way of writing
  result += 1; / This will also do the same
 */
public class CompoundAssignment {

    public static void main(String... args) {
        int result = 10;

        // Adding the value 5 by compound way

        result += 5;

        System.out.println(result);
    }

}
