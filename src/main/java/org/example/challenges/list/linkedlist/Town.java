package src.main.java.org.example.challenges.list.linkedlist;

public class Town {

    private String name;

    private int distanceFromChennai;

    public Town(String name, int distanceFromChennai) {
        this.name = name;
        this.distanceFromChennai = distanceFromChennai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceFromChennai() {
        return distanceFromChennai;
    }

    public void setDistanceFromChennai(int distanceFromChennai) {
        this.distanceFromChennai = distanceFromChennai;
    }

    @Override
    public String toString() {
        return "Town [ Name = " + this.getName() + " , Distance = " + this.getDistanceFromChennai() + " ]";
    }
}
