package KodlamaIo.Hrms.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CandidateExperianceService;
import KodlamaIo.Hrms.entities.concretes.CandidateExperiance;

@RestController
@RequestMapping("/api/candidateExperiance")
public class CandidateExperianceController {
	private CandidateExperianceService candidateExperianceService;

	public CandidateExperianceController(CandidateExperianceService candidateExperianceService) {
		super();
		this.candidateExperianceService = candidateExperianceService;
	}
	
		@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateExperiance candidateExperiance){
		return ResponseEntity.ok(this.candidateExperianceService.add(candidateExperiance));
	}	
		
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateExperianceService.getAll());
	}
	
	@GetMapping("/getAllByCandidateIdByLeaveDate")
	public ResponseEntity<?> getAllByCandidateIdByLeaveDate(@RequestParam int candidateId){
		return ResponseEntity.ok(this.candidateExperianceService.getAllByCandidateIdOrderByLeaveYearDesc(candidateId));
	}
	

}
