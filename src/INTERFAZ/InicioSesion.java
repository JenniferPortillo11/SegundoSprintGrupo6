/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import javax.swing.ImageIcon;
import CLASES.SqlUsuarios;
import CLASES.hash;
import CLASES.usuarios;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer Portillo
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
        cerrar();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(64, 64, 64));
        jPanel3.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USUARIO");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(30, 150, 80, 20);

        txtUsuario.setBackground(new java.awt.Color(64, 64, 64));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel3.add(txtUsuario);
        txtUsuario.setBounds(60, 180, 290, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASE??A");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 240, 120, 23);

        txtPassword.setBackground(new java.awt.Color(64, 64, 64));
        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        jPanel3.add(txtPassword);
        txtPassword.setBounds(60, 270, 290, 30);

        btnIngresar.setBackground(new java.awt.Color(0, 188, 227));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Icon.png"))); // NOI18N
        btnIngresar.setText("Iniciar sesi??n");
        btnIngresar.setBorder(null);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnIngresar);
        btnIngresar.setBounds(40, 360, 220, 40);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(30, 300, 300, 20);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(30, 210, 300, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/candado.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 280, 16, 16);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user.png"))); // NOI18N
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 190, 16, 16);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INICIO DE SESI??N");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 30, 320, 45);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(260, 380, 100, 120);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 360, 460));

        jPanel2.setBackground(new java.awt.Color(0, 188, 227));
        jPanel2.setLayout(null);

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setToolTipText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 400, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogLine.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 100, 256, 256);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GYM SPORT CENTER");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 30, 340, 45);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inicio frm = new Inicio();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    String path = "src/IMG/";
        String path2 = "src/IMG/";
    public Icon icono(String path, int width, int heigth){
      
       Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }
    
    public Icon icono2(String path2, int width, int heigth){
      
       Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
         //boton para iniciar sesion
        SqlUsuarios modSql = new SqlUsuarios();
        usuarios mod = new usuarios();

        Date date = new Date();
        DateFormat fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String pass = new String(txtPassword.getPassword());

        if (!txtUsuario.getText().equals("") && !pass.equals("")) {
          
            //JOptionPane.showMessageDialog(null, "Conexi??n a la base de datos", "Bienvenido", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            String nuevoPass = null;

            
            try {
                nuevoPass = hash.sha1(pass);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            

            mod.setUsuario(txtUsuario.getText());
            mod.setPassword(nuevoPass);
            mod.setLast_sesion(fechaHora.format(date));

           
            try {
                if (modSql.login(mod)) {

                    Inicio.frmLog = null;
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Bienvenido a Gym Sport Center.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
                    Menu frmHome = new Menu(mod);
                    frmHome.setVisible(true);

                } else {

                    
                     JOptionPane.showMessageDialog(null, "Datos ingresados incorrectos.", "ERROR", JOptionPane.ERROR_MESSAGE, icono2("/IMG/mensaje-de-error.png", 40, 40));
                     Limpiar();
                }
            } catch (SQLException ex) {
                Logger.getLogger(InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
           

        } else {
             JOptionPane.showMessageDialog(null, "Debe ingresar sus datos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40)); 
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

        Inicio.frmLog = null;

    }//GEN-LAST:event_formWindowClosing

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtUsuarioKeyTyped

   public void Limpiar(){
       txtPassword.setText(null);
       txtUsuario.setText(null);
   }
   
      
  public void cerrar(){
      try {
          this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
          addWindowListener(new WindowAdapter() {
              
              public void windowClosing(WindowEvent e){
                  confirmarSalida();
              }
          });
          this.setVisible(true);
      } catch (Exception e) {
      }
  }

  public void confirmarSalida(){
      String botones [] = {"Cerrar","Cancelar"};
      int valor = JOptionPane.showOptionDialog(this, "??Desea cerrar la aplicaci??n?", "??ADVERTENCIA!", 0 , 0 ,null,botones, this );
      if(valor == JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(null, "Gracias pos su visita, hasta pronto.", "Gym Sport Center", JOptionPane.PLAIN_MESSAGE, icono("/IMG/adios.png", 40, 40));
          System.exit(0);
      }
      
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
