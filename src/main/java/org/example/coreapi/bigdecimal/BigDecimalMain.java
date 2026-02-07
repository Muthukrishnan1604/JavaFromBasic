package src.main.java.org.example.coreapi.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class BigDecimalMain {

    public static void main(String[] args) {
        String[] tests = {"15.456", "8", "10000.000001", ".123"};

        BigDecimal[] bigDecimals = new BigDecimal[tests.length];

        Arrays.setAll(bigDecimals, (i) -> new BigDecimal(tests[i]));

        System.out.printf("%-14s %-15s %-8s %s %n", "Value", "Unscaled Value", "Scale", "Precision");

        for(BigDecimal bigDecimal : bigDecimals) {
            System.out.printf("%-15s %-15d %-8d %d %n", bigDecimal, bigDecimal.unscaledValue(), bigDecimal.scale(), bigDecimal.precision());
        }

        Double[] doubles = {15.456, 8.0, 10000.000001, .123};

        Arrays.setAll(bigDecimals, (i) -> BigDecimal.valueOf(doubles[i]));

        System.out.println("-".repeat(20));

        System.out.printf("%-14s %-15s %-8s %s %n", "Value", "Unscaled Value", "Scale", "Precision");

        for(BigDecimal bigDecimal : bigDecimals) {
            System.out.printf("%-15s %-15d %-8d %d %n", bigDecimal, bigDecimal.unscaledValue(), bigDecimal.scale(), bigDecimal.precision());
            // If you are scaling we need to have the element lesser than that or
            // else it will throw error or we need to round up and then do the scaling
            bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
            System.out.printf("%-15s %-15d %-8d %d %n", bigDecimal, bigDecimal.unscaledValue(), bigDecimal.scale(), bigDecimal.precision());
        }

        BigDecimal policyPayout = new BigDecimal("100000000.00");
        System.out.printf("%-15s %-15d %-8d %d %n", policyPayout, policyPayout.unscaledValue(),
                policyPayout.scale(), policyPayout.precision());

        BigDecimal percent = BigDecimal.ONE.divide(BigDecimal.valueOf(3), new MathContext(20, RoundingMode.HALF_UP));
        System.out.println(percent);

        BigDecimal checkAmount = policyPayout.multiply(percent);

        System.out.printf("%.2f%n", checkAmount);

        BigDecimal[] divideAndRemainder = BigDecimal.TEN.divideAndRemainder(BigDecimal.valueOf(3), MathContext.DECIMAL32);

        System.out.println("-".repeat(20));

        for(BigDecimal bigDecimal : divideAndRemainder) {
            System.out.println(bigDecimal);
        }

    }

}
