package chapter_15;

import java.io.*;
import java.util.Scanner;

import static utils.Utils.output;

public class Encryption {

    public static void main(String[] args) {

        char[] a = "今天 10 点出发".toCharArray();
        int n = 0;

        try {
            File file = new File("test.txt");
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 'R');
            }
            FileWriter fw = new FileWriter(file);
            fw.write(a, 0, a.length);
            fw.close();
            FileReader fr = new FileReader(file);
            char[] tom = new char[10];
            output("加密后: ");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                String s = new String(tom, 0, n);
                output(s);
            }
            fr.close();
            fr = new FileReader(file);
            output("明文: ");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    tom[j] = (char) (tom[j] ^ 'R');
                }
                String str = new String(tom, 0, n);
                output(str);
            }
            fr.close();
            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
