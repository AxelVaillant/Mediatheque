package axel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import axel.app.models.Livre;

public interface ILivreRepository extends JpaRepository<Livre, Long> {

}
