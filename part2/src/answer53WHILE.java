public class answer53WHILE {
    public static void main(String[] args) {
        double a = 3;
        double n = 5;
        long P = 1;

        int i = 0;
        while (i < n) {
            P *= a + i;
            i++;
        }
        System.out.println("Результат: " + P);
    }
}