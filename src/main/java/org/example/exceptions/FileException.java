package src.main.java.org.example.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileException {

    public static void main(String[] args){
            String fileName = "testing.csv";
            testFile(fileName);
    }

    private static void testFile(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
        finally {
            System.out.println("I can do something before closing");
        }
        System.out.println("File Exists");
    }

}
