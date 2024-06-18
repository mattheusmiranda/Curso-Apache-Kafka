package com.miranda.strconsumer.listerners;

import com.miranda.strconsumer.custom.StrConsumerCustomListner;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListner(groupId = "group-1")
    public void create0(String message) {
        log.info("00 ### Receive message {}", message);
    }

    @StrConsumerCustomListner(groupId = "group-1")
    public void create1(String message) {
        log.info("01 ### Receive message {}", message);
    }

    @StrConsumerCustomListner(groupId = "group-2")
    public void create2(String message) {
        log.info("02 ### Receive message {}", message);
    }
}
