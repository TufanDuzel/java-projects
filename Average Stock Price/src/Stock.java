public class Stock {
    private double price;
    private int shares;
    private double capital;

    public void buyStock(double price, int shares) {
        this.price = price;
        this.shares += shares;
        capital += price * shares;
    }

    public void sellStock(double price, int shares) {
        this.price = price;
        this.shares -= shares;
        capital -= price * shares;
    }

    public double getPrice() {
        return price;
    }

    public int getShares() {
        return shares;
    }

    public double getAveragePrice() {
        return capital / shares;
    }
}
