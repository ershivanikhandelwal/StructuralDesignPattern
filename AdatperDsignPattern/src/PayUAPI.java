public class PayUAPI {
    public void MakeAPayment(long id, Double amount){
        System.out.println("Pay U Payment");
    }

    public PayUStatus getStatus(long id){
        return PayUStatus.OK;
    }
}
