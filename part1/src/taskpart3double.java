public class taskpart3double {
    public static void main(String[] args) {

        double a = 1000;
        double b = 0.0001;

        double result = (Math.pow(a + b, 2) - (Math.pow(a, 2) + 2 * a * b)) / Math.pow(b,2);

        System.out.println(result);

    }
}