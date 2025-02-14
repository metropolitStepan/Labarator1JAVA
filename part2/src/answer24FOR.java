import java.util.Scanner;

public class answer24FOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int index = 1;
        int currentIndex = 1;

        System.out.println("Введи последовательность, дальше 0 программа считать не будет:");

        for (int number = scanner.nextInt(); number != 0; number = scanner.nextInt()) {
            if (number > max) {
                max = number;
                index = currentIndex;
            }
            currentIndex++;
        }

        System.out.println("Номер максимального элемента: " + index);
    }
}

