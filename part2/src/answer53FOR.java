public class answer53FOR {
    public static void main(String[] args) {
        double a = 8.4;
        double n = 2.4;
        long P = 1;

        for (int i = 0; i < n; i++) {
            P *= a + i;
        }
        System.out.println("Результат: " + P);
    }
}



