package GUIs;

import Modelo.MaterialBiblioteca;
import Modelo.Biblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class BuscarMaterial extends JFrame{
    private JTextField titulo;
    private JTextField autor;
    private JTextField codigo;
    private JButton buscar;
    private JPanel PanelBuscar;
    private JTextArea resultadosTextArea;
    public BuscarMaterial(Biblioteca biblioteca) {

        super("Menubuscar material");
        setContentPane(PanelBuscar);

        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = BuscarMaterial.this.titulo.getText();
                String autor = BuscarMaterial.this.autor.getText();
                String codigo = BuscarMaterial.this.codigo.getText();

                List<MaterialBiblioteca> resultados = biblioteca.buscarMaterial(titulo, autor, codigo);

                for (MaterialBiblioteca material : resultados) {
                    resultadosTextArea.append(material.toString() + "\n");
                }
            }
        });
    }
}
