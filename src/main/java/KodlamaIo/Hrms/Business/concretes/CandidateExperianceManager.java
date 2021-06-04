package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateExperianceService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateExperianceDao;
import KodlamaIo.Hrms.entities.concretes.CandidateExperiance;

@Service
public class CandidateExperianceManager implements CandidateExperianceService{
	
	private CandidateExperianceDao candidateExperianceDao;
	
	@Autowired
	public CandidateExperianceManager(CandidateExperianceDao candidateExperianceDao) {
		super();
		this.candidateExperianceDao = candidateExperianceDao;
	}

	@Override
	public DataResult<List<CandidateExperiance>> getAll() {
		
		return new SuccessDataResult<>(this.candidateExperianceDao.findAll());
	}

	@Override
	public DataResult<List<CandidateExperiance>> getAllByCandidateIdOrderByLeaveYearDesc(int candidateId) {
		return new SuccessDataResult<>(this.candidateExperianceDao.getAllByCandidateIdOrderByLeaveYearDesc(candidateId));
	}

	@Override
	public Result add(CandidateExperiance candidateExperiance) {
	
		this.candidateExperianceDao.save(candidateExperiance);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateExperiance>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CandidateExperiance>>(this.candidateExperianceDao.getByCandidateId(candidateId));
	}

}
