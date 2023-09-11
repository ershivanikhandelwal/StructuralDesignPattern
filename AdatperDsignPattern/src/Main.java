// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PaymentProvider provider= new RazorPayAdapter();
        provider.CreatePayment(1,"HDFC","Test@gmail.com",1000);
        provider.getPaymentStatus(1);
    }
}