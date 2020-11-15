package chapter_12;

public class Computer {

    public static int getMaxComm(int m, int n) throws MyException2 {
        if (m <= 0 || n <= 0) {
            throw new MyException2("传递的参数不是正整数");
        }
        if (m < n) {
            int temp = 0;
            temp = n;
            m = n;
            n = temp;
        }
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }

    public static void main(String[] args) {
        try {
            getMaxComm(-2, -1);
        } catch (MyException2 myException2) {
            myException2.printStackTrace();
        }
    }
}

class MyException2 extends Exception {
    String message;

    public MyException2(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
