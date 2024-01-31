package com.nhnacademy.edu.springframework.messagesender.Sender;

import com.nhnacademy.edu.springframework.messagesender.User;

public interface MessageSender {
    void sendMessage(User user, String message);
}
