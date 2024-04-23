package com.avantika.jobsearchservice.controller;

import com.avantika.jobsearchservice.model.Job;
import com.avantika.jobsearchservice.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }
@PostMapping
    public ResponseEntity<Job> createJob(@RequestBody Job job){
        return ResponseEntity.ok(jobService.saveJob(job));
    }
@GetMapping
    public ResponseEntity<List<Job>> getAllJobs(){
        return ResponseEntity.ok(jobService.getAllJobs());
    }
@GetMapping("/{id}")
    public ResponseEntity<Job>getJobsById(@PathVariable Long id){
        return ResponseEntity.ok(jobService.getJobById(id));
    }
    @PutMapping
    public ResponseEntity<Job> updateJob(@RequestBody Job job){
        return ResponseEntity.ok(jobService.updateJob(job));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable Long id){
        jobService.deleteJob(id);
        return ResponseEntity.ok("Job deleted successfully");
    }
}
