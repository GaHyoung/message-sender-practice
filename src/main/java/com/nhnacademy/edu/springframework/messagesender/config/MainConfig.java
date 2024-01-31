package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.Sender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.nhnacademy.edu.springframework.messagesender") // 경로 안에 component 달린 애들 찾기.
public class MainConfig {


}
