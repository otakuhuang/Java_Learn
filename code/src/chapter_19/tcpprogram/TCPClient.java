package chapter_19.tcpprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import static chapter_19.tcpprogram.TCPServer.SERVER_PORT;
import static utils.Utils.output;

public class TCPClient {

    public static void commWithServer() throws IOException {
        try (
                Socket s = new Socket("localhost", SERVER_PORT);
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ) {
            output(br.readLine());
        }
    }

    public static void main(String[] args) throws IOException {
        commWithServer();
    }
}
