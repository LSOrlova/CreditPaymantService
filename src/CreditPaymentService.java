public class CreditPaymentService {
    public double calculate(int credit, int term, double percent){
        int time = term * 12; // срок кредита в месяцах
        double monthlyPercent = percent / 12 / 100; //месячная процентная ставка
        double a = 1 + monthlyPercent; // выражение под степенью
        double payment = credit * ((monthlyPercent * Math.pow(a,time)) / (Math.pow(a,time)-1));
        int YourPayment = (int) payment; // месячный платеж
        return YourPayment;
    }
}
