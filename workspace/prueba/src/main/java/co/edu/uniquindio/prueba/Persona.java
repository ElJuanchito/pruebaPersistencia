package co.edu.uniquindio.prueba;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona extends Humano {

	@Id
	private String id;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(String name, String email, String id) {
		super(name, email);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + getName() + ", email=" + getEmail() + "]";
	}

}
