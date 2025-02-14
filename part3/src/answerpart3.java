public class answerpart3 {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 1;
        int k = 10;
        int n = 20;
        double e = 0.0001;

        double step = (b - a) / k;

        for (double x = a; x <= b; x += step) {

            double SN = 1;
            double term = 1;
            for (int i = 1; i <= n; i++) {
                term *= (2 * x) / i;
                SN += term;
            }

            double SE = 1;
            term = 1;
            int i = 1;
            while (true) {
                term *= (2 * x) / i;
                SE += term;
                if (term < e) {
                    break;
                }
                i++;
            }

            double Y = Math.exp(2 * x);

            System.out.printf("X=%.3f SN=%.5f SE=%.5f Y=%.5f\n", x, SN, SE, Y);
        }
    }
}
