package chapter_10;

import static utils.Utils.output;

public class FatherClass {
    public void methodOne() {
        output("父类方法 1");
    }

    public void methodTwo() {
        output("父类方法 2");
    }

    public static void main(String[] args) {
        FatherClass child = new ChildClass();
        child.methodOne();
        child.methodTwo();
    }
}

class ChildClass extends FatherClass {
    @Override
    public void methodTwo() {
        output("子类方法 2");
    }
}
