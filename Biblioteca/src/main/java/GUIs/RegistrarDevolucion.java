package GUIs;

import Modelo.Biblioteca;
import Modelo.MaterialBiblioteca;
import Modelo.Prestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarDevolucion extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton devolver;
    private JPanel PanelDevolucion;
    private JTextArea prestamos;

    public RegistrarDevolucion(Biblioteca biblioteca) {

        super("Menu devolución");
        setContentPane(PanelDevolucion);

        for (Prestamo prestamo : biblioteca.getPrestamos()) {
            prestamos.append(prestamo.toString() + "\n");
        }
        devolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idUsuario = Integer.parseInt(textField1.getText());
                int idMaterial = Integer.parseInt(textField2.getText());
                biblioteca.registrarDevolucion(idUsuario, idMaterial);
                prestamos.setText("");
                for (Prestamo prestamo : biblioteca.getPrestamos()) {
                    prestamos.append(prestamo.toString() + "\n");
                }
            }
        });
    }
}
