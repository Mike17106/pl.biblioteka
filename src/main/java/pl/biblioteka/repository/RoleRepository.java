package pl.biblioteka.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.biblioteka.model.UserRole;

public interface RoleRepository extends JpaRepository<UserRole, Long> {
	UserRole findByRole(String role);
}