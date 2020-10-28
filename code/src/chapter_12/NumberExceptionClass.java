package chapter_12;

import static utils.Utils.output;

public class NumberExceptionClass {

    public static int count(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        try {
           int mult = count(2,5);
           output(mult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
