package com.lhy.rocketmq.comsumer;// src/main/java/com/example/demo/consumer/SimpleConsumer.java

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(
        topic = "TestTopic",
        consumerGroup = "test-consumer-group"
)
public class SimpleConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        System.out.println("📬 收到消息: " + message);
    }
}