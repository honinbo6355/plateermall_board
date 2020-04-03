package com.plateer;

import com.plateer.domain.dto.Question;

import java.util.List;

public interface QuestionDao {

    int save(Question question);

    List<Question> findAll();

    List<Question> findByUserName(String userName);

    Question find(int postId);

    void update(Question question);

    void delete(int postId);
}
