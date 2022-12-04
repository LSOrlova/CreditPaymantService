public class CreditPaymentService {
    public double calculate(int credit, int term, double percent){
        int time = term*12;
        double payment = credit * ((percent / 12) / (1 - (1 / (1 + 9.99 / 12))));
        return payment;
    }
}
