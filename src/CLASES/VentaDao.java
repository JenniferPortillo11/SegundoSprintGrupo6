/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class VentaDao extends Conexion  {

    int r;

    public int RegistrarVenta(Venta v) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String Sql = "INSERT INTO ventas (cliente, total, Num_venta) VALUES (?,?,?)";

        try {
            ps.setString(1, v.getCliente());
            ps.setDouble(2, v.getTotal());
            ps.setString(3, v.getNum_venta());
            ps.execute();
        } catch (Exception e) {
        }
        return r;
    }

    public int RegistrarDetalle(Detalle dv) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO detalle (cod_producto, cantidad, precio, id_venta) VALUES (?,?,?,?)";
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, dv.getCod_producto());
            ps.setInt(2, dv.getCantidad());
            ps.setDouble(3, dv.getPrecio());
            ps.setInt(4, dv.getId_ventas());

            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);

        }
        return r;
    }

    public int IdVenta() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs;
        int id = 0;
        String sql = "SELECT MAX(idventas) from ventas";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt(1);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);

        }
        return id;
    }
    
public boolean ActualizarStockVentas (int cantidad, String cod_producto){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE productos SET cantidad = cantidad - ? WHERE cod_producto = ?";
        
        try{
             ps = con.prepareStatement(sql);
             ps.setInt(1, cantidad);
             ps.setString(2, cod_producto);
             ps.execute();
             return true;
        }catch(SQLException e){
            
        }
        return false;
    }
}
