package strategy;

public class ContextToChooseAlgo {
    Payment payment;
    public void setContextToChooseAlgo(Payment payment) {
        this.payment = payment;
    }
    public void pay() {
        payment.pay();
    }
}
