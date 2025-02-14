public class answer53DO {
    public static void main(String[] args) {
        double a = 2;
        double n = 5;
        long P = 1;
        int i = 0;

        do {
            P *= a + i;
            i++;
        } while (i < n);
        System.out.println("Результат: " + P);
    }
}