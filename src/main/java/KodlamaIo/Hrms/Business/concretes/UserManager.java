package KodlamaIo.Hrms.Business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.UserService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.ErrorResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessResult;
import KodlamaIo.Hrms.dataAccess.abstracts.UserDao;
import KodlamaIo.Hrms.entities.abstracts.User;

@Service
public class UserManager implements UserService{
	
	UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll());
	}
	
	public Result checkRegisteredEmail(String email) {
		if(getByEmail(email).getData() !=null ) {
			
			return new ErrorResult("Bu email adresi zaten kayıtlı");
		}
		return new SuccessResult();
	}
	
	@Override
	public DataResult<User> getByEmail(String email) {
		return new SuccessDataResult<User>(userDao.findByEmail(email));
	}

}
