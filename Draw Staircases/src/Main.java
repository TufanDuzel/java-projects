import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        int width = 0;

        System.out.println("Please enter the number of steps: ");
        steps = scanner.nextInt();

        System.out.println("Please enter the number of width: ");
        width = scanner.nextInt();

        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < (i + 1) * width; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}