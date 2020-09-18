package com.hjy.bootactivemqqconsumer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class Queue_consummer {

    // 注册一个监听器。destination指定监听的主题。
    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws  Exception{
        System.out.println(" ***  消费者收到消息  ***"+textMessage.getText());
    }
}
