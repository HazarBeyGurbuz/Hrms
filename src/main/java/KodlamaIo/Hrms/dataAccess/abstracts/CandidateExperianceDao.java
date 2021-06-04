package KodlamaIo.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;
import KodlamaIo.Hrms.entities.concretes.CandidateExperiance;

public interface CandidateExperianceDao extends JpaRepository<CandidateExperiance, Integer>{
	List<CandidateExperiance> getAllByCandidateIdOrderByLeaveYearDesc(int candidateId);
	List<CandidateExperiance> getByCandidateId(int candidateId);
}
