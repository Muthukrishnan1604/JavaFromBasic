package src.main.java.org.example.oops.polymorphism;

import java.util.Scanner;

public class PolymorphismMain {

    public static void main(String[] args) {
        Movie movie = new Movie("Star wars");
        movie.watchMovie();

        Movie adventure = new Adventure("Jumanji");
        adventure.watchMovie();

        Comedy comedy = new Comedy("Kalakalapu");
        comedy.watchMovie();

        System.out.println("-".repeat(20));

        Movie movie1 = Movie.getMovie("Science", "Star wars");
        movie1.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter type (A for Adventure, C for Comedy, S for Science fiction, or Q for quit): ");
            String type = s.nextLine();
            if(!type.isBlank() && !type.isEmpty()) {
                if(type.startsWith("q") || type.startsWith("Q")) {
                    break;
                }
                System.out.println("Enter Movie Title");
                String title = s.nextLine();
                Movie movie2 = Movie.getMovie(type, title);
                movie2.watchMovie();
            } else {
                break;
            }
        }

    }

}
