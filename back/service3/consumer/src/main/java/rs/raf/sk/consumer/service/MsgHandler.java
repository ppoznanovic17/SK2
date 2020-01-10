package rs.raf.sk.consumer.service;

import rs.raf.sk.consumer.dto.MailDto;

public interface MsgHandler {

    void doSomething(MailDto mailDto);

}
