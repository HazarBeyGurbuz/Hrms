package KodlamaIo.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import KodlamaIo.Hrms.Business.abstracts.CvService;
import KodlamaIo.Hrms.entities.concretes.Cv;

@RestController
@RequestMapping("/api/cv")
public class CvController {
	private CvService cvService;
	
	@Autowired
	public CvController(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getAll")
	ResponseEntity<?> getAll(){
		return ResponseEntity.ok(this.cvService.getAll());
	}
	
	@GetMapping("/getByCvByOrderCandidateId")
	ResponseEntity<?> getByCvByOrderCandidateId(@RequestParam int candidateId){
		return ResponseEntity.ok(this.cvService.getCvByOrdeCandidateId(candidateId));
	}
	
	@PostMapping("/add")
	ResponseEntity<?> add(@RequestBody Cv cv){
		return ResponseEntity.ok(this.cvService.add(cv));
	}
}
