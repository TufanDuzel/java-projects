import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter number of the students: ");

        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();

        String[] studentName = new String[numOfStudents];
        int[] studentAge = new int[numOfStudents];

        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Please enter the name and the age for the students.");
            studentName[i] = scanName.nextLine();
            studentAge[i] = scanAge.nextInt();
        }

        for (int i = 0; i < numOfStudents; i++) {
            if (studentAge[i] >= 14) {
                System.out.println(studentName[i] + " can receive a vaccine.");
                System.out.println("This student is " + studentAge[i] + " years old.");
            } else {
                System.out.println(studentName[i] +  " cannot be vaccinated.");
                System.out.println("This student is " + studentAge[i] + " years old.");
            }
        }

        scanner.close();
        scanName.close();
        scanAge.close();
    }
}