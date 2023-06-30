package Lesson_1.Example_001;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите желаемое число для расчета треугольного числа и факториала: ");
        int n = in.nextInt();

        int triangleResult = triangularNumberOfN(n);
        int factorialResult = factorial(n);

        System.out.println("Треугольное число для " + n + " = " + triangleResult);
        System.out.println("Факториал числа " + n + " = " + factorialResult);

        in.close();
    }

    public static int triangularNumberOfN(int value) {
        int result = 0;

        for (int i = 1; i <= value; i++) {
            result += i;
        }

        return result;
    }

    public static int factorial(int value) {
        int result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }
}
