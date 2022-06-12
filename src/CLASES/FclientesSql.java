/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jennifer Portillo
 */
public class FclientesSql extends Conexion {

    /*public boolean registrar(Fclientes c) throws SQLException {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO clientes ( nombre,apellido,direccion,telefono,cod_gym) VALUES(?,?,?,?,?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getDireccion());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getCod_gym());

            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(FclientesSql.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int existeUsuario(String cod_gym) {//Si existe un usuario

        PreparedStatement ps = null;// es una sentencia SQL precompilada a la cual le agregamos la palabra Ps.
        ResultSet rs = null;//proporciona varios métodos para obtener los datos de columna correspondientes a un fila.
        Connection con = getConexion();//Llamamos a la clase conexion con el metodo getConexion para enlazarla con la base de datos

        String sql = "SELECT count(idclientes)FROM clientes WHERE  = ?";

        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, cod_gym);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(FclientesSql.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }

    } //Si existe un usuario*/
}
