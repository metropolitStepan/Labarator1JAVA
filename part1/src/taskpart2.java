import java.util.Scanner;

public class taskpart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        double x = scanner.nextDouble();
        System.out.print("y=");
        double y = scanner.nextDouble();

        boolean r = (x<=5 && x>=0 && y<=5 && y>=0 && y+x<=5) | (x<=5 && x>=0 && y>=-5 && y<=0 && y-x>=-5) |(x>=-5 && x<=0 && y>=-5 && y<=0 && y+x>=-5);

        System.out.println(r);
    }
}