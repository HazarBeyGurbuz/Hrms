package KodlamaIo.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CandidateImageService;
import KodlamaIo.Hrms.entities.concretes.CandidateImage;

@RestController
@RequestMapping("/api/candidateImage")
public class CandidateImageController {
	private CandidateImageService candidateImageService;
	
	@Autowired
	public CandidateImageController(CandidateImageService candidateImageService) {
		super();
		this.candidateImageService = candidateImageService;
	}
	
	@PostMapping("/upload")
	ResponseEntity<?> upload(@RequestBody CandidateImage candidateImage){
		return ResponseEntity.ok(this.candidateImageService.upload(candidateImage));
	}
}
