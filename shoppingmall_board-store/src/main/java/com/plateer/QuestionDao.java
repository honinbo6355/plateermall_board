package com.plateer;

import com.plateer.domain.dto.Question;
import com.plateer.domain.dto.Search;

import java.util.List;

public interface QuestionDao {

    void save(Question question);

    List<Question> findAll();

    List<Question> findByUserName(String userName);

    Question find(int postId);

    void update(Question question);

    void delete(int postId);

    int getRecentQuestion();

	List<Question> search(Search search);
}
