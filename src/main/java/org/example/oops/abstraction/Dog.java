package src.main.java.org.example.oops.abstraction;

public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if("Slow".equalsIgnoreCase(speed))
            System.out.println(type + " walking");
        else
            System.out.println(type + " running");
    }

    @Override
    public void shedHair() {
        System.out.println("Shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("Wolf")) {
            System.out.println("Howling! ");
        } else {
            System.out.println("Woof! ");
        }
    }

}
