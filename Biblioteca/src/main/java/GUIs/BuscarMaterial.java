package GUIs;

import Modelo.MaterialBiblioteca;
import Modelo.Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class BuscarMaterial extends JFrame{
    private JTextField textoBuscar;
    private JTextField autor;
    private JTextField codigo;
    private JButton buscarTitulo;
    private JPanel PanelBuscar;
    private JTextArea resultadosTextArea;
    private JButton buscarCodigo;
    private JButton buscarAutor;

    public BuscarMaterial(Biblioteca biblioteca) {

        super("Menubuscar material");
        setContentPane(PanelBuscar);
        for (MaterialBiblioteca material : biblioteca.getColeccion()) {
            resultadosTextArea.append(material.toString() + "\n");
        }
        buscarTitulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadosTextArea.setText("");
                String titulo = BuscarMaterial.this.textoBuscar.getText();

                List<MaterialBiblioteca> resultados = biblioteca.buscarPorTitulo(titulo);

                for (MaterialBiblioteca material : resultados) {
                    resultadosTextArea.append(material.toString() + "\n");
                }
            }
        });
        buscarAutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultadosTextArea.setText("");
                String autor = BuscarMaterial.this.textoBuscar.getText();

                List<MaterialBiblioteca> resultados = biblioteca.buscarPorAutor(autor);

                for (MaterialBiblioteca material : resultados) {
                    resultadosTextArea.append(material.toString() + "\n");
                }
            }
        });
        buscarCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadosTextArea.setText("");
                String codigo = BuscarMaterial.this.textoBuscar.getText();

                List<MaterialBiblioteca> resultados = biblioteca.buscarPorCodigo(codigo);

                for (MaterialBiblioteca material : resultados) {
                    resultadosTextArea.append(material.toString() + "\n");
                }
            }
        });

    }
}
