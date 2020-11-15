package chapter_5;

import java.util.Random;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_5_2 {
    public static void main(String[] args) {
        output("输入字符串 str1 和 str 2 , 用逗号隔开");
        String[] strings = input().nextLine().trim().split(",");
        String str1 = strings[0].substring(Math.abs(new Random().nextInt(strings[0].length())));
        String str2 = strings[1].substring(Math.abs(new Random().nextInt(strings[1].length())));
        output("str1 = " + str1 + ", str2 = " + str2);
        if (str1.equals(str2)) {
            output("两个字符串相等!");
        } else {
            output("两个字符串不相等!");
        }
    }
}
