package com.plateer.domain.dto;

import lombok.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuestionDto {

    private int postId;             //문의글의 ID (PK)
    private boolean state;          //문의에 대한 답변의 상태
    private Date date;              //작성일
    private String territory;       //문의 영역 ex) 주문, 배송, 반품, 교환 ...
    private String goodsCode;       //상품에 대한 문의일 때 상품코드 - 상품문의가 아닐 때는 빈값으로할까(?)
    private String title;           //문의글 제목
    private String description;     //문의글 내용
    private boolean smsAlarm;       //SMS로 알림을 받을지 (checkbox)
    private boolean emailAlarm;     //Email로 알림을 받을지 (checkbox)

}
