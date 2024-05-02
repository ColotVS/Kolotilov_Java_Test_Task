import java.util.InputMismatchException;
import java.util.Scanner;

public class First_Task_Java {
    public static void main(String[] args) {
        int a, b;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Необходимо ввести 2 целых числа");
            System.out.print("Введите первое число a:");
            a = scanner.nextInt();
            System.out.print("Введите второе число b:");
            b = scanner.nextInt();
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a / b = " + ((float)a / b));
            System.out.println("a * b = " + ((long)a * b));
        } catch (InputMismatchException exception) {
            System.err.println("Введено неверное значение");
        }
    }
}
