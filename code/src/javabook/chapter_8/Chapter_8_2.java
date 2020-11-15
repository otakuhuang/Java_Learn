package chapter_8;

import static utils.Utils.output;

public class Chapter_8_2 {
    public static void main(String[] args) {

        Character c1 = 'A';
        Character c2 = 'a';
        output(c1.equals(c2));

        c1 = Character.toLowerCase(c1);
        c2 = Character.toLowerCase(c2);

        output(c1.equals(c2));
    }
}
