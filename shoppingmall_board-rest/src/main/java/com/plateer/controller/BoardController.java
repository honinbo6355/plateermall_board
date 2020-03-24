package com.plateer.controller;

import com.plateer.domain.dto.AnswerDto;
import com.plateer.domain.dto.QuestionDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Set-Cookie"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RequestMapping("/api/faq/")
public class BoardController {

    @GetMapping("qeustion/list")
    public List<QuestionDto> getQeustionList() {
        List<QuestionDto> list = new ArrayList<>();
        list.add(new QuestionDto(1,new Date(),"주문영역질문","123","나이키신발질문","왜이렇게큰가요",true,true));
        list.add(new QuestionDto(2,new Date(),"배송영역질문","456","꽃무늬원피스질문","왜이렇게작은가요",false,false));
        return list;
    }

    @GetMapping("question/detail/{postId}")
    public QuestionDto getQuestion(@PathVariable int postId) {
        List<QuestionDto> list = new ArrayList<>();
        list.add(new QuestionDto(1,new Date(),"주문영역질문","123","나이키신발질문","왜이렇게큰가요",true,true));
        list.add(new QuestionDto(2,new Date(),"배송영역질문","456","꽃무늬원피스질문","왜이렇게작은가요",false,false));

        QuestionDto foundedBoard = null;

        for(int i=0 ; i<list.size() ; i++) {
            if(list.get(i).getPostId()==postId) {
                foundedBoard = list.get(i);
            }
        }
        return foundedBoard;
    }

    @GetMapping("answer/{postId}")
    public AnswerDto getAnswer() {



        return null;
    }
}
