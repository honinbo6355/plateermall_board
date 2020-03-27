package com.plateer.mapper;

import com.plateer.domain.dto.Answer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AnswerMapper {

    Answer select(int postId);
}
