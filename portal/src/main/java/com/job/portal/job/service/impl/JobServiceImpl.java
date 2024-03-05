package com.job.portal.job.service.impl;

import com.job.portal.job.model.Job;
import com.job.portal.job.repository.JobRepository;
import com.job.portal.job.service.JobService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServiceImpl implements JobService {
    JobRepository jobRepository;
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }




    @Override
    public List<Job> jobs() {
        List<Job> jobs = jobRepository.findAll();
        return jobs;
    }

    @Override
    public void addJob(Job job){
        jobRepository.save(job);
    }

    public void addAllJobs(List<Job> jobs) {
        for(Job job : jobs)
            addJob(job);

    }

    @Override
    public Job getById(long id) {
        return jobRepository.findById(id).orElse(null);
    }
}
