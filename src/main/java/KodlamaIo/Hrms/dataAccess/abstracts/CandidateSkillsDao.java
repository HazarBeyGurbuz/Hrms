package KodlamaIo.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.CandidateSkills;

public interface CandidateSkillsDao extends JpaRepository<CandidateSkills, Integer>{
	List<CandidateSkills> getAllByCandidateId(int candidateId);
}
