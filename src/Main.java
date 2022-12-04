public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        //int credit = 1_000_000; сумма кредита
        //int term = 1; срок кредита в годах
        //double percent = 9.99; годовая процентная ставка
        //double Payment = service.calculate(credit, term, percent);
        //int YourPayment = (int) payment;

        System.out.println( "Credit term 1 year. Your monthly payment is ");
        System.out.println(service.calculate(1_000_000,1,9.99));

        System.out.println( "Credit term 2 years. Your monthly payment is ");
        System.out.println(service.calculate(1_000_000,2,9.99));


        System.out.println( "Credit term 3 years. Your monthly payment is ");
        System.out.println(service.calculate(1_000_000,3,9.99));
    }

}
