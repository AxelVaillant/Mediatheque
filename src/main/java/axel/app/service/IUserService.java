package axel.app.service;

import java.util.List;

import axel.app.models.User;

public interface IUserService {

	public List<User> getAllUser();
	public User getUserById(long id);
	public User createUser(User user);
	public long deleteUser(long id);
	public User updateUser(User user);
	public User identification(String nom, String password);
	
}
