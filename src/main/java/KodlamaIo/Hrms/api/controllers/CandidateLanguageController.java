package KodlamaIo.Hrms.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CandidateLanguageService;
import KodlamaIo.Hrms.entities.concretes.CandidateLanguage;

@RestController
@RequestMapping("/api/candidateLanguage")
public class CandidateLanguageController {
	private CandidateLanguageService candidateLanguageService;

	public CandidateLanguageController(CandidateLanguageService candidateLanguageService) {
		super();
		this.candidateLanguageService = candidateLanguageService;
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.candidateLanguageService.getAll());
	}
	
	@GetMapping("/getAllByCandidateId")
	ResponseEntity<?> getAllByCandidateId(@RequestParam int candidateId){
		return ResponseEntity.ok(this.candidateLanguageService.getAllByCandidateId(candidateId));
	}
	
	@PostMapping("/add")
	ResponseEntity<?> add(@RequestBody CandidateLanguage candidateLanguage){
		return ResponseEntity.ok(this.candidateLanguageService.add(candidateLanguage));
	}
}
