package com.plateer.controller;

import java.util.List;

import com.plateer.AnswerService;
import com.plateer.QuestionService;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

import com.plateer.domain.dto.Answer;
import com.plateer.domain.dto.Question;

@RestController
@CrossOrigin(allowCredentials = "true", origins = {"*"}, methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT},
allowedHeaders = {"Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
		"Access-Control-Request-Headers", "Access-Control-Allow-Origin", "Set-Cookie", "Authorization"},
exposedHeaders = {"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"}, maxAge = 3000)
@RequestMapping("/api/faq/")
public class BoardController {

	private QuestionService questionService;
	private AnswerService answerService;

	public BoardController(QuestionService questionService, AnswerService answerService) {
		this.questionService = questionService;
		this.answerService = answerService;
	}	

	@GetMapping("question/list")
	public List<Question> getQuestionList() {

		return questionService.findAllQuestions();
	}

	@GetMapping("question/list/{userName}")
	public List<Question> getMyQuestionList(@PathVariable String userName) {

		System.out.println("Contoller : " + userName);
		return questionService.findByUserName(userName);
	}

	@GetMapping("question/recent")
	public int getRecentQuestion() {
		System.out.println("들어옴 Controller");
		return questionService.getRecentQuestion();
	}

	@GetMapping("question/detail/{postId}")
	public Question getQuestion(@PathVariable int postId) {

		return questionService.questionDetail(postId);
	}

	@GetMapping("answer/{postId}")
	public Answer getAnswer(@PathVariable int postId) {

		return answerService.findAnswer(postId);
	}

	@PostMapping("question/registration/")
	public void questionRegistration(@RequestBody Question question) {

		questionService.createQuestion(question);
	}

	@DeleteMapping("question/delete/{postId}")
	public void questionDelete(@PathVariable int postId) {

		questionService.deleteQuestion(postId);
	}

	@PutMapping("question/update/")
	public void questionUpdate(@RequestBody Question question) {

		questionService.updateQuestion(question);
	}
}
