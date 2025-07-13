package src.main.java.org.example.basics.main;

/*
We can have only one public class in java, if we have more than one public class compiler will throw error

File name and class name should be same else it will throw the error. It is case sensitive

Without main method if you try to run the program system will throw the run time exception
saying main method not found

 */


/* Below code will cause the compilation error */
class Main2 {

    static {
        System.out.println("From Main2 Static Block");
    }

    public static void main(String[] args) {
        System.out.println("From Main 2 normal class");
    }

    public static void dummy() {
        System.out.println("Testing....");
    }

}


public class Main {
    static {
        System.out.println("From Main Static Block");
    }

    public static void main(String[] args) {
        Main2.main(null);
    }
}
