package KodlamaIo.Hrms.Business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CandidateImageService;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CandidateImageDao;
import KodlamaIo.Hrms.entities.concretes.CandidateImage;

@Service
public class CandidateImageManager implements CandidateImageService {
	private CandidateImageDao candidateImageDao;
	
	@Autowired
	public CandidateImageManager(CandidateImageDao candidateImageDao) {
		super();
		this.candidateImageDao = candidateImageDao;
	}

	@Override
	public Result upload(CandidateImage candidateImage) {
		this.candidateImageDao.save(candidateImage);
		return new SuccessResult();
	}
	
}
