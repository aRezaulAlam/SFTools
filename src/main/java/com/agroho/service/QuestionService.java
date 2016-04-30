package com.agroho.service;

import com.agroho.model.Question;

import java.util.List;

/**
 * Created by USER on 4/22/2016.
 */
public interface QuestionService {

    public Question saveQuestion(Question question);
    public List<Question> getQuestionList();
}
