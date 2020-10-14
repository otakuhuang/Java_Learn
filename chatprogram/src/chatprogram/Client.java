import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

    }

    private static void commWithServer() throws IOException {
        try (
                Socket socket = new Socket("localhost", SimpleServer.SERVER_PORT);
        ) {
            Chat chat = new Chat("服务器端", null, socket);
            chat.chatting();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序退出!");
    }
}
