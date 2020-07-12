package org.petarbogdan.service3.ctrl;

import lombok.RequiredArgsConstructor;
import org.petarbogdan.service3.service.InputChanel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.annotation.MessageEndpoint;

@MessageEndpoint
@EnableBinding(InputChanel.class)
@RequiredArgsConstructor
public class MessageReceiver {


    @StreamListener(InputChanel.CHANNEL_NAME)
    public void receive(String s){
        System.out.println(s);
    }
}
