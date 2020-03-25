package com.plateer.controller;

import com.plateer.domain.dto.AnswerDto;
import com.plateer.domain.dto.QuestionDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Set-Cookie"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RequestMapping("/api/faq/")
public class BoardController {

    private List<QuestionDto> questionList = new ArrayList<>();
    private List<AnswerDto> answerList = new ArrayList<>();

    public BoardController() {
        questionList.add(new QuestionDto(1, true, null, "주문영역질문", "123", "나이키신발질문", "왜이렇게큰가요", true, true));
        questionList.add(new QuestionDto(2, false, null, "배송영역질문", "456", "꽃무늬원피스질문", "왜이렇게작은가요", false, false));

        answerList.add(new AnswerDto(1, null, "관리자", "당신의 발이 큰 탓입니다."));
        answerList.add(new AnswerDto(2, null, "관리자", "당신이 살이 찐 탓입니다.."));
    }

    @GetMapping("question/list")
    public List<QuestionDto> getQuestionList() {
        return questionList;
    }

    @GetMapping("question/detail/{postId}")
    public QuestionDto getQuestion(@PathVariable int postId) {

        QuestionDto foundedQuestion = null;

        for(int i=0; i < questionList.size(); i++) {
            if (questionList.get(i).getPostId() == postId) {
                foundedQuestion = questionList.get(i);
            }
        }
        return foundedQuestion;
    }

    @GetMapping("answer/{postId}")
    public AnswerDto getAnswer(@PathVariable int postId) {

        AnswerDto foundedAnswer = null;

        for(int i=0; i < answerList.size(); i++) {
            if (answerList.get(i).getPostId() == postId) {
                foundedAnswer = answerList.get(i);
            }
        }
        return foundedAnswer;
    }

    @PostMapping("question/registration/")
    public void questionRegistration(@RequestBody QuestionDto questionDto) {
        questionList.add(new QuestionDto(
                        3,
                        false,
                        questionDto.getDate(),
                        questionDto.getTerritory(),
                        questionDto.getGoodsCode(),
                        questionDto.getTitle(),
                        questionDto.getDescription(),
                        questionDto.isSmsAlarm(),
                        questionDto.isEmailAlarm()
                )
        );
    }
}
