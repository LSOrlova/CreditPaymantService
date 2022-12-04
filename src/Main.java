public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        int term = 1;
        double percent = 9.99;
        double payment = service.calculate(credit, term, percent);
        System.out.println( "Your monthly payment is " + payment);

    }

}
