public class Payment implements IPayment{
    @Override
    public void processPayment(long orderId) {
        System.out.println("Payment is successful");
    }
}
