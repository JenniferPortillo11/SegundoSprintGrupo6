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
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Jennifer Portillo
 */
public class FormConsultaProductos extends javax.swing.JFrame {

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

    public FormConsultaProductos() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarDatosProducto();
        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
    }

    @SuppressWarnings("unchecked")
    String path2 = "src/IMG/";

    public Icon icono(String path2, int width, int heigth) {

        Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BtnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de productos - Gym Sport Center");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Consulta de productos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 590, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(930, 10, 100, 100);

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
        jTabbedPane1.setBounds(50, 174, 960, 230);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Productos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 90, 23);

        txtCampo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(txtCampo);
        txtCampo.setBounds(124, 122, 400, 34);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnEliminar);
        BtnEliminar.setBounds(660, 120, 101, 34);

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnBuscar);
        BtnBuscar.setBounds(540, 120, 101, 34);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/inventario (2).png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(710, 10, 64, 64);

        BtnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pdf.png"))); // NOI18N
        BtnReporte.setText("Reporte");
        BtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReporte);
        BtnReporte.setBounds(780, 120, 101, 34);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Para mostrar los datos automaticamente

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
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }

    //Para eliminar datos seleccionando una fila de la tabla
    public void eliminar() {
        int fila = jTableProductos.getSelectedRow();
        String valor = jTableProductos.getValueAt(fila, 0).toString();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();
        try {

            ps = con.prepareStatement("DELETE FROM productos WHERE idproductos = '" + valor + " ' ");
            ps.executeUpdate();
            mostrarDatosProducto();
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no pudo ser eliminado", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
        }
    }
    private void BtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteActionPerformed
        // TODO add your handling code here:
        PdfReporteCli();
    }//GEN-LAST:event_BtnReporteActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        //BOTON BUSCAR

        String campo = txtCampo.getText();
        String where = " ";
        if (!"".equals(campo)) {
            where = "WHERE cod_producto = '" + campo + "'";
        }
        if (txtCampo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {

                DefaultTableModel modelo = new DefaultTableModel();
                jTableProductos.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                Conexion conn = new Conexion();
                Connection con = conn.getConexion();

                String sql = "SELECT idproductos, nombre, decripcion, cantidad, precio_costo, precio_venta, fecha_ingreso, cod_producto, proveedor, tipo FROM productos " + where;
                System.out.println(sql);
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

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
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_BtnEliminarActionPerformed
    public void PdfReporteCli() {
        try {
            FileOutputStream archivo;
            File file = new File("src/ReportesPDF/ReporteTotalProductos.pdf");
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
            String fact = "REPORTE DE Productos";
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
            cli.add("Datos de los productos" + "\n\n");
            docu.add(cli);

            //Tabla clientes
            PdfPTable tabla = new PdfPTable(10);
            tabla.setWidthPercentage(100);
            tabla.getDefaultCell().setBorder(0);
            float[] ColumnaCli = new float[]{15f, 40f, 45f, 30f, 30f, 35f, 45f, 25f, 40f, 30f};
            tabla.setWidths(ColumnaCli);
            tabla.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell cl11 = new PdfPCell(new Phrase("ID", negrita));
            PdfPCell cl12 = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell cl13 = new PdfPCell(new Phrase("Descripción", negrita));
            PdfPCell cl14 = new PdfPCell(new Phrase("Cantidad", negrita));
            PdfPCell cl15 = new PdfPCell(new Phrase("Precio c.", negrita));
            PdfPCell cl16 = new PdfPCell(new Phrase("Precio v.", negrita));
            PdfPCell cl17 = new PdfPCell(new Phrase("Fecha", negrita));
            PdfPCell cl18 = new PdfPCell(new Phrase("Cod", negrita));
            PdfPCell cl19 = new PdfPCell(new Phrase("Proveedor", negrita));
            PdfPCell cl110 = new PdfPCell(new Phrase("Tipo", negrita));

            cl11.setBorder(0);
            cl12.setBorder(0);
            cl13.setBorder(0);
            cl14.setBorder(0);
            cl15.setBorder(0);
            cl16.setBorder(0);
            cl17.setBorder(0);
            cl18.setBorder(0);
            cl19.setBorder(0);
            cl110.setBorder(0);

            cl11.setBackgroundColor(BaseColor.DARK_GRAY);
            cl12.setBackgroundColor(BaseColor.DARK_GRAY);
            cl13.setBackgroundColor(BaseColor.DARK_GRAY);
            cl14.setBackgroundColor(BaseColor.DARK_GRAY);
            cl15.setBackgroundColor(BaseColor.DARK_GRAY);
            cl16.setBackgroundColor(BaseColor.DARK_GRAY);
            cl17.setBackgroundColor(BaseColor.DARK_GRAY);
            cl18.setBackgroundColor(BaseColor.DARK_GRAY);
            cl19.setBackgroundColor(BaseColor.DARK_GRAY);
            cl110.setBackgroundColor(BaseColor.DARK_GRAY);

            tabla.addCell(cl11);
            tabla.addCell(cl12);
            tabla.addCell(cl13);
            tabla.addCell(cl14);
            tabla.addCell(cl15);
            tabla.addCell(cl16);
            tabla.addCell(cl17);
            tabla.addCell(cl18);
            tabla.addCell(cl19);
            tabla.addCell(cl110);

            try {
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps = con.prepareStatement("SELECT * FROM productos");

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
                        tabla.addCell(rs.getString(9));
                        tabla.addCell(rs.getString(10));

                    } while (rs.next());
                    docu.add(tabla);
                }

            } catch (DocumentException | SQLException e) {
            }

            docu.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
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
    private javax.swing.JButton BtnReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables
}
