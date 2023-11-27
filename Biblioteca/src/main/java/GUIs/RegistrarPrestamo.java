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

                int idMaterial = Integer.parseInt(textIDMaterial.getText());
                int idUsuario = Integer.parseInt(textIDUsuario.getText());

                if (biblioteca.existeMaterialConID(idMaterial) && biblioteca.existeUsuarioConID(idUsuario)) {
                    biblioteca.registrarPrestamo(idMaterial, idUsuario);

                } else {
                    JOptionPane.showMessageDialog(null, "Material o usuario no encontrado.");
                }
                dispose();
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
