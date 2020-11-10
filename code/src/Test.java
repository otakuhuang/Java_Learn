import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

public class Test implements Runnable {

    int num = 10;

    @Override
    public void run() {
        while (true) {
            synchronized ("") {
                if (num > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Class clazz = this.getClass();
                    System.out.println("tickets: " + num--);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Thread t1 = new Thread(test);
        Thread t2 = new Thread(test);
        Thread t3 = new Thread(test);
        Thread t4 = new Thread(test);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
