package src.main.java.org.example.singletonpattern.patternbreaker;

import java.io.*;

public class SingletonPatternBreaker {

    public static void main(String[] args) {

        // Step 1: Get the initial singleton instance
        BillPugh instance1 = BillPugh.getInstance();
        System.out.println("Instance 1 Hash Code: " + instance1.hashCode());

        // Step 2: Serialize the singleton instance to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("singleton.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(instance1);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Step 3: Deserialize the object from the file
        BillPugh instance2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("singleton.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            instance2 = (BillPugh) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }

        // Step 4: Compare the two instances
        System.out.println("Instance 2 Hash Code: " + instance2.hashCode());
        System.out.println("Are they the same instance? " + (instance1 == instance2));
    }

}


