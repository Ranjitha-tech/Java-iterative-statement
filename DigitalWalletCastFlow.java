class Wallet {
    void openWallet() {
        System.out.println("Wallet Opened");
    }
}

class CryptoWallet extends Wallet {
    void tradeCoins() {
        System.out.println("Trading Cryptocurrency");
    }
}

public class DigitalWalletCastFlow {
    public static void main(String[] args) {

        Wallet wallet = new CryptoWallet();

        wallet.openWallet();

        CryptoWallet crypto = (CryptoWallet) wallet;

        crypto.tradeCoins();
    }
}