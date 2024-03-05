package com.job.portal.company.service.impl;

import com.job.portal.company.model.Company;
import com.job.portal.company.repository.CompanyRepository;
import com.job.portal.company.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void addCompany(Company company) {
        companyRepository.save(company);
    }
}
