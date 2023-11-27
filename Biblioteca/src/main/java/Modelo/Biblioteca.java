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
    public List<MaterialBiblioteca> buscarMaterial(String titulo, String autor, String codigo) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();

        for (MaterialBiblioteca material : coleccion) {
            boolean coincideTitulo = titulo == null || material.getTitulo().equalsIgnoreCase(titulo);
            boolean coincideAutor = autor == null || material.getAutor().equalsIgnoreCase(autor);
            boolean coincideCodigo = codigo == null || cumpleCriterioCodigo(material, codigo);

            if (coincideTitulo && coincideAutor && coincideCodigo) {
                resultados.add(material);
            }
        }

        return resultados;
    }

    private boolean cumpleCriterioCodigo(MaterialBiblioteca material, String codigo) {
        if (material instanceof Libro) {
            Libro libro = (Libro) material;
            return libro.getISBN().equalsIgnoreCase(codigo);
        } else if (material instanceof Revista) {
            Revista revista = (Revista) material;
            return revista.getISSN().equalsIgnoreCase(codigo);
        }
        return false;
    }
}



