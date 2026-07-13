class Payment {
    void pay() {
        System.out.println("Payment initiated.");
    }
}

class CreditCard extends Payment {
    void swipeCard() {
        System.out.println("Credit card swiped.");
    }
}

public class PaymentGatewayUpcasting {

    public static void main(String[] args) {

        Payment payment = new CreditCard(); // Upcasting

        payment.pay();
    }
}
