package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {
    //beans.xml

    @Bean
    public SmsMessageSender smsMessageSender(){
        return new SmsMessageSender();
    }

    @Bean
    public EmailMessageSender emailMessageSender(){
        return new EmailMessageSender();
    }

    @Bean
    public MessageSendService messageSendService(){
        return new MessageSendService(smsMessageSender());
    }
}
