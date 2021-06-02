package KodlamaIo.Hrms.entities.dtos;

import java.util.List;


import KodlamaIo.Hrms.entities.concretes.Candidate;
import KodlamaIo.Hrms.entities.concretes.CandidateEducationStatus;
import KodlamaIo.Hrms.entities.concretes.CandidateExperiance;
import KodlamaIo.Hrms.entities.concretes.CandidateLanguage;
import KodlamaIo.Hrms.entities.concretes.CandidateLinks;
import KodlamaIo.Hrms.entities.concretes.CandidateSkills;
import KodlamaIo.Hrms.entities.concretes.CoverLetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvDto {
	private Candidate candidate;
	private List<CandidateEducationStatus> candidateEducationStatus;
	private List<CandidateExperiance> candidateExperiance;
	private List<CandidateLanguage> candidateLanguage;
	private List<CandidateLinks> candidateLinks;
	private List<CandidateSkills> candidateSkills;
	private List<CoverLetter> coverLetter;
}
