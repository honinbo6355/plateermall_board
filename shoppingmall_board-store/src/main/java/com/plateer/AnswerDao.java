package com.plateer;

import com.plateer.domain.dto.Answer;

public interface AnswerDao {

    Answer find(int postId);

}
