package com.plateer.controller;

import com.plateer.domain.dto.BoardDto;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Set-Cookie"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RequestMapping("/api/faq/")
public class BoardController {

    @GetMapping("list")
    public List<BoardDto> getFaqList() {
        List<BoardDto> list = new ArrayList<>();
        list.add(new BoardDto(1,"123","123","123","123",true,true));
        list.add(new BoardDto(2,"456","456","456","456",false,false));
        return list;
    }

    @GetMapping("detail")
    public BoardDto getFaq() {


        return null;
    }
}
