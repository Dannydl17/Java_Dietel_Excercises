package files.byteBased;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        // FileInputStream
        String fileLocation ="C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\src\\files\\byteBased\\example.txt";
        try(FileInputStream fileInputStream = new FileInputStream(fileLocation)){
            byte[] fileBytes = fileInputStream.readAllBytes();
            System.out.println(new String(fileBytes));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
