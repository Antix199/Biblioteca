package Modelo;

public class Libro extends MaterialBiblioteca implements Prestable {

	private String ISBN;
	private int edicion;

	public Libro(String id, String titulo, String autor, String ISBN, int edicion) {
		super(id, titulo, autor);
		this.ISBN = ISBN;
		this.edicion = edicion;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getEdicion() {
		return edicion;
	}


	public void mostrarInformacion() {
		System.out.println("Libro: " + getTitulo() + " - Autor: " + getAutor() + " - ISBN: " + ISBN);
	}

	@Override
	public void prestar() {
		setPrestado(true);
		System.out.println("El libro ha sido prestado.");
	}
	@Override
	public void devolver() {
		setPrestado(false);
		System.out.println("El libro ha sido devuelto.");
	}
}