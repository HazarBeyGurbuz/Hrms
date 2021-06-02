package KodlamaIo.Hrms.api.controllers;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CandidateEducationService;
import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;

@RestController
@RequestMapping("/api/candidateEducation")
public class CandidateEducationController {
	private CandidateEducationService candidateEducationService;

	public CandidateEducationController(CandidateEducationService candidateEducationService) {
		super();
		this.candidateEducationService = candidateEducationService;
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(this.candidateEducationService.getAll());
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CandidateEducationStatus candidateEducationStatus) {
		return ResponseEntity.ok(this.candidateEducationService.add(candidateEducationStatus));
		
	}

	@GetMapping("/getAllCandidateIdByGradutionYear")
	public ResponseEntity<?> getAllCandidateIdByGradutionYear(@RequestParam int candidateId) {
		return ResponseEntity.ok(this.candidateEducationService.getAllCandidateIdByGraduationYear(candidateId));
	}
}
