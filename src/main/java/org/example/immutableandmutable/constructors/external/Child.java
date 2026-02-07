package src.main.java.org.example.immutableandmutable.constructors.external;

import src.main.java.org.example.immutableandmutable.constructors.Parent;

import java.util.Random;

public class Child extends Parent {

    static {
        System.out.println("In Child static block");
    }

    private final int birthOrder = getBirthOrder();

    private final String birthOrderString;

    {
        if(sibilings == 0) {
            birthOrderString = "Only";
        } else if (birthOrder == 1){
            birthOrderString = "First";
        } else if (birthOrder == (sibilings + 1)) {
            birthOrderString = "Last";
        } else {
            birthOrderString = "Middle";
        }
        System.out.println("Child Initializer, birthOrder = " + birthOrder + ", birthOrderString = " + birthOrderString);
    }

    public Child() {
        super("Divi", "31/01/1998", 5);
    }

    private final int getBirthOrder() {
        if(sibilings == 0) return 1;

        return new Random().nextInt(1, sibilings + 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + birthOrderString + " child";
    }
}
