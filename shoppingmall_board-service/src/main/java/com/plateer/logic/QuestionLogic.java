package com.plateer.logic;

import com.plateer.QuestionService;
import com.plateer.domain.dto.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionLogic implements QuestionService
{
    private QuestionDaoImpl questionDao;

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
}
