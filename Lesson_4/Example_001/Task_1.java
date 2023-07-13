package Lesson_4.Example_001;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(Arrays.toString(list.toArray()));

        LinkedList<Integer> reversedList = reverseLinkedList(list);
        System.out.println(reversedList);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}
