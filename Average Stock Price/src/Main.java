public class Main {
    public static void main(String[] args) {
        Stock stockOfCompany = new Stock();

        stockOfCompany.buyStock(28.5, 1500);
        stockOfCompany.buyStock(32.3, 3000);

        stockOfCompany.sellStock(42.9, 2000);

        System.out.println("The total amount of shares: " + stockOfCompany.getShares());
        System.out.println("The current price of the share: " + stockOfCompany.getPrice());
        System.out.println("The average price of the share: " + stockOfCompany.getAveragePrice());
    }
}