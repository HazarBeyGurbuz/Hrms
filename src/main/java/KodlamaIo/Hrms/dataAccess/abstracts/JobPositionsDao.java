package KodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer>{
	JobPositions findByTitle(String title);
}
