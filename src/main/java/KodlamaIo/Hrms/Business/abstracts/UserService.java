package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.entities.abstracts.User;


public interface UserService {
	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
}
