package com.plateer;

import com.plateer.domain.dto.Question;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QuestionService {

    void createQuestion(Question question);

    List<Question> findAllQuestions();

    List<Question> findByUserName(String userName);

    Question questionDetail(int postId);

    void updateQuestion(Question question);

    void deleteQuestion(int postId);

}
