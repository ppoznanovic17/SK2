package rs.raf.sk.consumer.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import rs.raf.sk.consumer.dto.MailDto;
import rs.raf.sk.consumer.service.MsgHandler;

@Service
public class MsgHandlerImpl implements MsgHandler {
    @Async
    @Override
    public void doSomething(MailDto mailDto) {
        System.out.println(mailDto.toString());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doD() {
        doSomething(null);
    }
}
