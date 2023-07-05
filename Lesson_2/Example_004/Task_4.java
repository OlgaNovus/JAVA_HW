package Lesson_2.Example_004;

import java.util.Scanner;
import java.util.logging.Logger;

public class Task_4 {

    private static final Logger log = Logger.getLogger(Task_4.class.getName());

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        log.info("Результат операции: "+result);

    }
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
            log.info("Считано значение: " + num);
        } else {
            System.out.println("При вводе числа допущена ошибка. Повторите ввод.");
            scanner.next();
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("При вводе операции допущена ошибка. Повторите ввод.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());

        }
        return result;
    }
}