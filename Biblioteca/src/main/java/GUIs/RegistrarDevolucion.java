package GUIs;

import Modelo.Biblioteca;
import Modelo.Prestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarDevolucion extends JFrame{
    private JTextField idMaterial;
    private JTextField idUsuario;
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
                if (validarEntrada()){
                    int idUsuario = Integer.parseInt(idMaterial.getText());
                    int idMaterial = Integer.parseInt(RegistrarDevolucion.this.idUsuario.getText());
                    biblioteca.registrarDevolucion(idUsuario, idMaterial);
                    prestamos.setText("");
                    for (Prestamo prestamo : biblioteca.getPrestamos()) {
                        prestamos.append(prestamo.toString() + "\n");
                    }
                }
            }
        });

    }
    private boolean validarEntrada() {
        if (!ManejoVentanas.esNumero(idMaterial.getText()) || !ManejoVentanas.esNumero(idUsuario.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, revise el formato de los datos ingresados.");
            return false;
        }
        return true;
    }
}
