package com.goldpension.demo;

import com.goldpension.demo.entity.CompanyEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component

public class CompanyService {
    private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
    private final CompanyDao companyDao;

    public CompanyService(@Autowired CompanyDao companyDao){
        this.companyDao = companyDao;
    }

    public void createCompany(CompanyDto companyDto){
        this.companyDao.createCompany(companyDto);
    }

    public CompanyDto readCompany(int id){
        CompanyEntity companyEntity = this.companyDao.readCompany(id);
        return new CompanyDto(
                Math.toIntExact(companyEntity.getId()),
                companyEntity.getCOMPANY_NAME(),
                companyEntity.getCOMPANY_ADDRESS(),
                companyEntity.getCOMPANY_BOSS(),
                companyEntity.getCOMPANY_CALL(),
                companyEntity.getCOMPANY_HOMEPAGE(),
                companyEntity.getCOMPANY_LOGO(),
                companyEntity.getCOMPANY_NAME(),
                companyEntity.getCOMPANY_NUMBER(),
                companyEntity.getCOMPANY_SIZE(),

                companyEntity.getAPPLY_WORK(),
                companyEntity.getAPPLY_SEX(),
                companyEntity.getAPPLY_NUM(),
                companyEntity.getAPPLY_DETAIL(),
                companyEntity.getAPPLY_DEADLINE(),
                companyEntity.getAPPLY_AGE(),

                companyEntity.getWORK_EXPERIENCE(),
                companyEntity.getWORK_DAY(),
                companyEntity.getWORK_HOUR(),
                companyEntity.getWORK_PAY(),
                companyEntity.getWORK_PLACE(),
                companyEntity.getWORK_TERM()
        );
    }

    public List<CompanyDto> readCompanyAll(){
        Iterator<CompanyEntity> iterator = this.companyDao.readCompanyAll();
        List<CompanyDto> companyDtoList = new ArrayList<>();
        while (iterator.hasNext()){
            CompanyEntity companyEntity = iterator.next();
            companyDtoList.add(new CompanyDto(
                    Math.toIntExact(companyEntity.getId()),
                    companyEntity.getCOMPANY_NAME(),
                    companyEntity.getCOMPANY_ADDRESS(),
                    companyEntity.getCOMPANY_BOSS(),
                    companyEntity.getCOMPANY_CALL(),
                    companyEntity.getCOMPANY_HOMEPAGE(),
                    companyEntity.getCOMPANY_LOGO(),
                    companyEntity.getCOMPANY_NAME(),
                    companyEntity.getCOMPANY_NUMBER(),
                    companyEntity.getCOMPANY_SIZE(),

                    companyEntity.getAPPLY_WORK(),
                    companyEntity.getAPPLY_SEX(),
                    companyEntity.getAPPLY_NUM(),
                    companyEntity.getAPPLY_DETAIL(),
                    companyEntity.getAPPLY_DEADLINE(),
                    companyEntity.getAPPLY_AGE(),

                    companyEntity.getWORK_EXPERIENCE(),
                    companyEntity.getWORK_DAY(),
                    companyEntity.getWORK_HOUR(),
                    companyEntity.getWORK_PAY(),
                    companyEntity.getWORK_PLACE(),
                    companyEntity.getWORK_TERM()
            ));
        }
        return companyDtoList;
    }

    public void updateCompany(int id, CompanyDto companyDto){
        this.companyDao.updateCompany(id, companyDto);
    }

    public void deleteCompany(int id){
        this.companyDao.deleteCompany(id);
    }
}
