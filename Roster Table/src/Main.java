import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int days = 3;

        ArrayList<ArrayList<String>> roster = new ArrayList<ArrayList<String>>(days);
        ArrayList<String> day1 = new ArrayList<String>();
        ArrayList<String> day2 = new ArrayList<String>();
        ArrayList<String> day3 = new ArrayList<String>();

        day1.add("Alice");
        day1.add("Bob");
        roster.add(day1);

        day2.add("Alice");
        day2.add("Sam");
        day2.add("Mike");
        roster.add(day2);

        day3.add("Ray");
        day3.add("Sam");
        roster.add(day3);

        getDays(roster, "Alice");
        getDays(roster, "Sam");
    }
    public static void getDays(ArrayList<ArrayList<String>> rosterTable, String name) {
        for (ArrayList<String> arrayList: rosterTable) {
            for (String str: arrayList) {
                if (str.contentEquals(name)) {
                    System.out.println(rosterTable.indexOf(arrayList) + 1);
                }
            }
        }
    }

}