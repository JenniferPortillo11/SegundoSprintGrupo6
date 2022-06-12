/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.SqlUsuarios;
import CLASES.hash;
import CLASES.usuarios;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer Portillo
 */
public class Registrarse extends javax.swing.JFrame {

    /**
     * Creates new form Registrarse
     */
    public Registrarse() {
        initComponents();
        cerrar();
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

        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmaPassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrarse - Gym Sport Center");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(64, 64, 64));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setToolTipText("Cancelar");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 120, 40));

        jPanel2.setBackground(new java.awt.Color(64, 64, 64));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REGISTRO DE USUARIOS");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 30, 410, 44);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USUARIO");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 120, 100, 20);

        txtUsuario.setBackground(new java.awt.Color(64, 64, 64));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(60, 150, 330, 30);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 190, 100, 23);

        txtNombre.setBackground(new java.awt.Color(64, 64, 64));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre);
        txtNombre.setBounds(60, 220, 330, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("APELLIDO");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 270, 110, 23);

        txtApellido.setBackground(new java.awt.Color(64, 64, 64));
        txtApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txtApellido);
        txtApellido.setBounds(60, 300, 330, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTRASEÑA");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 340, 130, 23);

        txtPassword.setBackground(new java.awt.Color(64, 64, 64));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        jPanel2.add(txtPassword);
        txtPassword.setBounds(60, 370, 330, 30);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONFIRMAR CONTRASEÑA");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 410, 240, 40);

        txtConfirmaPassword.setBackground(new java.awt.Color(64, 64, 64));
        txtConfirmaPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmaPassword.setBorder(null);
        txtConfirmaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmaPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtConfirmaPassword);
        txtConfirmaPassword.setBounds(60, 450, 330, 30);

        jButton1.setBackground(new java.awt.Color(0, 188, 227));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/registrarse.png"))); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(60, 530, 220, 40);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(60, 485, 330, 20);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(60, 180, 330, 20);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(60, 250, 330, 20);
        jPanel2.add(jSeparator4);
        jSeparator4.setBounds(60, 330, 330, 20);
        jPanel2.add(jSeparator5);
        jSeparator5.setBounds(60, 405, 330, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(320, 510, 100, 120);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 430, 590));

        jPanel1.setBackground(new java.awt.Color(0, 128 , 227));
        jPanel1.setBackground(new java.awt.Color(0, 188, 227));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/enroll.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 170, 256, 256);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GYM SPORT CENTER");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 30, 340, 44);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton registrar
        SqlUsuarios modSql = new SqlUsuarios(); //LLamamos la clase SqlUsuarios donde tenemos el codigo necesario para el login
        usuarios modelo = new usuarios(); //llamamos la classe Usuarios donde tenemos los campos para el usuario, sus setter y getter

        String pass = new String(txtPassword.getPassword());
        String passCon = new String(txtConfirmaPassword.getPassword());

        if (txtUsuario.getText().equals("") || (txtNombre.getText().equals("")) || (txtApellido.getText().equals("")) || pass.equals("") || passCon.equals("")) { //Validamos que en los campos de texto no esten vacios ya que esto en la base de datos no se ve agradable y aja
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40)); //Indica si hay campos vacios
            limpiar();
        } else {
            if (pass.equals(passCon)) { //Aca nos confirma si las contraseñas son iguales

                if (modSql.existeUsuario(txtUsuario.getText()) == 0) {
                    try { //Validar que un usuario ya este ingresado 

                        String nuevoPass = null;

                        try {
                            nuevoPass = hash.sha1(pass);
                            modelo.setUsuario(txtUsuario.getText());
                            modelo.setNombre(txtNombre.getText());
                            modelo.setApellido(txtApellido.getText());
                            modelo.setId_tipo(1);

                            modelo.setPassword(nuevoPass);

                        } catch (NoSuchAlgorithmException ex) {
                            Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (modSql.registrar(modelo)) {
                            JOptionPane.showMessageDialog(null, "Registro almacenado", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40)); //Aca nos enviara un mensaje en el que nos confirmara que se guardo el registro
                            limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo almacenar el registro", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40)); //Aca nos avisa que no se pudo almacenar y mientras el programa no sea un ejecutable mostrara el error en consola
                            limpiar();
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Registrarse.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Este usuario ya existe", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40)); //Nos avisa que el usuario que tratamos de ingresar ya existe
                    limpiar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40)); //Mensaje en el que las contraseñas no existen
                limpiar();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Inicio frm = new Inicio();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Inicio.frmReg = null;
    }//GEN-LAST:event_formWindowClosing

    private void txtConfirmaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmaPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmaPasswordActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // validacion de solo letras
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtApellidoKeyTyped
    private void limpiar() {
        txtUsuario.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtPassword.setText("");
        txtConfirmaPassword.setText("");
    }
    /**
     * @param args the command line arguments
     */

       
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
      int valor = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicación?", "¡ADVERTENCIA!", 0 , 0 ,null,botones, this );
      if(valor == JOptionPane.YES_OPTION){
         JOptionPane.showMessageDialog(null, "Gracias pos su visita, hasta pronto.", "Gym Sport Center", JOptionPane.PLAIN_MESSAGE, icono("/IMG/adios.png", 40, 40));
          System.exit(0);
      }
      
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtConfirmaPassword;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
