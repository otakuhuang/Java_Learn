package chapter_17;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static utils.Utils.output;

public class TClassTwo<T> {

    public void doIt(TClassTwo<? extends List<Object>> a) {
        output(a.getClass().getName());
    }

    public static void main(String[] args) {
        TClassTwo<? extends List<Object>> tClassTwo_1 = new TClassTwo<ArrayList<Object>>();
        tClassTwo_1.doIt(new TClassTwo<ArrayList<Object>>());
        tClassTwo_1.doIt(new TClassTwo<LinkedList<Object>>());
        TClassTwo<? super List<Object>> tClassTwo_2 = null;
        tClassTwo_2 = new TClassTwo<Object>();
    }

}
