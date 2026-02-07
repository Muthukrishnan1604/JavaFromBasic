package src.main.java.org.example.challenges.list.arraylist;

public class MobilePhoneMain {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("8754420188");
        mobilePhone.addNewContact(Contact.createContact("Divya", "9003250278"));
        mobilePhone.addNewContact(Contact.createContact("Durai", "9444275546"));
        mobilePhone.addNewContact(Contact.createContact("Latha", "9677059588"));
        mobilePhone.addNewContact(Contact.createContact("Divya", "9003250278"));

        System.out.println(mobilePhone.queryContact("Divya"));
        System.out.println(mobilePhone.removeContact(Contact.createContact("Durai", "9444275546")));
        mobilePhone.printContacts();
    }

}
