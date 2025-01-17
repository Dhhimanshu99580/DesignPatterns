package strategy;

public class UpiPaymentImpl implements Payment{
    @Override
    public void pay() {
        System.out.println("Client wants to pay through UPI. Please use the upi algo logic...");
    }
}
