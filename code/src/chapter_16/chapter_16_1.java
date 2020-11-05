package chapter_16;

import java.lang.reflect.Array;
import java.time.format.TextStyle;

public class chapter_16_1 {

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.print();

        arrays.ints = (int[]) addArraysLength(arrays.ints, 10);
        arrays.strings = (String[]) addArraysLength(arrays.strings, 10);

        arrays.print();
    }

    public static Object addArraysLength(Object array, int newLength) {
        Object newArray = null;
        Class componentType = array.getClass().getComponentType();
        newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(array, 0, newArray, 0, Array.getLength(array));
        return newArray;
    }
}

class Arrays {
    public int[] ints = new int[]{1, 2, 3};

    public String[] strings = {"A", "B", "C"};

    public void print() {
        for (int i : ints) {
            System.out.println("i= " + i);
        }
        System.out.println();
        for (String str : strings) {
            System.out.println("str= " + str);
        }
        System.out.println();
    }
}
