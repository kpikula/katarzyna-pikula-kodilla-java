package HashMap;

import java.util.ArrayList;
import java.util.List;

public class Grade {
    private List<Double> grades = new ArrayList<>();

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double gradeMean() {
        double sum = 0;
        for(Double grade : grades) {
            sum+= grade;
        }
        return sum / grades.size();
    }
}