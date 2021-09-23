package com.kodilla.testing.collection;

import java.lang.reflect.Array;
import java.util.*;

public class OddNumbersExterminator {
    public void exterminate(List<Integer> allNumbers) {
        int number = 0;
        for (int i = 0; i < allNumbers.size(); i++) {
            number = allNumbers.get(i);
            if (number % 2 == 0) {
                List<Integer> evenList = Arrays.asList(number);
                System.out.println(evenList);

            }

        }

    }



    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6)); {
            int size = allNumbers.size();
            System.out.println("Array size: " + size);
            System.out.println("All numbers: " + allNumbers);

            OddNumbersExterminator pick = new OddNumbersExterminator();
            pick.exterminate(allNumbers);


        }
    }
}



