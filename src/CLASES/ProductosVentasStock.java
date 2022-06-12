/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductosVentasStock extends Conexion{
    
    public boolean ActualizarStock (int cantidad, String cod_producto){
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE productos SET cantidad = cantidad + ? WHERE cod_producto = ?";
        
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
