package files.bank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {
        String location = "C:\\Users\\Daniel\\Documents\\IdeaProjects\\javaPrograms\\src\\files\\bank\\transaction.txt";
        List<Transaction> lisOfTransaction = new ArrayList<>();
        lisOfTransaction.add(new Transaction("Daniel","Melody", BigDecimal.valueOf(5000).toString()));
        lisOfTransaction.add(new Transaction("Toby","Melody", BigDecimal.valueOf(5000).toString()));
        lisOfTransaction.add(new Transaction("Phillip","Melody", BigDecimal.valueOf(5000).toString()));

        writeTransaction(lisOfTransaction,location);
    }

    public static void  writeTransaction(List<Transaction> transactions, String fileLocation){
        try (FileOutputStream outputStream = new FileOutputStream(fileLocation)){
            for(Transaction transaction : transactions){

                if(!transaction.equals(transactions.get(0))){
                    outputStream.write("\n".getBytes());
                    sendToStream(transaction, outputStream);
                }
                else sendToStream(transaction, outputStream);
            }
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }

    private static void sendToStream(Transaction transaction, FileOutputStream outputStream) throws IOException {
        outputStream.write((transaction.getSender()+"   ").getBytes());
        outputStream.write(transaction.getReceipient().concat("   ").getBytes());
        outputStream.write(transaction.getAmount().concat("    ").getBytes());
    }
}
