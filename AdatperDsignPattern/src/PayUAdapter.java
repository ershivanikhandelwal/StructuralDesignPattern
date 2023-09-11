public class PayUAdapter implements PaymentProvider{
    private PayUAPI pu= new PayUAPI();
    @Override
    public void CreatePayment(long id, String name, String email, double amount) {
        pu.MakeAPayment(id,amount);
    }

    @Override
    public PaymentStatus getPaymentStatus(long id) {
        return to(pu.getStatus(id));
    }

    private PaymentStatus to(PayUStatus pus){
        switch(pus){
            case OK: return PaymentStatus.OK;
            case BADREQUEST: return PaymentStatus.FAILED;
        }
        throw new IllegalArgumentException("Invalid Payment Status");
    }
}
