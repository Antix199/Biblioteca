package Modelo;

public class MaterialBiblioteca {

	protected String id;
	protected boolean estado;
	protected String titulo;
	protected String autor;

	public String getId() {
		return id;
	}

	public boolean isPrestado() {
		return estado;
	}

	public void setPrestado(boolean prestado) {
		this.estado = prestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void mostrarInformacion(){};
	public MaterialBiblioteca(String id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.estado = false;
	}


}