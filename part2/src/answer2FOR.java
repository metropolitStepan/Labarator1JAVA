import java.util.Scanner;

public class answer2FOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество элементов: ");
        int all = scanner.nextInt();

        int sum = 0;

        System.out.println("Введите число:");
        for (int i = 0; i < all; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Сумма четных элементов: " + sum);
    }
}
