import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Please enter your buying price per share: ");
        double buyingPrice = sc.nextDouble();
        double closingPrice = 0.0;

        int day = 1;

        do {
            System.out.println("Please enter closing price for the day " + day + ".");
            System.out.println("(Enter any negative value if you want to leave.)");
            closingPrice = sc.nextDouble();

            if (closingPrice < 0.0) break;

            double earnings = closingPrice - buyingPrice;
            if (closingPrice > 0.0) {
                System.out.println("After day " + day + ", you earned: " + df.format(earnings) + " per share.");
            } else if (closingPrice < 0.0) {
                System.out.println("After day " + day + ", you lose: " + df.format(-earnings) + " per share.");
            } else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }

            day += 1;
        } while (true);

        sc.close();
    }
}