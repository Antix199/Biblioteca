package GUIs;

import Modelo.Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarPrestamo extends JFrame {
    private JTextField textIDMaterial;
    private JTextField textIDUsuario;
    private JButton Prestar;
    private JPanel PanelPrestamo;
    private JButton nuevoUsuario;

    public RegistrarPrestamo(Biblioteca biblioteca) {

        super("Menu préstamo");
        setContentPane(PanelPrestamo);
        Prestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int idMaterial = Integer.parseInt(RegistrarPrestamo.this.textIDMaterial.getText());
                int idUsuario = Integer.parseInt(RegistrarPrestamo.this.textIDUsuario.getText());

                if (biblioteca.existeMaterialConID(idMaterial) && biblioteca.existeUsuarioConID(idUsuario)) {
                    biblioteca.registrarPrestamo(idMaterial, idUsuario);
                    JOptionPane.showMessageDialog(null, "Préstamo registrado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "Material o usuario no encontrado.");
                }
            }

        });
        nuevoUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaUsuario(biblioteca);
            }
        });
    }
}
