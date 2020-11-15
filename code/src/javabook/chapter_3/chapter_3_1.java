package chapter_3;

import java.util.Arrays;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_3_1 {
    public static void main(String[] args) {
        output("请输入两个数组，用逗号隔开: ");
        String[] strings = input().nextLine().trim().split(",");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        output(ints[0] + "+" + ints[1] + "=" + (Arrays.stream(ints).sum()));
    }
}
