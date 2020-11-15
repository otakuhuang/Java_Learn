package chapter_17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TClass<T extends List> {
    public static void main(String[] args) {
        TClass<ArrayList> tClassArrayList = new TClass<>();
        TClass<LinkedList> tClassLinkedList = new TClass<>();
    }
}
