import java.util.Scanner;

public class answer2DOWHILE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество элементов: ");
        int all = scanner.nextInt();

        int sum = 0;

        System.out.println("Введите число: ");
        int i = 0;
        do {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
            }
            i++;
        } while (i < all);

        System.out.println("Сумма четных элементов: " + sum);
    }
}

