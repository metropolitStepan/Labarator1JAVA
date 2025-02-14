import java.math.BigDecimal;

public class taskpart3BigDecimal {
    public static void main(String[] args) {

        BigDecimal a = new BigDecimal(1000);
        BigDecimal b = new BigDecimal(0.0001);

        BigDecimal sum = a.add(b);
        BigDecimal sumSqr = sum.pow(2);

        BigDecimal PowA = a.pow(2);
        BigDecimal two = new BigDecimal(2);
        BigDecimal twoAB = two.multiply(a).multiply(b);
        BigDecimal PowAandTwoAB = PowA.add(twoAB);

        BigDecimal minus = sumSqr.subtract(PowAandTwoAB);

        BigDecimal SqrB = b.pow(2);

        BigDecimal result = minus.divide(SqrB);

        System.out.println(result);

    }
}