package com.goldpension.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("company")
public class CompanyController {
    private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
    private final CompanyService companyService;

    public CompanyController(
            @Autowired CompanyService companyService
    ){
        this.companyService = companyService;
    }

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createCompany(@RequestBody CompanyDto dto){
        this.companyService.createCompany(dto);
    }

    @GetMapping("read/{id}")
    public CompanyDto readCompany(
            @PathVariable("id") int id
    ){
        return this.companyService.readCompany(id);
    }

    @GetMapping("read")
    public List<CompanyDto> readCompanyAll(){
        return this.companyService.readCompanyAll();
    }

    @PutMapping("update/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateCompany(
            @PathVariable("id") int id,
            @RequestBody CompanyDto dto
    ){
        this.companyService.updateCompany(id, dto);
    }

    @DeleteMapping("delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCompany(
            @PathVariable("id") int id
    ){
        this.companyService.deleteCompany(id);
    }


}
