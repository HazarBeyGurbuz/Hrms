package KodlamaIo.Hrms.Business.concretes;

import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.EmailService;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;

@Service
public class EmailManager implements EmailService{

	@Override
	public Result confirmation(String email) {
		return new SuccessResult(email + " adresi başarıyla doğrulandı.");
	}
}
