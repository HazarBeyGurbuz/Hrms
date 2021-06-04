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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_experiance")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler","candidate"})
public class CandidateExperiance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="workplace_name")
	@NotNull
	@NotBlank
	private String workplaceName;
	
	@Column(name="position")
	@NotNull
	@NotBlank
	private String position;
	
	@Column(name="start_year")
	@NotNull
	@NotBlank
	private int startYear;
	
	@Column(name="leave_year")
	private int leaveYear;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	
}
