public class taskpart3float {
    public static void main(String[] args) {
        float a = -1000;
        float b = -0.0001F;

        float result = (float) ((Math.pow(a + b,2) - (Math.pow(a,2) + 2 * a * b)) / Math.pow(b,2));

        System.out.println(result);

    }
}