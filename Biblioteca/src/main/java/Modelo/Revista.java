package Modelo;

public class Revista extends MaterialBiblioteca implements Prestable {

	private String ISSN;
	private int numero;

	public String getISSN() {
		return ISSN;
	}

	public int getNumero() {
		return numero;
	}

	public Revista(int id, String titulo, String autor, String ISSN, int numero) {
		super(id, titulo, autor);
		this.ISSN = ISSN;
		this.numero = numero;
	}

	public void mostrarInformacion() {
		System.out.println("ID:" + getId() + "Revista: " + getTitulo() + " - Autor: " + getAutor() + " - ISSN: " + ISSN + "Número: " + numero);
	}


	@Override
	public void prestar() {
		setPrestado(true);
		System.out.println("La revista ha sido prestada.");
	}

	@Override
	public void devolver() {
		setPrestado(false);
		System.out.println("La revista ha sido devuelta.");
	}
}