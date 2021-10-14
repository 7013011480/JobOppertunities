package com.Employement.JobOpertunities.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JobApplicant")
public class JobApplicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="jobId")
	private Long jobId;
	
	@Column(name="applicantId")
	private Long applicantId;
	
	public JobApplicant()
	{
		
	}

	public JobApplicant(Long jobId, Long applicantId)
	{
		this.jobId= jobId;
		this.applicantId= applicantId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public Long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}
	

}
