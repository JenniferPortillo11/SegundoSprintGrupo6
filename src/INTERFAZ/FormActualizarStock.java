/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import javax.swing.ImageIcon;
import CLASES.Conexion;
import CLASES.Productos;
import CLASES.ProductosVentasStock;
import CLASES.usuarios;
import com.mysql.jdbc.Statement;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.ImageIcon;

public class FormActualizarStock extends javax.swing.JFrame {

    Productos pro = new Productos();
    ProductosVentasStock proDao = new ProductosVentasStock();

    private static final String url = "jdbc:mysql://localhost:3306/base-gym?characterEncoding=utf8";
    private static final String user = "root";
    private static final String password = "root";
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.print(e);

        }

        return con;
    }

    public FormActualizarStock() {
        initComponents();
        mostrarDatosProducto();
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
    }

    public Icon icono(String path2, int width, int heigth) {

        Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        Nstock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        StockA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualización de Stock-Gym Sport Center");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(860, 10, 100, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 30, 110, 23);

        cod.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(cod);
        cod.setBounds(160, 30, 330, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Descripción:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 120, 120, 23);

        descripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(descripcion);
        descripcion.setBounds(160, 110, 330, 30);

        Nstock.setBackground(new java.awt.Color(64, 64, 64));
        Nstock.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Nstock);
        Nstock.setBounds(510, 160, 112, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Stock actual:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 170, 130, 23);

        StockA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(StockA);
        StockA.setBounds(160, 160, 180, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Nuevo Stock:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(380, 170, 120, 23);

        BtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setToolTipText("Buscar producto");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(BtnBuscar);
        BtnBuscar.setBounds(510, 30, 100, 31);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 80, 90, 23);

        Nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        jPanel2.add(Nombre);
        Nombre.setBounds(160, 70, 330, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 90, 630, 220);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(null);

        BtnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setToolTipText("Nuevo producto");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(BtnNuevo);
        BtnNuevo.setBounds(25, 53, 120, 34);

        BtnActualizar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Modificar.png"))); // NOI18N
        BtnActualizar.setText("<html>Actualizar<html>");
        BtnActualizar.setToolTipText("Actualizar stock");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnActualizar);
        BtnActualizar.setBounds(25, 147, 120, 34);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(690, 90, 170, 220);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Act-Stock.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(650, 10, 64, 64);

        jTableProductos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Cantidad", "Precio compra", "Precio venta", "Fecha de ingreso", "Código", "Proveedor", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);

        jTabbedPane1.addTab("Productos", jScrollPane1);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 350, 960, 180);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel6.setText("Actualización de Stock");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 20, 550, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // Buscar datos del producto
        if (cod.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el código del producto.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                Connection con = null;
                con = getConection();
                ps = con.prepareStatement("Select * FROM productos WHERE cod_producto = ?");
                ps.setString(1, cod.getText());

                rs = ps.executeQuery();

                if (rs.next()) {
                    cod.setText(rs.getString("cod_producto"));
                    Nombre.setText(rs.getString("nombre"));
                    descripcion.setText(rs.getString("decripcion"));
                    StockA.setText(rs.getString("cantidad"));

                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos existentes.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
                    limpiar();
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // Nuevo Stocck
        Nstock.setText(null);
        StockA.setText(null);
        cod.setText(null);
        descripcion.setText(null);
        Nombre.setText(null);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        // Actualizar 

        ActualizarStock();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed
    public void limpiar(){
        Nstock.setText(null);
        StockA.setText(null);
        cod.setText(null);
        descripcion.setText(null);
        Nombre.setText(null);
    }
    
    
    public void mostrarDatosProducto() {
        DefaultTableModel modelo = new DefaultTableModel();
        jTableProductos.setModel(modelo);

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio costo");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Fecha ingreso");
        modelo.addColumn("Código");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Tipo");

        String[] datos = new String[10];
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            Statement leer = (Statement) con.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM productos");

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                datos[8] = resultado.getString(9);
                datos[9] = resultado.getString(10);

                modelo.addRow(datos);
            }
            jTableProductos.setModel(modelo);
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error en la consulta.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
        }

    }

    private void ActualizarStock() {
        // Actualizar

        int StockActual;
        String Cod = cod.getText();
        int Cant = Integer.parseInt(Nstock.getText());
        StockActual = Integer.parseInt(StockA.getText());

        StockActual = pro.getCantidad() + Cant;
        proDao.ActualizarStock(StockActual, Cod);
        mostrarDatosProducto();
        /*int Cant = 0;
        String Cod = cod.getText();
        Cant = Integer.parseInt(Nstock.getText());
        int StockA = pro.getCantidad() + Cant;

        proDao.ActualizarStock(StockA, Cod);
        mostrarDatosProducto();*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Nstock;
    private javax.swing.JTextField StockA;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField descripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableProductos;
    // End of variables declaration//GEN-END:variables
}
