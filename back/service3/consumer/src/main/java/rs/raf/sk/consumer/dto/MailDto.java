package rs.raf.sk.consumer.dto;

import lombok.Data;

@Data
public class MailDto {

    private String to;

    private String title;

    private String body;

}
