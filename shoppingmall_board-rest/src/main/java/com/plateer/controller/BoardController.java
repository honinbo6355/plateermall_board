package com.plateer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plateer.domain.dto.Answer;
import com.plateer.domain.dto.Question;
import com.plateer.logic.AnswerLogic;
import com.plateer.logic.QuestionLogic;

@RestController
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
		"Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Set-Cookie"},
exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RequestMapping("/api/faq/")
public class BoardController {

	private QuestionLogic questionLogic;
	private AnswerLogic answerLogic;

	public BoardController(QuestionLogic questionLogic, AnswerLogic answerLogic) {

		this.questionLogic = questionLogic;
		this.answerLogic = answerLogic;
	}	

	@GetMapping("question/list")
	public List<Question> getQuestionList() {

		return questionLogic.findAllQuestions();
	}

	@GetMapping("question/detail/{postId}")
	public Question getQuestion(@PathVariable int postId) {

		return questionLogic.questionDetail(postId);
	}

	@GetMapping("answer/{postId}")
	public Answer getAnswer(@PathVariable int postId) {

		return answerLogic.findAnswer(postId);
	}

	@PostMapping("question/registration/")
	public void questionRegistration(@RequestBody Question question) {
		System.out.println(question.getTitle());
		questionLogic.createQuestion(question);
	}

	@GetMapping("question/delete/{postId}")
	public void questionDelete(@PathVariable int postId) {

		questionLogic.deleteQuestion(postId);
	}

	@PostMapping("question/update/")
	public void questionUpdate(@RequestBody Question question) {
		
		questionLogic.updateQuestion(question);
	}
}
