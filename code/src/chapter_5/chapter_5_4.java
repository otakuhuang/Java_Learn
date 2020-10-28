package chapter_5;

import java.util.Arrays;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_5_4 {
    public static void main(String[] args) {
        output("请输入一个字符串: ");
        StringBuilder sb = new StringBuilder();
        sb.append(input().nextLine().trim());
        int i = 1;
        while (i <= 10) {
            sb.append(i);
            i++;
        }
        output(sb.toString());
    }
}
