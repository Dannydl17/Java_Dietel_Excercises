package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PracticeFiles {

    public static void createFile(String location, String fileName) {
        Path path = Paths.get(location, fileName);
        try{
            Files.createFile(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void createDirectory(String location) {
        Path path = Paths.get(location);
        try{
            Files.createFile(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void deleteDirectory(String location) {
        Path path = Paths.get(location);
        try {
            Files.deleteIfExists(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }

    public static void deleteFile(String location, String fileName){
        Path path = Paths.get(location, fileName);
        try{
            Files.delete(path);
        }catch (IOException exception){
            System.err.println(exception.getMessage());

        }
    }

}
