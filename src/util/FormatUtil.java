package util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatUtil {

    public static void main(String[] args) {

        NumberFormat f = new DecimalFormat("0.000000");
        System.out.println(f.format(2.3344556677));

        f = new DecimalFormat("0.00");
        System.out.println(f.format(2.3344556677));

        float num = 1234.12345f;
        System.out.printf("%,.3f :: %,.5f", num, num);
    }
}
