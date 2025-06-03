import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = new ArrayList<>(grades);
    }

    public void addGrade(int grade) {
        if (grade >= 0){
            grades.add(grade);
        }
    }

    public double average() {
        double sum = 0;
        for (double gradeT : grades){
            sum += gradeT;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void printGrades() { }
}
