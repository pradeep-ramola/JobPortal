package com.job.portal.company.repository;

import com.job.portal.company.model.Company;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface CompanyRepository extends JpaRepositoryImplementation<Company,Long> {

}
