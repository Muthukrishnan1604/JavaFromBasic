package src.main.java.org.example.oops.classandobject;

public class Car {

    private boolean isAutomatic;

    private String make;

    private String model;

    private String color;

    private int doors;

    private boolean isSuperCar;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        this.isAutomatic = automatic;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSuperCar() {
        return isSuperCar;
    }

    public void setSuperCar(boolean superCar) {
        this.isSuperCar = superCar;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (isAutomatic ? "Automatic Gear" : "Manual Gear") + " " +
                (isSuperCar ? "Super Car" : "Normal Car"));
    }
}
