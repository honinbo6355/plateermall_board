package com.plateer.logic;

import com.plateer.AnswerDao;
import com.plateer.domain.dto.Answer;
import com.plateer.mapper.AnswerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDaoImpl implements AnswerDao {

    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Answer find(int postId) {

        return this.answerMapper.select(postId);
    }
}
