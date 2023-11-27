package GUIs;

import Modelo.Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarPrestamo extends JFrame {
    private JTextField idMaterial;
    private JTextField idUsuario;
    private JTextField nombreUsuario;
    private JTextField correo;
    private JButton Prestar;
    private JPanel PanelPrestamo;

    public RegistrarPrestamo(Biblioteca biblioteca) {

        super("Menu préstamo");
        setContentPane(PanelPrestamo);
        Prestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
