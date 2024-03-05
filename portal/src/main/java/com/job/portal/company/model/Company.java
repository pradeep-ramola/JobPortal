package com.job.portal.company.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.job.portal.job.model.Job;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data

@Entity
@Table(name = "company_table")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String location;
    @JsonIgnore
    @OneToMany (mappedBy = "company")
    private List<Job> jobs;
}
