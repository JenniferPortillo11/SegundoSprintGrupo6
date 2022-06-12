/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.Conexion;
import CLASES.usuarios;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mysql.jdbc.Statement;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jennifer Portillo
 */
public class FormConsultaProveedor extends javax.swing.JFrame {

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

    public FormConsultaProveedor() {
        initComponents();
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
        mostrarDatosProveedores();

    }
    String path2 = "src/IMG/";

    public Icon icono(String path2, int width, int heigth) {

        Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }

    //Para mostrar los datos automaticamente
    public void mostrarDatosProveedores() {
        DefaultTableModel modelo = new DefaultTableModel();
        jtProveedores.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("NIT");
        modelo.addColumn("Nombre comercial");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Fecha de ingreso");

        String[] datos = new String[8];
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            Statement leer = (Statement) con.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM proveedores");

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);

                modelo.addRow(datos);
            }
            jtProveedores.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }

    //Boton modificar
    public void actualizardatos() {
        int fila = jtProveedores.getSelectedRow();

        String nit = jtProveedores.getValueAt(fila, 0).toString();
        String nombre_comercial = jtProveedores.getValueAt(fila, 1).toString();
        String nombre = jtProveedores.getValueAt(fila, 2).toString();
        String apellido = jtProveedores.getValueAt(fila, 3).toString();
        String direccion = jtProveedores.getValueAt(fila, 4).toString();
        String telefono = jtProveedores.getValueAt(fila, 5).toString();
        String fecha = jtProveedores.getValueAt(fila, 6).toString();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        try {
            PreparedStatement actu = con.prepareStatement("UPDATE proveedores SET nombre= '" + nombre + "', apellido = '" + apellido + "', telefono = '" + telefono + "' WHERE NIT = '" + nit + "'");
            actu.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro eliminado ha sido actualizado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            mostrarDatosProveedores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro  no pudo ser actualizado.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProveedores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtcampo = new javax.swing.JTextField();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnPDF = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de proveedores - Gym Sport Center");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Consulta de proveedores");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 610, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1033, 6, 100, 100);

        jScrollPane2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jtProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NIT", "Nombre comercial", "Nombre", "Apellido", "Dirección", "Teléfono", "Fecha de ingreso"
            }
        ));
        jScrollPane2.setViewportView(jtProveedores);

        jTabbedPane1.addTab("Proveedores", jScrollPane2);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 160, 1163, 250);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Proveedor");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 120, 100, 23);

        txtcampo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(txtcampo);
        txtcampo.setBounds(208, 112, 302, 34);

        BtnModificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Modificar.png"))); // NOI18N
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnModificar);
        BtnModificar.setBounds(760, 110, 120, 34);

        BtnEliminar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar);
        BtnEliminar.setBounds(644, 112, 110, 34);

        BtnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar);
        BtnBuscar.setBounds(528, 112, 101, 34);

        BtnPDF.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pdf.png"))); // NOI18N
        BtnPDF.setText("Reporte");
        BtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPDFActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPDF);
        BtnPDF.setBounds(889, 110, 110, 34);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/proveedores.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(700, 10, 64, 64);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // Eliminar un registro
        eliminar();

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // Boton para buscar un proveedor pormedio de su nombre comercial
        String campo = txtcampo.getText();
        String where = " ";
        if (!"".equals(campo)) {
            where = "WHERE nombre_comercial = '" + campo + "'";

            if (txtcampo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
            } else {
                try {

                    DefaultTableModel modelo = new DefaultTableModel();
                    jtProveedores.setModel(modelo);

                    PreparedStatement ps = null;
                    ResultSet rs = null;
                    Conexion conn = new Conexion();
                    Connection con = conn.getConexion();

                    String sql = "SELECT idproveedores, nit, nombre_comercial, nombre, apellido, direccion, telefono, fecha_ingreso FROM proveedores " + where;
                    System.out.println(sql);
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();

                    ResultSetMetaData rsMd = rs.getMetaData();
                    int cantidadColumnas = rsMd.getColumnCount();
                    modelo.addColumn("ID");
                    modelo.addColumn("NIT");
                    modelo.addColumn("Nombre comercial");
                    modelo.addColumn("Nombre");
                    modelo.addColumn("Apellido");
                    modelo.addColumn("Dirección");
                    modelo.addColumn("Teléfono");
                    modelo.addColumn("Fecha ingreso");

                    while (rs.next()) {

                        Object[] filas = new Object[cantidadColumnas];

                        for (int i = 0; i < cantidadColumnas; i++) {
                            filas[i] = rs.getObject(i + 1);
                        }

                        modelo.addRow(filas);

                    }
                    JOptionPane.showMessageDialog(null, "No hay datos existentes con el código "+campo, "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Datos ingresados incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));

                }
            }
        } 
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        // actualizar datos
        actualizardatos();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPDFActionPerformed
        PdfReporteCli();
    }//GEN-LAST:event_BtnPDFActionPerformed

    //Para eliminar datos seleccionando una fila de la tabla
    public void eliminar() {
        int fila = jtProveedores.getSelectedRow();
        String valor = jtProveedores.getValueAt(fila, 0).toString();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        if (fila >= 0) {
            try {
                ps = con.prepareStatement("DELETE FROM proveedores WHERE idproveedores = '" + valor + " ' ");
                ps.executeUpdate();
                mostrarDatosProveedores();
                JOptionPane.showMessageDialog(null, "El registro ha sido eliminado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "El registro  no pudo ser eliminado.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
            }
        }
    }

    //rEPORTES
    public void PdfReporteCli() {
        try {
            FileOutputStream archivo;
            File file = new File("src/ReportesPDF/ReporteTotalProveedores.pdf");
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
            String fact = "REPORTE DE PROVEEDORES";
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
            cli.add("Datos de los proveedores" + "\n\n");
            docu.add(cli);

            //Tabla clientes
            PdfPTable tabla = new PdfPTable(8);
            tabla.setWidthPercentage(100);
            tabla.getDefaultCell().setBorder(0);
            float[] ColumnaCli = new float[]{10f, 45f, 35f, 35f, 30f, 40f, 40f, 40f};
            tabla.setWidths(ColumnaCli);
            tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl11 = new PdfPCell(new Phrase("ID", negrita));
            PdfPCell cl12 = new PdfPCell(new Phrase("NIT", negrita));
            PdfPCell cl13 = new PdfPCell(new Phrase("Nombre c.", negrita));
            PdfPCell cl14 = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell cl15 = new PdfPCell(new Phrase("Apellido", negrita));
            PdfPCell cl16 = new PdfPCell(new Phrase("Dirección", negrita));
            PdfPCell cl17 = new PdfPCell(new Phrase("Teléfono", negrita));
            PdfPCell cl18 = new PdfPCell(new Phrase("Fecha", negrita));

            cl11.setBorder(0);
            cl12.setBorder(0);
            cl13.setBorder(0);
            cl14.setBorder(0);
            cl15.setBorder(0);
            cl16.setBorder(0);
            cl17.setBorder(0);
            cl18.setBorder(0);

            cl11.setBackgroundColor(BaseColor.DARK_GRAY);
            cl12.setBackgroundColor(BaseColor.DARK_GRAY);
            cl13.setBackgroundColor(BaseColor.DARK_GRAY);
            cl14.setBackgroundColor(BaseColor.DARK_GRAY);
            cl15.setBackgroundColor(BaseColor.DARK_GRAY);
            cl16.setBackgroundColor(BaseColor.DARK_GRAY);
            cl17.setBackgroundColor(BaseColor.DARK_GRAY);
            cl18.setBackgroundColor(BaseColor.DARK_GRAY);

            tabla.addCell(cl11);
            tabla.addCell(cl12);
            tabla.addCell(cl13);
            tabla.addCell(cl14);
            tabla.addCell(cl15);
            tabla.addCell(cl16);
            tabla.addCell(cl17);
            tabla.addCell(cl18);

            try {
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps = con.prepareStatement("SELECT * FROM proveedores");

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));

                    } while (rs.next());
                    docu.add(tabla);
                }

            } catch (DocumentException | SQLException e) {
            }

            docu.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            archivo.close();
            Desktop.getDesktop().open(file);
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException ex) {
            Logger.getLogger(FormConsultaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jtProveedores;
    private javax.swing.JTextField txtcampo;
    // End of variables declaration//GEN-END:variables
}
