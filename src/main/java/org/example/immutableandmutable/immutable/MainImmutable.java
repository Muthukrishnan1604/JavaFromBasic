package src.main.java.org.example.immutableandmutable.immutable;

import src.main.java.org.example.immutableandmutable.immutable.external.LivingPerson;

public class MainImmutable {

    public static void main(String[] args) {
        PersonImmutable divi = new PersonImmutable("Divi", "31/01/2023");
        PersonImmutable vijay = new PersonImmutable("Vijay", "01/01/2026");
        PersonImmutable nila = new PersonImmutable("Nila", "04/04/2028");

        PersonImmutable[] muthuKids = new PersonImmutable[] {divi, nila, vijay};

        PersonImmutable muthu = new PersonImmutable("Muthu", "16/04/1998", muthuKids);

        muthuKids[2] = null;
        System.out.println(muthu);
        PersonImmutable muthuCopy = new PersonImmutable("Muthu", "16/04/1998", muthuKids);
        System.out.println(muthuCopy);

        PersonImmutable[] kids = muthuCopy.getKids();
        kids[0] = nila;
        kids[1] = new PersonImmutable("Hepsi", "15/04/2016");
        System.out.println(muthuCopy);

        muthuKids[0] = new PersonImmutable("Victor", "16/06/2019");
        System.out.println(muthu);

        LivingPerson muthuLiving = new LivingPerson(muthu.getName(), muthu.getKids());
        System.out.println(muthuLiving);

        LivingPerson diviLiving = new LivingPerson("Divi", null);
        muthuLiving.addKid(diviLiving);

        System.out.println(muthuLiving);
    }

}
