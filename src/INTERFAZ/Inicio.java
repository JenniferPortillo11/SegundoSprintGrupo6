/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer Portillo
 */
public class Inicio extends javax.swing.JFrame {

    public static InicioSesion frmLog;
    public static Registrarse frmReg;
    public Inicio() {
        initComponents();
        cerrar();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        btnRegistar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bienvenido a GymSportCenter");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnIngresar.setText("Iniciar sesión");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        btnRegistar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistar.setText("Registrarse");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoPrototipo1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public Icon icono(String path2, int width, int heigth) {

        Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }
    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        // boton registrarse
        if(frmReg == null){
            frmReg = new Registrarse();
            frmReg.setVisible(true);
            this.setVisible(false);
            
        }
       
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // boton inicio de sesion
        if(frmLog == null){
            frmLog = new InicioSesion();
            frmLog.setVisible(true);
            this.setVisible(false);
          
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
