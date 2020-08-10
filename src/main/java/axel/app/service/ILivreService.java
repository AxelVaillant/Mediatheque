package axel.app.service;

import java.util.List;

import axel.app.models.Livre;



public interface ILivreService {

	public List<Livre> getAllLivre();
	public Livre getLivreById(long id);
	public Livre createLivre(Livre livre);
	public long deleteLivre(long id);
	public Livre updateLivre(Livre livre);
}
