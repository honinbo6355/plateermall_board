package com.plateer.domain.dto;

import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnswerDto {

    private int postId;
    private Date date;
    private String writer;
    private String description;

}
