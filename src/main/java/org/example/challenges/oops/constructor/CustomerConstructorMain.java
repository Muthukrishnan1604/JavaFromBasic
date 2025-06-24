package src.main.java.org.example.challenges.oops.constructor;

/*
If we new keyword and create object then only it will create object by mapping to the new reference address
else it will just create one object by referring to the existing address. If you change the value in
any one of the object then the same will reflect in the other object
 */

public class CustomerConstructorMain {

    public static void main(String[] args) {
        Customer customer = new Customer("Divya", 10000d, "Divi@gmail.com");

        System.out.println("Customer1 name: " + customer.getName());
        System.out.println("Customer1 creditlimit: " + customer.getCreditLimit());
        System.out.println("Customer1 Email: " + customer.getEmailAddress());

        Customer customer2 = new Customer();
        System.out.println("Customer2 name: " + customer2.getName());
        System.out.println("Customer2 creditlimit: " + customer2.getCreditLimit());
        System.out.println("Customer2 Email: " + customer2.getEmailAddress());

        Customer customer3 = new Customer("Muthu", "Muthu@gmail.com");
        System.out.println("Customer3 name: " + customer3.getName());
        System.out.println("Customer3 creditlimit: " + customer3.getCreditLimit());
        System.out.println("Customer3 Email: " + customer3.getEmailAddress());

        Customer customer4 = customer3;
        System.out.println(customer4.hashCode());
        System.out.println(customer3.hashCode());
        customer4.setName("MuthuDivya");
        System.out.println(customer4.getName());
        System.out.println(customer3.getName());
    }

}
