package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.Candidate;
import KodlamaIo.Hrms.entities.dtos.CvDto;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	DataResult<List<Candidate>> getById(int candidateId);
	DataResult<List<CvDto>> getCvByCandidate(int candidateId);
	Result add(Candidate candidate);
}
