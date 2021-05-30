package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);

}
