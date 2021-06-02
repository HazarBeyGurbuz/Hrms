package KodlamaIo.Hrms.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CandidateLinksService;
import KodlamaIo.Hrms.entities.concretes.CandidateLinks;

@RestController
@RequestMapping("/api/candidateLinks")
public class CandidateLinksController {

	private CandidateLinksService candidateLinksService;

	public CandidateLinksController(CandidateLinksService candidateLinksService) {
		super();
		this.candidateLinksService = candidateLinksService;
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateLinksService.getAll());
	}
	
	@GetMapping("/getAllByCandidateId")
	ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateId){
		return ResponseEntity.ok(this.candidateLinksService.getAllByCandidateId(candidateId));
	}
	
	@PostMapping("/add")
	ResponseEntity<?> add(@RequestBody CandidateLinks candidateLinks){
		return ResponseEntity.ok(this.candidateLinksService.add(candidateLinks));
	}
}
