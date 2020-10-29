package chapter_15;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static utils.Utils.output;

public class UserFile {

    public static void fileOutputStream(File file) throws IOException {

        // TODO 建立从文件到程序的数据输入（input）流
        FileInputStream fis = new FileInputStream(file);
        // TODO 用 InputStreamReader 将这个byte 流套一下，装饰一下，并指定字符编码，让它能够将读出的byte转为字符
        InputStreamReader isr = new InputStreamReader(fis);
        // TODO 增加缓存功能，输入输出效率更高，并且可以一次读取一行
        BufferedReader br = new BufferedReader(isr);
        String str = null;

        if (file.exists()) {
            while ((str = br.readLine()) != null) {
                output(str);
            }
        }

        br.close();
        isr.close();
        fis.close();
    }

    public static void fileInputStream(File file) throws IOException {
        Scanner in = new Scanner(System.in);
        // TODO 创建一个inputstream，建立一个从文件到程序的byte数据传输流
        FileOutputStream fos = new FileOutputStream(file);
        // TODO 建立一个可以消费inputstream的writer，并指定字符集，这样就可以一个个的写入字符了
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        // TODO 使用PrintWriter，可以方便的写入一行字符
        PrintWriter pw = new PrintWriter(osw);
        boolean flag = true;
        while(flag) {
            System.out.print("请输入: ");
            String str = in.nextLine().trim();
            if(file.exists() && !"done".equals(str)) {
                pw.println(str);
                pw.flush();
            } else {
                flag = false;
            }
        }
        pw.close();
        osw.close();
        fos.close();
    }

    public static void deleteFile(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static File createFile() throws IOException {
        File file = new File("user.txt");
        if (file.exists()) {
            return file;
        } else {
            file.createNewFile();
        }
        return file;
    }

    public static void main(String[] args) {
        try {
            File file = createFile();
            fileInputStream(file);
            fileOutputStream(file);
            deleteFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
