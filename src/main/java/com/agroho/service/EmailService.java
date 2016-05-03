package com.agroho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

/**
 * Created by rezaul on 4/30/16.
 */
@Service
public class EmailService {

    @Autowired
    private MailSender agrohoSendMail; // MailSender interface defines a strategy
    // for sending simple mails

    public void agrohoReadyToSendEmail(String toAddress, String fromAddress, String subject, String msgBody) {

        SimpleMailMessage agrohoMsg = new SimpleMailMessage();
        agrohoMsg.setFrom(fromAddress);
        agrohoMsg.setTo(toAddress);
        agrohoMsg.setSubject(subject);
        agrohoMsg.setText(msgBody);
        agrohoSendMail.send(agrohoMsg);
    }
}
