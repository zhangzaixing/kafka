package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzx
 * @Description TODO
 * @company www.eddue.com
 * @since 2018/11/16 09:52
 */
@RestController
public class ProducerController {

    private final KafkaTemplate kafkaTemplate;

    @Autowired
    public ProducerController(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping(value = "/send/message")
    public void sendMessage() throws Exception{
        System.out.println(1111);
        for (int i = 0; i < 10; i++) {
            kafkaTemplate.send("boot-kafka-test", "message " +i);
            Thread.sleep(500);
        }
    }
}
