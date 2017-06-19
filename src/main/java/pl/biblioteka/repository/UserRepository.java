package pl.biblioteka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.biblioteka.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}