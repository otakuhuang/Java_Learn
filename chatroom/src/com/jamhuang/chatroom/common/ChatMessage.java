package com.jamhuang.chatroom.common;

import java.util.Objects;

import static com.jamhuang.chatroom.common.Constants.MESSAGE_BREAK;
import static com.jamhuang.chatroom.common.Constants.MESSAGE_SEP;

public class ChatMessage {

    private String from;
    private String to;
    private String message;

    public ChatMessage() {
    }

    public ChatMessage(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static ChatMessage buildFrom(String message) {
        ChatMessage ret = new ChatMessage();
        int fromEnd = message.indexOf(MESSAGE_SEP);
        ret.from = message.substring(0, fromEnd);
        int toEnd = message.indexOf(MESSAGE_SEP, fromEnd + 1);
        ret.message = message.substring(fromEnd + 1, toEnd);
        return ret;
    }

    public String toMessageString() {
        StringBuilder ret = new StringBuilder();
        ret.append(from).append(MESSAGE_SEP).append(to).append(MESSAGE_SEP).append(message).append(MESSAGE_BREAK);
        return ret.toString();
    }

    public static void main(String[] args) {
        ChatMessage chatMessage = new ChatMessage("testfrom", "testto", "这是测试");
        String strMessage = chatMessage.toMessageString().trim();
        System.out.println(strMessage);
        ChatMessage parsed = buildFrom(strMessage);
        System.out.println(parsed.equals(chatMessage));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatMessage)) return false;
        ChatMessage that = (ChatMessage) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, message);
    }
}
