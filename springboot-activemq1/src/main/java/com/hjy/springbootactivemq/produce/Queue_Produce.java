package com.hjy.springbootactivemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

@Component
public class Queue_Produce {
    @Autowired
    private Queue queue;
    // JMS模板
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate ;

    public void produceMessage(){

        jmsMessagingTemplate.convertAndSend(queue,"****"+ UUID.randomUUID().toString().substring(0,6));
    }

    // 定时任务。每3秒执行一次。非必须代码，仅为演示。
    /*@Scheduled(fixedDelay = 3000)
    public void produceMessageScheduled(){
        produceMessage();
    }*/
}
