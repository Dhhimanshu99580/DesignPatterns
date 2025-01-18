package strategy;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.println("Please choose through what would you like to pay..");
        System.out.println("Please choose 1 for credit"+"\n"+"Please use 2 for UPI");
        Scanner sc  = new Scanner(System.in);
        ContextToChooseAlgo contextToChooseAlgo = new ContextToChooseAlgo();
        switch (sc.nextInt()) {
            case 1: Payment payment = new CreditCardPaymentImpl();
                    contextToChooseAlgo.setContextToChooseAlgo(payment);
                    contextToChooseAlgo.pay();
            case 2: Payment payment1 = new UpiPaymentImpl();
                    contextToChooseAlgo.setContextToChooseAlgo(payment1);
                    contextToChooseAlgo.pay();
                    break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
