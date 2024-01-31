package com.nhnacademy.edu.springframework.messagesender.Sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"real"})
public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("SMS Message Send to %s : %s %n", user.getEmail(), message);
    }
}
