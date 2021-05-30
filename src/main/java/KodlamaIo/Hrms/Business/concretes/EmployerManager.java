package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.EmployerService;
import KodlamaIo.Hrms.Business.abstracts.EmployerVerificationService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.EmployerDao;
import KodlamaIo.Hrms.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {

	EmployerDao employerDao;
	EmployerVerificationService employerVerificationService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, EmployerVerificationService employerVerificationService) {
		this.employerDao = employerDao;
		this.employerVerificationService = employerVerificationService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Employer employer) {
		
		Result checkTotal = employerVerificationService.checkTotal(employer);
		
		if(!checkTotal.isSuccess()) {
			return checkTotal;
		}
		
		employerDao.save(employer);
		return new SuccessResult("İş veren başarıyla eklendi.");
	}

}
