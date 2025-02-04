package src.main.java.org.example.basics.operators;

/*
    operand1 ? operand2 : operand3

    if operand1 is true it will return operand2 else it will return operand3
*/

public class TernaryOperator {

    public static void main(String[] args) {
        String carModel = "Tata";

        boolean funBoolean = false;

        boolean isTata = "Tata".equals(carModel) ? true : false;

        System.out.println(isTata);

        String fun = ("Tata".equals(carModel)) ? (true && funBoolean) ? ("Fun true value") : ("Fun false Value")
                : (true || funBoolean) ? ("Fun 1 true value") : ("Fun 1 false value") ;

        System.out.println(fun);
    }

}
