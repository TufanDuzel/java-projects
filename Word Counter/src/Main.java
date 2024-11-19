import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type your paragraph: ");
        String userInput = scanner.nextLine();
        scanner.close();

        userInput = userInput.trim();

        int words = 0;

        if (userInput.length() == 0) {
            words = 0;
        } else {
            words++;

            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) == ' ' && userInput.charAt(i + 1) != ' ') {
                    words++;
                }
            }
        }

        System.out.println("Total words in your paragraph: " + words);
    }
}