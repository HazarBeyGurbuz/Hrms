package KodlamaIo.Hrms.Business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import KodlamaIo.Hrms.Business.abstracts.CityService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.SuccessDataResult;
import KodlamaIo.Hrms.dataAccess.abstracts.CityDao;
import KodlamaIo.Hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {
	private CityDao cityDao;

	@Autowired
	public CityManager(CityDao cityDao) {
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(), "data listelendi");
	}
}
