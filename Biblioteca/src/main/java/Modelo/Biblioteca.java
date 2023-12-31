package Modelo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MaterialBiblioteca> coleccion;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos = new ArrayList<>();

    public List<MaterialBiblioteca> getColeccion() {
        return coleccion;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
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

    public void registrarUsuario(Usuario usuario) {
        if (!existeUsuarioConID(usuario.getId())) {
            usuarios.add(usuario);
            JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");

        } else {
            System.out.println("Ya existe un material con el mismo ID.");
            JOptionPane.showMessageDialog(null, "Error, Ya existe un usuario registrado con el mismo ID.");

        }
    }
    public boolean existeMaterialConID(int id) {
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
    private MaterialBiblioteca buscarPorID(int idMaterial) {
        for (MaterialBiblioteca material : coleccion) {
            if (material.getId() == idMaterial) {
                return material;
            }
        }
        return null;
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

    public boolean existeUsuarioConID(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                return true;
            }
        }
        return false;
    }

    private Usuario buscarUsuarioPorID(int idUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == idUsuario) {
                return usuario;
            }
        }
        return null;
    }

    public void registrarPrestamo(int idMaterial, int idUsuario) {
        MaterialBiblioteca material = buscarPorID(idMaterial);
        Usuario usuario = buscarUsuarioPorID(idUsuario);

        if (usuario != null) {
            if (!usuario.getPrestamo()) {
                if (material != null && material instanceof Prestable) {
                    Prestable prestableMaterial = (Prestable) material;
                    if (!material.isPrestado()) {
                        usuario.registrarPrestamo(material);
                        prestableMaterial.prestar();
                        Prestamo nuevoPrestamo = new Prestamo(idUsuario, usuario.getNombre(), usuario.getEmail(), idMaterial, material.getTitulo());
                        prestamos.add(nuevoPrestamo);
                        JOptionPane.showMessageDialog(null, "Préstamo registrado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El material ya está prestado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El material no es prestable.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, este usuario ya tiene un préstamo asociado: \n " +"Titulo: " + usuario.getMaterialPrestado().getTitulo() + ", Id:" + usuario.getMaterialPrestado().getId());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }

    }
    public Prestamo buscarPrestamo(int idUsuario, int idMaterial) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getIdUsuario() == idUsuario && prestamo.getIdMaterial() == idMaterial) {
                return prestamo;
            }
        }
        return null;
    }

    public void registrarDevolucion(int idUsuario, int idMaterial) {
        Prestamo prestamo = buscarPrestamo(idUsuario, idMaterial);
        if (prestamo != null) {
            Usuario usuario = buscarUsuarioPorID(idUsuario);
            usuario.registrarDevolucion();
            Prestable prestableMaterial = (Prestable) buscarPorID(idMaterial);
            prestableMaterial.devolver();
            prestamos.remove(prestamo);
            JOptionPane.showMessageDialog(null, "Devolución registrada con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el préstamo.");
        }
    }


}



