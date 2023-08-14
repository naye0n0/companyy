package com.goldpension.demo;

public class CompanyDto {
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

    public CompanyDto() {
    }

    public CompanyDto(int intExact, String companyName, String companyAddress, String companyBoss, String companyCall, String companyHomepage, String companyLogo, String company_name, String companyNumber, String companySize, String applyWork, String applySex, String applyNum, String applyDetail, String applyDeadline, String applyAge, String workExperience, String workDay, String workHour, String workPay, String workPlace, String workTerm) {
    }

    public CompanyDto(Long id, String COMPANY_NAME, String COMPANY_NUMBER, String COMPANY_ADDRESS, String COMPANY_CALL, String COMPANY_BOSS, String COMPANY_SIZE, String COMPANY_LOGO, String COMPANY_HOMEPAGE, String WORK_PLACE, String WORK_DAY, String WORK_HOUR, String WORK_PAY, String WORK_TERM, String WORK_EXPERIENCE, String APPLY_NUM, String APPLY_DEADLINE, String APPLY_SEX, String APPLY_AGE, String APPLY_WORK, String APPLY_DETAIL) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }

    public String getCOMPANY_NUMBER() {
        return COMPANY_NUMBER;
    }

    public void setCOMPANY_NUMBER(String COMPANY_NUMBER) {
        this.COMPANY_NUMBER = COMPANY_NUMBER;
    }

    public String getCOMPANY_ADDRESS() {
        return COMPANY_ADDRESS;
    }

    public void setCOMPANY_ADDRESS(String COMPANY_ADDRESS) {
        this.COMPANY_ADDRESS = COMPANY_ADDRESS;
    }

    public String getCOMPANY_CALL() {
        return COMPANY_CALL;
    }

    public void setCOMPANY_CALL(String COMPANY_CALL) {
        this.COMPANY_CALL = COMPANY_CALL;
    }

    public String getCOMPANY_BOSS() {
        return COMPANY_BOSS;
    }

    public void setCOMPANY_BOSS(String COMPANY_BOSS) {
        this.COMPANY_BOSS = COMPANY_BOSS;
    }

    public String getCOMPANY_SIZE() {
        return COMPANY_SIZE;
    }

    public void setCOMPANY_SIZE(String COMPANY_SIZE) {
        this.COMPANY_SIZE = COMPANY_SIZE;
    }

    public String getCOMPANY_LOGO() {
        return COMPANY_LOGO;
    }

    public void setCOMPANY_LOGO(String COMPANY_LOGO) {
        this.COMPANY_LOGO = COMPANY_LOGO;
    }

    public String getCOMPANY_HOMEPAGE() {
        return COMPANY_HOMEPAGE;
    }

    public void setCOMPANY_HOMEPAGE(String COMPANY_HOMEPAGE) {
        this.COMPANY_HOMEPAGE = COMPANY_HOMEPAGE;
    }

    public String getWORK_PLACE() {
        return WORK_PLACE;
    }

    public void setWORK_PLACE(String WORK_PLACE) {
        this.WORK_PLACE = WORK_PLACE;
    }

    public String getWORK_DAY() {
        return WORK_DAY;
    }

    public void setWORK_DAY(String WORK_DAY) {
        this.WORK_DAY = WORK_DAY;
    }

    public String getWORK_HOUR() {
        return WORK_HOUR;
    }

    public void setWORK_HOUR(String WORK_HOUR) {
        this.WORK_HOUR = WORK_HOUR;
    }

    public String getWORK_PAY() {
        return WORK_PAY;
    }

    public void setWORK_PAY(String WORK_PAY) {
        this.WORK_PAY = WORK_PAY;
    }

    public String getWORK_TERM() {
        return WORK_TERM;
    }

    public void setWORK_TERM(String WORK_TERM) {
        this.WORK_TERM = WORK_TERM;
    }

    public String getWORK_EXPERIENCE() {
        return WORK_EXPERIENCE;
    }

    public void setWORK_EXPERIENCE(String WORK_EXPERIENCE) {
        this.WORK_EXPERIENCE = WORK_EXPERIENCE;
    }

    public String getAPPLY_NUM() {
        return APPLY_NUM;
    }

    public void setAPPLY_NUM(String APPLY_NUM) {
        this.APPLY_NUM = APPLY_NUM;
    }

    public String getAPPLY_DEADLINE() {
        return APPLY_DEADLINE;
    }

    public void setAPPLY_DEADLINE(String APPLY_DEADLINE) {
        this.APPLY_DEADLINE = APPLY_DEADLINE;
    }

    public String getAPPLY_SEX() {
        return APPLY_SEX;
    }

    public void setAPPLY_SEX(String APPLY_SEX) {
        this.APPLY_SEX = APPLY_SEX;
    }

    public String getAPPLY_AGE() {
        return APPLY_AGE;
    }

    public void setAPPLY_AGE(String APPLY_AGE) {
        this.APPLY_AGE = APPLY_AGE;
    }

    public String getAPPLY_WORK() {
        return APPLY_WORK;
    }

    public void setAPPLY_WORK(String APPLY_WORK) {
        this.APPLY_WORK = APPLY_WORK;
    }

    public String getAPPLY_DETAIL() {
        return APPLY_DETAIL;
    }

    public void setAPPLY_DETAIL(String APPLY_DETAIL) {
        this.APPLY_DETAIL = APPLY_DETAIL;
    }

    @Override
    public String toString() {
        return "CompanyDto{" +
                "id=" + id +
                ", COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", COMPANY_NUMBER='" + COMPANY_NUMBER + '\'' +
                ", COMPANY_ADDRESS='" + COMPANY_ADDRESS + '\'' +
                ", COMPANY_CALL='" + COMPANY_CALL + '\'' +
                ", COMPANY_BOSS='" + COMPANY_BOSS + '\'' +
                ", COMPANY_SIZE=" + COMPANY_SIZE +
                ", COMPANY_LOGO='" + COMPANY_LOGO + '\'' +
                ", COMPANY_HOMEPAGE='" + COMPANY_HOMEPAGE + '\'' +
                ", WORK_PLACE='" + WORK_PLACE + '\'' +
                ", WORK_DAY='" + WORK_DAY + '\'' +
                ", WORK_HOUR=" + WORK_HOUR +
                ", WORK_PAY=" + WORK_PAY +
                ", WORK_TERM='" + WORK_TERM + '\'' +
                ", WORK_EXPERIENCE='" + WORK_EXPERIENCE + '\'' +
                ", APPLY_NUM=" + APPLY_NUM +
                ", APPLY_DEADLINE='" + APPLY_DEADLINE + '\'' +
                ", APPLY_SEX='" + APPLY_SEX + '\'' +
                ", APPLY_AGE=" + APPLY_AGE +
                ", APPLY_WORK='" + APPLY_WORK + '\'' +
                ", APPLY_DETAIL='" + APPLY_DETAIL + '\'' +
                '}';
    }
}

