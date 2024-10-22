import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter how much you can spend: ");
        double maxSpending = sc.nextDouble();
        double sumOfProportions = 0;
        int i = 0;

        ArrayList<Double> proportions = new ArrayList<Double>();

        System.out.println("Please enter your proportion of various expenses.");
        System.out.println("(The system will be stop if cumulative proportion exceeds 100%.)");

        do {
            System.out.println("Your proportion of expense " + (i + 1) + ": ");
            double enteredValue = sc.nextDouble();
            proportions.add(enteredValue);

            sumOfProportions += proportions.get(i);

            i++;
        } while (sumOfProportions <= 100);

        sc.close();

        if (sumOfProportions > 100) {
            double cumulativeSum = 0.0;

            for (int j = 0; j < proportions.size() - 1; j++) {
                cumulativeSum += proportions.get(j);
            }

            proportions.set(proportions.size() - 1, 100.0 - cumulativeSum);
        }

        for (double value: proportions) {
            double expense = value * maxSpending / 100.0;

            System.out.println("Your " + value + "% equals: $" + expense);
        }
    }
}