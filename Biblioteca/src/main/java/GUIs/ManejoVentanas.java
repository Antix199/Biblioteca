package GUIs;
import javax.swing.*;

public class ManejoVentanas {

    public static void abrirVentanaPrincipal() {
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setSize(400, 300);
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuPrincipal.setLocationRelativeTo(null);
        menuPrincipal.setVisible(true);
    }

    public static void abrirVentanaAgregar() {
        AgregarMaterial ventanaAgregar = new AgregarMaterial();
        ventanaAgregar.setSize(400, 300);
        ventanaAgregar.setLocationRelativeTo(null);
        ventanaAgregar.setVisible(true);
    }

    public static void abrirVentanaBuscar() {
        BuscarMaterial ventanaBuscar = new BuscarMaterial();
        ventanaBuscar.setSize(400, 300);
        ventanaBuscar.setLocationRelativeTo(null);
        ventanaBuscar.setVisible(true);
    }

    public static void abrirVentanaPrestamo() {
        RegistrarPrestamo ventanaPrestamo = new RegistrarPrestamo();
        ventanaPrestamo.setSize(400, 300);
        ventanaPrestamo.setLocationRelativeTo(null);
        ventanaPrestamo.setVisible(true);
    }

    public static void abrirVentanaDevolucion() {
        RegistrarDevolucion ventanaDevolucion = new RegistrarDevolucion();
        ventanaDevolucion.setSize(400, 300);
        ventanaDevolucion.setLocationRelativeTo(null);
        ventanaDevolucion.setVisible(true);
    }

    public static void finalizarPrograma() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

