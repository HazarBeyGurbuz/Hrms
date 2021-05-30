package KodlamaIo.Hrms.Business.concretes;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.JobAdService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.JobAdDao;
import KodlamaIo.Hrms.entities.concretes.JobAd;

@Service
public class JobAdManager implements JobAdService {
	private JobAdDao JobAdDao;

	@Autowired
	public JobAdManager(JobAdDao JobAdDao) {
		this.JobAdDao = JobAdDao;
	}

	@Override
	public DataResult<List<JobAd>> getAll() {
		return new SuccessDataResult<List<JobAd>>(this.JobAdDao.findAll(),"data listelendi");
	}

	@Override
	public Result add(JobAd JobAd) {

		this.JobAdDao.save(JobAd);
		return new SuccessResult("ilan eklendi");
	}

	@Override
	public DataResult<List<JobAd>> getActiveAd() {
		return new SuccessDataResult<List<JobAd>>(this.JobAdDao.findByIsActiveTrue(), "data listelendi");
	}
@Override
	public DataResult<List<JobAd>> getIsActiveTrueAndDeadlineDate(java.sql.Date deadlineDate) {
		return new SuccessDataResult<List<JobAd>>(
				this.JobAdDao.findByIsActiveTrueAndDeadlineDate(deadlineDate), "data listelendi");
	}
	

	@Override
	public DataResult<List<JobAd>> getIsActiveTrueAndEmployerId(int employerId) {
		return new SuccessDataResult<List<JobAd>>(this.JobAdDao.findByIsActiveTrueAndEmployer(employerId),
				"data listelendi");
	}

	@Override
	public Result changeJobAdActivity(int JobAdId) {
		JobAd JobAdToUpdate = this.JobAdDao.findById(JobAdId);
		if (JobAdToUpdate.isActive() == false) {
			JobAdToUpdate.setActive(true);
		} 
			
		this.JobAdDao.save(JobAdToUpdate);
		return new SuccessResult("Değişiklik kaydedildi");
	}

	
}
