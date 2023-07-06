package Lesson_2.Example_002;

import java.util.Scanner;
import java.util.logging.Logger;

public class Task_2 {
    private static final Logger log = Logger.getLogger(Task_2.class.getName());
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        int n, arr[];
        n = in.nextInt();

        log.info(String.valueOf(n));

        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(i + " ");
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            log.info(arr[i] + "\n");
        }
    }

    public static void bubbleSort(int[] sortArray) {
        for (int i = 0; i < sortArray.length - 1; i++) {
            for (int j = 0; j < sortArray.length - i - 1; j++) {
                if (sortArray[j + 1] < sortArray[j]) {
                    int swap = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = swap;
                }
            }
        }
    }
}
