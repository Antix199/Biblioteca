package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarPrestamo extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton Prestar;
    private JPanel PanelPrestamo;

    public RegistrarPrestamo() {

        super("Menu préstamo");
        setContentPane(PanelPrestamo);
        Prestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
