package src.main.java.org.example.challenges.controlflow;

public class PrimeNumberUsingForLoop {

    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "Not ") + "a prime number");
        System.out.println("17 is " + (isPrime(17) ? "" : "Not ") + "a prime number");
        System.out.println("10007 is " + (isPrime(10007) ? "" : "Not ") + "a prime number");

        System.out.println("Number of prime numbers in 1000 is " + primeNumberCounter(1000));
    }

    public static boolean isPrime(int number) {
        if(number == 2 || number == 3) {
            return true;
        } else if(number <= 1) {
            return false;
        } else {
            for(int i = 2; i <= number/2; i++) {
                if(number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int primeNumberCounter(int number) {
        int counter = 0;
        for (int i = 2; i <= number; i++) {
            if (i >= 2) {
                if (i == 2 || i == 3) {
                    counter++;
                }
                if (i % 2 != 0) {
                    boolean isDivisible = false;
                    for (int j = 3; j <= i / 2; j += 2) {
                        if (i % j == 0) {
                            isDivisible = true;
                        }
                    }
                    if (!isDivisible) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}
