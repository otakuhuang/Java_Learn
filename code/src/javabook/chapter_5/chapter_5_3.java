package chapter_5;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_5_3 {
    public static void main(String[] args) {
        output("请输入 11 位的手机号: ");
        String phoneNumber = input().nextLine().trim();
        if (phoneNumber.length() != 11) {
            output("手机号位数错误!");
        } else {
            String regex = "1[35]\\d{9}";
            if (phoneNumber.matches(regex)) {
                output(phoneNumber + " 是合法的手机号!");
            } else {
                output("手机号错误!");
            }
        }
    }
}
