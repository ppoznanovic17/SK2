package rs.raf.sk.publisher.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class MailDto {

    private String to;

    private String title;

    private String body;

}
