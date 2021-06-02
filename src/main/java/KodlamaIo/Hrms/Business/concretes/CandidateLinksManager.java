package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateLinksService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateLinksDao;
import KodlamaIo.Hrms.entities.concretes.CandidateLinks;

@Service
public class CandidateLinksManager implements CandidateLinksService {
	
	private CandidateLinksDao candidateLinksDao;
	
	@Autowired
	public CandidateLinksManager(CandidateLinksDao candidateLinksDao) {
		super();
		this.candidateLinksDao = candidateLinksDao;
	}

	@Override
	public DataResult<List<CandidateLinks>> getAll() {
		return new SuccessDataResult<List<CandidateLinks>>(this.candidateLinksDao.findAll());
	}

	@Override
	public Result add(CandidateLinks candidateLinks) {
		this.candidateLinksDao.save(candidateLinks);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<CandidateLinks>> getAllByCandidateId(int candidateId) {
		return new SuccessDataResult<List<CandidateLinks>>(this.candidateLinksDao.getAllByCandidateId(candidateId));
	}

}
