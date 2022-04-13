package LinkedArrayLists;

import java.util.ArrayList;
import java.util.List;

public class GradesCalculator {
    public static void main(String[] args) {
        List<Double> gradeList = new ArrayList<>();
        gradeList.add(2.5);
        gradeList.add(3.5);
        gradeList.add(3.5);
        gradeList.add(4.0);
        gradeList.add(4.5);
        gradeList.add(3.0);
        gradeList.add(5.5);

        double sum = 0.0;
        double min = gradeList.get(0);
        double max = gradeList.get(0);
        for (int i = 0; i < gradeList.size(); i++) {
            System.out.println("Grade: " + gradeList.get(i));
            sum+= gradeList.get(i);
            if (gradeList.get(i) < min) {
                min = gradeList.get(i);
            }
            if (gradeList.get(i) > max) {
                max = gradeList.get(i);
            }
        }

        System.out.println("Sum " + sum);
        double mean = (sum - min - max) / (gradeList.size() -2);
        System.out.println("Min " + min) ;
        System.out.println("Max " + max) ;
        System.out.println("Mean " + mean) ;
    }
}