package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {
	public DataResult<List<CoverLetter>> getAll();
	public DataResult<List<CoverLetter>> getByCandidateId(int candidateId);
	public Result add(CoverLetter coverLetter);
	
}
