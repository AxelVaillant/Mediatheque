package axel.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_user")
	private int iduser;
	private String nom;
	private String prenom;
	private String password;
	private String login;
	@OneToOne
	@JoinColumn(name="role")
	private Role role;
	public User(int iduser, String nom, String prenom, String password, String login, Role role) {
		super();
		this.iduser = iduser;
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.login = login;
		this.role = role;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", login="
				+ login + ", role=" + role + "]";
	}
	
	
	
	
	
}
