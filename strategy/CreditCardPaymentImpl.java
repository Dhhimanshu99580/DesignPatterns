package strategy;

public class CreditCardPaymentImpl implements Payment{
    @Override
    public void pay() {
        System.out.println("Client wants to pay through Credit card. Please use Credit card algo logic...");
    }
}
