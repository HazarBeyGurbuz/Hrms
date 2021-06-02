package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.Cv;

public interface CvService {
	DataResult<List<Cv>> getAll();
	DataResult<List<Cv>> getCvByOrdeCandidateId(int candidateId);
	Result add(Cv cv);
}
