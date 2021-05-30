package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.JobPositionsService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.ErrorResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.JobPositionsDao;
import KodlamaIo.Hrms.entities.concretes.Employer;
import KodlamaIo.Hrms.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionsDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		super();
		this.jobPositionsDao = jobPositionsDao;
	}

	@Override
	public DataResult<List<JobPositions>> getAll() {
		
		return new SuccessDataResult<List<JobPositions>>(jobPositionsDao.findAll(), "Data listelendi");
		
	}

	@Override
	public Result add(JobPositions jobPositions) {
		if(getByTitle(jobPositions.getTitle()).getData() != null) {
			return new ErrorResult("Bu iş adı zaten kayıtlı.");
		}
		
		jobPositionsDao.save(jobPositions);
		return new SuccessResult("İş adı başarıyla kaydedildi.");
		
	}

	@Override
	public DataResult<JobPositions> getByTitle(String title) {
		return new SuccessDataResult<JobPositions>(jobPositionsDao.findByTitle(title));
	}

}
