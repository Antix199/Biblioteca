package Modelo;

public class Libro extends MaterialBiblioteca implements Prestable {

	private String ISBN;
	private int edicion;

	public Libro(int id, String titulo, String autor, String ISBN, int edicion) {
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
		System.out.println("ID:" + getId() + "Libro: " + getTitulo() + " - Autor: " + getAutor() + " - ISBN: " + ISBN + "Edición: " + edicion);
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

	public void registrarPrestamo(Libro libro, Usuario usuario) {
		if (!libro.isPrestado()) {
			libro.prestar();
			System.out.println("Préstamo registrado: " + libro.getTitulo() + " a " + usuario.getNombre());
		} else {
			System.out.println("El material ya está prestado.");
		}
	}
	public void registrarDevolucion(Libro libro) {
		if (libro.isPrestado()) {
			libro.devolver();
			System.out.println("Devolución registrada: " + libro.getTitulo());
		} else {
			System.out.println("El material no está prestado.");
		}
	}
}