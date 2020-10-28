package chapter_15;

import java.io.*;
import java.util.Scanner;

public class UserFile {

    public static String fileOutputStream(File file) throws IOException {
        String str = null;
        String reader = null;
        if (file.exists()) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while ((str = br.readLine()) != null) {
                i++;
                System.out.println(str);
                reader = reader + str;
            }
            br.close();
            fr.close();
        }
        return reader;
    }

    public static void fileInputStream(File file) throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        boolean flag = true;
        while(flag) {
            System.out.print("请输入: ");
            String str = in.nextLine();
            if(file.exists() && !"done".equals(str)) {
                bw.write(str);
                bw.newLine();
                bw.flush();
            } else {
                flag = false;
            }
        }
        bw.close();
        fw.close();
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
            System.out.println(fileOutputStream(file));
            deleteFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
