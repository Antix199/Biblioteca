package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgregarMaterial extends JFrame{
    private JTextField nombre;
    private JTextField autor;
    private JTextField codigo;
    private JTextField id;
    private JTextField edicion;
    private JButton registrar;

    public AgregarMaterial() {
        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
