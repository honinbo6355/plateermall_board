package com.plateer.logic;

import com.plateer.QuestionDao;
import com.plateer.domain.dto.Question;
import com.plateer.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public void save(Question question) {

        this.questionMapper.insert(question);
    }

    @Override
    public List<Question> findAll() {

        return this.questionMapper.selectAll();
    }

    @Override
    public Question find(int postId) {

        Question foundedQuestion;
        foundedQuestion = this.questionMapper.select(postId);
        return foundedQuestion;
    }

    @Override
    public void update(Question question) {

        this.questionMapper.update(question);
    }

    @Override
    public void delete(int postId) {

        this.questionMapper.delete(postId);
    }
}