package src.main.java.org.example.immutableandmutable;

public class MainRecord {

    public static void main(String[] args) {
        PersonRecord divi = new PersonRecord("Divi", "31/01/2023");
        PersonRecord vijay = new PersonRecord("Vijay", "01/01/2026");
        PersonRecord nila = new PersonRecord("Nila", "04/04/2028");

        PersonRecord[] muthuKids = new PersonRecord[] {divi, nila, vijay};

        PersonRecord muthu = new PersonRecord("Muthu", "16/04/1998", muthuKids);
        System.out.println(muthu);

        PersonRecord muthuCopy = new PersonRecord("Muthu", "16/04/1998");
        System.out.println(muthuCopy);

        PersonRecord[] kids = muthuCopy.kids();
        kids[0] = nila;
        kids[1] = new PersonRecord("Hepsi", "15/04/2016");
        System.out.println(muthuCopy);

        muthuKids[0] = new PersonRecord("Victor", "16/06/2019");
        System.out.println(muthu);
    }
    
}
