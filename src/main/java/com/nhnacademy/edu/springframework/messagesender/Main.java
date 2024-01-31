package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;

public class Main {
    public static void main(String[] args) {

        User user = new User(
                "mnb2457@naver.com",
                "010-0000-0000"
        );

        String message = "hello";

        SmsMessageSender smsMessageSender = new SmsMessageSender();

        MessageSendService messageSendService = new MessageSendService(smsMessageSender);
        messageSendService.doSendMessage(user, message);
    }
}