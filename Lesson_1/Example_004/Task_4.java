package Lesson_1.Example_004;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_4 {

    private static List<Integer> generateNumbers(String numStr) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            String newNumStr = numStr.replace('?', (char) ('0' + i));
            numbers.add(Integer.parseInt(newNumStr));
        }
        return numbers;
    }

    public static void solveEquation(String equation) {
        int equalsIndex = equation.indexOf(" = ");
        int plusIndex = equation.indexOf(" + ");
        if (equalsIndex == -1 || plusIndex == -1) {
            System.out.println("Неверный формат выражения");
            return;
        }

        String firstAddend = equation.substring(0, plusIndex);
        String secondAddend = equation.substring(plusIndex + 3, equalsIndex);
        String resultStr = equation.substring(equalsIndex + 3);

        if (resultStr.contains("?")) {
            System.out.println("Решение не поддерживается, если в ответе содержится '?'");
            return;
        }
        int result = Integer.parseInt(resultStr);

        List<Integer> firstAddends = generateNumbers(firstAddend);
        List<Integer> secondAddends = generateNumbers(secondAddend);

        boolean foundSolution = false;

        for (int first : firstAddends) {
            for (int second : secondAddends) {
                if (first + second == result) {
                    System.out.println(first + " + " + second + " = " + result);
                    foundSolution = true;
                }
            }
        }

        if (!foundSolution) {
            System.out.println("Уравнение " + equation + " не имеет решений");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите выражение в формате q + w = e, где q, w, e > 0: ");
        String equation = sc.nextLine();

        solveEquation(equation);

        sc.close();
    }
}
