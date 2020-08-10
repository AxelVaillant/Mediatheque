package axel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import axel.app.models.User;

public interface IUserRepository extends JpaRepository<User, Long> {
	public User findByNom(String nom);

}
