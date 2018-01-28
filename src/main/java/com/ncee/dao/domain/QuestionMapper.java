package com.ncee.dao.domain;

import com.ncee.dao.model.Question;
import com.ncee.dao.model.QuestionWithBLOBs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface QuestionMapper {
    @Delete({
        "delete from question",
        "where question_id = #{questionId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long questionId);

    @Insert({
        "insert into question (question_id, question, ",
        "question_type_id, construct_type_id, ",
        "active, answer, ",
        "analysis)",
        "values (#{questionId,jdbcType=BIGINT}, #{question,jdbcType=VARCHAR}, ",
        "#{questionTypeId,jdbcType=BIGINT}, #{constructTypeId,jdbcType=BIGINT}, ",
        "#{active,jdbcType=INTEGER}, #{answer,jdbcType=LONGVARCHAR}, ",
        "#{analysis,jdbcType=LONGVARCHAR})"
    })
    int insert(QuestionWithBLOBs record);

    int insertSelective(QuestionWithBLOBs record);

    @Select({
        "select",
        "question_id, question, question_type_id, construct_type_id, active, answer, ",
        "analysis",
        "from question",
        "where question_id = #{questionId,jdbcType=BIGINT}"
    })
    @ResultMap("ResultMapWithBLOBs")
    QuestionWithBLOBs selectByPrimaryKey(Long questionId);

    int updateByPrimaryKeySelective(QuestionWithBLOBs record);

    @Update({
        "update question",
        "set question = #{question,jdbcType=VARCHAR},",
          "question_type_id = #{questionTypeId,jdbcType=BIGINT},",
          "construct_type_id = #{constructTypeId,jdbcType=BIGINT},",
          "active = #{active,jdbcType=INTEGER},",
          "answer = #{answer,jdbcType=LONGVARCHAR},",
          "analysis = #{analysis,jdbcType=LONGVARCHAR}",
        "where question_id = #{questionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(QuestionWithBLOBs record);

    @Update({
        "update question",
        "set question = #{question,jdbcType=VARCHAR},",
          "question_type_id = #{questionTypeId,jdbcType=BIGINT},",
          "construct_type_id = #{constructTypeId,jdbcType=BIGINT},",
          "active = #{active,jdbcType=INTEGER}",
        "where question_id = #{questionId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Question record);
}