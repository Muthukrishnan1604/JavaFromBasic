package src.main.java.org.example.challenges.oops.encapsulation;

public class Printer {

    private int tonerLevel;

    private int pagesPrinted;

    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        int temp = this.tonerLevel + tonerAmount;
        if(temp < 0 || temp > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagePrinted = duplex ? (pages / 2) + (pages % 2) : pages;
        this.pagesPrinted = this.pagesPrinted + pagePrinted;
        return pagePrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
