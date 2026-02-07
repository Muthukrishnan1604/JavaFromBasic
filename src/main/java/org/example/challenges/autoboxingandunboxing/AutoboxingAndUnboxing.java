package src.main.java.org.example.challenges.autoboxingandunboxing;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        Customer muthu = new Customer("Muthu", 10000);
        System.out.println(muthu);

        Bank bank = new Bank("IOB");
        bank.addCustomer("Muthu", 10000.0);
        bank.addTransaction("Muthu", -100);
        bank.addTransaction("Muthu", 1000);
        bank.printStatement("Muthu");
    }

}
