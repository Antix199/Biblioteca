package Modelo;

public class MaterialBiblioteca {

	protected int id;
	protected boolean estado;
	protected String titulo;
	protected String autor;

	protected String estadotxt;

	public int getId() {
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

	public String getEstadotxt() {
		if (!estado ){
			return "disponible";
		}
		else {
			return "prestado";
		}
	}

	public MaterialBiblioteca(int id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.estado = false;
		this.estadotxt = getEstadotxt();
	}


}