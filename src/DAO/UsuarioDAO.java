
package DAO;

import Objetos.UsuariosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistock.Conexion;


public class UsuarioDAO {
    
    String cadenaAltas = "INSERT INTO public.\"Usuarios\" VALUES ";
    String cadenaBuscar = "SELECT * FROM public.\"Usuarios\"";
    PreparedStatement sentencia =  null;
    Conexion con = null;
    Connection conne = null;

    public UsuarioDAO() {
    }
       
    public void agregar_Usuario(UsuariosDTO usu){
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + usu.getDNI() + "','" + usu.getUsuario() + "','" + usu.getContraseña() 
                                      + "','" + usu.getTipo() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            conne.close();
            con.desconectar();               
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet buscarUsuario(String Usuario, String Contraseña){
        ResultSet rs = null;
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaBuscar = cadenaBuscar + " WHERE \"Usuario\" = '" + Usuario + "' AND \"Contraseña\" = '" + Contraseña + "';";
            sentencia = conne.prepareStatement(cadenaBuscar);
            rs = sentencia.executeQuery();
            conne.close();
            con.desconectar();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
}
