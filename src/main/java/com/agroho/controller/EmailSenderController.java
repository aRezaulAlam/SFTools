package com.agroho.controller;

import com.agroho.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rezaul on 4/30/16.
 */
@Controller
public class EmailSenderController {

    @Autowired
    EmailService emailService = new EmailService();

    @RequestMapping(value = "/send_email" , method = RequestMethod.GET)
    @ResponseBody
    public String sendEmail(){

        emailService.agrohoReadyToSendEmail("rezaulalam@live.com","arezaulalam@gmail.com","Agroho Mail","This is a agroho email");



        return "success";
    }

}
