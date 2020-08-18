package axel.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import axel.app.models.Livre;
import axel.app.models.Notification;
import axel.app.repository.ILivreRepository;
import axel.app.repository.INotificationRepository;
@Service
public class LivreService implements ILivreService{
	@Autowired
	ILivreRepository livrerepository;
	
	@Autowired
	INotificationRepository notifrepository;
	@Override
	public List<Livre> getAllLivre() {
		return livrerepository.findAll();
	}

	@Override
	public Livre getLivreById(long id) {
		Optional<Livre> livre1 =livrerepository.findById(id);
		Livre livre = new Livre();
		if(livre1.isPresent()) {
			livre=livre1.get()
;		}
		return livre;
	}

	@Override
	public Livre createLivre(Livre livre) {
		return livrerepository.save(livre);
	}

	@Override
	public long deleteLivre(long id) {
		try {
			livrerepository.deleteById(id);
			
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

	@Override
	public Livre updateLivre(Livre livre) {
		return livrerepository.save(livre);
	}

	@Override
	public long emprunt(long id, String login) {
		Optional<Livre> livre1 =livrerepository.findById(id);
		Livre livre = new Livre();
		if(livre1.isPresent()) {
			livre=livre1.get();}
		if(livre.getQuantite()>0) {
			livre.setQuantite(livre.getQuantite()-1);
			Notification n = new Notification(login,livre,new Date());
			notifrepository.save(n);

		}
		else System.err.println("Erreur");
		return 1;
		
		
	}

	@Override
	public long annulation(long id) {
		Optional<Livre> livre1 =livrerepository.findById(id);
		Livre livre = new Livre();
		if(livre1.isPresent()) {
			livre=livre1.get();}
		livre.setQuantite(livre.getQuantite()+1);
		
		return 1;
	}

}
