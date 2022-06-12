/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import CLASES.usuarios;
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
public class Menu extends javax.swing.JFrame {

    ImageIcon imagen[] = new ImageIcon[13];
    int contador = 1;

    usuarios mod;

    public Menu() {
        initComponents();

    }

    public Menu(usuarios mod) {
        initComponents();
        cerrar();
        this.setTitle("visor");

        for (int a = 1; a < 13; a++) {
            imagen[a] = new ImageIcon(getClass().getResource("/IMG/IMG" + a + ".jpg"));
        }

        jLabel1.setIcon(imagen[1]);
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio

        this.mod = mod;

        Nombre.setText(mod.getNombre());
        Apellido.setText(mod.getApellido());
        ROL.setText(mod.getNombre_tipo());
        sesion.setText(mod.getLast_sesion());

        if (mod.getId_tipo() == 1) {

        } else if (mod.getId_tipo() == 2) {

            MenuProveedores.setVisible(false);

           
            subConsultaClientes.setVisible(false);
            SubConsultaProductos.setVisible(false);
            subConsultaProveedores.setVisible(false);
            
          
            
        }
    }

    public Icon icono(String path2, int width, int heigth) {

        Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        ROL = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        sesion = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuClientes = new javax.swing.JMenu();
        SubRegClientes = new javax.swing.JMenuItem();
        MenuProductos = new javax.swing.JMenu();
        SubProducto = new javax.swing.JMenuItem();
        subActualizarStock = new javax.swing.JMenuItem();
        MenuProveedores = new javax.swing.JMenu();
        subRegistroProveedores = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        subConsultaClientes = new javax.swing.JMenuItem();
        SubConsultaProductos = new javax.swing.JMenuItem();
        subConsultaProveedores = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1270, 10, 111, 108);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jefe.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 6, 120, 128);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 10, 560, 700);

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel1.add(Nombre);
        Nombre.setBounds(24, 138, 355, 38);

        ROL.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ROL.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(ROL);
        ROL.setBounds(26, 226, 270, 43);

        Apellido.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel1.add(Apellido);
        Apellido.setBounds(24, 182, 240, 38);

        sesion.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jPanel1.add(sesion);
        sesion.setBounds(26, 277, 453, 52);

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/atras.png"))); // NOI18N
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });
        jPanel1.add(anterior);
        anterior.setBounds(402, 330, 90, 30);

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/flecha-correcta.png"))); // NOI18N
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(siguiente);
        siguiente.setBounds(1070, 330, 90, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 710));

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/home.png"))); // NOI18N
        jMenu1.setText("Home");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu1);

        MenuClientes.setText("Clientes");
        MenuClientes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        SubRegClientes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        SubRegClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/kyc.png"))); // NOI18N
        SubRegClientes.setText("Registro de clientes");
        SubRegClientes.setToolTipText("");
        SubRegClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubRegClientesActionPerformed(evt);
            }
        });
        MenuClientes.add(SubRegClientes);

        jMenuBar1.add(MenuClientes);

        MenuProductos.setText("Productos");
        MenuProductos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        SubProducto.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        SubProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/inventario 16x16.png"))); // NOI18N
        SubProducto.setText("Registro de productos");
        SubProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubProductoActionPerformed(evt);
            }
        });
        MenuProductos.add(SubProducto);

        subActualizarStock.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subActualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/actualiza-Stock.png"))); // NOI18N
        subActualizarStock.setText("Actualizar Stock");
        subActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActualizarStockActionPerformed(evt);
            }
        });
        MenuProductos.add(subActualizarStock);

        jMenuBar1.add(MenuProductos);

        MenuProveedores.setText("Proveedores");
        MenuProveedores.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        subRegistroProveedores.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subRegistroProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/proveedores 16x16.png"))); // NOI18N
        subRegistroProveedores.setText("Registro de proveedores");
        subRegistroProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistroProveedoresActionPerformed(evt);
            }
        });
        MenuProveedores.add(subRegistroProveedores);

        jMenuBar1.add(MenuProveedores);

        MenuConsultas.setText("Consultas");
        MenuConsultas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        subConsultaClientes.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subConsultaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/charla.png"))); // NOI18N
        subConsultaClientes.setText("Consulta de clientes");
        subConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subConsultaClientesActionPerformed(evt);
            }
        });
        MenuConsultas.add(subConsultaClientes);

        SubConsultaProductos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        SubConsultaProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/caja.png"))); // NOI18N
        SubConsultaProductos.setText("Consulta de productos");
        SubConsultaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubConsultaProductosActionPerformed(evt);
            }
        });
        MenuConsultas.add(SubConsultaProductos);

        subConsultaProveedores.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subConsultaProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/proveedores 16x16.png"))); // NOI18N
        subConsultaProveedores.setText("Consulta de proveedores");
        subConsultaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subConsultaProveedoresActionPerformed(evt);
            }
        });
        MenuConsultas.add(subConsultaProveedores);

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/atras-en-el-tiempo.png"))); // NOI18N
        jMenuItem1.setText("Consulta de vigencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuConsultas.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cuenta.png"))); // NOI18N
        jMenuItem2.setText("Consulta de factura de clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MenuConsultas.add(jMenuItem2);

        jMenuBar1.add(MenuConsultas);

        jMenu2.setText("Facturas");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cuenta.png"))); // NOI18N
        jMenuItem4.setText("Factura de clientes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/punto-de-venta.png"))); // NOI18N
        jMenuItem6.setText("Ventas y facturas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Herramientas");
        jMenu6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cerrar-sesion.png"))); // NOI18N
        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //cerrar sesion
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void subConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subConsultaClientesActionPerformed
        // TODO add your handling code here:
        FormConsultaClientes b = new FormConsultaClientes();
        b.setVisible(true);

    }//GEN-LAST:event_subConsultaClientesActionPerformed

    private void SubConsultaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubConsultaProductosActionPerformed
        // TODO add your handling code here:
        FormConsultaProductos c = new FormConsultaProductos();
        c.setVisible(true);

    }//GEN-LAST:event_SubConsultaProductosActionPerformed

    private void subConsultaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subConsultaProveedoresActionPerformed
        // TODO add your handling code here:
        FormConsultaProveedor d = new FormConsultaProveedor();
        d.setVisible(true);

    }//GEN-LAST:event_subConsultaProveedoresActionPerformed

    private void subRegistroProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistroProveedoresActionPerformed
        // TODO add your handling code here:
        FormProveedores e = new FormProveedores();
        e.setVisible(true);

    }//GEN-LAST:event_subRegistroProveedoresActionPerformed

    private void SubProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubProductoActionPerformed
        // TODO add your handling code here:
        FormProductos f = new FormProductos();
        f.setVisible(true);

    }//GEN-LAST:event_SubProductoActionPerformed

    private void subActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActualizarStockActionPerformed
        // TODO add your handling code here:
        FormActualizarStock g = new FormActualizarStock();
        g.setVisible(true);

    }//GEN-LAST:event_subActualizarStockActionPerformed

    private void SubRegClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubRegClientesActionPerformed
        // TODO add your handling code here:
        FormClientes h = new FormClientes();
        h.setVisible(true);
    }//GEN-LAST:event_SubRegClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ConsultaClienteVigencia t = new ConsultaClienteVigencia();
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FactClientes z = new FactClientes();
        z.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //  
        FormVentas y = new FormVentas();
        y.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        // siguiente
        if (contador == 12) {
            contador = 0;
        }
        contador++;
        jLabel1.setIcon(imagen[contador]);
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        // TODO add your handling code here:

        if (contador == 1) {
            contador = 11;
        }
        contador--;
        jLabel1.setIcon(imagen[contador]);
    }//GEN-LAST:event_anteriorActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         FormConsultaFactClientes y1 = new FormConsultaFactClientes();
        y1.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       // cerrar();
    }//GEN-LAST:event_formWindowClosing
    
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
    private javax.swing.JLabel Apellido;
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenu MenuProductos;
    private javax.swing.JMenu MenuProveedores;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel ROL;
    private javax.swing.JMenuItem SubConsultaProductos;
    private javax.swing.JMenuItem SubProducto;
    private javax.swing.JMenuItem SubRegClientes;
    private javax.swing.JButton anterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sesion;
    private javax.swing.JButton siguiente;
    private javax.swing.JMenuItem subActualizarStock;
    private javax.swing.JMenuItem subConsultaClientes;
    private javax.swing.JMenuItem subConsultaProveedores;
    private javax.swing.JMenuItem subRegistroProveedores;
    // End of variables declaration//GEN-END:variables
}
