package chapter_19.chatroom;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static utils.Utils.output;

public class Message {

    public static final Charset CHARSET = StandardCharsets.UTF_8;
    public static final String BYE = "bye";
    private String from;
    private String msg;
    private Socket s;

    public Message(String from, String msg, Socket s) {
        this.from = from;
        this.msg = msg;
        this.s = s;
    }

    public void sendMessage() throws IOException {
        Scanner in = new Scanner(System.in);
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream(), CHARSET));
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), CHARSET));
        ) {
            output("Socket 连接成功!");
            if (msg != null) {
                pw.println("你好 " + from + " " + msg);
                pw.flush();
            }
            while (true) {
                String line = br.readLine();
                if (line.trim().equalsIgnoreCase(BYE)) {
                    output("对方要求断开连接!");
                    pw.println(BYE);
                    pw.flush();
                    break;
                } else {
                    output("来自\"" + from + "\"的消息: " + line);
                }
                line = in.nextLine();
                pw.println(line);
                pw.flush();
            }
        }
        output("聊天结束!");
    }
}
