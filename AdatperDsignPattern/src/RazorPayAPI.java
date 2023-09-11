public class RazorPayAPI {
    public void Pay(long id, String name, String email, double amount){
        System.out.println("Razor pay payment");
    }

    public RazorPayStatus checkStatus(long id){
        return RazorPayStatus.OK;
    }
}
