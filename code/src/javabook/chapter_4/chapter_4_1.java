package chapter_4;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_4_1 {
    public static void main(String[] args) {
        output("请输入一个数字: ");
        int x = input().nextInt();
        if (x % 2 == 0) {
            output(x + " 是整数");
        } else {
            output(x + " 是奇数");
        }
    }
}
