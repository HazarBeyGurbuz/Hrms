package KodlamaIo.Hrms.Business.abstracts;

import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.Employer;

public interface AuthServiceEmployer {
	Result checkNullInput(Employer employer);

	Result checkRegisteredEmail(String email);

	Result emailValid(String email,String companyName,String webAdress);
}
