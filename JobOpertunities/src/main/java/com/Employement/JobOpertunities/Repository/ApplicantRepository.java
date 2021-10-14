package com.Employement.JobOpertunities.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Employement.JobOpertunities.Model.ApplicantDetails;

@Repository
public interface ApplicantRepository extends JpaRepository<ApplicantDetails, Long>{

	 ApplicantDetails findByApplicantId(long applicantId);
//	@Query(value = "SELECT * FROM Applicants WHERE applicantId IN (:ids)",nativeQuery=true)
//	List<ApplicantDetails> getApplicantsByIds(@Param("ids") List<Long> applicantIds);
}
