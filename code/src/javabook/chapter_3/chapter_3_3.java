package chapter_3;

import java.util.Arrays;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_3_3 {
    public static void main(String[] args) {
        output("输入一组数字，以逗号隔开: ");
        String[] strings = input().nextLine().trim().split(",");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        output(Arrays.toString(ints));
    }
}
