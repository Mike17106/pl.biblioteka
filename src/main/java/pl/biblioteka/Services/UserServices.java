package pl.biblioteka.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.biblioteka.model.User;
import pl.biblioteka.model.UserRole;
import pl.biblioteka.repository.RoleRepository;
import pl.biblioteka.repository.UserRepository;

@Service
public class UserServices {

	private static final String DEFAULT_ROLE = "ROLE_USER";
	private UserRepository userRepository;
	private RoleRepository roleRepository;

	@Autowired
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Autowired
	public void setRoleRepository(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public void addWithDefaultRole(User user) {
		UserRole defaultRole = roleRepository.findByRole(DEFAULT_ROLE);
		user.getRoles().add(defaultRole);
		userRepository.save(user);
	}

}