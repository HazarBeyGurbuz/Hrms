package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateService;
import KodlamaIo.Hrms.Business.abstracts.CandidateVerificationService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateDao;
import KodlamaIo.Hrms.entities.concretes.Candidate;
import KodlamaIo.Hrms.entities.dtos.CvDto;

@Service
public class CandidateManager implements CandidateService {

	CandidateDao candidateDao;
	CandidateVerificationService candidateVerificationService;

	@Autowired
	public CandidateManager(CandidateDao candidateDao, CandidateVerificationService candidateVerificationService) {
		this.candidateDao = candidateDao;
		this.candidateVerificationService = candidateVerificationService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data Listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		
		Result checkTotal = candidateVerificationService.checkTotal(candidate);
		
		if(!checkTotal.isSuccess()) {
			return checkTotal;
		}
		
		this.candidateDao.save(candidate);
		return new SuccessResult("İş arayan başarıyla kaydedildi.");
	}



}
