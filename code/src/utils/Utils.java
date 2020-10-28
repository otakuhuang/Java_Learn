package utils;

import java.util.Scanner;

public class Utils {
    private static Scanner in = new Scanner(System.in);

    public static Scanner input() {
        return in;
    }

    public static void output(Object str) {
        System.out.println(str);
    }
}
