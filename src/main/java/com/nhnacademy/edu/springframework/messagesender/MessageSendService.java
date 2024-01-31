package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSendService {
    //Autowired Injection (byType) 해당 필드에 어노페이션.
    @Autowired
    public MessageSender messageSender;

    public void setEmailMessageSender(MessageSender messageSender){
        System.out.println("setMessageSender invoked!");
       this.messageSender = messageSender;
    }

    public void doSendMessage(User user, String message){
        // 인터페이스의 메소드를 호출하지만 실제 구현 객체의 메소드가 실행
        messageSender.sendMessage(user, message);
        // SOLID -> DIP 원칙에 따른 것.
        // 구체적인 상위 클래스(service)가 하위클래스(email, sms)에 의존할 때, 상위 클래스, 하위 클래스 둘 다 추상적인 클래스(MessageSender)에 의존하라.
    }
}
