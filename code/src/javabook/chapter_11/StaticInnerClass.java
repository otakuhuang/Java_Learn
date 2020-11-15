package chapter_11;

import static utils.Utils.output;

public class StaticInnerClass {

    private static String str = "Hello World";

    static class innerClass {
        public static void main(String[] args) {
            output(str);
        }
    }
}
