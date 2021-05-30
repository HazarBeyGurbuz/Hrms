package KodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import KodlamaIo.Hrms.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String email);

}
