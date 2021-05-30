package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.JobPositions;

public interface JobPositionsService {
	DataResult<List<JobPositions>> getAll();
	Result add(JobPositions jobPositions);
	DataResult<JobPositions> getByTitle(String title);
}
