package com.Employement.JobOpertunities.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employement.JobOpertunities.Model.ApplicantDetails;
import com.Employement.JobOpertunities.Model.JobApplicant;
import com.Employement.JobOpertunities.Model.JobDetails;
import com.Employement.JobOpertunities.Repository.ApplicantRepository;
import com.Employement.JobOpertunities.Repository.JobRepository;
import com.Employement.JobOpertunities.Repository.JobApplicantRepository;

@Controller
public class JobOpertunityController {

	@Autowired 
	ApplicantRepository applicant_repository;
	
	@Autowired
	JobRepository job_repository;
	
	@Autowired
	JobApplicantRepository job_applicant_repository;
	
	
	@RequestMapping("/home")
	public  String Home()
	{
		return "Home";
	}
	
	@RequestMapping("/Register")
	public  String Register()
	{
		return "Register";
	}
	
	@RequestMapping("/AddJob")
	public  String AddJob()
	{
		return "AddJob";
	}
	
	@RequestMapping("/Candidates_Jobs")
	public  String Candidates_Jobs()
	{
		return "Candidates_Jobs";
	}
	
	@PostMapping("/ApplicantData")
    @ResponseBody
	public String ApplicantData( @RequestParam("applicantName") String applicantName,
								 @RequestParam("qualification") String qualification,
								 @RequestParam("email") String email,
								 @RequestParam("experiance") int experiance) throws IOException
	{
		System.out.println("here im now\n");
		long applicantId = (10000 + new Random().nextInt(90000));
		applicant_repository.save(new ApplicantDetails(applicantId, applicantName, qualification, email, experiance));
		return "applicant details updated successfully";
	}
	
	@PostMapping("/JobData")
	@ResponseBody
	public String JobData( @RequestParam("JobDescription") String jobDescription,
							 @RequestParam("MinQualification") String qualification,
							 @RequestParam("Email") String email,
							 @RequestParam("MinExperiance") int experiance) throws IOException
	{
		long jobId = (1000 + new Random().nextInt(9000));
		job_repository.save(new JobDetails(jobId, jobDescription, qualification, email, experiance));
		return "Job details updated successfully";
	}
	
	@GetMapping("/getAllJobs")
	@ResponseBody
	public List<JobDetails> getAllJobDetails()
	{
		List<JobDetails> list= job_repository.findAll();
		return list;
	}
	
	
	@GetMapping("/getApplicants")
	@ResponseBody
	public List<ApplicantDetails> getApplicants(@RequestParam("JobId") Long jobId)
	{
		List<JobApplicant> jobs = job_applicant_repository.findByJobId(jobId);
		
		//List<Long> list = new ArrayList<>();
		List<ApplicantDetails> applicants = new ArrayList<>();
		for( JobApplicant job_applicant : jobs)
		{
			long id= job_applicant.getApplicantId();
			applicants.add(applicant_repository.findByApplicantId(id));
		}
		//return applicant_repository.getApplicantsByIds(list);
		
		return applicants;
	}
	
	@PostMapping("/saveApplicants")
	@ResponseBody
	public String saveAppicants(@RequestParam("JobId") Long jobId,
								@RequestParam("ApplicantId") Long applicantId)
	{
		job_applicant_repository.save(new JobApplicant(jobId,applicantId));
		return "applicant saved successfully";
	}
}
