package com.plateer.domain.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuestionDto {

    private int postId;
    private Date date;
    private String territory;
    private String goodsCode;
    private String title;
    private String description;
    private boolean smsAlarm;
    private boolean emailAlarm;

}
