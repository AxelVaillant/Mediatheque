package axel.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import axel.app.models.Role;
import axel.app.service.IRoleService;

@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	@Autowired
	IRoleService roleservice;
	
	@GetMapping("/all")
	public List<Role> getAllRole(){
		return roleservice.getAllRole();
	}
	@GetMapping("/save")
	public Role createRole(@RequestBody Role role) {
		return roleservice.createRole(role);
	}
}
