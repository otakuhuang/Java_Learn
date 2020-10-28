package chapter_9;

import java.util.Arrays;
import java.util.Random;

import static utils.Utils.output;

public class Chapter_9_1 {
    public static void main(String[] args) {

        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int x = Math.abs(randomInt().nextInt(30)) + 2;
            while (x % 2 != 0) {
                x = Math.abs(randomInt().nextInt(30)) + 2;
            }
            arr[i] = x;
        }
        output(Arrays.toString(arr));
        output(Arrays.stream(arr).sum());
    }

    public static Random randomInt() {
        return new Random();
    }
}
