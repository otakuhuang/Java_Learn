package chapter_19.tcpprogram;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static utils.Utils.output;

public class TCPServer {

    public static final int SERVER_PORT = 8001;
    public static final Charset CHARSET = StandardCharsets.UTF_8;

    public TCPServer() throws IOException {
        commWithClient();
    }

    public static void commWithClient() throws IOException {
        try (
                ServerSocket ss = new ServerSocket(SERVER_PORT);
                Socket s = ss.accept();
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream(), CHARSET));
        ) {
            output("客户端 " + s.getInetAddress().getHostAddress() + " 已连接!");
            pw.println("你好，客户端!");
            pw.flush();
        }
    }

    public static void main(String[] args) throws IOException {
        TCPServer tcpServer = new TCPServer();
    }
}
