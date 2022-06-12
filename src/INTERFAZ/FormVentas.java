/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package INTERFAZ;

import javax.swing.ImageIcon;
import CLASES.Conexion;
import CLASES.Detalle;
import CLASES.Productos;

import CLASES.Venta;
import CLASES.VentaDao;
import CLASES.usuarios;
import CLASES.Productos;

import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;

import com.itextpdf.text.Image;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;

import com.mysql.jdbc.Statement;
import java.awt.Desktop;
import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class FormVentas extends javax.swing.JFrame {

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

    public FormVentas() {
        initComponents();

        Num.setVisible(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/IMG/100x1000.png")).getImage()); //<-- cambia el logo por defecto de los formulario de java y agregamos la imagen del logo gimnasio
    }

    int item;
    double TotalPagar = 0.00;
    DefaultTableModel modelo = new DefaultTableModel();
    Productos pro = new Productos();

    Venta v = new Venta();
    VentaDao Vdao = new VentaDao();
    Detalle dv = new Detalle();

    String path2 = "src/IMG/";

    public Icon icono(String path2, int width, int heigth) {

        Icon imag = new ImageIcon(new ImageIcon(getClass().getResource(path2)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return imag;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        CodC = new javax.swing.JTextField();
        BtnBuscarCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        NombreC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CodP = new javax.swing.JTextField();
        BtnBuscarProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NombreP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        StockActual = new javax.swing.JTextField();
        CantidadVenta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Num = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venta de productos - Gym Sport Center");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/carrito-de-compras.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(570, 0, 80, 100);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel3.setText("Venta de productos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 10, 480, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100x1000.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1080, 10, 100, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Código cliente");

        CodC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        BtnBuscarCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        BtnBuscarCliente.setText("Buscar");
        BtnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Nombre");

        NombreC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        NombreC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreCKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Fecha");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(NombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 190, 830, 90);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Código");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        CodP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel5.add(CodP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 99, 30));

        BtnBuscarProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        BtnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Buscar.png"))); // NOI18N
        BtnBuscarProducto.setText("Buscar");
        BtnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarProductoActionPerformed(evt);
            }
        });
        jPanel5.add(BtnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Nombre");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        NombreP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        NombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePActionPerformed(evt);
            }
        });
        NombreP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombrePKeyTyped(evt);
            }
        });
        jPanel5.add(NombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, 33));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Precio");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Precio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioActionPerformed(evt);
            }
        });
        jPanel5.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 190, 33));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Descripción");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 90, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Stock actual");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        Descripcion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionKeyTyped(evt);
            }
        });
        jPanel5.add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 210, 33));

        StockActual.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        StockActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                StockActualKeyTyped(evt);
            }
        });
        jPanel5.add(StockActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 210, 33));

        CantidadVenta.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        CantidadVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CantidadVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadVentaKeyTyped(evt);
            }
        });
        jPanel5.add(CantidadVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 89, 33));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Total");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 40, -1));

        Total.setBackground(new java.awt.Color(0, 153, 153));
        Total.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel5.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 89, 33));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, -1));
        jPanel5.add(Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jPanel2.add(jPanel5);
        jPanel5.setBounds(10, 20, 830, 160);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 90, 850, 290);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/nuevo.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.setToolTipText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(17, 45, 138, 36);

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Guardar.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.setToolTipText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(17, 107, 138, 36);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/pdf.png"))); // NOI18N
        jButton3.setText("Reporte");
        jButton3.setToolTipText("Generar factura");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(17, 169, 138, 36);

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Eliminar.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.setToolTipText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(17, 231, 138, 36);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(890, 90, 170, 290);

        jTableVentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Descripción", "Cantidad", "Precio unitario", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVentas);

        jTabbedPane1.addTab("Productos", jScrollPane1);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 400, 910, 190);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioActionPerformed

    private void BtnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProductoActionPerformed
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = null;
            con = getConection();
            ps = con.prepareStatement("Select * FROM productos WHERE cod_producto = ?");
            ps.setString(1, CodP.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                CodP.setText(rs.getString("cod_producto"));
                NombreP.setText(rs.getString("nombre"));
                Descripcion.setText(rs.getString("decripcion"));
                StockActual.setText(rs.getString("cantidad"));
                Precio.setText(rs.getString("precio_venta"));

            } else {
                JOptionPane.showMessageDialog(null, "No hay datos existentes.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_BtnBuscarProductoActionPerformed

    private void BtnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarClienteActionPerformed
        try {
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = null;
            con = getConection();
            ps = con.prepareStatement("Select * FROM clientes WHERE cod_gym = ?");
            ps.setString(1, CodC.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                CodC.setText(rs.getString("cod_gym"));
                NombreC.setText(rs.getString("nombre"));

            } else {
                JOptionPane.showMessageDialog(null, "No hay datos existentes.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_BtnBuscarClienteActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void CantidadVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadVentaKeyPressed
        // Evento que ala agregar una cantidad 
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!"".equals(CantidadVenta.getText())) {
                String cod = CodP.getText();
                String nombre = NombreP.getText();
                String descripcion = Descripcion.getText();
                int cant = Integer.parseInt(CantidadVenta.getText());
                double precio = Double.parseDouble(Precio.getText());
                double total = cant * precio;
                int stock = Integer.parseInt(StockActual.getText());
                if (stock >= cant) {

                    item = item + 1;
                    modelo = (DefaultTableModel) jTableVentas.getModel();
                    for (int i = 0; i < jTableVentas.getRowCount(); i++) {

                        if (jTableVentas.getValueAt(i, 1).equals(NombreP.getText())) {
                            JOptionPane.showMessageDialog(null, "El producto ya está registrado", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
                            return;
                        }
                    }
                    ArrayList<String> lista = new ArrayList<String>();
                    lista.add(Integer.toString(item));
                    lista.add(cod);
                    lista.add(nombre);
                    lista.add(descripcion);
                    lista.add(Integer.toString(cant));
                    lista.add(Double.toString(precio));
                    lista.add(Double.toString(total));
                    Object[] O = new Object[6];
                    O[0] = lista.get(1);
                    O[1] = lista.get(2);
                    O[2] = lista.get(3);
                    O[3] = lista.get(4);
                    O[4] = lista.get(5);
                    O[5] = lista.get(6);
                    modelo.addRow(O);
                    jTableVentas.setModel(modelo);
                    TotalAPagar();
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Stock no disponible", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
            }

        }
    }//GEN-LAST:event_CantidadVentaKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CantidadVenta.setText(null);
        CodC.setText(null);
        CodP.setText(null);
        Descripcion.setText(null);
        NombreC.setText(null);
        NombreP.setText(null);
        Precio.setText(null);
        StockActual.setText(null);
        Total.setText(null);
        jDateChooserFecha.setCalendar(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Eliminar
        modelo = (DefaultTableModel) jTableVentas.getModel();
        modelo.removeRow(jTableVentas.getSelectedRow());
        TotalAPagar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection con = null;
        if (NombreC.getText().equals("") || (Total.getText().equals(""))  || CantidadVenta.getText().equals("") || CodP.getText().equals("") || jDateChooserFecha.getDate().equals("") || NombreP.getText().equals("") || StockActual.getText().equals("") || Precio.getText().equals("") || Descripcion.getText().equals("") || CodC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Aún hay campos vacíos.", "Mensaje", JOptionPane.ERROR_MESSAGE, icono("/IMG/advertencia.png", 40, 40));
        } else {
            try {
                con = getConection();
                ps = con.prepareStatement("INSERT INTO ventas (cliente, total,Num_venta,fecha) VALUES(?,?,?,?)");

                ps.setString(1, NombreC.getText());//2

                ps.setString(2, Total.getText());//3

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = sdf.format(jDateChooserFecha.getDate());
                ps.setString(4, fecha);

                ps.setString(3, Num.getText());//3
                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "El registro ha sido almacenado correctamente", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));

                } else {
                    JOptionPane.showMessageDialog(null, "El registro  no pudo ser almacenado.", "ERROR", JOptionPane.ERROR_MESSAGE, icono("/IMG/mensaje-de-error.png", 40, 40));
                }

            } catch (Exception e) {
                System.err.println(e);
            }
            RegistrarDetalle();

            ActualizarStockVentas();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PDF();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void NombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombrePActionPerformed

    private void NombrePKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombrePKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_NombrePKeyTyped

    private void DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_DescripcionKeyTyped

    private void NombreCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreCKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_NombreCKeyTyped

    private void StockActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_StockActualKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_StockActualKeyTyped

    private void CantidadVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadVentaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_CantidadVentaKeyTyped

    private void TotalAPagar() {
        TotalPagar = 0.00;
        int numFila = jTableVentas.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(jTableVentas.getModel().getValueAt(i, 5)));
            TotalPagar = TotalPagar + cal;

        }
        Total.setText(String.format("%.2f", TotalPagar));
    }

    private void RegistrarVenta() {
        String cliente = NombreP.getText();
        double monto = TotalPagar;
        v.setCliente(cliente);
        v.setTotal(monto);
        Vdao.RegistrarVenta(v);

    }

    private void RegistrarDetalle() {
        int id = Vdao.IdVenta();
        for (int i = 0; i < jTableVentas.getRowCount(); i++) {
            String cod = jTableVentas.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(jTableVentas.getValueAt(i, 3).toString());
            double precio = Double.parseDouble(jTableVentas.getValueAt(i, 5).toString());

            dv.setCod_producto(cod);
            dv.setCantidad(cant);
            dv.setPrecio(precio);
            dv.setId_ventas(id);
            Vdao.RegistrarDetalle(dv);

        }
    }

    private void ActualizarStockVentas() {

        int Stockactual;
        for (int i = 0; i < jTableVentas.getRowCount(); i++) {
            String cod = jTableVentas.getValueAt(i, 0).toString();
            int cant = Integer.parseInt(jTableVentas.getValueAt(i, 3).toString());
            Stockactual = pro.getCantidad() - cant;
            Vdao.ActualizarStockVentas(Stockactual, cod);
        }

        /*int Stockactual;
        String Cod = CodP.getText();
        int Cant = Integer.parseInt(CantidadVenta.getText());
        Stockactual = Integer.parseInt(StockActual.getText());

        Stockactual = pro.getCantidad() - Cant;
        Vdao.ActualizarStockVentas(Stockactual, Cod);*/
    }

    private void PDF() {

        try {
            int id = Vdao.IdVenta();
            FileOutputStream archivo;
            File file = new File("src/ReportesPDF/ventas.pdf");
            archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            Image logo = Image.getInstance("src/IMG/100x1000.png");

            Paragraph fech = new Paragraph();
            Font negrita = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);

            fech.add(Chunk.NEWLINE);
            Date date = new Date();
            fech.add("Factura:" + id + "\n" + "Fecha: " + new SimpleDateFormat("dd-mm-yyyy").format(date) + "\n\n");

            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

            Encabezado.addCell(logo);
            String fact = "FACTURA DE VENTA";
            String nombre = "GYM SPORT CENTER";
            String tel = "2654-1541";
            String correo = "gymSport.208@gmail.com";
            String Dir = "San Francisco Gotera, Morazán";

            Encabezado.addCell("");

            Encabezado.addCell(fact + "\n\nNombre: " + nombre + "\n\nTeléfono: " + tel + "\n\nCorreo: " + correo + "\n\nDireción: " + Dir);
            Encabezado.addCell(fech);
            doc.add(Encabezado);

            Paragraph cli = new Paragraph();
            cli.add(Chunk.NEWLINE);
            cli.add("Datos del cliente" + "\n\n");
            doc.add(cli);

            PdfPTable tablaCli = new PdfPTable(2);
            tablaCli.setWidthPercentage(100);
            tablaCli.getDefaultCell().setBorder(0);
            float[] ColumnaCli = new float[]{50f, 50f};
            tablaCli.setWidths(ColumnaCli);
            tablaCli.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cl11 = new PdfPCell(new Phrase("Código", negrita));
            PdfPCell cl12 = new PdfPCell(new Phrase("Nombre", negrita));

            cl11.setBorder(0);
            cl12.setBorder(0);
            cl11.setBackgroundColor(BaseColor.DARK_GRAY);
            cl12.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaCli.addCell(cl11);
            tablaCli.addCell(cl12);

            tablaCli.addCell(CodC.getText());
            tablaCli.addCell(NombreC.getText());

            doc.add(tablaCli);

            Paragraph SALTO = new Paragraph();
            SALTO.add(Chunk.NEWLINE);
            doc.add(SALTO);
            //Para los productos
            Paragraph pRO = new Paragraph();
            pRO.add(Chunk.NEWLINE);
            pRO.add("Datos de la venta" + "\n\n");
            doc.add(pRO);

            PdfPTable tablaPro = new PdfPTable(4);
            tablaPro.setWidthPercentage(100);
            tablaPro.getDefaultCell().setBorder(0);
            float[] ColumnaPro = new float[]{20f, 20f, 15f, 20f};
            tablaPro.setWidths(ColumnaPro);
            tablaPro.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell pro2 = new PdfPCell(new Phrase("Nombre", negrita));
            PdfPCell pro4 = new PdfPCell(new Phrase("Cantidad", negrita));
            PdfPCell pro5 = new PdfPCell(new Phrase("Precio U.", negrita));
            PdfPCell pro6 = new PdfPCell(new Phrase("Precio T.", negrita));

            pro2.setBorder(0);
            pro4.setBorder(0);
            pro5.setBorder(0);
            pro6.setBorder(0);
            pro2.setBackgroundColor(BaseColor.DARK_GRAY);
            pro4.setBackgroundColor(BaseColor.DARK_GRAY);
            pro5.setBackgroundColor(BaseColor.DARK_GRAY);
            pro6.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaPro.addCell(pro2);
            tablaPro.addCell(pro4);
            tablaPro.addCell(pro5);
            tablaPro.addCell(pro6);

            for (int i = 0; i < jTableVentas.getRowCount(); i++) {
                String nom = jTableVentas.getValueAt(i, 1).toString();
                String cant = jTableVentas.getValueAt(i, 3).toString();
                String pre = jTableVentas.getValueAt(i, 4).toString();
                String total = jTableVentas.getValueAt(i, 5).toString();
                tablaPro.addCell(nom);
                tablaPro.addCell(cant);
                tablaPro.addCell(pre);
                tablaPro.addCell(total);
            }
            doc.add(tablaPro);

            /*Paragraph info = new Paragraph();
            info.add(Chunk.NEWLINE);
            info.add("Total a pagar: " + TotalPagar);
            info.setAlignment(Element.ALIGN_RIGHT);
            doc.add(info);*/
            //Salto al total
            Paragraph Total = new Paragraph();
            Total.add(Chunk.NEWLINE);
            Total.add("\n");
            Total.setAlignment(Element.ALIGN_CENTER);
            doc.add(Total);

            PdfPTable tablaTotal = new PdfPTable(1);
            tablaTotal.setWidthPercentage(30);
            tablaTotal.getDefaultCell().setBorder(0);
            float[] ColumnaTotal = new float[]{30f};
            tablaTotal.setWidths(ColumnaTotal);
            tablaTotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
            PdfPCell tablaTotal1 = new PdfPCell(new Phrase("Total a pagar: " + "$" + TotalPagar, negrita));
            tablaTotal1.setBorder(0);
            tablaTotal1.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaTotal.addCell(tablaTotal1);

            doc.add(tablaTotal);

            Paragraph Epac = new Paragraph();
            Epac.add(Chunk.NEWLINE);
            Epac.add("\n\n");
            doc.add(Epac);

            Paragraph mensaje = new Paragraph();
            mensaje.add(Chunk.NEWLINE);
            mensaje.add("--------------------------------------\n\n");
            mensaje.add("GRACIAS POR SU COMPRA\n\n");
            mensaje.add("----------------------------------------");
            mensaje.setAlignment(Element.ALIGN_CENTER);

            doc.add(mensaje);

            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte creado correctamente.", "Mensaje", JOptionPane.PLAIN_MESSAGE, icono("/IMG/cheque.png", 40, 40));
            archivo.close();

            Desktop.getDesktop().open(file);
        } catch (DocumentException | IOException e) {
            System.out.println(e.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarCliente;
    private javax.swing.JButton BtnBuscarProducto;
    private javax.swing.JTextField CantidadVenta;
    private javax.swing.JTextField CodC;
    private javax.swing.JTextField CodP;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JTextField NombreC;
    private javax.swing.JTextField NombreP;
    private javax.swing.JTextField Num;
    private javax.swing.JTextField Precio;
    private javax.swing.JTextField StockActual;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableVentas;
    // End of variables declaration//GEN-END:variables
}
