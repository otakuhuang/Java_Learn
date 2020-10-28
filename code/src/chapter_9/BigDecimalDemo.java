package chapter_9;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static utils.Utils.output;

public class BigDecimalDemo {

    public static BigDecimal div(double value1, double value2, int b, int r) {
        if (b < 0) {
            output("b 值必须大于等于 0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(value1));
        BigDecimal b2 = new BigDecimal(Double.toString(value2));
        return b1.divide(b2, b, r);
    }

    public static void main(String[] args) {
        output(div(2, 3, 4, 2));
        StringBuilder sb = new StringBuilder("Hello ");
    }
}
