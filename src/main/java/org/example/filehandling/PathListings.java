package src.main.java.org.example.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Instant;
import java.util.Arrays;
import java.util.Map;

public class PathListings {

    public static void main(String[] args) {
        Path path = Path.of("file/files/testing.txt");
        Path path2 = Path.of("file/files/Test.json");
        printPathInfo(path);
        try{
            logStatement(path);
        } catch (IOException e) {
            System.out.println("Error while writing to txt file " + Arrays.toString(e.getStackTrace()));
        }
        extraInfo(path);
        extraInfo(path2);
    }

    private static void printPathInfo(Path path) {
        System.out.println("Path: " + path);
        System.out.println("File Name = " + path.getFileName());
        System.out.println("Parent = " + path.getParent());
        var absolutePath = path.toAbsolutePath();
        System.out.println("Absolute Path = " + absolutePath);
        System.out.println("Absolute Path Root = " + absolutePath.getRoot());
        System.out.println("Root Path = " + path.getRoot());
        System.out.println("IsAbsolute = " + path.isAbsolute());

        System.out.println(absolutePath.getRoot());
        /*int i = 1;
        var it = path.toAbsolutePath().iterator();

        while(it.hasNext()) {
            System.out.println("Path " + i + " " + it.next());
            i++;
        }*/
        int pathParts = absolutePath.getNameCount();
        for(int i = 0; i < pathParts; i++) {
            System.out.println(".".repeat(i + 1) + absolutePath.getName(i));
        }
        System.out.println("-".repeat(30));
    }

    private static void logStatement(Path path) throws IOException {
        try {
            Path parent = path.getParent();
            if(!Files.exists(parent)) {
                Files.createDirectories(parent); // This is to create multiple directories
            }
        } catch (IOException e) {
            System.out.println("Error while creating directories " + Arrays.toString(e.getStackTrace()));
        }
        Files.writeString(path, Instant.now() +  " Vanakam da mapla pathlisting la irunthu \n",
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);

    }

    private static void extraInfo(Path path) {
        try {
            var atts = Files.readAttributes(path, "*");
            for(Map.Entry map : atts.entrySet()) {
                System.out.println("Key = " + map.getKey() + " : Value = " + map.getValue());
            }
            System.out.println(Files.probeContentType(path));
        } catch (IOException e) {
            System.out.println("Some problem");
        }
    }
}
