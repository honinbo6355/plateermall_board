package com.plateer.mapper;

import com.plateer.domain.dto.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuestionMapper {

    int insert(Question question);

    Question select(int postId);

    List<Question> selectAll();

    void update(Question question);

    void delete(int postId);

    List<Question> selectByUserName(String userName);

}
