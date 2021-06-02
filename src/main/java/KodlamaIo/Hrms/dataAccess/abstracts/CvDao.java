package KodlamaIo.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer>{
	List<Cv> getCvOrderByCandidateId(int candidateId);
}
