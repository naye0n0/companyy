package com.goldpension.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String COMPANY_NAME;
    private String COMPANY_NUMBER;
    private String COMPANY_ADDRESS;
    private String COMPANY_CALL;
    private String COMPANY_BOSS;
    private String COMPANY_SIZE;
    private String COMPANY_LOGO;
    private String COMPANY_HOMEPAGE;

    private String WORK_PLACE;
    private String WORK_DAY;
    private String WORK_HOUR;
    private String WORK_PAY;
    private String WORK_TERM;
    private String WORK_EXPERIENCE;

    private String APPLY_NUM;
    private String APPLY_DEADLINE;
    private String APPLY_SEX;
    private String APPLY_AGE;
    private String APPLY_WORK;
    private String APPLY_DETAIL;

    public CompanyEntity() {
    }

    public CompanyEntity(Long id, String COMPANY_NAME, String COMPANY_NUMBER, String COMPANY_ADDRESS, String COMPANY_CALL, String COMPANY_BOSS, String COMPANY_SIZE, String COMPANY_LOGO, String COMPANY_HOMEPAGE, String WORK_PLACE, String WORK_DAY, String WORK_HOUR, String WORK_PAY, String WORK_TERM, String WORK_EXPERIENCE, String APPLY_NUM, String APPLY_DEADLINE, String APPLY_SEX, String APPLY_AGE, String APPLY_WORK, String APPLY_DETAIL) {
        this.id = id;
        this.COMPANY_NAME = COMPANY_NAME;
        this.COMPANY_NUMBER = COMPANY_NUMBER;
        this.COMPANY_ADDRESS = COMPANY_ADDRESS;
        this.COMPANY_CALL = COMPANY_CALL;
        this.COMPANY_BOSS = COMPANY_BOSS;
        this.COMPANY_SIZE = COMPANY_SIZE;
        this.COMPANY_LOGO = COMPANY_LOGO;
        this.COMPANY_HOMEPAGE = COMPANY_HOMEPAGE;
        this.WORK_PLACE = WORK_PLACE;
        this.WORK_DAY = WORK_DAY;
        this.WORK_HOUR = WORK_HOUR;
        this.WORK_PAY = WORK_PAY;
        this.WORK_TERM = WORK_TERM;
        this.WORK_EXPERIENCE = WORK_EXPERIENCE;
        this.APPLY_NUM = APPLY_NUM;
        this.APPLY_DEADLINE = APPLY_DEADLINE;
        this.APPLY_SEX = APPLY_SEX;
        this.APPLY_AGE = APPLY_AGE;
        this.APPLY_WORK = APPLY_WORK;
        this.APPLY_DETAIL = APPLY_DETAIL;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }

    public void setCOMPANY_NUMBER(String COMPANY_NUMBER) {
        this.COMPANY_NUMBER = COMPANY_NUMBER;
    }

    public void setCOMPANY_ADDRESS(String COMPANY_ADDRESS) {
        this.COMPANY_ADDRESS = COMPANY_ADDRESS;
    }

    public void setCOMPANY_CALL(String COMPANY_CALL) {
        this.COMPANY_CALL = COMPANY_CALL;
    }

    public void setCOMPANY_BOSS(String COMPANY_BOSS) {
        this.COMPANY_BOSS = COMPANY_BOSS;
    }

    public void setCOMPANY_SIZE(String COMPANY_SIZE) {
        this.COMPANY_SIZE = COMPANY_SIZE;
    }

    public void setCOMPANY_LOGO(String COMPANY_LOGO) {
        this.COMPANY_LOGO = COMPANY_LOGO;
    }

    public void setCOMPANY_HOMEPAGE(String COMPANY_HOMEPAGE) {
        this.COMPANY_HOMEPAGE = COMPANY_HOMEPAGE;
    }

    public void setWORK_PLACE(String WORK_PLACE) {
        this.WORK_PLACE = WORK_PLACE;
    }

    public void setWORK_DAY(String WORK_DAY) {
        this.WORK_DAY = WORK_DAY;
    }

    public void setWORK_HOUR(String WORK_HOUR) {
        this.WORK_HOUR = WORK_HOUR;
    }

    public void setWORK_PAY(String WORK_PAY) {
        this.WORK_PAY = WORK_PAY;
    }

    public void setWORK_TERM(String WORK_TERM) {
        this.WORK_TERM = WORK_TERM;
    }

    public void setWORK_EXPERIENCE(String WORK_EXPERIENCE) {
        this.WORK_EXPERIENCE = WORK_EXPERIENCE;
    }

    public void setAPPLY_NUM(String APPLY_NUM) {
        this.APPLY_NUM = APPLY_NUM;
    }

    public void setAPPLY_DEADLINE(String APPLY_DEADLINE) {
        this.APPLY_DEADLINE = APPLY_DEADLINE;
    }

    public void setAPPLY_SEX(String APPLY_SEX) {
        this.APPLY_SEX = APPLY_SEX;
    }

    public void setAPPLY_AGE(String APPLY_AGE) {
        this.APPLY_AGE = APPLY_AGE;
    }

    public void setAPPLY_WORK(String APPLY_WORK) {
        this.APPLY_WORK = APPLY_WORK;
    }

    public void setAPPLY_DETAIL(String APPLY_DETAIL) {
        this.APPLY_DETAIL = APPLY_DETAIL;
    }


    @Override
    public String toString() {
        return "CompanyEntity{" +
                "id=" + id +
                ", COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", COMPANY_NUMBER='" + COMPANY_NUMBER + '\'' +
                ", COMPANY_ADDRESS='" + COMPANY_ADDRESS + '\'' +
                ", COMPANY_CALL='" + COMPANY_CALL + '\'' +
                ", COMPANY_BOSS='" + COMPANY_BOSS + '\'' +
                ", COMPANY_SIZE='" + COMPANY_SIZE + '\'' +
                ", COMPANY_LOGO='" + COMPANY_LOGO + '\'' +
                ", COMPANY_HOMEPAGE='" + COMPANY_HOMEPAGE + '\'' +
                ", WORK_PLACE='" + WORK_PLACE + '\'' +
                ", WORK_DAY='" + WORK_DAY + '\'' +
                ", WORK_HOUR='" + WORK_HOUR + '\'' +
                ", WORK_PAY='" + WORK_PAY + '\'' +
                ", WORK_TERM='" + WORK_TERM + '\'' +
                ", WORK_EXPERIENCE='" + WORK_EXPERIENCE + '\'' +
                ", APPLY_NUM='" + APPLY_NUM + '\'' +
                ", APPLY_DEADLINE='" + APPLY_DEADLINE + '\'' +
                ", APPLY_SEX='" + APPLY_SEX + '\'' +
                ", APPLY_AGE='" + APPLY_AGE + '\'' +
                ", APPLY_WORK='" + APPLY_WORK + '\'' +
                ", APPLY_DETAIL='" + APPLY_DETAIL + '\'' +
                '}';
    }
}