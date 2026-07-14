class BankService {
    void login() {
        System.out.println("Customer logged into banking portal.");
    }
}

class PremiumAccount extends BankService {

    void rewardPoints() {
        System.out.println("Premium reward points credited.");
    }
}

public class PremiumAccountDowncasting {

    public static void main(String[] args) {

        BankService service = new PremiumAccount();

        service.login();

        PremiumAccount premium = (PremiumAccount) service;
        premium.rewardPoints();
    }
}