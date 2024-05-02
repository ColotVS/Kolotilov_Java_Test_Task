import java.util.Scanner;

public class Second_Task_Java {
    /**
     * Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
     *В результате сравнения в консоль должно быть выведено одно из сообщений:
     *"Строки неидентичны" или "Строки идентичны"
     */
    public static void main(String[] args) {
        System.out.println("Необходимо ввести 2 строки");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();
        if (firstString.equals(secondString)){
            System.out.println("Строки идентичны");
        }
        else System.out.println("Строки неидентичны");
    }
}
