package com.job.portal.company.controller;

import com.job.portal.company.model.Company;
import com.job.portal.company.service.impl.CompanyServiceImpl;
import com.job.portal.job.model.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
    CompanyServiceImpl companyService;
    public CompanyController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<Company>> allJobs(){
        List<Company> company= companyService.getCompanies();
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> add(@RequestBody Company company){
        companyService.addCompany(company);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
