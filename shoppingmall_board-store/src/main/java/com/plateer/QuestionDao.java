package com.plateer;

import com.plateer.domain.dto.Question;

import java.util.List;

public interface QuestionDao {

    void save(Question question);

    List<Question> findAll();

    Question find(int postId);

    void update(Question question);

    void delete(int postId);
}
