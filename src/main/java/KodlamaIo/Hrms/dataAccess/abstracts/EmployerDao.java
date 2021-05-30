package KodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	Employer findByEmail(String email);
	
}
