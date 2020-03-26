package com.plateer.domain.dto;

import java.util.Date;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Answer {

    private int postId;
    private String date;
    private String writer;
    private String description;

}
