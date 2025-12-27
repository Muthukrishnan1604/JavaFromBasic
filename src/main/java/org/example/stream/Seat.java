package src.main.java.org.example.stream;

public record Seat(char row, int seatNumber, double price) {

    public Seat(char row, int seatNumber) {
        this(row, seatNumber, row > 'C' && (seatNumber <=2 || seatNumber >= 9) ? 50 : 75);
    }

    public String toString() {
        return "%c-%03d %.0f".formatted(row, seatNumber, price);
    }
}
