package GUIs;

import Modelo.Biblioteca;
import Modelo.Usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoUsuario extends JFrame {
    private JTextField textIdUsuario;
    private JTextField textNombre;
    private JTextField textCorreo;
    private JButton RegistrarUsuario;
    private JPanel PanelUsuario;

    public NuevoUsuario(Biblioteca biblioteca) {

        super("Menu principal");
        setContentPane(PanelUsuario);
        RegistrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idUsuario = Integer.parseInt(textIdUsuario.getText());
                String nombre = textNombre.getText();
                String correo = textCorreo.getText();

                Usuario usuario = new Usuario(idUsuario, nombre, correo);
                biblioteca.registrarUsuario(usuario);

                dispose();
            }
        });
    }
}
