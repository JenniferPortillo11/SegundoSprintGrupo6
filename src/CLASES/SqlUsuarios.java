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

/**
 *
 * @author Jennifer Portillo
 */
public class SqlUsuarios extends Conexion {

    public boolean registrar(usuarios usr) throws SQLException {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuarios (usuario, password, nombre, apellido, id_tipo) VALUES (?,?,?,?,?)";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getApellido());
            ps.setInt(5, usr.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean login (usuarios usr) throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT u.id, u.usuario, u.password, u.nombre, u.id_tipo, t.nombre FROM usuarios AS u INNER JOIN tipo_usuario AS t ON u.id_tipo = t.id WHERE usuario = ?";
        
        ps = con.prepareStatement(sql);
        ps.setString(1, usr.getUsuario());
        rs= ps.executeQuery();
        
        if(rs.next()){
            if(usr.getPassword().equals(rs.getString(3))){
                String SqlUpdate = "UPDATE usuarios SET last_sesion = ? WHERE id = ?";
                ps = con.prepareStatement(SqlUpdate);
                ps.setString(1, usr.getLast_sesion());
                ps.setInt(2, rs.getInt(1));
                ps.execute();
                
                usr.setId(rs.getInt(1));
                usr.setNombre(rs.getString(4));
                usr.setId_tipo(rs.getInt(5));
                usr.setNombre_tipo(rs.getString(6));
                return true;
            }else{
            return false;
            }
            
        }
        return false;
    }

    public int existeUsuario(String usuario) {//Si existe un usuario

        PreparedStatement ps = null;// es una sentencia SQL precompilada a la cual le agregamos la palabra Ps.
        ResultSet rs = null;//proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
        Connection con = getConexion();//Llamamos a la clase conexion con el metodo getConexion para enlazarla con la base de datos

        String sql = "SELECT count(id)FROM usuarios WHERE usuario = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }

    } //Si existe un usuario

}
