package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CandidateLanguage;

public interface CandidateLanguageService {
	public DataResult<List<CandidateLanguage>> getAll();
	public DataResult<List<CandidateLanguage>> getAllByCandidateId(int candidateId);
	public Result add(CandidateLanguage candidateLanguage);
}
