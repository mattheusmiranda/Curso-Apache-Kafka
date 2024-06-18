package com.miranda.strconsumer.listerners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
    public void create0(String message) {
        log.info("00 ### Receive message {}", message);
    }

    @KafkaListener(groupId = "group-1", topics = "str-topic", containerFactory = "strContainerFactory")
    public void create1(String message) {
        log.info("01 ### Receive message {}", message);
    }

    @KafkaListener(groupId = "group-2", topics = "str-topic", containerFactory = "strContainerFactory")
    public void create2(String message) {
        log.info("02 ### Receive message {}", message);
    }
}
