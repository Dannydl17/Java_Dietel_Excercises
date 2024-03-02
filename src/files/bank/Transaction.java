package files.bank;

public class Transaction {

    private  String sender;
    private String receipient;

    private String amount;

    public Transaction(String sender, String receipient, String amount) {
        this.sender = sender;
        this.receipient = receipient;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceipient() {
        return receipient;
    }

    public void setReceipient(String receipient) {
        this.receipient = receipient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "sender='" + sender + '\'' +
                ", receipient='" + receipient + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
