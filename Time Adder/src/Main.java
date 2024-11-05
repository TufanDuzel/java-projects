import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the current hour: ");
        int currentHour = scanner.nextInt();
        System.out.println("Please enter the current minute: ");
        int currentMinute = scanner.nextInt();
        System.out.println("Please enter the current second: ");
        int currentSecond = scanner.nextInt();

        System.out.println("Please enter the hour to go forward: ");
        int forwardHour = scanner.nextInt();
        System.out.println("Please enter the minute to go forward: ");
        int forwardMinute = scanner.nextInt();
        System.out.println("Please enter the second to go forward: ");
        int forwardSecond = scanner.nextInt();

        int answerHour = 0;
        int answerMinute = 0;
        int answerSecond = 0;

        int carryMinute = 0;
        int carrySecond = 0;

        boolean isNextDay = false;

        answerSecond = currentSecond + forwardSecond;
        if (answerSecond > 60) {
            answerSecond -= 60;
            carrySecond = 1;
        }

        answerMinute = currentMinute + forwardMinute + carrySecond;
        if (answerMinute > 60) {
            answerMinute -= 60;
            carryMinute = 1;
        }

        answerHour = currentHour + forwardHour + carryMinute;
        if (answerHour >= 24) {
            answerHour -= 24;
            isNextDay = true;
        }

        if (isNextDay) {
            System.out.println("The new time is: " + answerHour + ":" + answerMinute + ":" + answerSecond + " on the next day.");
        } else {
            System.out.println("The new time is: " + answerHour + ":" + answerMinute + ":" + answerSecond);
        }

        scanner.close();
    }
}