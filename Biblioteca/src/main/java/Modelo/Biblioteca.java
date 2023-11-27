package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MaterialBiblioteca> coleccion;
    private List<Usuario> usuarios;

    public List<MaterialBiblioteca> getColeccion() {
        return coleccion;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Biblioteca() {
            this.coleccion = new ArrayList<>();
            this.usuarios = new ArrayList<>();
    }

    public void agregarMaterial(MaterialBiblioteca material) {
        coleccion.add(material);
        System.out.println("Material agregado a la colección: " + material.getTitulo());
    }

    public List<MaterialBiblioteca> buscarPorTitulo(String titulo) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : coleccion) {
            if (material.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(material);
            }
        }
        return resultados;
    }

    public List<MaterialBiblioteca> buscarPorAutor(String autor) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : coleccion) {
            if (material.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(material);
            }
        }
        return resultados;
    }

    public List<Libro> buscarLibrosPorISBN(String isbn) {
        List<Libro> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : coleccion) {
            if (material instanceof Libro) {
                Libro libro = (Libro) material;
                if (libro.getISBN().equalsIgnoreCase(isbn)) {
                    resultados.add(libro);
                }
            }
        }
        return resultados;
    }

    public List<Revista> buscarRevistasPorISSN(String issn) {
        List<Revista> resultados = new ArrayList<>();
        for (MaterialBiblioteca material : coleccion) {
            if (material instanceof Revista) {
                Revista revista = (Revista) material;
                if (revista.getISSN().equalsIgnoreCase(issn)) {
                    resultados.add(revista);
                }
            }
        }
        return resultados;
    }

}