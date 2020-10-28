package chapter_11;

import static utils.Utils.output;

public class AnonymousInnerClass {

}

class OuterClass {
    public OutInterface doit(final String s) {
        return new OutInterface() {
            private int i = 0;

            public int getValue() {
                output(s);
                return i;
            }

            public void f() {
                output("f()");
            }
        };
    }
}

interface OutInterface {

}
