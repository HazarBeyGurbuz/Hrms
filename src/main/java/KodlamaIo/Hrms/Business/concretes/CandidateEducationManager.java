package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateEducationService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateEducationDao;
import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;


@Service
public class CandidateEducationManager implements CandidateEducationService{
	private CandidateEducationDao candidateEducationDao;
	
	@Autowired
	public CandidateEducationManager(CandidateEducationDao candidateEducationDao) {
		super();
		this.candidateEducationDao = candidateEducationDao;
	}

	@Override
	public DataResult<List<CandidateEducationStatus>> getAll() {
		return new SuccessDataResult<>(this.candidateEducationDao.findAll());
	}

	@Override
	public Result add(CandidateEducationStatus candidateEducationStatus) {
		this.candidateEducationDao.save(candidateEducationStatus);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateEducationStatus>> getAllCandidateIdByGraduationYear(int candidateId) {
		return new SuccessDataResult<List<CandidateEducationStatus>>(this.candidateEducationDao.getAllCandidateIdByGraduationYear(candidateId));
	}

	@Override
	public DataResult<List<CandidateEducationStatus>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CandidateEducationStatus>>(this.candidateEducationDao.getByCandidateId(candidateId));
	}
	
}
