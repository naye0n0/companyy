package com.goldpension.demo;

import com.goldpension.demo.entity.CompanyEntity;
import com.goldpension.demo.repository.CompanyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.Iterator;
import java.util.Optional;

@Repository
public class CompanyDao {
    private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
    private final CompanyRepository companyRepository;

    public CompanyDao(
            @Autowired CompanyRepository companyRepository
    ){
        this.companyRepository = companyRepository;
    }


    public void createCompany(CompanyDto dto){
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setCOMPANY_NAME(dto.getCOMPANY_NAME());
        companyEntity.setCOMPANY_ADDRESS(dto.getCOMPANY_ADDRESS());
        companyEntity.setCOMPANY_BOSS(dto.getCOMPANY_BOSS());
        companyEntity.setCOMPANY_CALL(dto.getCOMPANY_CALL());
        companyEntity.setCOMPANY_HOMEPAGE(dto.getCOMPANY_HOMEPAGE());
        companyEntity.setCOMPANY_LOGO(dto.getCOMPANY_LOGO());
        companyEntity.setCOMPANY_NUMBER(dto.getCOMPANY_NUMBER());
        companyEntity.setCOMPANY_SIZE(dto.getCOMPANY_SIZE());

        companyEntity.setAPPLY_AGE(dto.getAPPLY_AGE());
        companyEntity.setAPPLY_DEADLINE(dto.getAPPLY_DEADLINE());
        companyEntity.setAPPLY_DETAIL(dto.getAPPLY_DETAIL());
        companyEntity.setAPPLY_NUM(dto.getAPPLY_NUM());
        companyEntity.setAPPLY_SEX(dto.getAPPLY_SEX());
        companyEntity.setAPPLY_WORK(dto.getAPPLY_WORK());

        companyEntity.setWORK_DAY(dto.getWORK_DAY());
        companyEntity.setWORK_EXPERIENCE(dto.getWORK_EXPERIENCE());
        companyEntity.setWORK_HOUR(dto.getWORK_HOUR());
        companyEntity.setWORK_PAY(dto.getWORK_PAY());
        companyEntity.setWORK_PLACE(dto.getWORK_PLACE());
        companyEntity.setWORK_TERM(dto.getWORK_TERM());


        this.companyRepository.save(companyEntity);
    }

    public CompanyEntity readCompany(long id) {
        Optional<CompanyEntity> companyEntityOptional = this.companyRepository.findById(id);
        if (companyEntityOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return companyEntityOptional.get();
    }

    public Iterator<CompanyEntity> readCompanyAll(){
        return this.companyRepository.findAll().iterator();
    }

    public void updateCompany(int id, CompanyDto dto){
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setCOMPANY_NAME(dto.getCOMPANY_NAME() == null ? companyEntity.getCOMPANY_NAME() : dto.getCOMPANY_NAME());
        companyEntity.setCOMPANY_ADDRESS(dto.getCOMPANY_ADDRESS() == null ? companyEntity.getCOMPANY_ADDRESS() : dto.getCOMPANY_ADDRESS());
        companyEntity.setCOMPANY_BOSS(dto.getCOMPANY_BOSS() == null ? companyEntity.getCOMPANY_BOSS() : dto.getCOMPANY_BOSS());
        companyEntity.setCOMPANY_CALL(dto.getCOMPANY_CALL() == null ? companyEntity.getCOMPANY_CALL() : dto.getCOMPANY_CALL());
        companyEntity.setCOMPANY_HOMEPAGE(dto.getCOMPANY_HOMEPAGE() == null ? companyEntity.getCOMPANY_HOMEPAGE() : dto.getCOMPANY_HOMEPAGE());
        companyEntity.setCOMPANY_LOGO(dto.getCOMPANY_LOGO() == null ? companyEntity.getCOMPANY_LOGO() : dto.getCOMPANY_LOGO());
        companyEntity.setCOMPANY_NUMBER(dto.getCOMPANY_NUMBER() == null ? companyEntity.getCOMPANY_NUMBER() : dto.getCOMPANY_NUMBER());
        companyEntity.setCOMPANY_SIZE(dto.getCOMPANY_SIZE() == null ? companyEntity.getCOMPANY_SIZE() : dto.getCOMPANY_SIZE());

        companyEntity.setAPPLY_AGE(dto.getAPPLY_AGE() == null ? companyEntity.getAPPLY_AGE() : dto.getAPPLY_AGE());
        companyEntity.setAPPLY_DEADLINE(dto.getAPPLY_DEADLINE() == null ? companyEntity.getAPPLY_DEADLINE() : dto.getAPPLY_DEADLINE());
        companyEntity.setAPPLY_DETAIL(dto.getAPPLY_DETAIL() == null ? companyEntity.getAPPLY_DETAIL() : dto.getAPPLY_DETAIL());
        companyEntity.setAPPLY_NUM(dto.getAPPLY_NUM() == null ? companyEntity.getAPPLY_NUM() : dto.getAPPLY_NUM());
        companyEntity.setAPPLY_SEX(dto.getAPPLY_SEX() == null ? companyEntity.getAPPLY_SEX() : dto.getAPPLY_SEX());
        companyEntity.setAPPLY_WORK(dto.getAPPLY_WORK() == null ? companyEntity.getAPPLY_WORK() : dto.getAPPLY_WORK());

        companyEntity.setWORK_DAY(dto.getWORK_DAY() == null ? companyEntity.getWORK_DAY() : dto.getWORK_DAY());
        companyEntity.setWORK_EXPERIENCE(dto.getWORK_EXPERIENCE() == null ? companyEntity.getWORK_EXPERIENCE(): dto.getWORK_EXPERIENCE());
        companyEntity.setWORK_HOUR(dto.getWORK_HOUR() == null ? companyEntity.getWORK_HOUR() : dto.getWORK_HOUR());
        companyEntity.setWORK_PAY(dto.getWORK_PAY() == null ? companyEntity.getWORK_PAY() : dto.getWORK_PAY());
        companyEntity.setWORK_PLACE(dto.getWORK_PLACE() == null ? companyEntity.getWORK_PLACE() : dto.getWORK_PLACE());
        companyEntity.setWORK_TERM(dto.getWORK_TERM() == null ? companyEntity.getWORK_TERM() : dto.getWORK_TERM());


        this.companyRepository.save(companyEntity);
    }

    public void deleteCompany(long id) {
        Optional<CompanyEntity> companyEntityOptional = this.companyRepository.findById(id);
        if (companyEntityOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        CompanyEntity companyEntity = companyEntityOptional.get();

        this.companyRepository.delete(companyEntity);
    }


}
