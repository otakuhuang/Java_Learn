package chapter_9;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import static utils.Utils.output;

public class Chapter_9_2 {

    static String doubleFormat(String pattern, double value) {
        DecimalFormat format = new DecimalFormat(pattern);
        return format.format(value);
    }

    public static double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        output(doubleFormat("#.#####",area(5)));
    }
}
