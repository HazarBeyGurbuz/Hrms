package KodlamaIo.Hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_education_status")
public class CandidateEducationStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")
	@NotBlank
	@NotNull
	private String schoolName;
	
	@Column(name="department_name")
	@NotBlank
	@NotNull
	private String departmentName;
	
	@Column(name="start_year")
	@NotBlank
	@NotNull
	private int startYear;
	
	@Column(name="graduation_year")
	private int graduationYear;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private Cv cv;
}
