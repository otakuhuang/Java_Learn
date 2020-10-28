package chapter_2;

import java.util.Scanner;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_2_2 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        output("请输入第一个整数: ");
        int x = input().nextInt();
        output("请输入第二个整数: ");
        int y = input().nextInt();
        output(x + "+" + y + "=" + (x + y));
        output(x + "-" + y + "=" + (x - y));
        output(x + "*" + y + "=" + (x * y));
        output(x + "/" + y + "=" + (x / y));
    }
}
