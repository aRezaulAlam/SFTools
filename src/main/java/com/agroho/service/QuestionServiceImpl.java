package com.agroho.service;

import com.agroho.model.Question;
import com.agroho.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by USER on 4/22/2016.
 */
@Service
public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question saveQuestion(Question question) {
        return questionRepository.saveQuestion(question);
    }

    @Override
    public List<Question> getQuestionList() {
        return questionRepository.getQuestionList();
    }
}
