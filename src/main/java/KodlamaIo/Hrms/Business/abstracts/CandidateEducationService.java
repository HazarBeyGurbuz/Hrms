package KodlamaIo.Hrms.Business.abstracts;
import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;

public interface CandidateEducationService {
	DataResult<List<CandidateEducationStatus>> getAll();
	DataResult<List<CandidateEducationStatus>> getByCandidateId(int candidateId);
	Result add(CandidateEducationStatus candidateEducationStatus);
	DataResult<List<CandidateEducationStatus>> getAllCandidateIdByGraduationYear(int candidateId);
	
	
}
