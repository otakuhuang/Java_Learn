package com.jamhuang.chatroom;

import com.jamhuang.chatroom.client.ChatRoomClient;

import java.io.IOException;

public class ChatRoomClientAppMain {

    public static void main(String[] args) throws IOException {
        String server = "127.0.0.1";
        ChatRoomClient client = new ChatRoomClient(server);
        client.start();
    }
}
