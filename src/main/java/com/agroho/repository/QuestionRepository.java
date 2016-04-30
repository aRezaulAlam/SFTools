package com.agroho.repository;

import com.agroho.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by USER on 4/22/2016.
 */
@Repository
public class QuestionRepository {

    @Autowired
    QuestionJpaRepository questionJpaRepository;

    @Transactional
    public Question saveQuestion(Question question){

        Question questionSaved = questionJpaRepository.saveAndFlush(question);

        return questionSaved;
    }

    @Transactional
    public List<Question> getQuestionList(){

        List<Question> questionList = questionJpaRepository.findAll();

        return questionList;
    }

}
