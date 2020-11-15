package chapter_19.chatroom;

import java.io.IOException;
import java.net.Socket;

import static chapter_19.chatroom.Server.SERVER_PORT;
import static utils.Utils.output;

public class Client {

    public static void commWithServer() throws IOException {
        try (
                Socket s = new Socket("localhost", SERVER_PORT);
        ) {
            output("连接到服务器: " + s.getRemoteSocketAddress());
            Message msg = new Message("服务端", null, s);
            msg.sendMessage();
        }
    }

    public static void main(String[] args) throws IOException {
        commWithServer();
    }
}
