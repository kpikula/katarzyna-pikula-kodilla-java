package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MeanCalculator {
    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Nowak", "114111111111111");
        Student student2 = new Student("Anna", "Kowalska", "111131111111111");
        Student student3 = new Student("Witold", "Masz", "112111111111111");

        Grade grade1 = new Grade();
        grade1.addGrade(2.0);
        grade1.addGrade(3.0);
        grade1.addGrade(5.0);
        grade1.addGrade(3.5);

        Grade grade2 = new Grade();
        grade2.addGrade(3.0);
        grade2.addGrade(4.0);

        Grade grade3 = new Grade();
        grade3.addGrade(6.0);
        grade3.addGrade(3.0);

        HashMap<Student, Grade> gradeMap = new HashMap<>();
        gradeMap.put(student1, grade1);
        gradeMap.put(student2, grade2);
        gradeMap.put(student3, grade3);

        for(Map.Entry<Student, Grade> entry : gradeMap.entrySet()) {
            System.out.println("Grades of " + entry.getKey() + ": " + entry.getValue().gradeMean());
        }
    }
}