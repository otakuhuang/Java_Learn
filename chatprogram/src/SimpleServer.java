import javax.swing.text.AttributeSet;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SimpleServer {

    public static final int SERVER_PORT = 42138;

    public static final Charset SERVER_CHARSET = StandardCharsets.UTF_8;

    public static final String BYE = "bye";

    public static void main(String[] args) throws IOException {

    }

    private static void commWithClient() throws IOException {
        System.out.println("Server 端启动，在端口" + SERVER_PORT + "监听...");
        try (
                ServerSocket ss = new ServerSocket(SERVER_PORT);
                Socket s = ss.accept();
        ) {
            Chat chat = new Chat("客户端", "你已经成功连到我了。我们可以开始对话了。", s);
            chat.chatting();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序退出!");
    }
}
