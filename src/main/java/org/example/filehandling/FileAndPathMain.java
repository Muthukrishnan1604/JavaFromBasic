package src.main.java.org.example.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileAndPathMain {

    public static void main(String[] args) {
        useFile("testing.csv");
        usePath("pathfile.txt");
        createDirectoriesInLocal("test/test1/test2/test.txt", false);
    }

    private static void createDirectoriesInLocal(String fileName, boolean createDirectory) {

        File file = new File(fileName);

        if(!file.exists()) {
            if(createDirectory)
                file.mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Something went wrong while creating directory and writing");
            }
        }

        if(file.exists()) {
            file.delete();
        }

    }

    private static void useFile(String fileName) {
        File file = new File(fileName);
        boolean fileExists = file.exists();

        System.out.printf("File \"%s\" %s %n", fileName, fileExists ? "exist." : "does not exist.");

        if(fileExists) {
            System.out.println("Deleting file: " + fileName);
            fileExists = !file.delete();
        }
        if(!fileExists) {
            try {
                file.createNewFile();
                System.out.println("Created file: " + fileName);
            } catch (IOException e) {
                System.out.println("Something went wrong when creating the file");
            }
            if(file.canWrite()) {
                System.out.println("We can write to this file");
            }
        }
    }

    private static void usePath(String fileName) {
        Path path = Path.of(fileName);
        boolean fileExists = Files.exists(path);

        System.out.printf("File \"%s\" %s %n", fileName, fileExists ? "exist." : "does not exist.");

        if(fileExists) {
            System.out.println("Deleting path: " + fileName);
            try {
                Files.delete(path);
                fileExists = false;
            } catch (IOException e) {
                System.out.println("Failed while deleting path");
            }
        }
        if(!fileExists) {
            try {
                Files.createFile(path);
                System.out.println("Created path: " + fileName);

                if (Files.isWritable(path)) {
                    System.out.println("We can write to this path");
                    Files.writeString(path, """
                            Hello Muthu!
                            Hope you are doing good
                            I love Divya
                            """);
                }
                System.out.println("I am going to read the content inside the file " + fileName);
                System.out.println("-".repeat(20));
                System.out.println(Files.readString(path));

                List<String> result = Files.readAllLines(path);
                System.out.println("Result Size = " + result.size());

            } catch (IOException e) {
                System.out.println("Something went wrong when creating the path");
            }
        }
    }
}
