package Lesson_1.Example_002;

import java.util.StringJoiner;

public class Task_2 {

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[ ", " ]");

        for (int i = 1; i <= 1000; i++) {
            if (isSimple(i)) {
                joiner.add(String.valueOf(i));
            }
        }

        System.out.println("Список простых чисел от 1 до 1000: " + joiner.toString());
    }

    public static boolean isSimple(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
