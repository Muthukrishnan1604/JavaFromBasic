package src.main.java.org.example.immutableandmutable;


public class ImmutableMain {

    public static void main(String[] args) throws ClassNotFoundException {
        /*Person divi = new Person();
        divi.setName("Divi");
        Person nila = new Person();
        nila.setName("Nila");
        Person vijay = new Person();
        vijay.setName("Vijay");

        Person muthu = new Person();
        muthu.setName("Muthu");
        muthu.setDob("16/04/1998");
        muthu.setKids(new Person[] {divi, nila, vijay});

        System.out.println(muthu);
        // If we go with the above approach we can easily modify the data through setter methods it will break the data consistency
        muthu.setName("Krishnasamy");
        muthu.setKids(new Person[] {new Person(), new Person()});

        System.out.println(muthu);
        */

        Person divi = new Person("Divi", "31/01/2023");
        Person vijay = new Person("Vijay", "01/01/2026");
        Person nila = new Person("Nila", "04/04/2028");

        Person[] muthuKids = new Person[] {divi, nila, vijay};

        Person muthu = new Person("Muthu", "16/04/1998", muthuKids);
        System.out.println(muthu);

        Person[] kids = muthu.getKids();
        kids[0] = nila;
        System.out.println(muthu);

        kids = null;
        System.out.println(muthu);
    }
}
