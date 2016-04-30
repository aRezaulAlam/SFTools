package com.agroho.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by USER on 4/22/2016.
 */
@Entity
@Table(name = "user_question")
public class Question {


    @Id@Column(name = "user_question_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userQuestionId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_question_subject")
    private String  userQuestionSubject;

    @Column(name = "user_mobile_number")
    private String userMobileNo;

    @Column(name = "user_question_details")
    private String userQuestionDetails;

    @Column(name = "user_attachment")
    private String userAttachment;

    @Column(name = "user_submission_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date date;

    public long getUserQuestionId() {
        return userQuestionId;
    }

    public void setUserQuestionId(long userQuestionId) {
        this.userQuestionId = userQuestionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserQuestionSubject() {
        return userQuestionSubject;
    }

    public void setUserQuestionSubject(String userQuestionSubject) {
        this.userQuestionSubject = userQuestionSubject;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    public String getUserQuestionDetails() {
        return userQuestionDetails;
    }

    public void setUserQuestionDetails(String userQuestionDetails) {
        this.userQuestionDetails = userQuestionDetails;
    }

    public String getUserAttachment() {
        return userAttachment;
    }

    public void setUserAttachment(String userAttachment) {
        this.userAttachment = userAttachment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
