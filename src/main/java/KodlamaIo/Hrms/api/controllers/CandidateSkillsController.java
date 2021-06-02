package KodlamaIo.Hrms.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CandidateSkillsService;
import KodlamaIo.Hrms.entities.concretes.CandidateSkills;


@RestController
@RequestMapping("/api/candidateSkills")
public class CandidateSkillsController {
	private CandidateSkillsService candidateSkillsService;

	public CandidateSkillsController(CandidateSkillsService candidateSkillsService) {
		super();
		this.candidateSkillsService = candidateSkillsService;
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll(){
	return ResponseEntity.ok(this.candidateSkillsService.getAll());
	}
	
	@GetMapping("/getAllByCandidatesId")
	ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateId){
		return ResponseEntity.ok(this.candidateSkillsService.getAllByCandidateId(candidateId));
	}
	
	@PostMapping("/add")
	ResponseEntity<?> add(@RequestBody CandidateSkills candidateSkills){
		return ResponseEntity.ok(this.candidateSkillsService.add(candidateSkills));
	}
}
