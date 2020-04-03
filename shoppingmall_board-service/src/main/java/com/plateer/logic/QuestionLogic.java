package com.plateer.logic;

import com.plateer.QuestionDao;
import com.plateer.QuestionService;
import com.plateer.domain.dto.Question;
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
    public int createQuestion(Question question) {

//        question.setPostId(UUID.randomUUID().toString());
        return questionDao.save(question);
    }

    @Override
    public List<Question> findAllQuestions() {

        return questionDao.findAll();
    }

    @Override
    public List<Question> findByUserName(String userName) {

        System.out.println("Logic : " + userName);
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
}
