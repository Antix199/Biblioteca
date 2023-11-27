package GUIs;
import Modelo.Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {
    private JButton menuAgregar;
    private JButton menuBuscar;
    private JButton menuRP;
    private JButton menuRD;
    private JButton finalizarPrograma;
    private JPanel PanelMenu;

    public MenuPrincipal() {

        super("Menu principal");
        setContentPane(PanelMenu);
        Biblioteca biblioteca = new Biblioteca();
        menuAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaAgregar(biblioteca);
            }
        });
        menuBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaBuscar(biblioteca);
            }
        });
        menuRP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaPrestamo(biblioteca);
            }
        });
        menuRD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManejoVentanas.abrirVentanaDevolucion(biblioteca);
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
