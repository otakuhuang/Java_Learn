package chapter_14;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        list.remove(10);
        for (int i : list) {
            System.out.print(i + ", ");
        }
    }
}
