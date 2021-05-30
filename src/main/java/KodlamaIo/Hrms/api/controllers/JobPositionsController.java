package KodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.JobPositionsService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {
	private JobPositionsService jobPositionsService;

	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobPositions>> getAll(){
		return jobPositionsService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPositions jobPositions) {
		return this.jobPositionsService.add(jobPositions);
	}
}
