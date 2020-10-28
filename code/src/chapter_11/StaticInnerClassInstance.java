package chapter_11;

import static utils.Utils.output;

public class StaticInnerClassInstance {

    static class inner {
        public inner() {
            output("inner class");
        }

        public void method() {
            output("This is method");
        }
    }

    public static void main(String[] args) {
        StaticInnerClassInstance.inner inner = new inner();
        inner.method();
    }
}
