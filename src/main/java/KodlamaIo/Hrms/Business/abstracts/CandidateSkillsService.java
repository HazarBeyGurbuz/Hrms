package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.CandidateSkills;

public interface CandidateSkillsService {
	public DataResult<List<CandidateSkills>> getAll();
	public DataResult<List<CandidateSkills>> getAllByCandidateId(int candidateId);
	public Result add(CandidateSkills candidateSkills);
}
