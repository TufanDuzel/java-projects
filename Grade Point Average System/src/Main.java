public class Main {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.add("English", 'A');
        john.add("Mathematics", 'B');
        john.add("Geography", 'D');
        john.add("Physics", 'C');

        System.out.println(john.getName() + " has a GPA of: " + john.getGPA());

        System.out.println("This GPA is obtained from these courses: ");
        for(String course : john.getCourses()) {
            System.out.println(course);
        }
    }
}