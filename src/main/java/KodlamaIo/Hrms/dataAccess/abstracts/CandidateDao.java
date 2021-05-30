package KodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	Candidate findByNationalIdentity(String nationalIdentity);
	Candidate findByEmail(String email);
}
