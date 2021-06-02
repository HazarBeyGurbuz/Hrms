package KodlamaIo.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv")
public class Cv {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	@OneToMany(mappedBy = "cv")
	private List<CandidateEducationStatus> candidateEducationStatus;

	@OneToMany(mappedBy = "cv")
	private List<CandidateExperiance> candidateExperiance;
	
	@OneToMany(mappedBy = "cv")
	private List<CandidateLanguage> candidateLanguage;
	
	@OneToMany(mappedBy = "cv")
	private List<CandidateLinks> candidateLinks;
	
	@OneToMany(mappedBy = "cv")
	private List<CandidateSkills> candidateSkills;
	
	@OneToMany(mappedBy = "cv")
	private List<CoverLetter> coverLetter;
	
	@OneToMany(mappedBy = "cv")
	private List<CandidateImage> candidateImage;
	
}
