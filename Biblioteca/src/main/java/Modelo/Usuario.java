package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String email;
	private Boolean prestamo;
	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return idUsuario;
	}
	public int getIdUsuario() {
		return idUsuario;
		}
	public Usuario(int idUsuario, String nombre, String email) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
		this.prestamo = false;

	}

	public void registrarPrestamo(MaterialBiblioteca material){}


}