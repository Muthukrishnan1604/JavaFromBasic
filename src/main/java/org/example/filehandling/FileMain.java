package src.main.java.org.example.filehandling;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMain {

    public static void main(String[] args) {

        System.out.println("Current working directory : " + new File("").getAbsolutePath());

        String fileName = "files/testing.csv";

        File file = new File(".",fileName);

        if(!file.exists()) {
            System.out.println("No file exist with the filename " + fileName);
            return;
        }
        System.out.println("Found the file proceeding with further actions...");

        for(var files : File.listRoots()) {
            System.out.println(files);
        }

        Path path = Paths.get("files/testing.csv");
        System.out.println(file.getAbsolutePath());
        if(!Files.exists(path)) {
            System.out.println("2. No file exist with the filename " + fileName);
            return;
        }
        System.out.println("2. Found the file proceeding with further actions...");
    }

}
