package axel.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axel.app.models.Role;
import axel.app.repository.IRoleRepository;
@Service
public class RoleService implements IRoleService {
	@Autowired
	IRoleRepository rolerepository;
	@Override
	public List<Role> getAllRole() {
		return rolerepository.findAll();
	}



	@Override
	public Role createRole(Role role) {
		return rolerepository.save(role);
	}

}
