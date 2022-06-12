/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jennifer Portillo
 */
public class ConsultaClienteVigencia extends javax.swing.JFrame {

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

    public ConsultaClienteVigencia() {
        initComponents();
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio

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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtcampo = new javax.swing.JTextField();
        BtnConsularVigencia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vigencia de inscripción - Gym Sport Center");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de vigencia ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 390, 44);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 10, 100, 100);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vigencia de inscripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setToolTipText("Consulta de vigencia de clientes - GymSport Center");
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Cliente");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 50, 80, 23);
        jPanel2.add(txtcampo);
        txtcampo.setBounds(100, 40, 229, 40);

        BtnConsularVigencia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BtnConsularVigencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        BtnConsularVigencia.setText("Buscar");
        BtnConsularVigencia.setToolTipText("Buscar cliente");
        BtnConsularVigencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsularVigenciaActionPerformed(evt);
            }
        });
        jPanel2.add(BtnConsularVigencia);
        BtnConsularVigencia.setBounds(350, 40, 100, 40);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese el código del cliente para verificar la  fecha de vigencia.");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 110, 340, 44);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 138, 500, 180);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/calendario.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(204, 62, 70, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnConsularVigenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsularVigenciaActionPerformed
        // consultar vigencia de inscripción

        if (txtcampo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {
                PreparedStatement ps = null;
                ResultSet rs = null;
                Connection con = null;
                con = getConection();
                ps = con.prepareStatement("Select fecha_vigencia FROM factura_clientes WHERE cod_gym = ?");
                ps.setString(1, txtcampo.getText());

                rs = ps.executeQuery();

                if (rs.next()) {
                    ps.setString(1, "fecha_vigencia");
                    JOptionPane.showMessageDialog(null, "Su inscripción tiene vigencia hasta: " + (rs.getString(1)), "Vigencia de inscripción ", JOptionPane.PLAIN_MESSAGE, icono("/IMG/calendar.png", 40, 40));
                    Limpiar();

                } else {
                    JOptionPane.showMessageDialog(null, "No hay datos existentes", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));

                    Limpiar();
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }//GEN-LAST:event_BtnConsularVigenciaActionPerformed

    public void Limpiar() {
        txtcampo.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsularVigencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcampo;
    // End of variables declaration//GEN-END:variables
}
