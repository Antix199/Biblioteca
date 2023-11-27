package GUIs;
import javax.swing.*;

public class ManejoVentanas {



    public static void abrirVentanaAgregar() {
        AgregarMaterial ventanaAgregar = new AgregarMaterial();
        ventanaAgregar.setVisible(true);
    }

    public static void abrirVentanaBuscar() {
        BuscarMaterial ventanaBuscar = new BuscarMaterial();
        ventanaBuscar.setVisible(true);
    }

    public static void abrirVentanaPrestamo() {
        RegistrarPrestamo ventanaPrestamo = new RegistrarPrestamo();
        ventanaPrestamo.setVisible(true);
    }

    public static void abrirVentanaDevolucion() {
        RegistrarDevolucion ventanaDevolucion = new RegistrarDevolucion();
        ventanaDevolucion.setVisible(true);
    }

    public static void finalizarPrograma() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

