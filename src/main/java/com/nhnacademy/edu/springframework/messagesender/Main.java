package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        User user = new User(
                "mnb2457@naver.com",
                "010-0000-0000"
        );

        String message = "hello";

        //javaconfig를 받아주는 context.
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class)) {
            context.getBean("messageSendService", MessageSendService.class).doSendMessage(user, message);
        }

    }
}