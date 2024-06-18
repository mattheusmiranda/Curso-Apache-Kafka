package com.miranda.strconsumer.listerners;

import com.miranda.strconsumer.custom.StrConsumerCustomListener;
import lombok.extern.log4j.Log4j2;
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

    @StrConsumerCustomListener(groupId = "group-2")
    public void create2(String message) {
        log.info("02 ### Receive message {}", message);
    }
}
