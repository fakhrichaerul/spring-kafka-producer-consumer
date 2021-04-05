package com.fakhri.kafkaconsumer.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "NewTopic", groupId = "group1")
    public void consume(String message) {

        System.out.println("message = " + message);
    }
}
