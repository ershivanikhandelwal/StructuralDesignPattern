public class OrderManagement implements IOrderManagement{
    private IOrderCheckoutFacade checkoutService= new OrderCheckoutFacade();
    @Override
    public void OrderCheckout(long orderId) {
       checkoutService.checkout(orderId);
    }
}
