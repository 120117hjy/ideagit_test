package com.hjy.springbootactivemq;

import com.hjy.springbootactivemq.produce.Queue_Produce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

// 加载主类
@SpringBootTest(classes = SpringbootActivemqApplication.class)
// 加载spring的junit
@RunWith(SpringJUnit4ClassRunner.class)
// 加载web
@WebAppConfiguration
public class TestActiveMQ {

    @Autowired
    Queue_Produce queue_Produce;

    @Test
    public void testActiveMqsend(){

        queue_Produce.produceMessage();
    }
}
