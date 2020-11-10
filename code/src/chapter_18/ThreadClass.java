package chapter_18;

import static utils.Utils.output;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        String str = "Hello Java";
        char[] chars = str.toCharArray();
        int i = 0;
        while (true) {
            if (i < chars.length) {
                output(chars[i]);
                i++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}
