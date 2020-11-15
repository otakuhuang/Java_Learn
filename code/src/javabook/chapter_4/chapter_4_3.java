package chapter_4;

import static utils.Utils.output;

public class chapter_4_3 {
    public static void main(String[] args) {
        double result = 0, a = 1;
        int i = 1;
        while (i <= 20) {
            result += a;
            i++;
            a *= 1.0 / i;
        }
        output(result);
    }
}
