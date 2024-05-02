public class Third_Task_Java {
    /**
     * Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
     * Необходимо написать программу, которая выведет в консоль все чётные числа.
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Чётные числа в массиве от 1 до 10 это: ");
        for (int x : array) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}
