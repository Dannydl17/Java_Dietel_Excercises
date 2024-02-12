package files;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class PracticeFilesTest {

    @Test
    public void testCreateFile(){
        String fileName = "practice.txt";
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\files";

        PracticeFiles.createFile(location, fileName);

        Path path = Paths.get(location, fileName);
        assertTrue(Files.exists(path));
    }

    @Test
    public void testCreateDirectory(){
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\Danny";
        PracticeFiles.createDirectory(location);

        Path path = Paths.get(location);
        assertTrue(Files.exists(path));
    }

    @Test
    public void testThatFileCanBeDeleted(){
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\Danny";
        PracticeFiles.deleteDirectory(location);

        Path path = Paths.get(location);
        assertFalse(Files.exists(path));
    }

    @Test
    public void testCreateFileCanBeDeleted(){
        String fileName = "practice.txt";
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\files";

        PracticeFiles.deleteFile(location, fileName);

        Path path = Paths.get(location, fileName);
        assertFalse(Files.exists(path));
    }
}