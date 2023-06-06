package org.example.vista;

import org.example.modelo.Natacion;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaNatacion extends JFrame {
    private GridLayout layout;

    private JPanel panel1; //formulario para capturar datos de nadadores
    private JLabel lblId;
    private JLabel lblNadador;
    private JLabel lblEdad;
    private JLabel lblNacionalidad;
    private JLabel lblMedallas;
    private JLabel lblImagen;
    private JTextField txtId;
    private JTextField txtNadador;
    private JTextField txtEdad;
    private JTextField txtNacionalidad;
    private JTextField txtMedallas;
    private JTextField txtImagen;
    private JButton btnAgregar;

    private JPanel panel2; //tabla para mostrar la base de datos
    private JButton btnCargar;
    private JTable tblNatacion;
    private JScrollPane scrollPane;

    private JPanel panel3; //para que se cargue la imagen de la url
    private JLabel lblFoto;

    private JPanel panel4; //actualizar y eliminar datos de la base de datos
    private JLabel lblNadadorx;
    private JLabel lblEdadx;
    private JLabel lblNacionalidadx;
    private JLabel lblMedallasx;
    private JLabel lblImagenx;
    private JTextField txtNadadorx;
    private JTextField txtEdadx;
    private JTextField txtNacionalidadx;
    private JTextField txtMedallasx;
    private JTextField txtImagenx;
    private JButton btnActualizar;
    private JButton btnEliminar;


    public VentanaNatacion(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout); //agragar el layout a la ventana principal

        //panel1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(77, 191, 252));

        lblId = new JLabel("Id: ");
        lblNadador = new JLabel("Nombre del nadador: ");
        lblEdad = new JLabel("Edad: ");
        lblNacionalidad = new JLabel("Nacionalidad: ");
        lblMedallas = new JLabel("Num. de medallas: ");
        lblImagen = new JLabel("Url de imagen: ");

        txtId = new JTextField(3);

        //Para que el id esté deshabilido
        txtId.setText("0");
        txtId.setEnabled(false);

        txtNadador = new JTextField(15);
        txtEdad = new JTextField(5);
        txtNacionalidad= new JTextField(10);
        txtMedallas = new JTextField(5);
        txtImagen = new JTextField(25);

        btnAgregar = new JButton("Agregar");

        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNadador);
        panel1.add(txtNadador);
        panel1.add(lblEdad);
        panel1.add(txtEdad);
        panel1.add(lblNacionalidad);
        panel1.add(txtNacionalidad);
        panel1.add(lblMedallas);
        panel1.add(txtMedallas);
        panel1.add(lblImagen);
        panel1.add(txtImagen);

        panel1.add(btnAgregar);

        //panel2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(111, 175, 245));
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tblNatacion = new JTable();
        scrollPane = new JScrollPane(tblNatacion);
        panel2.add(scrollPane);

        //panel3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(117, 211, 248, 255));
        lblFoto = new JLabel();

        this.panel3.add(lblFoto);


        //panel4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(71, 112, 171));

        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");

        lblNadadorx = new JLabel("Nombre del nadador: ");
        lblEdadx = new JLabel("Edad: ");
        lblNacionalidadx = new JLabel("Nacionalidad: ");
        lblMedallasx = new JLabel("Num. de medallas: ");
        lblImagenx = new JLabel("Url de imagen: ");

        txtNadadorx = new JTextField(15);
        txtEdadx = new JTextField(5);
        txtNacionalidadx = new JTextField(10);
        txtMedallasx = new JTextField(5);
        txtImagenx = new JTextField(25);

        panel4.add(lblNadadorx);
        panel4.add(txtNadadorx);
        panel4.add(lblEdadx);
        panel4.add(txtEdadx);
        panel4.add(lblNacionalidadx);
        panel4.add(txtNacionalidadx);
        panel4.add(lblMedallasx);
        panel4.add(txtMedallasx);
        panel4.add(lblImagenx);
        panel4.add(txtImagenx);

        panel4.add(btnActualizar);
        panel4.add(btnEliminar);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNadador() {
        return lblNadador;
    }

    public void setLblNadador(JLabel lblNadador) {
        this.lblNadador = lblNadador;
    }

    public JLabel getLblEdad() {
        return lblEdad;
    }

    public void setLblEdad(JLabel lblEdad) {
        this.lblEdad = lblEdad;
    }

    public JLabel getLblNacionalidad() {
        return lblNacionalidad;
    }

    public void setLblNacionalidad(JLabel lblNacionalidad) {
        this.lblNacionalidad = lblNacionalidad;
    }

    public JLabel getLblMedallas() {
        return lblMedallas;
    }

    public void setLblMedallas(JLabel lblMedallas) {
        this.lblMedallas = lblMedallas;
    }

    public JLabel getLblImagen() {
        return lblImagen;
    }

    public void setLblImagen(JLabel lblImagen) {
        this.lblImagen = lblImagen;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNadador() {
        return txtNadador;
    }

    public void setTxtNadador(JTextField txtNadador) {
        this.txtNadador = txtNadador;
    }

    public JTextField getTxtEdad() {
        return txtEdad;
    }

    public void setTxtEdad(JTextField txtEdad) {
        this.txtEdad = txtEdad;
    }

    public JTextField getTxtNacionalidad() {
        return txtNacionalidad;
    }

    public void setTxtNacionalidad(JTextField txtNacionalidad) {
        this.txtNacionalidad = txtNacionalidad;
    }

    public JTextField getTxtMedallas() {
        return txtMedallas;
    }

    public void setTxtMedallas(JTextField txtMedallas) {
        this.txtMedallas = txtMedallas;
    }

    public JTextField getTxtImagen() {
        return txtImagen;
    }

    public void setTxtImagen(JTextField txtImagen) {
        this.txtImagen = txtImagen;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTable getTblNatacion() {
        return tblNatacion;
    }

    public void setTblNatacion(JTable tblNatacion) {
        this.tblNatacion = tblNatacion;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JLabel getLblNadadorx() {
        return lblNadadorx;
    }

    public void setLblNadadorx(JLabel lblNadadorx) {
        this.lblNadadorx = lblNadadorx;
    }

    public JLabel getLblEdadx() {
        return lblEdadx;
    }

    public void setLblEdadx(JLabel lblEdadx) {
        this.lblEdadx = lblEdadx;
    }

    public JLabel getLblNacionalidadx() {
        return lblNacionalidadx;
    }

    public void setLblNacionalidadx(JLabel lblNacionalidadx) {
        this.lblNacionalidadx = lblNacionalidadx;
    }

    public JLabel getLblMedallasx() {
        return lblMedallasx;
    }

    public void setLblMedallasx(JLabel lblMedallasx) {
        this.lblMedallasx = lblMedallasx;
    }

    public JLabel getLblImagenx() {
        return lblImagenx;
    }

    public void setLblImagenx(JLabel lblImagenx) {
        this.lblImagenx = lblImagenx;
    }

    public JTextField getTxtNadadorx() {
        return txtNadadorx;
    }

    public void setTxtNadadorx(JTextField txtNadadorx) {
        this.txtNadadorx = txtNadadorx;
    }

    public JTextField getTxtEdadx() {
        return txtEdadx;
    }

    public void setTxtEdadx(JTextField txtEdadx) {
        this.txtEdadx = txtEdadx;
    }

    public JTextField getTxtNacionalidadx() {
        return txtNacionalidadx;
    }

    public void setTxtNacionalidadx(JTextField txtNacionalidadx) {
        this.txtNacionalidadx = txtNacionalidadx;
    }

    public JTextField getTxtMedallasx() {
        return txtMedallasx;
    }

    public void setTxtMedallasx(JTextField txtMedallasx) {
        this.txtMedallasx = txtMedallasx;
    }

    public JTextField getTxtImagenx() {
        return txtImagenx;
    }

    public void setTxtImagenx(JTextField txtImagenx) {
        this.txtImagenx = txtImagenx;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public void limpiar(){
        txtNadador.setText("");
        txtEdad.setText("");
        txtNacionalidad.setText("");
        txtMedallas.setText("");
        txtImagen.setText("");
    }

    public void actualizarRegistro(int registro, Natacion natacion){
        //Aquí se obtiene el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblNatacion.getModel();

        //Aquí se actualizarán datos del registro seleccionado
        modelo.setValueAt(natacion.getNadador(), registro, 1);
        modelo.setValueAt(natacion.getEdad(), registro, 2);
        modelo.setValueAt(natacion.getNacionalidad(),registro,3);
        modelo.setValueAt(natacion.getMedallas(), registro, 4);
        modelo.setValueAt(natacion.getImagen(),registro,5);
    }



}
