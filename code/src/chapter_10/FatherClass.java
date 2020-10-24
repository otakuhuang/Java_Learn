package chapter_10;

import static utils.Utils.output;

public class Father {
    public void methodOne() {
        output("父类方法 1");
    }

    public void methodTwo() {
        output("父类方法 2");
    }

    public static void main(String[] args) {
        Father child = new Child();
        child.methodOne();
        child.methodTwo();
    }
}

class Child  extends Father {
    @Override
    public void methodTwo() {
        output("子类方法 2");
    }
}
