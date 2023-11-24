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
}