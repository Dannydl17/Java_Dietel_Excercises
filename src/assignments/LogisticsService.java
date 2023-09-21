package assignments;

public class LogisticsService {
    public static int calculateRiderPayment(int delivery) {
        int amount = 0;
        if (delivery >= 70) {
            amount = delivery * 500 + 5000;
        }
        else if (delivery >= 60 && delivery < 69) {
            amount = delivery * 250 + 5000;
        }
        else if (delivery >= 50 && delivery < 59) {
            amount = delivery * 200 + 5000;
        }
        else {
            amount = delivery * 160 + 5000;
        }
        return amount;
    }
}
