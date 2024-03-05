package com.job.portal.company.service;

import com.job.portal.company.model.Company;

import java.util.List;

public interface CompanyService {
    public List<Company> getCompanies();
    public void addCompany(Company company);
}
