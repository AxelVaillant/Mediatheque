package axel.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_role")
	private long idRole;
	private String nomRole;
	public Role(long idRole, String nomRole) {
		super();
		this.idRole = idRole;
		this.nomRole = nomRole;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdRole() {
		return idRole;
	}
	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}
	public String getNomRole() {
		return nomRole;
	}
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}
	
	
}
