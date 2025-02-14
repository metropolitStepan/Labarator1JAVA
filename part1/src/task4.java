import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
//        double x = Double.MAX_VALUE;
//        double x = Double.MIN_VALUE;

        double squaerx = Math.pow(x, 2);

        double result = 7 * Math.atan(squaerx);


        System.out.println(result);

    }
}