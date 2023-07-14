package Lesson_4.Example_003;

import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Logger;

public class Task_3 {
    private static final Logger log = Logger.getLogger(Task_3.class.getName());

    private static final Scanner scanner = new Scanner(System.in);
    private static final Stack<Operation> history = new Stack<>();

    public static void main(String[] args) {
        while (true) {
            int num1 = getInt();
            int num2 = getInt();
            char operation = getOperation();

            if (operation == 'Z' && !history.empty()) {
                Operation lastOperation = history.pop();
                
                log.info("Отменена последняя операция: " + lastOperation.num1 + lastOperation.operation
                        + lastOperation.num2 + " = " + lastOperation.result);
            } else {
                int result = calc(num1, num2, operation);

                log.info("Результат операции: " + result);

                history.push(new Operation(num1, num2, operation, result));
            }
        }
    }

    public static int getInt() {
        System.out.println("Введите число:");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            log.info("Считано значение: " + num);
        } else {
            System.out.println("При вводе числа допущена ошибка. Повторите ввод.");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите операцию:");

        char operation;

        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("При вводе операции допущена ошибка. Повторите ввод.");
            scanner.next();
            operation = getOperation();
        }

        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    private static class Operation {
        int num1;
        int num2;
        char operation;
        int result;

        Operation(int num1, int num2, char operation, int result) {
            this.num1 = num1;
            this.num2 = num2;
            this.operation = operation;
            this.result = result;
        }
    }
}