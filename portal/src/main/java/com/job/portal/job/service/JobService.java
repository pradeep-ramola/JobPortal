package com.job.portal.job.service;

import com.job.portal.job.model.Job;

import java.util.List;

public interface JobService {
    public List<Job> jobs ();
    public void addJob(Job job);
    public void addAllJobs(List<Job> jobs);

    public Job getById(long id);
}
