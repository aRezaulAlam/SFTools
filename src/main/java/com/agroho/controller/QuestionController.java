package com.agroho.controller;

import com.agroho.model.Question;
import com.agroho.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by USER on 4/22/2016.
 */
@Controller
public class QuestionController {



    @Autowired
    QuestionService questionService;


    @RequestMapping(value = "/api/v1/question/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Question> getAllQuestions(){

        return questionService.getQuestionList();


    }

    @RequestMapping(value = "/api/v1/question", method = RequestMethod.POST)
    @ResponseBody
    public Question addQuestion(@RequestBody Question question){

        System.out.println("NAME OF THE USER : "+question.getUserName().toString());

        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime();
        question.setDate(currentDate);
        Question replyQuestion = questionService.saveQuestion(question);

        return replyQuestion;
    }

    @RequestMapping(value = "/api/v1/question", method = RequestMethod.GET)
    @ResponseBody
    public String getJson(){

        return "Hello World";
    }

}
