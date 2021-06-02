package KodlamaIo.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.CandidateLinks;

public interface CandidateLinksDao extends JpaRepository<CandidateLinks, Integer>{
	List<CandidateLinks> getAllByCandidateId(int candidateId);
}
