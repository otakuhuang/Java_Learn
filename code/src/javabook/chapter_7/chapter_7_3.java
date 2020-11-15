package chapter_7;

import static utils.Utils.output;

public class chapter_7_3 {
    public static void main(String[] args) {
        int length = args.length;
        if (length == 0) {
            output("无运行参数");
        } else {
            for (int i = 0; i < args.length; i++) {
                output(i);
            }
        }
    }
}
