package files.byteBased;

import files.bank.Transaction;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class Example5 {

    public static void main(String[] args) {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(
                System.out
        )){
            Transaction transaction = new Transaction("Tobi", "Ope", BigDecimal.valueOf(4000).toString());
         outputStream.writeObject(transaction);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
