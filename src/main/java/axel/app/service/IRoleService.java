package axel.app.service;

import java.util.List;

import axel.app.models.Role;

public interface IRoleService {
	
	public List<Role> getAllRole();
	public Role createRole(Role role);

	

}
