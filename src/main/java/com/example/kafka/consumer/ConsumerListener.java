package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zzx
 * @Description TODO
 * @company www.eddue.com
 * @since 2018/11/16 09:52
 */
@Component
public class ConsumerListener {

    @KafkaListener(topics = "boot-kafka-test")
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
