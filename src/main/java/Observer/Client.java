package Observer;

public class Client {
    public static void main(String[] args) {
        Amazon amazon=Amazon.getInstance();
        EmailService emailService=new EmailService();
        InventoryService inventoryService=new InventoryService();
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();

        amazon.onOrderPlaced();
    }
}
