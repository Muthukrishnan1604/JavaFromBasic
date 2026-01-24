package src.main.java.org.example.filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;

public class FileListings {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("");
        System.out.println("cwd = " + path.toAbsolutePath());
        try(Stream<Path> paths = Files.list(path);) {
            paths
                    .map(FileListings::listDir)
                            .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(30));

        try(Stream<Path> paths = Files.walk(path, 2);) {
            paths
                    .filter(Files::isRegularFile)
                    .map(FileListings::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(30));

        Files.createDirectories(path);

        try(Stream<Path> paths = Files.find(path, 2, (path1, attr) -> attr.isRegularFile())) {
            paths
                    .map(FileListings::listDir)
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        path = path.resolve(".idea");

        System.out.println("=".repeat(10) + "Directory Stream" + "=".repeat(10));
        try(var dirs = Files.newDirectoryStream(path, "*.xml")) {
            dirs.forEach(System.out::println);
        }

        System.out.println("=".repeat(10) + "Directory Stream" + "=".repeat(10));
        try(var dirs = Files.newDirectoryStream(path, p -> p.getFileName().toString().endsWith(".xml"))) {
            dirs.forEach(System.out::println);
        }

    }

    private static String listDir(Path path) {
        try{
            boolean isDirectory = Files.isDirectory(path);
            if(Files.isHidden(path))
                System.out.println("This path is hidden " + path);
            FileTime datefield = Files.getLastModifiedTime(path);
            LocalDateTime ldt = LocalDateTime.ofInstant(datefield.toInstant(), ZoneId.systemDefault());
            return "%tD %tT %-5s %12s %s".formatted(ldt, ldt, (isDirectory ? "<DIR>" : ""), (isDirectory ? "" : Files.size(path)), path);
        } catch (IOException exception) {
            System.out.println("Something went wrong with " + path);
            return path.toString();
        }
    }

}
