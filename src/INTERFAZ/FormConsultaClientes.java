/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.Conexion;
import CLASES.usuarios;
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

//reporte
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Toolkit;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Desktop;
import java.awt.HeadlessException;

import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import javax.swing.Icon;

/**
 *
 * @author Jennifer Portillo
 */
public class FormConsultaClientes extends javax.swing.JFrame {

    usuarios mod;
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

    public FormConsultaClientes() {
        initComponents();
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
        mostrarDatosCliente();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        txtcampo = new javax.swing.JTextField();
        BtnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnPDF = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de clientes - Gym Sport Center");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Consulta de clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 510, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(910, 10, 100, 100);

        jtClientes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Dirección", "Teléfono", "Código gym"
            }
        ));
        jScrollPane1.setViewportView(jtClientes);

        jTabbedPane1.addTab("Clientes", jScrollPane1);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(70, 180, 900, 220);

        btnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);
        btnEliminar.setBounds(590, 130, 110, 34);

        txtcampo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(txtcampo);
        txtcampo.setBounds(147, 133, 302, 34);

        BtnModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Modificar.png"))); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar);
        BtnModificar.setBounds(710, 130, 115, 34);

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(480, 130, 101, 34);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Cliente:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 140, 80, 23);

        BtnPDF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pdf.png"))); // NOI18N
        BtnPDF.setText("Reporte");
        BtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPDFActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPDF);
        BtnPDF.setBounds(830, 130, 110, 34);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cliente (1).png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(690, 20, 64, 80);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Para mostrar los datos automaticamente
    public void mostrarDatosCliente() {
        DefaultTableModel modelo = new DefaultTableModel();
        jtClientes.setModel(modelo);

        modelo.addColumn("ID");

        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Código gym");

        String[] datos = new String[6];
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            Statement leer = (Statement) con.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM clientes");

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);

                modelo.addRow(datos);
            }
            jtClientes.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }

    //Para eliminar datos seleccionando una fila de la tabla
    public void eliminar() {
        int fila = jtClientes.getSelectedRow();
        String valor = jtClientes.getValueAt(fila, 0).toString();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        try {

            ps = con.prepareStatement("DELETE FROM clientes WHERE idclientes = '" + valor + " ' ");
            ps.executeUpdate();
            mostrarDatosCliente();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no pudo ser eliminado", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
        }
    }

    //Boton modificar
    public void actualizardatos() {
        int fila = jtClientes.getSelectedRow();

        int idclientes = Integer.parseInt(this.jtClientes.getValueAt(fila, 0).toString());
        String nombre = jtClientes.getValueAt(fila, 1).toString();
        String apellido = jtClientes.getValueAt(fila, 2).toString();
        String telefono = jtClientes.getValueAt(fila, 4).toString();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            PreparedStatement actu = con.prepareStatement("UPDATE clientes SET nombre= '" + nombre + "', apellido = '" + apellido + "', telefono = '" + telefono + "' WHERE idClientes = '" + idclientes + "'");
            actu.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro actualizado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            mostrarDatosCliente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no pudo ser actualizado", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
        }

    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //BOTON BUSCAR

        String campo = txtcampo.getText();
        String where = " ";
        if (!"".equals(campo)) {
            where = "WHERE cod_gym = '" + campo + "'";
        }
        if (txtcampo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {

                DefaultTableModel modelo = new DefaultTableModel();
                jtClientes.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                Conexion conn = new Conexion();
                Connection con = conn.getConexion();

                String sql = "SELECT idClientes, nombre, apellido, direccion, telefono, cod_gym FROM clientes " + where;
                System.out.println(sql);
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("ID");

                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido");
                modelo.addColumn("Dirección");
                modelo.addColumn("Teléfono");
                modelo.addColumn("Código gym");

                while (rs.next()) {

                    Object[] filas = new Object[cantidadColumnas];

                    for (int i = 0; i < cantidadColumnas; i++) {
                        filas[i] = rs.getObject(i + 1);
                    }

                    modelo.addRow(filas);

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No hay datos existentes.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));

            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //boton eliminar
        eliminar();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // boton modificar
        actualizardatos();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPDFActionPerformed
        // TODO add your handling code here:
        PdfReporteCli();
    }//GEN-LAST:event_BtnPDFActionPerformed

    public void PdfReporteCli() {
        try {
            FileOutputStream archivo;
            File file = new File("src/ReportesPDF/ReporteTotalClientes.pdf");
            archivo = new FileOutputStream(file);
            Document docu = new Document();
            PdfWriter.getInstance(docu, archivo);
            docu.open();

            //encabezadp
            com.itextpdf.text.Image logo = com.itextpdf.text.Image.getInstance("src/IMG/100x1000.png");
            Paragraph fech = new Paragraph();
            Font negrita = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);

            fech.add(Chunk.NEWLINE);
            Date date = new Date();
            fech.add(" Fecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(logo);
            String fact = "REPORTE DE CLIENTES";
            String Nombre = "GYM SPORT CENTER";
            String tele = "2654-1541";
            String correo = "gymSport.208@gmail.com";
            String Dir = "San Francisco Gotera, Morazán";

            Encabezado.addCell("");

            Encabezado.addCell(fact + "\n\nNombre: " + Nombre + "\n\nTeléfono: " + tele + "\n\nCorreo: " + correo + "\n\nDireción: " + Dir);

            Encabezado.addCell(fech);
            docu.add(Encabezado);

            //Para clientes-datos del cliente
            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos de los clientes" + "\n\n");
            docu.add(cli);

            //Tabla clientes
            PdfPTable tabla = new PdfPTable(6);
            tabla.setWidthPercentage(100);
            tabla.getDefaultCell().setBorder(0);
            float[] ColumnaCli = new float[]{10f, 30f, 30f, 40f, 30, 20};
            tabla.setWidths(ColumnaCli);
            tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl11 = new PdfPCell(new Phrase("ID", negrita));
            PdfPCell cl12 = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell cl13 = new PdfPCell(new Phrase("Apellido", negrita));
            PdfPCell cl14 = new PdfPCell(new Phrase("Dirección", negrita));
            PdfPCell cl15 = new PdfPCell(new Phrase("Teléfo", negrita));
            PdfPCell cl16 = new PdfPCell(new Phrase("Código", negrita));

            cl11.setBorder(0);
            cl12.setBorder(0);
            cl13.setBorder(0);
            cl14.setBorder(0);
            cl15.setBorder(0);
            cl16.setBorder(0);

            cl11.setBackgroundColor(BaseColor.DARK_GRAY);
            cl12.setBackgroundColor(BaseColor.DARK_GRAY);
            cl13.setBackgroundColor(BaseColor.DARK_GRAY);
            cl14.setBackgroundColor(BaseColor.DARK_GRAY);
            cl15.setBackgroundColor(BaseColor.DARK_GRAY);
            cl16.setBackgroundColor(BaseColor.DARK_GRAY);

            tabla.addCell(cl11);
            tabla.addCell(cl12);
            tabla.addCell(cl13);
            tabla.addCell(cl14);
            tabla.addCell(cl15);
            tabla.addCell(cl16);

            try {
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps = con.prepareStatement("SELECT * FROM clientes");

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));

                    } while (rs.next());
                    docu.add(tabla);
                }

            } catch (DocumentException | SQLException e) {
            }

            docu.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            archivo.close();
            Desktop.getDesktop().open(file);
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException ex) {
            Logger.getLogger(FormConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnPDF;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField txtcampo;
    // End of variables declaration//GEN-END:variables

}
