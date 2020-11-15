package chapter_5;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_5_1 {
    public static void main(String[] args) {
        output("请输入一串字符串: ");
        String str = input().nextLine();
        output("转为大写还是小写: 1. 大写 2. 小写");
        int i = input().nextInt();
        switch (i) {
            case 1:
                output("转为大写: " + str.toUpperCase());
                break;
            case 2:
                output("转为小写: " + str.toLowerCase());
                break;
            default:
                output("输入错误, 请重新输入!");
        }
    }
}
