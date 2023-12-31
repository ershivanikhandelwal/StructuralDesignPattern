public class RazorPayAdapter implements PaymentProvider{
    private RazorPayAPI rp= new RazorPayAPI();
    @Override
    public void CreatePayment(PaymentRequest request) {
        rp.Pay(request.getId(),request.getName(),request.getEmail(),request.getAmount());
    }

    @Override
    public PaymentStatus getPaymentStatus(long id) {
        return to(rp.checkStatus(id));
    }

    public PaymentStatus to(RazorPayStatus rps){
        switch(rps){
            case OK: return PaymentStatus.OK;
            case BADREQUEST:return PaymentStatus.FAILED;
        }
        throw new IllegalArgumentException("Invalid Payment Status");
    }
}
