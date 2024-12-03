public class Main {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.addMarks("Mathematics", 70);
        john.addMarks("English", 65);
        john.addMarks("History", 95);

        Student penny = new Student("Penny");
        penny.addMarks("Mathematics", 50);
        penny.addMarks("English", 95);
        penny.addMarks("History", 80);

        if (john.compareTo(penny) > 0) {
            System.out.println(john.getName() + " has a higher total mark.");
        } else if (john.compareTo(penny) == 0) {
            System.out.println("Both students have same total marks.");
        } else {
            System.out.println(penny.getName() + " has a higher total mark.");
        }
    }
}