package src.main.java.org.example.challenges.oops.encapsulation;

public class EncapsulationChallengeMain {

    public static void main(String[] args) {
        Printer printer = new Printer(20, false);
        System.out.printf("Before calling methods toner level = %d, pages printed = %d, duplex = %b %n", printer.getTonerLevel(), printer.getPagesPrinted(), printer.isDuplex());
        printer.addToner(100);
        printer.printPages(5);
        System.out.printf("After calling methods toner level = %d, pages printed = %d, duplex = %b %n", printer.getTonerLevel(), printer.getPagesPrinted(), printer.isDuplex());
        printer.setDuplex(true);
        printer.printPages(5);
        System.out.printf("After calling methods toner level = %d, pages printed = %d, duplex = %b %n", printer.getTonerLevel(), printer.getPagesPrinted(), printer.isDuplex());
    }

}
