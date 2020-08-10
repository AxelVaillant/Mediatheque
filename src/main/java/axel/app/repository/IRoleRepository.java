package axel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import axel.app.models.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
