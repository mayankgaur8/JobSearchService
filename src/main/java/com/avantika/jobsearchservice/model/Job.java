package com.avantika.jobsearchservice.model;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "job")
@lombok.Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String company;

    @Column
    private String location;

    @Column(name = "employment_type")
    private String employmentType;

    @Column(name = "posted_date")
    @Temporal(TemporalType.DATE)
    private Date postedDate;

    @Column(name = "salary_range")
    private String salaryRange;


    // Constructors
    public Job() {}

    public Job(String title, String description, String company, String location,
               String employmentType, Date postedDate, String salaryRange) {
        this.title = title;
        this.description = description;
        this.company = company;
        this.location = location;
        this.employmentType = employmentType;
        this.postedDate = postedDate;
        this.salaryRange = salaryRange;
    }
}
