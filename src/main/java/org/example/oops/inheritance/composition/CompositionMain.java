package src.main.java.org.example.oops.inheritance.composition;

public class CompositionMain {

    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2208", "Lenovo", "240");

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");

        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "V2.30");

        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherBoard);

        personalComputer.powerUp();
    }
}
