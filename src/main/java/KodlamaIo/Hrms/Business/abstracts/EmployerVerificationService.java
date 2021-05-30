package KodlamaIo.Hrms.Business.abstracts;

import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.Employer;

public interface EmployerVerificationService {
	Result checkNullInput(Employer employer);

	Result checkRegisteredEmail(String email);

	Result emailValid(String email,String companyName,String webAdress);
	
	Result checkTotal(Employer employer);
}
