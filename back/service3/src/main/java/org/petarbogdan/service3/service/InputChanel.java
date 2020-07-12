package org.petarbogdan.service3.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputChanel {

    String CHANNEL_NAME = "simple_channel";

    @Input(CHANNEL_NAME)
    SubscribableChannel input();
}
