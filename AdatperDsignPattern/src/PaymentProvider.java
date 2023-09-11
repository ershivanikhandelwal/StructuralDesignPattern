public interface PaymentProvider {
    public void CreatePayment(long id, String name, String email, double amount);
    public PaymentStatus getPaymentStatus(long id);
}
