package src.main.java.org.example.collections.set;

import java.util.*;

public class ContactData {
    private static final String phone = """
            Muthu, 6789200389
            Muthu, 6789200389
            Muthu, 6789200389
            Muthu, 6889200289
            Muthu Krishna, 6789200299
            Muthu Krish, 6789200278
            Divya, 6789200189
            Hema, 6789200289
            Hema, 6789200289
            """;

    private static final String emails = """
            Muthu, muthu@gmail.com
            Muthu, muthu1604@gmail.com
            Muthu Krishna, MuthuKrishna@amazon.com
            Muthu Krish, MuthuKrish@google.com
            Muthu Krish, MuthuKrish@google.com
            Muthu Krish, MuthuKrish@google.com
            Divya, Divi@gmail.com
            Divya, Divi@gmail.com
            """;

    public static List<Contact> getData(String emailOrPhoneNumber) {
        List<Contact> contactList = new ArrayList<>();
        Scanner scanner = new Scanner("Phone".equalsIgnoreCase(emailOrPhoneNumber) ? phone : emails);
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);

            if("phone".equalsIgnoreCase(emailOrPhoneNumber)) {
                contactList.add(new Contact(data[0], Long.parseLong(data[1])));
            } else if("email".equalsIgnoreCase(emailOrPhoneNumber)) {
                contactList.add(new Contact(data[0], data[1]));
            }
        }
        return contactList;
    }
}
