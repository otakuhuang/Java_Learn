package chapter_8;

import static utils.Utils.output;

public class Chapter_8_3 {
    public static void main(String[] args) {
        Boolean b1 = new Boolean("abc");
        output(b1.toString());
        Boolean b2 = new Boolean("true");
        output(b2.toString());
    }
}
