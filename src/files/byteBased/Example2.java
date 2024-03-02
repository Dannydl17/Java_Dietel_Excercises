package files.byteBased;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\src\\files\\byteBased\\example.txt";
        try(FileOutputStream outputStream = new FileOutputStream(location)){
            String data = "Up Nepa!";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
