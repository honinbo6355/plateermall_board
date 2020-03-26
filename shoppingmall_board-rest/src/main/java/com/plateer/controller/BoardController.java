package com.plateer.controller;

import com.plateer.domain.dto.Answer;
import com.plateer.domain.dto.Question;
import com.plateer.logic.QuestionLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
        allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                "Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Set-Cookie"},
        exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RequestMapping("/api/faq/")
public class BoardController {

    private QuestionLogic questionLogic;

//    private List<QuestionDto> questionList = new ArrayList<>();
//    private List<AnswerDto> answerList = new ArrayList<>();

    public BoardController(QuestionLogic questionLogic) {
//        questionList.add(new QuestionDto(1, true, "최단비", "1915 - 5 - 2", "주문영역질문", "123", "나이키신발질문", "왜이렇게큰가요", true, true));
//        questionList.add(new QuestionDto(2, false, "장명섭", "1993 - 3 - 11", "배송영역질문", "456", "꽃무늬원피스질문", "왜이렇게작은가요", false, false));
//
//        answerList.add(new AnswerDto(1, null, "관리자", "당신의 발이 큰 탓입니다."));
//        answerList.add(new AnswerDto(2, null, "관리자", "당신이 살이 찐 탓입니다.."));
        this.questionLogic = questionLogic;
    }

//    @GetMapping("question/list")
//    public List<QuestionDto> getQuestionList() {
//        return questionList;
//    }

    @GetMapping("question/detail/{postId}")
    public Question getQuestion(@PathVariable int postId) {

        Question foundedQuestion = null;

//        for (int i = 0; i < questionList.size(); i++) {
//            if (questionList.get(i).getPostId() == postId) {
//                foundedQuestion = questionList.get(i);
//            }
//        }
        return foundedQuestion;
    }

    @GetMapping("answer/{postId}")
    public Answer getAnswer(@PathVariable int postId) {

        Answer foundedAnswer = null;

//        for (int i = 0; i < answerList.size(); i++) {
//            if (answerList.get(i).getPostId() == postId) {
//                foundedAnswer = answerList.get(i);
//            }
//        }
        return foundedAnswer;
    }

    @PostMapping("question/registration/")
    public void questionRegistration(@RequestBody Question question) {
//        questionList.add(new Question(
//                        3,
//                        false,
//                        null,                   //작성자의 닉네임(?)을 넣어야함
//                        question.getDate(),
//                        question.getTerritory(),
//                        question.getGoodsCode(),
//                        question.getTitle(),
//                        question.getDescription(),
//                        question.isSmsAlarm(),
//                        question.isEmailAlarm()
//                )
//        );
    }

    @GetMapping("question/delete/{postId}")
    public void questionDelete(@PathVariable int postId) {

//        for(int i=0 ; i<questionList.size() ; i++) {
//            if(questionList.get(i).getPostId()==postId) {
//                questionList.remove(i);
//                return;
//            }
//        }
    }

    @GetMapping("question/update/")
    public Question questionUpdate(@RequestBody Question question) {

//        for(int i=0 ; i<questionList.size() ; i++) {
//            if(questionList.get(i).getPostId()== question.getPostId()) {
//                questionList.get(i).setTerritory(question.getTerritory());
//                questionList.get(i).setGoodsCode(question.getGoodsCode());
//                questionList.get(i).setTitle(question.getTitle());
//                questionList.get(i).setDescription(question.getDescription());
//            }
//        }
        return null;
    }
}
