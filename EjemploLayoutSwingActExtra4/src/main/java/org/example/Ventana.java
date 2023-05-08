package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Ventana extends JFrame{
    private JPanel panel1;
    private JButton botonPanel1;
    private JLabel etiquetaPanel1;
    private JPanel panel2;
    private JLabel etiquetaPanel2;
    private JPanel panel3;
    private JComboBox <String> comboBoxPanel3;
    private JPanel panel4;
    private GridLayout layout;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        // Panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(214, 197, 252));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        botonPanel1 = new JButton("Presioname");
        panel1.add(botonPanel1);
        etiquetaPanel1 = new JLabel("....");
        panel1.add(etiquetaPanel1);
        botonPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiquetaPanel1.setText("Hola presionaste el boton del panel 1");
            }
        });

        this.getContentPane().add(panel1,0);


        // Panel 2
        String urlImagen = "https://i.pinimg.com/originals/02/5b/a7/025ba7e675efb7238b8b36dbdff7633b.png";
        panel2 = new JPanel();
        panel2.setBackground(new Color(252, 197, 229));
        panel2.setLayout(new FlowLayout());
        // cargar la imagen de internet

        try {
            URL url = new URL(urlImagen);
            Image imagen = ImageIO.read(url);
            ImageIcon imagenIcon = new ImageIcon(imagen);
            etiquetaPanel2 = new JLabel(imagenIcon);
            panel2.add(etiquetaPanel2);
            this.getContentPane().add(panel2,1);
        } catch (MalformedURLException me){
            System.out.println("url no válida");
        } catch (Exception e){
            System.out.println("Error al cargar la imagen");
        }


        // Panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(197, 245, 252));
        panel3.setLayout(new FlowLayout(FlowLayout.RIGHT));
        String[] elementos = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
        comboBoxPanel3 = new JComboBox<>(elementos);
        comboBoxPanel3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getSource().toString());
                System.out.println(comboBoxPanel3.getSelectedIndex());

            }
        });
        panel3.add(comboBoxPanel3);
        this.getContentPane().add(panel3,2);


        // Panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(252, 252, 197));
        this.getContentPane().add(panel4,3);


        this.setVisible(true);
    }
}
