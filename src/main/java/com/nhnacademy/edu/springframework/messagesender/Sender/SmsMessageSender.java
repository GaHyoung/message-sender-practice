package com.nhnacademy.edu.springframework.messagesender.Sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev", "default"}) //!를 쓰면 얘를 제외하고 인식.
public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(User user, String message) {
        System.out.printf("SMS Message Send to %s : %s %n", user.getPhoneNumber(), message);
    }
}