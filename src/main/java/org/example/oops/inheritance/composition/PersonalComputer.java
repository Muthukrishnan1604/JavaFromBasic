package src.main.java.org.example.oops.inheritance.composition;

public class PersonalComputer extends Product {

    private Monitor monitor;

    private ComputerCase computerCase;

    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixelArt(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
    /*
    public Monitor getMonitor() {
        return monitor;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }*/
}
