package com.Employement.JobOpertunities.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jobs")
public class JobDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="JobId")
	private Long JobId;
	
	@Column(name="JobDescription")
	private String JobDescription;
	
	@Column(name="MinQualification")
	private String MinQualification;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="MinExperiance")
	private int MinExperiance;
	
	public JobDetails()
	{
		
	}

	public JobDetails(Long JobId, String JobDescription, String MinQualification, String Email, int MinExperiance)
	{
		this.JobId= JobId;
		this.JobDescription= JobDescription;
		this.MinQualification = MinQualification;
		this.Email= Email;
		this.MinExperiance = MinExperiance;
	}
	

	public Long getJobId() {
		return JobId;
	}

	public void setJobId(Long jobId) {
		JobId = jobId;
	}

	public String getJobDescription() {
		return JobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.JobDescription = jobDescription;
	}

	public String getMinQualification() {
		return MinQualification;
	}

	public void setMinQualification(String minQualification) {
		this.MinQualification = minQualification;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public int getMinExperiance() {
		return MinExperiance;
	}

	public void setMinExperiance(int minExperiance) {
		this.MinExperiance = minExperiance;
	}


	
}
