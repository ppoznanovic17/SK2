package rs.raf.sk.publisher.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import rs.raf.sk.publisher.dto.MailDto;

@Component
@EnableBinding(OutputChannel.class)
@RequiredArgsConstructor
public class Scheduler {

    private static final Logger logger = LoggerFactory.getLogger("SchedulerService");

    private final OutputChannel outputChannel;

    @Scheduled(fixedDelay = 1000)
    public void publish() {
        MailDto mailDto = new MailDto("pera@gmail.com", "Zdravo", "Zdravo");
        outputChannel.output().send(MessageBuilder.withPayload(mailDto).build());
        logger.info("Hello!");
    }

}
