package com.plateer.logic;

import com.plateer.AnswerService;
import com.plateer.domain.dto.Answer;

public class AnswerLogic implements AnswerService {

    private AnswerDaoImpl answerDao;

    public AnswerLogic(AnswerDaoImpl answerDao) {

        this.answerDao = answerDao;
    }

    @Override
    public Answer findAnswer(int postId) {

        return answerDao.find(postId);
    }

}
