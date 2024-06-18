package com.miranda.strconsumer.listerners;

import com.miranda.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(groupId = "group-1")
    public void create0(String message) {
        log.info("00 ### Receive message {}", message);
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void create1(String message) {
        log.info("01 ### Receive message {}", message);
    }

    @KafkaListener(
            groupId = "group-2",
            topicPartitions = {
                    @TopicPartition(topic = "str-topic", partitions = {"1"})
            },
            containerFactory = "validMessageContainerFactory"
    )
    public void create2(String message) {
        log.info("02 ### Receive message {}", message);
    }
}
