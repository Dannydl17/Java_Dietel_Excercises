package files.byteBased;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\src\\turtleApp\\Turtle.java";
        try(DataInputStream inputStream = new DataInputStream(
                new FileInputStream(location)
        )){
           byte[] bytes = inputStream.readAllBytes();
            System.out.println(new String(bytes));
        }catch (IOException exception){
            System.err.println(exception.getMessage());

        }
    }
}
