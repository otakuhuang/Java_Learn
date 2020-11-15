package chapter_10;

import javax.print.attribute.standard.MediaSize;

import static utils.Utils.output;

public class ConstructorClass {

    private String name;
    private Integer value;

    // (1) 先执行父类的构造函数
    public ConstructorClass() {
        output("调用方法前");
        method(); // 执行子类的方法
        output("调用方法后");
    }

    public void method() {
        output("父类的方法");
    }

    public static void main(String[] args) {
        new OtherClass();
    }
}

class OtherClass extends ConstructorClass {

    // (2) 成员变量初始化
    private String name;
    private Integer value;

    // (3) 执行子类的构造函数
    public OtherClass() {
        output("子类的构造方法");
    }

    @Override
    public void method() {
        output("子类的方法");
    }
}
