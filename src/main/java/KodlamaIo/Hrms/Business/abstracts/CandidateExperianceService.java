package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;
import KodlamaIo.Hrms.entities.concretes.CandidateExperiance;

public interface CandidateExperianceService {
	DataResult<List<CandidateExperiance>> getAll();
	DataResult<List<CandidateExperiance>> getByCandidateId(int candidateId);
	DataResult<List<CandidateExperiance>> getAllByCandidateIdOrderByLeaveYearDesc(int candidateId);
	Result add(CandidateExperiance candidateExperience);
}
