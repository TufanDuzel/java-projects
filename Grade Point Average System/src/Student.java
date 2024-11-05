import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> course;
    private ArrayList<Character> grade;

    public Student(String name) {
        this.name = name;
        course = new ArrayList<String>();
        grade = new ArrayList<Character>();
    }

    public String getName() {
        return name;
    }

    public void add(String c, Character g) {
        course.add(c);
        grade.add(g);
    }

    public ArrayList<String> getCourses() {
        return course;
    }

    public double getGPA() {
        double totalPoint = 0.0;

        for(char g : grade) {
            switch(g) {
                case 'A':
                    totalPoint += 4.0;
                    break;
                case 'B':
                    totalPoint += 3.0;
                    break;
                case 'C':
                    totalPoint += 2.0;
                    break;
                case 'D':
                    totalPoint += 1.0;
                    break;
                case 'F':
                    totalPoint += 0.0;
                    break;
            }
        }

        return totalPoint / grade.size();
    }
}
