interface Payment {
    void pay(double amount) throws Exception;
}

class CardPayment implements Payment {
    public void pay(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid payment amount");
        }
        System.out.println("Card payment successful: " + amount);
    }
}

public class InterfaceExceptionDemo {
    public static void main(String[] args) {
        try {
            Payment p = new CardPayment();
            p.pay(-500);
        }
        catch (Exception e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }
}
