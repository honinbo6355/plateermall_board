package com.plateer.domain.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BoardDto {

    private int id;
    private String territory;
    private String goodsCode;
    private String title;
    private String description;
    private boolean smsAlarm;
    private boolean emailAlarm;

}
