public class OrderCheckoutFacade implements IOrderCheckoutFacade {
    private ICheckInventory inventory= new CheckInventory();
    private IPayment processPaymenet= new Payment();
    private IInvoiceService invoice= new InvoiceService();
    private INotificationService notification= new NotificationService();
    @Override
    public void checkout(long orderId) {
        if(!this.inventory.isInventory(orderId)){
            throw new RuntimeException("Exception occured");
        }
        processPaymenet.processPayment(orderId);
        invoice.createInvoice(orderId);
        notification.sendNotification(orderId);
    }
}
