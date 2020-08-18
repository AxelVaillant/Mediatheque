package axel.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import axel.app.models.Livre;
import axel.app.service.ILivreService;

@RestController
@RequestMapping("livre")
@CrossOrigin("http://localhost:4200")
public class LivreController {
@Autowired
ILivreService livreservice;

@GetMapping("/all")
public List<Livre> getAllLivre(){
	return livreservice.getAllLivre();
}

@GetMapping("/byid/{id}")
public Livre getLivrebyid(@PathVariable long id) {
	return livreservice.getLivreById(id);
}

@PostMapping("/save")
public Livre createLivre(@RequestBody Livre Livre) {
	return livreservice.createLivre(Livre);
}

@PostMapping("/delete/{id}")
public long deleteLivre(@PathVariable long id) {
	return livreservice.deleteLivre(id);
}
@PutMapping("/update/{id}")
public Livre updateLivre(@PathVariable long id, @RequestBody Livre Livre) {
	Livre Livremodif=livreservice.getLivreById(id);
	Livremodif.setNomlivre(Livre.getNomlivre());
	Livremodif.setQuantite(Livre.getQuantite());
	Livremodif.setAuteur(Livre.getAuteur());
	Livremodif.setDescription(Livre.getDescription());
	return livreservice.updateLivre(Livre);
}
@PutMapping("/emprunt/{id}")
public long emprunt(@PathVariable long id , @RequestBody String login) {
	 return livreservice.emprunt(id, login);
}

@PutMapping("/annulation/{id}")
public long emprunt(@PathVariable long id ) {
	 return livreservice.annulation(id);
}
}
