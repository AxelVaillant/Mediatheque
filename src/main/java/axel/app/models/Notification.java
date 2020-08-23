package axel.app.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Notification {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_notif")
	private long idNotif;
	private Date date;
	private String nomEtudiant;
	@ManyToOne
	private Livre livre;
public Notification(long idNotif, Date date, String nomEtudiant, Livre livre) {
	super();
	this.idNotif = idNotif;
	this.date = date;
	this.nomEtudiant = nomEtudiant;
	this.livre = livre;
}
public Notification() {
	super();
	// TODO Auto-generated constructor stub
}

public Notification(Date date, Livre livre, String nomEtudiant) {
	super();
	this.nomEtudiant = nomEtudiant;
	this.date = date;
	this.livre = livre;
}
public long getIdNotif() {
	return idNotif;
}
public void setIdNotif(long idNotif) {
	this.idNotif = idNotif;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getNomEtudiant() {
	return nomEtudiant;
}
public void setNomEtudiant(String nomEtudiant) {
	this.nomEtudiant = nomEtudiant;
}
public Livre getLivre() {
	return livre;
}
public void setLivre(Livre livre) {
	this.livre = livre;
}
@Override
public String toString() {
	return "Notification [idNotif=" + idNotif + ", date=" + date + ", nomEtudiant=" + nomEtudiant + ", livre=" + livre
			+ "]";
}


	
}
