package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String email;
	private List<MaterialBiblioteca> prestamos;
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}
	public int getIdUsuario() {
		return idUsuario;
		}
	public Usuario(int idUsuario, String nombre, String email) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
		this.prestamos = new ArrayList<>();

	}
	public void registrarPrestamo(MaterialBiblioteca material) {
		prestamos.add(material);
	}

}