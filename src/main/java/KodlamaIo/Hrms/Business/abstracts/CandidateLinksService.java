package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CandidateLinks;

public interface CandidateLinksService {
	public DataResult<List<CandidateLinks>> getAll();
	public Result add(CandidateLinks candidateLinks);
	DataResult<List<CandidateLinks>> getAllByCandidateId(int candidateId);
}
