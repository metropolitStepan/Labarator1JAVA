import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double n = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double m = scanner.nextDouble();

        if (m == 1) {
            System.out.println("Ошибка деления на ноль при m = " + m);
            return;
        }

        double result = n++ / --m;
        result++;
        System.out.println(result);
//        double n = Double.MIN_VALUE;
//        double m = Double.MAX_VALUE;
//        int n = 5;
//        System.out.println("n до " + n);
//        n++;
//        System.out.println("n после " + n);
//        int m = 5;
//        System.out.println("m до " + m);
//        --m;
//        System.out.println("m после " + m);
    }
}
