package src.main.java.org.example.oops.classandobject;

public class ClassAndObject {

    public static void main(String[] args) {
        System.out.println(args.length);
        Car car = new Car();
        setCarDetails(car);
        car.describeCar();
    }

    private static void setCarDetails(Car car) {
        car.setDoors(6);
        car.setSuperCar(false);
        car.setAutomatic(false);
        car.setColor("Black");
        car.setMake("Benz");
        car.setModel("CLA");
    }

}
