package src.main.java.org.example.oops.pojo.legacy;

public class StudentMain {

    public static void main(String[] args) {

        for(int i = 1; i < 6; i++ ) {
            Student s = new Student(i, switch (i) {
                case 1 -> "Muthu";
                case 2 -> "Divya";
                case 3 -> "Krishna";
                case 4 -> "Latha";
                default -> "Durai";
            }, "16/04/1998", "Java");
            System.out.println(s);
        }

    }

}
