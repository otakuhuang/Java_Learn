package headfirstjava;

public class Exercise1b {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
            x++;
        }
    }

    public static void method2() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("small y");
            }
        }
    }

    public static void method3() {
        int x = 5;
        while (x > 1) {
            x = x + 1;
            if (x < 3) {
                System.out.println("small z");
            }
        }
    }
}
