package com.Employement.JobOpertunities.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employement.JobOpertunities.Model.JobDetails;

@Repository
public interface JobRepository extends JpaRepository<JobDetails, Long> {

}
