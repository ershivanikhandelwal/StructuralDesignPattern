// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PaymentProvider provider= new RazorPayAdapter();
        PaymentRequest pr=PaymentRequest.builder().id(1).name("HDFC").email("Test@Gmail.com").amount(1000).build();
        provider.CreatePayment(pr);
        provider.getPaymentStatus(1);

        PaymentProvider payuProvide= new PayUAdapter();
        payuProvide.CreatePayment(pr);
        payuProvide.getPaymentStatus(1);
    }
}