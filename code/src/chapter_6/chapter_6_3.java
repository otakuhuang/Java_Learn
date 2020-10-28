package chapter_6;

import java.util.Arrays;

public class chapter_6_3 {
    public static void main(String[] args) {

        String[] strings = new String[]{"re", "fq", "hw", "rot"};
        System.out.println(Arrays.toString(strings));
        Arrays.fill(strings, 2, 3, "bb");
        System.out.println(Arrays.toString(strings));
    }
}
