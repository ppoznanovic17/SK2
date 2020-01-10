package rs.raf.sk.consumer.ctrl;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.annotation.MessageEndpoint;
import rs.raf.sk.consumer.dto.MailDto;
import rs.raf.sk.consumer.service.InputChannel;
import rs.raf.sk.consumer.service.MsgHandler;

@MessageEndpoint
@EnableBinding(InputChannel.class)
@RequiredArgsConstructor
public class MessageReceiver {

    private static Logger logger = LoggerFactory.getLogger(MessageReceiver.class);

    private final MsgHandler msgHandler;

    @StreamListener(InputChannel.CHANNEL_NAME)
    public void receive(MailDto mailDto) {
        msgHandler.doSomething(mailDto);
    }

}
