package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarDevolucion extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton devolver;
    private JPanel PanelDevolucion;

    public RegistrarDevolucion() {

        super("Menu devolución");
        setContentPane(PanelDevolucion);
        devolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
