import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the vehicle type: ");
        System.out.println("(Available vehicle types are; car, motorcycle, bus and truck.)");

        String type = scanner.nextLine();
        int premium = 0;

        switch (type) {
            case "car":
                premium = 200;
                break;

            case "motorcycle":
                System.out.println("Please enter the motorcycle type:");
                System.out.println("1: Low power, 2: Medium power, 3: High power.");

                String motorcycleType = scanner.nextLine();
                int motorcycleTypeInt = Integer.parseInt(motorcycleType);

                switch (motorcycleTypeInt) {
                    case 1:
                        premium = 100;
                        break;

                    case 2:
                        premium = 200;
                        break;

                    case 3:
                        premium = 300;
                        break;

                    default:
                        System.out.println("Unknown motorcycle type.");
                }
                break;

            case "bus":
                premium = 400;
                break;

            case "truck":
                premium = 500;
                break;

            default:
                System.out.println("Unknown vehicle type.");
        }

        System.out.println("The premium is $" + premium + ".");

        scanner.close();
    }
}