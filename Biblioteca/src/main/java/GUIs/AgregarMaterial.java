package GUIs;

import Modelo.Biblioteca;

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
    private JPanel PanelAgregar;

    public AgregarMaterial(Biblioteca biblioteca) {

        super("Menu agregar material");
        setContentPane(PanelAgregar);
        registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEntrada()){
                    String nombreTexto = nombre.getText();
                    String autorTexto = autor.getText();
                    String codigoTexto = codigo.getText();
                    String idTexto = id.getText();
                    String edicionTexto = edicion.getText();

                    Object[] opciones = {"Libro", "Revista"};
                    int seleccion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de material", "Tipo de Material",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                    if (seleccion == 0) { // Libro
                    Modelo.Libro libro = new Modelo.Libro(Integer.parseInt(idTexto), nombreTexto, autorTexto, codigoTexto, Integer.parseInt(edicionTexto));
                    biblioteca.agregarMaterial(libro);
                    libro.mostrarInformacion();
                    } else if (seleccion == 1) { // Revista
                    Modelo.Revista revista = new Modelo.Revista(Integer.parseInt(idTexto), nombreTexto, autorTexto, codigoTexto, Integer.parseInt(edicionTexto));
                    biblioteca.agregarMaterial(revista);
                    revista.mostrarInformacion();
                    }
                    dispose();
                }

            }
        });
    }
    private boolean validarEntrada() {
        if (!ManejoVentanas.esNumero(id.getText()) || !ManejoVentanas.esNumero(edicion.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, revise el formato de los datos ingresados.");
            return false;
        }

        if (!ManejoVentanas.esTextoNoVacio(nombre.getText()) || !ManejoVentanas.esTextoNoVacio(autor.getText())
                || !ManejoVentanas.esTextoNoVacio(codigo.getText()) || !ManejoVentanas.esTextoNoVacio(id.getText())
                || !ManejoVentanas.esTextoNoVacio(edicion.getText())) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return false;
        }

        return true;
    }
}
