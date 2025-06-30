package src.main.java.org.example.challenges.oops.constructor;

/*
new Keyword and Object Creation:

When you use the new keyword (e.g., MyClass obj = new MyClass();),
a new object is created in memory (on the heap).

This new object is allocated a unique memory address (reference address).

The variable (obj in the example) then stores this new reference address, "pointing" to the newly created object.

Assigning Existing References (No new Keyword):

If you assign one object reference variable to another without using new (e.g., MyClass obj2 = obj1;),
no new object is created.

Instead, both reference variables (obj1 and obj2 in the example) will now point to the exact same object in memory. They store the same memory address.

Impact of Changes with Shared References:

When multiple reference variables point to the same object:

If you modify the state (data/fields) of the object using any of these reference variables,
the change will be reflected in all other reference variables that point to that same object.

This is because you are modifying the single underlying object, not separate copies.

Analogy:

Think of it like two different remote controls (reference variables) controlling the same TV (object).
If you change the channel with one remote, the TV's channel changes, and if you pick up the other remote,
it will show the new channel because it's still controlling the same TV.
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
