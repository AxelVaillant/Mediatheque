package axel.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_livre")
	private long idLivre;
	private String nomlivre;
	private String auteur;
	private String description;
	
	private int quantite;

	public Livre(long idLivre, String nomlivre, String auteur, String description, int quantite) {
		super();
		this.idLivre = idLivre;
		this.nomlivre = nomlivre;
		this.auteur = auteur;
		this.description = description;
		this.quantite = quantite;
	}

	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(long idLivre) {
		this.idLivre = idLivre;
	}

	public String getNomlivre() {
		return nomlivre;
	}

	public void setNomlivre(String nomlivre) {
		this.nomlivre = nomlivre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", nomlivre=" + nomlivre + ", auteur=" + auteur + ", description="
				+ description + ", quantite=" + quantite + "]";
	}
	
	
	

}
