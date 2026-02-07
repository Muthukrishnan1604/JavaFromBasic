package src.main.java.org.example.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static src.main.java.org.example.oops.staticandinstance.methods.InstanceMethod.test;

public class TryWithResources {

    public static void main(String[] args) {
        test();
        String fileName = "testing.csv";
        testFile2(fileName);
        testFile(fileName);
    }

    private static void testFile(String fileName) {
        Path path = Paths.get(fileName);
        FileReader reader = null;
        try {
             reader = new FileReader(fileName);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("I can do something before closing");
        }
        System.out.println("File Exists");
    }

    private static void testFile2(String fileName) {

        try (FileReader reader = new FileReader(fileName)) {
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("File '" + fileName + " ' does not exist");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Something unrelated and unexpected happened");
        } catch (Throwable e) {
            System.out.println("Throwable Exception");
        }
        System.out.println("File exists and able to use a resource");

    }

}
