package KodlamaIo.Hrms.api.controllers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.JobAdService;
import KodlamaIo.Hrms.core.utilities.results.DataResult;
import KodlamaIo.Hrms.core.utilities.results.Result;
import KodlamaIo.Hrms.entities.concretes.JobAd;

@RestController
@RequestMapping("/api/JobAd")
public class JobAdController {
	private JobAdService JobAdService;

	@Autowired
	public JobAdController(JobAdService JobAdService) {
		this.JobAdService = JobAdService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobAd>> getAll() {
		return this.JobAdService.getAll();
	}

	@PostMapping("/add")
	public Result add(@RequestBody JobAd JobAd) {
		return this.JobAdService.add(JobAd);
	}

	@GetMapping("/getActiveAd")
	public DataResult<List<JobAd>> getActivePostings() {
		return this.JobAdService.getActiveAd();
	}

	@GetMapping("/getIsActiveTrueAndDeadlineDate")
	public DataResult<List<JobAd>> getIsActiveTrueAndDeadlineDateEquals(@RequestParam Date deadlineDate) {
		return this.JobAdService.getIsActiveTrueAndDeadlineDate(deadlineDate);
	}

	@GetMapping("/getIsActiveTrueAndEmployerId")
	public DataResult<List<JobAd>> getIsActiveTrueAndEmployerId(@RequestParam int employerId) {
		return this.JobAdService.getIsActiveTrueAndEmployerId(employerId);
	} 

	@PostMapping("/changeJobAdIsActivity")
	public Result changeJobAdIsActivity(@RequestParam int JobAdId) {
		return this.JobAdService.changeJobAdActivity(JobAdId);
	}

}
