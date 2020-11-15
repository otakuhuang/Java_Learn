package chapter_14;

import java.util.*;

public class SetAndListClass {
    public static void main(String[] args) {
        char[] chars = new char[]{'A', 'a', 'c', 'C', 'a'};
        Set<Character> characterSet = new HashSet<>();
        List<Character> characterList = new ArrayList<>();
        for (char c : chars) {
            characterSet.add(c);
            characterList.add(c);
        }
        System.out.println(characterSet);
        System.out.println(characterList);
    }
}
