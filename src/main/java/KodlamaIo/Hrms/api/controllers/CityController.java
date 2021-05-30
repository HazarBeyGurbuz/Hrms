package KodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CityService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	private CityService cityService;

	@Autowired
	public CityController(CityService cityService) {
		this.cityService = cityService;
	}

	@GetMapping("/getall")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}

}
