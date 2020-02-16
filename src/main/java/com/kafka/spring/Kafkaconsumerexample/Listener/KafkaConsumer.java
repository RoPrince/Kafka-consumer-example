package com.kafka.spring.Kafkaconsumerexample.Listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic_test", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message:" + message);
    }

//    @KafkaListener(topics = "topics_test",groupId = "group_json",containerFactory = "personKafkaListenerFactory")
//    public void consumeJson(Person person){
//        System.out.println("Consumed message:"+person.toString());
//    }
}
