package Modelo;

public class Usuario {

	private String idUsuario;
	private String nombre;
	private String email;
	public String getIdUsuario() {
		return idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}
	public Usuario(String idUsuario, String nombre, String email) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
	}

}