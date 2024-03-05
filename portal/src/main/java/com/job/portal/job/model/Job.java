package com.job.portal.job.model;

import com.job.portal.company.model.Company;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="job_table")
@Data
public class Job {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String location;

    @ManyToOne
    private Company company;
}
