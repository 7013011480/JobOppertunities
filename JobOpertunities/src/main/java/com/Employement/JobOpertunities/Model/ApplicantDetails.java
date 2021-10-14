package com.Employement.JobOpertunities.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Applicants")
public class ApplicantDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="applicantId")
	private long applicantId; 
	
	@Column(name="applicantName")
	private String applicantName;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="experiance")
	private int experiance;
	
	public ApplicantDetails()
	{
		
	}

	public ApplicantDetails(Long applicantId,String applicantName, String qualification, String email, int experiance)
	{
		this.applicantId= applicantId;
		this.applicantName= applicantName;
		this.qualification = qualification;
		this.email= email;
		this.experiance = experiance;
	}

	public long getId() {
		return id;
	}
	
	public long getApplicantId() {
		return applicantId;
	}
	
	public void setApplicantId(Long applicantId) {
		this.applicantId = applicantId;
	}
	
	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}


	
}
