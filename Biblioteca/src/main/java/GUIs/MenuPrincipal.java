package GUIs;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JButton menuAgregar;
    private JButton menuBuscar;
    private JButton menuRP;
    private JButton menuRD;
    private JButton finalizarPrograma;

    public MenuPrincipal() {

        menuAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaAgregar();
            }
        });
        menuBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaBuscar();
            }
        });
        menuRP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaPrestamo();
            }
        });
        menuRD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaDevolucion();
            }
        });
        finalizarPrograma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.finalizarPrograma();
            }
        });
    }
}
