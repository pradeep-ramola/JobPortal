package com.job.portal.job.controller;

import com.job.portal.job.model.Job;
import com.job.portal.job.service.impl.JobServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    JobServiceImpl jobService;

    JobController(JobServiceImpl jobService){
        this.jobService=jobService;
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Job>> allJobs(){
        List<Job> jobs= jobService.jobs();
        return new ResponseEntity<>(jobs, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<HttpStatus> add(@RequestBody Job job){
        jobService.addJob(job);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/addAll")
    public ResponseEntity<HttpStatus> add(@RequestBody List<Job> jobs){
        jobService.addAllJobs(jobs);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> add(@PathVariable long id){
        Job job = jobService.getById(id);
        return new ResponseEntity<>(job,HttpStatus.OK);
    }
}
