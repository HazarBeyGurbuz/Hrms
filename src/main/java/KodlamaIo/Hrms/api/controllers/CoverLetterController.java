package KodlamaIo.Hrms.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CoverLetterService;
import KodlamaIo.Hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverLetter")
public class CoverLetterController {
	private CoverLetterService coverLetterService;

	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.coverLetterService.getAll());
	}
	
	@GetMapping("/getByCandidateId")
	ResponseEntity<?> getByCandidateId(int candidateId){
		return ResponseEntity.ok(this.coverLetterService.getByCandidateId(candidateId));
	}
	
	ResponseEntity<?> add(CoverLetter coverLetter){
		return ResponseEntity.ok(this.coverLetterService.add(coverLetter));
	}
}
