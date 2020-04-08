package com.plateer.controller;

import java.io.File;
import java.util.List;

import com.plateer.AnswerService;
import com.plateer.QuestionService;
import com.plateer.S3Client;

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
	private S3Client s3Client;


	public BoardController(QuestionService questionService, AnswerService answerService, S3Client s3Client) {
		this.questionService = questionService;
		this.answerService = answerService;
		this.s3Client = s3Client;
	}	

	@GetMapping("question/list")
	public List<Question> getQuestionList() {

		return questionService.findAllQuestions();
	}

	@GetMapping("question/list/{userName}")
	public List<Question> getMyQuestionList(@PathVariable String userName) {

		return questionService.findByUserName(userName);
	}

	@GetMapping("question/recent")
	public int getRecentQuestion() {
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

		System.out.println(question.getGoodsTitle());
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

	@GetMapping("upload/")
	public void fileUpload() {

		File file = new File("D:\\arm.jpg");
		s3Client.fileUpload("arm.jpg", file);
		
	}
}
