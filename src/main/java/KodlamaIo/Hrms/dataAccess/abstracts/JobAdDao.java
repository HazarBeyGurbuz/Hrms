package KodlamaIo.Hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.JobAd;

public interface JobAdDao extends JpaRepository<JobAd,Integer>{
	List<JobAd> findByIsActiveTrue();

	List<JobAd> findByIsActiveTrueAndDeadlineDate(Date deadlineDate);

	List<JobAd> findByIsActiveTrueAndEmployer(int employerId);

	JobAd findById(int JobAdId);
}
