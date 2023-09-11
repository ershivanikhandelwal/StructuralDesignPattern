public interface PaymentProvider {
    public void CreatePayment(PaymentRequest request);
    public PaymentStatus getPaymentStatus(long id);
}
