package chapter_6;

import java.util.Arrays;

public class chapter_6_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{5, 6, 7, 8};

        arr2 = Arrays.copyOf(arr1,3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
