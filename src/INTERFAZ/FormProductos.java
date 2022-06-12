/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import javax.swing.ImageIcon;
import CLASES.Conexion;
import CLASES.usuarios;
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

/**
 *
 * @author Jennifer Portillo
 */
public class FormProductos extends javax.swing.JFrame {

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

    public FormProductos() {
        initComponents();
        COD.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        nombreP = new javax.swing.JTextField();
        PrecioC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PrecioV = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        Proveedor = new javax.swing.JTextField();
        COD = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Nuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de productos-Gym Sport Center");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(980, 10, 100, 110);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setText("Registro de productos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 530, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(11, 37, 90, 23);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Precio costo:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(11, 101, 115, 23);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Descripción:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(350, 70, 120, 25);

        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Descripcion.setRows(5);
        jScrollPane2.setViewportView(Descripcion);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(480, 60, 230, 55);

        nombreP.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePActionPerformed(evt);
            }
        });
        nombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrePKeyTyped(evt);
            }
        });
        jPanel2.add(nombreP);
        nombreP.setBounds(140, 40, 180, 30);

        PrecioC.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel2.add(PrecioC);
        PrecioC.setBounds(140, 100, 180, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Tipo: ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(11, 208, 46, 23);

        jComboBoxTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Bebida", "Proteína", "Artículo deportivo" }));
        jPanel2.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(140, 210, 180, 30);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Cantidad:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(350, 150, 90, 23);

        Cantidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });
        jPanel2.add(Cantidad);
        Cantidad.setBounds(480, 150, 234, 30);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Proveedor:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(350, 200, 97, 23);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Precio venta:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(11, 154, 116, 23);

        PrecioV.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel2.add(PrecioV);
        PrecioV.setBounds(140, 150, 180, 30);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Fecha ingreso");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(170, 270, 126, 23);
        jPanel2.add(jDateChooserFecha);
        jDateChooserFecha.setBounds(310, 270, 170, 30);

        Proveedor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProveedorKeyTyped(evt);
            }
        });
        jPanel2.add(Proveedor);
        Proveedor.setBounds(480, 200, 234, 30);

        COD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODActionPerformed(evt);
            }
        });
        jPanel2.add(COD);
        COD.setBounds(590, 20, 5, 19);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(32, 76, 760, 320);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(null);

        Nuevo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo.png"))); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        jPanel3.add(Nuevo);
        Nuevo.setBounds(25, 50, 110, 34);

        BtnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Guardar.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnGuardar);
        BtnGuardar.setBounds(25, 129, 110, 34);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(800, 80, 160, 210);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/inventario (2).png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(680, 0, 64, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // Guardar producto
        Connection con = null;
        if (nombreP.getText().equals("") || Descripcion.getText().equals("") || Cantidad.getText().equals("") || PrecioV.getText().equals("") || PrecioC.getText().equals("") || jDateChooserFecha.getDate().equals("") || COD.getText().equals("") || Proveedor.getText().equals("") || jComboBoxTipo.getSelectedItem().toString().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO productos (nombre, decripcion, cantidad, precio_costo, precio_venta, fecha_ingreso, cod_producto, proveedor, tipo) VALUES(?,?,?,?,?,?,?,?,?)");

                ps.setString(1, nombreP.getText());//2
                ps.setString(2, Descripcion.getText());//2
                ps.setString(3, Cantidad.getText());//3
                ps.setString(4, PrecioC.getText());//3
                ps.setString(5, PrecioV.getText());//3
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = sdf.format(jDateChooserFecha.getDate());
                ps.setString(6, fecha);

                ps.setString(7, COD.getText());
                ps.setString(8, Proveedor.getText());//3
                ps.setString(9, jComboBoxTipo.getSelectedItem().toString());

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "El registro  ha sido almacenado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));

                } else {
                    JOptionPane.showMessageDialog(null, "El registro  no pudo ser almacenado.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));

                }

                con.close();

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed


    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // Nuevo producto
        PrecioC.setText(null);
        nombreP.setText(null);
        Descripcion.setText(null);
        PrecioV.setText(null);
        Proveedor.setText(null);
        jDateChooserFecha.setCalendar(null);

        jComboBoxTipo.setSelectedIndex(0);
        Cantidad.setText(null);
    }//GEN-LAST:event_NuevoActionPerformed

    private void CODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODActionPerformed
        // TODO add your handling code here:
        COD.setVisible(false);
    }//GEN-LAST:event_CODActionPerformed

    private void nombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePActionPerformed

    private void nombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombrePKeyTyped

    private void ProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProveedorKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_ProveedorKeyTyped

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_CantidadKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JTextField COD;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField PrecioC;
    private javax.swing.JTextField PrecioV;
    private javax.swing.JTextField Proveedor;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nombreP;
    // End of variables declaration//GEN-END:variables
}
