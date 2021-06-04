package KodlamaIo.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;

public interface CandidateEducationDao extends JpaRepository<CandidateEducationStatus, Integer>{
	List<CandidateEducationStatus> getAllCandidateIdByGraduationYear(int candidateId);
	List<CandidateEducationStatus> getByCandidateId(int candidateId);
}
