package chapter_17;

import java.util.Scanner;

import static utils.Utils.output;

public class EnumClass {
    enum SubEnum {
        ENUM_1,
        ENUM_2,
        ENUM_3;

        public static void doIt(SubEnum subEnum) {
            switch (subEnum) {
                case ENUM_1:
                    output("doIt() " + ENUM_1);
                    break;
                case ENUM_2:
                    output("doIt() " + ENUM_2);
                    break;
                case ENUM_3:
                    output("doIt() " + ENUM_3);
                    break;
                default:
                    output("输入错误");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        output("请输入数字 (1-3): ");
        int i = in.nextInt();
        switch (i) {
            case 1:
                SubEnum.doIt(SubEnum.ENUM_1);
                break;
            case 2:
                SubEnum.doIt(SubEnum.ENUM_2);
                break;
            case 3:
                SubEnum.doIt(SubEnum.ENUM_3);
                break;
            default:
                output("输入错误");
        }
    }
}
