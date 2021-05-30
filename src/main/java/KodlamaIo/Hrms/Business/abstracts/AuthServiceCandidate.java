package KodlamaIo.Hrms.Business.abstracts;

import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.Candidate;

public interface AuthServiceCandidate {
	Result checkNullInput(Candidate candidate);

	Result checkRegisteredEmail(String email);

	Result checkRegisteredNationalIdentity(String nationalIdentity);

	Result emailValid(String email);
}
