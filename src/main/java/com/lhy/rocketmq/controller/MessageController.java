package com.lhy.rocketmq.controller;// src/main/java/com/example/demo/controller/MessageController.java

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String msg) {
        // 发送到 Topic: "TestTopic"
        rocketMQTemplate.convertAndSend("TestTopic", msg);
        return "✅ 消息已发送: " + msg;
    }
}