package KodlamaIo.Hrms.Business.abstracts;

import java.util.List;

import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.entities.concretes.City;

public interface CityService {
	DataResult<List<City>> getAll();
}
