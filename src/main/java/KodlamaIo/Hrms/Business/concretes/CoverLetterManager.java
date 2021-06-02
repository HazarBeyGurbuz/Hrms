package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import KodlamaIo.Hrms.Business.abstracts.CoverLetterService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CoverLetterDao;
import KodlamaIo.Hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{
	private CoverLetterDao coverLetterDao;
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.findAll());
	}

	@Override
	public DataResult<List<CoverLetter>> getByCandidateId(@RequestParam int candidateId) {
		return new SuccessDataResult<List<CoverLetter>>(this.coverLetterDao.getByCandidateId(candidateId));
	}

	@Override
	public Result add(@RequestBody CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult();
	}
	
}
