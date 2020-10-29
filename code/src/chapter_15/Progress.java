package chapter_15;

import javax.swing.*;
import java.io.*;

import static utils.Utils.output;

public class Progress {
    public static void main(String[] args) {

        byte[] b = new byte[2];
        try {
            File file = new File("test.txt");
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            PrintWriter pw = new PrintWriter(osw);
            pw.println("Hello World");
            pw.flush();

            FileInputStream fis = new FileInputStream(file);
            ProgressMonitorInputStream pmi = new ProgressMonitorInputStream(null, "读取文件", fis);
            while(pmi.read(b) != -1) {
                String s = new String(b);
                output(s);
                Thread.sleep(100);
            }
            file.delete();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
