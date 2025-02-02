package src.main.java.org.example.basics.operators;

/*
  Increment operator increase the value by one ++
        Pre-Increment it will increase the value by one first and than assign it to the respective variable
            Example - int r = 1; p = ++r --> it will update to 2
        Post-Increment it will assign it to the respective variable first and then increase the value by one
            Example - int r = 1; p = ++r --> it will update p to 1 and r value will be 2 in the end
  Decrement operator decrease the value by one --
 */
public class IncrementAndDecrementOperator {

    public static void main(String... args) {
        int result = 1;
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        System.out.println(result++);

        System.out.println(++result);
    }

}
