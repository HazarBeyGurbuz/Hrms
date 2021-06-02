package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateSkillsService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateSkillsDao;
import KodlamaIo.Hrms.entities.concretes.CandidateSkills;

@Service
public class CandidateSkillsManager implements CandidateSkillsService{
	
	private CandidateSkillsDao candidateSkillsDao;
	
	@Autowired
	public CandidateSkillsManager(CandidateSkillsDao candidateSkillsDao) {
		super();
		this.candidateSkillsDao = candidateSkillsDao;
	}

	@Override
	public DataResult<List<CandidateSkills>> getAll() {
		return new SuccessDataResult<List<CandidateSkills>>(this.candidateSkillsDao.findAll());
	}

	@Override
	public DataResult<List<CandidateSkills>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CandidateSkills>>(this.candidateSkillsDao.getAllByCandidateId(candidateId));
	}

	@Override
	public Result add(CandidateSkills candidateSkills) {
		this.candidateSkillsDao.save(candidateSkills);
		return new SuccessResult();
	}

}
