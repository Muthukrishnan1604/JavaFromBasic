package src.main.java.org.example.challenges.collections.ticketbooking;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Theatre {

    private String theatreName;

    private int numberOfRows;

    private int seatsInEachRow;

    private TreeSet<Seat> seats;

    public Theatre(String theatreName, int numberOfRows, int seatsInEachRow) {

    }

    public Theatre() {

    }


    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        Seat seat = new Seat('a', 2);
        System.out.println(seat.getSeat());

    }

    public static class Seat {
        private char row;
        private int seatNumber;
        private String seat;
        private boolean isReserved;

        public Seat(char row, int seatNumber) {
            this.row = row;
            this.seatNumber = seatNumber;
            this.seat = generateSeatFormat();
            this.isReserved = true;
        }

        private String generateSeatFormat() {
            return String.format("%c%03d", Character.toUpperCase(this.row), this.seatNumber);
        }

        public String getSeat() {
            return this.seat;
        }
    }

}
