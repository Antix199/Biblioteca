package Modelo;

public class Usuario {

	private int idUsuario;
	private String nombre;
	private String email;
	private Boolean prestamo;

	private MaterialBiblioteca materialPrestado;
	public String getNombre() {
		return nombre;
	}
	public String getEmail(){return email;}

	public MaterialBiblioteca getMaterialPrestado(){return materialPrestado; }

	public int getId() {
		return idUsuario;
	}
	public int getIdUsuario() {
		return idUsuario;
		}
		public Boolean getPrestamo(){ return prestamo; }
	public Usuario(int idUsuario, String nombre, String email) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.email = email;
		this.prestamo = false;
		this.materialPrestado = null;

	}

	public void registrarPrestamo(MaterialBiblioteca material){
		this.prestamo = true;
		this.materialPrestado = material;
	}

	public void registrarDevolucion() {
		this.prestamo = false;
		this.materialPrestado = null;
	}



}