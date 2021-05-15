package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cuenta database table.
 * 
 */
@Entity
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codcuenta;

	private String contrasena;

	private String correoelectronico;

	public Cuenta() {
	}

	public int getCodcuenta() {
		return this.codcuenta;
	}

	public void setCodcuenta(int codcuenta) {
		this.codcuenta = codcuenta;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreoelectronico() {
		return this.correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

}