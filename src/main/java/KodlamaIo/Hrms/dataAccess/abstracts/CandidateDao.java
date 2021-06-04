package KodlamaIo.Hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import KodlamaIo.Hrms.entities.concretes.Candidate;
import KodlamaIo.Hrms.entities.dtos.CvDto;


public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	Candidate findByNationalIdentity(String nationalIdentity);
	Candidate findByEmail(String email);
	List<Candidate> getById(int candidateId);
	
	
}
