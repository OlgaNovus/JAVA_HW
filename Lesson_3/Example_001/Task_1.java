package Lesson_3.Example_001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            myList.add(random.nextInt(50));
        }

        System.out.println(Arrays.toString(myList.toArray()));

        ArrayList<Integer> removedEven = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            int current = myList.get(i);

            if (current % 2 != 0) {
                removedEven.add(current);
            }
        }

        System.out.println(Arrays.toString(removedEven.toArray()));

        Integer minValue = Integer.MAX_VALUE;
        Integer maxValue = Integer.MIN_VALUE;
        Double avg = 0.0;
        for (int i = 0; i < myList.size(); i++) {
            int current = myList.get(i);

            if (maxValue < current) {
                maxValue = current;
            }

            if (minValue > current) {
                minValue = current;
            }

            avg += current;
        }

        System.out.println("Максимальное: " + maxValue);
        System.out.println("Минимальное: " + minValue);
        System.out.println("Среднее: "+ (avg / myList.size()));
    }
}
