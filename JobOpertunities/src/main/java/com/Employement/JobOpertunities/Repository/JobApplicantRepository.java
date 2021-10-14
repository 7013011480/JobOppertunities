package com.Employement.JobOpertunities.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employement.JobOpertunities.Model.JobApplicant;

@Repository
public interface JobApplicantRepository extends JpaRepository<JobApplicant, Long> {
	
	List<JobApplicant> findByJobId(long jobId);
}
