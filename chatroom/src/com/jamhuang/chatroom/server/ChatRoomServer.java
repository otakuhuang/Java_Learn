package com.jamhuang.chatroom.server;

import com.jamhuang.chatroom.common.DataExchange;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.jamhuang.chatroom.common.Constants.SERVER_PORT;

public class ChatRoomServer {

    private int port;

    private Map<String, DataExchange> name2DataEx = new ConcurrentHashMap<>();

    private ExecutorService service = Executors.newCachedThreadPool();

    public ChatRoomServer(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        System.out.println("服务器已启动");
        ServerSocket ss = new ServerSocket(SERVER_PORT);
        while (true) {
            Socket socket = ss.accept();

        }
    }

    private void handleClientSocket(Socket socket) {
        service.submit(new ClientHand)
    }
}
