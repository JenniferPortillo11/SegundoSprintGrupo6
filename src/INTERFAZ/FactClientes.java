/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import javax.swing.ImageIcon;
import CLASES.Conexion;
import CLASES.FDao;
import CLASES.Fclientes;
import CLASES.FclientesSql;
import CLASES.usuarios;
import javax.swing.ImageIcon;

import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Toolkit;
import com.itextpdf.text.Image;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.awt.Desktop;

import java.awt.Toolkit;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
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

public class FactClientes extends javax.swing.JFrame {

    private static final String url = "jdbc:mysql://localhost:3306/base-gym?characterEncoding=utf8";
    private static final String user = "root";
    private static final String password = "root";
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.print(e);

        }

        return con;
    }

    public FactClientes() {
        initComponents();
        setLocationRelativeTo(null);
        numero.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
        jComboBoxTipo.addItem("Seleccionar...");
        jComboBoxTipo.addItem("Diaria");
        jComboBoxTipo.addItem("Semanal");
        jComboBoxTipo.addItem("Mensual");

    }
    FDao Fdao = new FDao();

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
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        numero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        fecha_vigencia = new com.toedter.calendar.JDateChooser();
        fecha_pago = new com.toedter.calendar.JDateChooser();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        BtnNuevo = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura de clientes - Gym Sport Center");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1000, 10, 100, 100);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setText("Factura de clientes");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 470, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Factura 64x64.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(630, 20, 80, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura de clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Código gym");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(30, 40, 120, 23);

        codigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel4.add(codigo);
        codigo.setBounds(150, 40, 100, 30);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Teléfono");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(390, 90, 100, 23);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Apellido");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(30, 90, 120, 23);

        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Buscar cliente");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscar);
        btnBuscar.setBounds(260, 40, 100, 30);
        jPanel4.add(numero);
        numero.setBounds(720, 30, 10, 19);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(390, 40, 80, 23);

        apellido.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        jPanel4.add(apellido);
        apellido.setBounds(150, 90, 210, 30);

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel4.add(nombre);
        nombre.setBounds(482, 40, 226, 30);

        tel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel4.add(tel);
        tel.setBounds(482, 88, 226, 34);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 20, 750, 150);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel5.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Total");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(460, 110, 70, 23);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Fecha de pago");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 40, 140, 30);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setText("Fecha de vigencia");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(350, 40, 180, 23);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Tipo");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(90, 110, 60, 23);

        total.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel5.add(total);
        total.setBounds(530, 110, 180, 30);
        jPanel5.add(fecha_vigencia);
        fecha_vigencia.setBounds(530, 40, 180, 30);
        jPanel5.add(fecha_pago);
        fecha_pago.setBounds(160, 40, 180, 30);

        jComboBoxTipo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoItemStateChanged(evt);
            }
        });
        jPanel5.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(160, 110, 180, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 170, 750, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 110, 770, 340);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(null);

        BtnNuevo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo.png"))); // NOI18N
        BtnNuevo.setText("Nuevo");
        BtnNuevo.setToolTipText("Nuevo registro");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(BtnNuevo);
        BtnNuevo.setBounds(30, 50, 130, 35);

        BtnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Guardar.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.setToolTipText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(BtnGuardar);
        BtnGuardar.setBounds(30, 120, 130, 35);

        BtnReporte.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pdf.png"))); // NOI18N
        BtnReporte.setText("Reporte");
        BtnReporte.setToolTipText("Generar reporte");
        BtnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReporteActionPerformed(evt);
            }
        });
        jPanel3.add(BtnReporte);
        BtnReporte.setBounds(30, 190, 130, 36);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(820, 110, 190, 270);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = null;
            con = getConection();
            ps = con.prepareStatement("Select * FROM clientes WHERE cod_gym = ?");
            ps.setString(1, codigo.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                codigo.setText(rs.getString("cod_gym"));
                nombre.setText(rs.getString("nombre"));
                apellido.setText(rs.getString("apellido"));
                tel.setText(rs.getString("telefono"));

            } else {
                JOptionPane.showMessageDialog(null, "No hay datos existentes", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jComboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoItemStateChanged
        // COMBOBOX
        String Cuota = (String) jComboBoxTipo.getSelectedItem();
        if (Cuota.equals("Seleccionar...")) {
            total.setText(null);
        }
        if (Cuota.equals("Diaria")) {
            total.setText("2.00");
        }
        if (Cuota.equals("Quincenal")) {
            total.setText("8.50");
        }
        if (Cuota.equals("Mensual")) {
            total.setText("17.00");
        }


    }//GEN-LAST:event_jComboBoxTipoItemStateChanged

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        // Limpiar
        nombre.setText(null);
        numero.setText(null);
        tel.setText(null);
        total.setText(null);
        fecha_pago.setCalendar(null);
        fecha_vigencia.setCalendar(null);
        jComboBoxTipo.setSelectedIndex(0);
        apellido.setText(null);
        codigo.setText(null);
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReporteActionPerformed
        // TODO add your handling code here:
        PDFClientes();
    }//GEN-LAST:event_BtnReporteActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        /*Fclientes modelo = new Fclientes();
        FclientesSql modSql = new FclientesSql();
        //verificar campos vacios
        if (codigo.getText().equals("") || (nombre.getText().equals("")) || (apellido.getText().equals("")) || tel.getText().equals("") || fecha_pago.getDate().equals("") || fecha_vigencia.getDate().equals("") || jComboBoxTipo.getSelectedItem().toString().equals("") || total.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            if (modSql.existeUsuario(codigo.getText()) == 0) {
                try { //Validar que un usuario ya este ingresado 

                    String nuevoPass = null;
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    modelo.setCod_gym(codigo.getText());
                    modelo.setNombre(nombre.getText());
                    modelo.setApellido(apellido.getText());
                    modelo.setTelefono(tel.getText());
                    String fecha = sdf.format(fecha_pago.getDate());
                    String fech2 = sdf.format(fecha_vigencia.getDate());
                    modelo.setFecha_pago(fecha_pago.getDate());
                    modelo.setFecha_vigencia(fecha_vigencia.getDate());
                    modelo.setCuota(jComboBoxTipo.getSelectedItem().toString());
                    modelo.setTotal(Float.parseFloat(total.getText()));
                    modelo.setIdfactura(1);
                    if (modSql.registrar(modelo)) {
                        JOptionPane.showMessageDialog(null, "Registro almacenado", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40)); //Aca nos enviara un mensaje en el que nos confirmara que se guardo el registro

                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo almacenar el registro", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40)); //Aca nos avisa que no se pudo almacenar y mientras el programa no sea un ejecutable mostrara el error en consola

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este registro ya existe", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
            }
        }*/

        Connection con = null;
        if (codigo.getText().equals("") || (nombre.getText().equals("")) || (apellido.getText().equals("")) || tel.getText().equals("") || fecha_pago.getDate().equals("") || fecha_vigencia.getDate().equals("") || jComboBoxTipo.getSelectedItem().toString().equals("") || total.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO factura_clientes (num_fact, fecha_pago, fecha_vigencia, cuota, total, nombre, apellido, telefono, cod_gym) VALUES(?,?,?,?,?,?,?,?,?)");

                ps.setString(1, numero.getText());//2

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = sdf.format(fecha_pago.getDate());
                String fecha2 = sdf.format(fecha_vigencia.getDate());
                ps.setString(2, fecha);
                ps.setString(3, fecha2);

                ps.setString(4, jComboBoxTipo.getSelectedItem().toString());//3
                ps.setString(5, total.getText());//3
                ps.setString(6, nombre.getText());//3
                ps.setString(7, apellido.getText());//3
                ps.setString(8, tel.getText());//3
                ps.setString(9, codigo.getText());//3
                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "El registro ha sido almacenado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));

                } else {
                    JOptionPane.showMessageDialog(null, "El registro  no pudo ser almacenado.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
                }

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_apellidoKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_nombreKeyTyped

    //CREAR REPORTE
    private void PDFClientes() {
        if (codigo.getText().equals("") || (nombre.getText().equals("")) || (apellido.getText().equals("")) || tel.getText().equals("") || fecha_pago.getDate().equals("") || fecha_vigencia.getDate().equals("") || jComboBoxTipo.getSelectedItem().toString().equals("") || total.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {

                FileOutputStream archivo;
                
                File file = new File("src/ReportesPDF/Clientes.pdf");
                archivo = new FileOutputStream(file);
                Document docu = new Document();
                PdfWriter.getInstance(docu, archivo);
                docu.open();

                Image logo = Image.getInstance("src/IMG/100x1000.png");
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
                String fact = "FACTURA DE CLIENTES";
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
                cli.add("Datos del cliente" + "\n\n");
                docu.add(cli);

                PdfPTable tablaCli = new PdfPTable(4);
                tablaCli.setWidthPercentage(100);
                tablaCli.getDefaultCell().setBorder(0);
                float[] ColumnaCli = new float[]{20f, 50f, 30f, 40f};
                tablaCli.setWidths(ColumnaCli);
                tablaCli.setHorizontalAlignment(Element.ALIGN_LEFT);
                PdfPCell cl11 = new PdfPCell(new Phrase("Código", negrita));
                PdfPCell cl12 = new PdfPCell(new Phrase("Nombre", negrita));
                PdfPCell cl13 = new PdfPCell(new Phrase("Apellido", negrita));
                PdfPCell cl14 = new PdfPCell(new Phrase("Teléfono", negrita));

                cl11.setBorder(0);
                cl12.setBorder(0);
                cl13.setBorder(0);
                cl14.setBorder(0);

                cl11.setBackgroundColor(BaseColor.DARK_GRAY);
                cl12.setBackgroundColor(BaseColor.DARK_GRAY);
                cl13.setBackgroundColor(BaseColor.DARK_GRAY);
                cl14.setBackgroundColor(BaseColor.DARK_GRAY);

                tablaCli.addCell(cl11);
                tablaCli.addCell(cl12);
                tablaCli.addCell(cl13);
                tablaCli.addCell(cl14);

                tablaCli.addCell(codigo.getText());
                tablaCli.addCell(nombre.getText());
                tablaCli.addCell(apellido.getText());
                tablaCli.addCell(tel.getText());

                docu.add(tablaCli);

                Paragraph SALTO = new Paragraph();
                SALTO.add(Chunk.NEWLINE);
                docu.add(SALTO);
                //Para la cuota
                Paragraph Cuota = new Paragraph();
                Cuota.add(Chunk.NEWLINE);
                Cuota.add("Datos de la inscripción" + "\n\n");
                Cuota.add(Cuota);

                PdfPTable tablaCuo = new PdfPTable(4);
                tablaCuo.setWidthPercentage(100);
                tablaCuo.getDefaultCell().setBorder(0);
                float[] ColumnaCuo = new float[]{20f, 50f, 50f, 15f};
                tablaCuo.setWidths(ColumnaCuo);
                tablaCuo.setHorizontalAlignment(Element.ALIGN_LEFT);
                PdfPCell Cuo2 = new PdfPCell(new Phrase("Tipo", negrita));
                PdfPCell Cuo4 = new PdfPCell(new Phrase("Fecha pago.", negrita));
                PdfPCell Cuo5 = new PdfPCell(new Phrase("Fecha vigencia", negrita));
                PdfPCell Cuo6 = new PdfPCell(new Phrase("Costo", negrita));

                Cuo2.setBorder(0);
                Cuo4.setBorder(0);
                Cuo5.setBorder(0);
                Cuo6.setBorder(0);

                Cuo2.setBackgroundColor(BaseColor.DARK_GRAY);
                Cuo4.setBackgroundColor(BaseColor.DARK_GRAY);
                Cuo5.setBackgroundColor(BaseColor.DARK_GRAY);
                Cuo6.setBackgroundColor(BaseColor.DARK_GRAY);

                tablaCuo.addCell(Cuo2);
                tablaCuo.addCell(Cuo4);
                tablaCuo.addCell(Cuo5);
                tablaCuo.addCell(Cuo6);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = sdf.format(fecha_pago.getDate());
                String fecha2 = sdf.format(fecha_vigencia.getDate());

                tablaCuo.addCell(jComboBoxTipo.getSelectedItem().toString());
                tablaCuo.addCell(fecha);
                tablaCuo.addCell(fecha2);
                tablaCuo.addCell(total.getText());

                docu.add(tablaCuo);

                //Total a pagar
                Paragraph Total = new Paragraph();
                Total.add(Chunk.NEWLINE);
                Total.add("\n");
                Total.setAlignment(Element.ALIGN_CENTER);
                docu.add(Total);

                PdfPTable tablaTotal = new PdfPTable(1);
                tablaTotal.setWidthPercentage(30);
                tablaTotal.getDefaultCell().setBorder(0);
                float[] ColumnaTotal = new float[]{30f};
                tablaTotal.setWidths(ColumnaTotal);
                tablaTotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
                PdfPCell tablaTotal1 = new PdfPCell(new Phrase("Total a pagar: ", negrita));
                tablaTotal1.setBorder(0);
                tablaTotal1.setBackgroundColor(BaseColor.DARK_GRAY);
                tablaTotal.addCell(tablaTotal1);
                tablaTotal.addCell("$" + total.getText());

                docu.add(tablaTotal);

                //MENSAJE
                Paragraph Epac = new Paragraph();
                Epac.add(Chunk.NEWLINE);
                Epac.add("\n\n");
                docu.add(Epac);

                Paragraph mensaje = new Paragraph();
                mensaje.add(Chunk.NEWLINE);
                mensaje.add("--------------------------------------\n\n");
                mensaje.add("GRACIAS POR SU PREFERENCIA\n\n");
                mensaje.add("----------------------------------------");
                mensaje.setAlignment(Element.ALIGN_CENTER);

                docu.add(mensaje);

                docu.close();
                JOptionPane.showMessageDialog(null, "Reporte creado correctamente.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
                archivo.close();
                Desktop.getDesktop().open(file);
            } catch (DocumentException | IOException e) {
                System.out.println(e.toString());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JButton BtnReporte;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField codigo;
    private com.toedter.calendar.JDateChooser fecha_pago;
    private com.toedter.calendar.JDateChooser fecha_vigencia;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
