package Modelo;

import javax.swing.*;
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
        if (!existeMaterialConID(material.getId())) {
            coleccion.add(material);
            JOptionPane.showMessageDialog(null, "Material registrado con éxito.");

        } else {
            System.out.println("Ya existe un material con el mismo ID.");
            JOptionPane.showMessageDialog(null, "Error, Ya existe un material con el mismo ID.");

        }
    }

    private boolean existeMaterialConID(int id) {
        for (MaterialBiblioteca material : coleccion) {
            if (material.getId() == id) {
                return true;
            }
        }
        return false;
    }
    public List<MaterialBiblioteca> buscarPorTitulo(String titulo) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();

        for (MaterialBiblioteca material : coleccion) {
            boolean coincideTitulo = titulo == null || material.getTitulo().equalsIgnoreCase(titulo);

            if (coincideTitulo) {
                resultados.add(material);
            }
        }

        return resultados;
    }

    public List<MaterialBiblioteca> buscarPorAutor(String autor) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();

        for (MaterialBiblioteca material : coleccion) {
            boolean coincideAutor = autor == null || material.getAutor().equalsIgnoreCase(autor);

            if (coincideAutor) {
                resultados.add(material);
            }
        }

        return resultados;
    }

    public List<MaterialBiblioteca> buscarPorCodigo(String codigo) {
        List<MaterialBiblioteca> resultados = new ArrayList<>();

        for (MaterialBiblioteca material : coleccion) {
            boolean coincideCodigo = codigo == null || cumpleCriterioCodigo(material, codigo);

            if (coincideCodigo) {
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



