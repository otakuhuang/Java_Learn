package chapter_3;

import static utils.Utils.input;
import static utils.Utils.output;

public class chapter_3_2 {

    public static void main(String[] args) {

        System.out.printf("请输入行数: ");
        // 输出的菱形有多少行，请赋值成奇数
        int lineCount = input().nextInt();
        if (lineCount % 2 == 0) {
            output("请输入奇数");
        } else {
            // 菱形最多一行
            int maxLineNum = (lineCount + 1) / 2;
            // 循环菱形数量越来越多的几行
            for (int i = 1; i <= maxLineNum; i++) {
                // 输出空格，数量 = 最后一行 - 当前行数
                for (int space = 1; space <= maxLineNum - i; space++) {
                    System.out.printf("  ");
                }
                // 输出星号，数量 = 行数 * 2 - 1
                for (int star = 1; star <= (i * 2) - 1; star++) {
                    System.out.printf("* ");
                }
                System.out.println();
            }

            int decLineCount = lineCount - maxLineNum;
            // 循环菱形数量越来越少的行数
            for (int i = 1; i <= decLineCount; i++) {
                // 输出空格，数量等于当前的行数
                for (int space = 1; space <= i; space++) {
                    System.out.print("  ");
                }
                // 输出星号，数量等于（总数 - 当前行数）* 2 - 1
                for (int star = 1; star <= (decLineCount - i + 1) * 2 - 1; star++) {
                    System.out.print("* ");
                }
                // 换行
                System.out.println();
            }
        }
    }
}