package GUIs;
import Modelo.Biblioteca;

import javax.swing.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ManejoVentanas {

    public static void abrirVentanaPrincipal() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setSize(400, 300);
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuPrincipal.setLocationRelativeTo(null);
        menuPrincipal.setVisible(true);
    }

    public static void abrirVentanaAgregar(Biblioteca biblioteca) {

        AgregarMaterial ventanaAgregar = new AgregarMaterial(biblioteca);
        ventanaAgregar.setSize(400, 300);
        ventanaAgregar.setLocationRelativeTo(null);
        ventanaAgregar.setVisible(true);
    }

    public static void abrirVentanaBuscar(Biblioteca biblioteca) {
        BuscarMaterial ventanaBuscar = new BuscarMaterial(biblioteca);
        ventanaBuscar.setSize(600, 300);
        ventanaBuscar.setLocationRelativeTo(null);
        ventanaBuscar.setVisible(true);
    }

    public static void abrirVentanaPrestamo(Biblioteca biblioteca) {
        RegistrarPrestamo ventanaPrestamo = new RegistrarPrestamo(biblioteca);
        ventanaPrestamo.setSize(400, 300);
        ventanaPrestamo.setLocationRelativeTo(null);
        ventanaPrestamo.setVisible(true);
    }

    public static void abrirVentanaDevolucion(Biblioteca biblioteca) {
        RegistrarDevolucion ventanaDevolucion = new RegistrarDevolucion(biblioteca);
        ventanaDevolucion.setSize(400, 300);
        ventanaDevolucion.setLocationRelativeTo(null);
        ventanaDevolucion.setVisible(true);
    }
    public static void abrirVentanaUsuario() {
        NuevoUsuario ventanaUsuario = new NuevoUsuario();
        ventanaUsuario.setSize(400, 300);
        ventanaUsuario.setLocationRelativeTo(null);
        ventanaUsuario.setVisible(true);
    }

    public static void finalizarPrograma() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

