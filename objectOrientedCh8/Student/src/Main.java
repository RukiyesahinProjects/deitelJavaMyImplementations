import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Student s1 = new Student("Ali");
        List<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(50);
      s1.setGrades(list);
        System.out.println(s1.getGrades());
        list.add(100);
        System.out.println(s1.getGrades());
        s1.addGrade(100);
        System.out.println(s1.getGrades());
        s1.average();
      System.out.println(s1.average());
    }
}