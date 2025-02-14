import java.util.Scanner;

public class answer24WHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int index = 1;
        int currentIndex = 1;

        System.out.println("Введи последовательность, дальше 0 программа считать не будет:");

        int number = scanner.nextInt();

        while (number != 0) {
            if (number > max) {
                max = number;
                index = currentIndex;
            }
            currentIndex++;
            number = scanner.nextInt();
        }

        System.out.println("Номер максимального элемента: " + index);
    }
}
