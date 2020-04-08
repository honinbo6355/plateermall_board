package com.plateer.logic;

import com.plateer.QuestionDao;
import com.plateer.QuestionService;
import com.plateer.domain.dto.Question;
import com.plateer.domain.dto.Search;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionLogic implements QuestionService
{
    private QuestionDao questionDao;

    public QuestionLogic(QuestionDaoImpl questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public void createQuestion(Question question) {

//        question.setPostId(UUID.randomUUID().toString());
        questionDao.save(question);
    }

    @Override
    public List<Question> findAllQuestions() {

        return questionDao.findAll();
    }

    @Override
    public List<Question> findByUserName(String userName) {

        return questionDao.findByUserName(userName);
    }

    @Override
    public Question questionDetail(int postId) {

        return questionDao.find(postId);
    }

    @Override
    public void updateQuestion(Question question) {
    	
    	questionDao.update(question);
    }

    @Override
    public void deleteQuestion(int postId) {

        questionDao.delete(postId);
    }

    @Override
    public int getRecentQuestion() {

        return questionDao.getRecentQuestion();
    }

	@Override
	public List<Question> searchQuestion(Search search) {
		
		return questionDao.search(search);
	}
}
