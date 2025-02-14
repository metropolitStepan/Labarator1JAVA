import java.util.Scanner;

public class answer24DOWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int index = 1;
        int currentIndex = 1;

        System.out.println("Введи последовательность, дальше 0 программа считать не будет:");

        int number;

        do {
            number = scanner.nextInt();
            if (number != 0) {
                if (number > max) {
                    max = number;
                    index = currentIndex;
                }
                currentIndex++;
            }
        } while (number != 0);

        System.out.println("Номер максимального элемента: " + index);
    }
}
