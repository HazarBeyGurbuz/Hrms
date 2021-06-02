package KodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.CandidateImage;

public interface CandidateImageDao extends JpaRepository<CandidateImage, Integer>{

}
