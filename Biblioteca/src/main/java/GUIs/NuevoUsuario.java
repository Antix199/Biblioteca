package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoUsuario extends JFrame {
    private JTextField textIdUsuario;
    private JTextField textNombre;
    private JTextField textCorreo;
    private JButton RegistrarUsuario;
    private JPanel PanelUsuario;

    public NuevoUsuario() {

        super("Menu principal");
        setContentPane(PanelUsuario);
        RegistrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
