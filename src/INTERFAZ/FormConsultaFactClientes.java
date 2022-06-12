/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.Conexion;
import com.mysql.jdbc.Statement;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;

public class FormConsultaFactClientes extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private final String URL = "jdbc:mysql://localhost:3306/base-gym ?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private final String USER = "root";
    private final String PASSWORD = "root";
    Connection con = null;

    public Connection getConexion() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public FormConsultaFactClientes() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatosFACTCliente();
        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage());
    }

    String path2 = "src/IMG/";

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
        txtcampo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFact = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de factura de clientes - Gym Sport Center");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Consultas de factura ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 40, 500, 40);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código de la factura:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 120, 189, 23);

        txtcampo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(txtcampo);
        txtcampo.setBounds(300, 119, 240, 30);

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(590, 120, 101, 34);

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(700, 120, 110, 34);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(880, 10, 100, 110);

        jtFact.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jtFact);

        jTabbedPane1.addTab("Facturas", jScrollPane1);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 180, 950, 290);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/facturacion.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 30, 64, 64);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Para mostrar los datos automaticamente

    public void mostrarDatosFACTCliente() {
        DefaultTableModel modelo = new DefaultTableModel();
        jtFact.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Número de factura");
        modelo.addColumn("Fecha de pago");
        modelo.addColumn("Fecha de vigencia");
        modelo.addColumn("Inscripción");
        modelo.addColumn("Total");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Código gym");

        String[] datos = new String[10];
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            Statement leer = (Statement) con.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM factura_clientes");

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
            jtFact.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }
    //Para eliminar datos seleccionando una fila de la tabla

    public void eliminar() {
        int fila = jtFact.getSelectedRow();
        String valor = jtFact.getValueAt(fila, 0).toString();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        try {

            ps = con.prepareStatement("DELETE FROM factura_clientes WHERE idfactura = '" + valor + " ' ");
            ps.executeUpdate();
            mostrarDatosFACTCliente();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no pudo ser eliminado", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
        }
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //BOTON BUSCAR

        String campo = txtcampo.getText();
        String where = " ";
        if (!"".equals(campo)) {
            where = "WHERE num_fact = '" + campo + "'";
        }
        if (txtcampo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {

                DefaultTableModel modelo = new DefaultTableModel();
                jtFact.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                Conexion conn = new Conexion();
                Connection con = conn.getConexion();

                String sql = "SELECT idfactura, num_fact, fecha_pago, fecha_vigencia, cuota, total, nombre, apellido, telefono, cod_gym FROM factura_clientes " + where;
                System.out.println(sql);
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("ID");
                modelo.addColumn("Número de factura");
                modelo.addColumn("Fecha de pago");
                modelo.addColumn("Fecha de vigencia");
                modelo.addColumn("Inscripción");
                modelo.addColumn("Total");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Código gym");

                while (rs.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }

                    modelo.addRow(filas);

                }
                JOptionPane.showMessageDialog(null, "No hay datos existentes con el código " + campo, "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Datos ingresados incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));

            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //boton eliminar
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtFact;
    private javax.swing.JTextField txtcampo;
    // End of variables declaration//GEN-END:variables
}
