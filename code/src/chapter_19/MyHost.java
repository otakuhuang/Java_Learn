package chapter_19;

import java.net.InetAddress;
import java.net.UnknownHostException;

import static utils.Utils.output;

public class MyHost {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("localhost");
        output("主机名称: " + ia.getHostName());
        output("主机地址: " + ia.getHostAddress());
        output("本机地址: " + InetAddress.getLocalHost().getHostAddress());
    }
}