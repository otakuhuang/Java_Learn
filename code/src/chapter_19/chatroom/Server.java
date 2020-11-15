package chapter_19.chatroom;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static final int SERVER_PORT = 41251;

    public static void commWithClient() throws IOException {
        try (
                ServerSocket ss = new ServerSocket(SERVER_PORT);
                Socket s = ss.accept();
        ) {
            Message msg = new Message("客户端", "成功连接到服务器", s);
            msg.sendMessage();
        }
    }

    public static void main(String[] args) throws IOException {
        commWithClient();
    }
}
