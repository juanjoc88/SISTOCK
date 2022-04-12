
package DAO;

import Objetos.RubrosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sistock.Conexion;


public class RubrosDAO {
    
    String cadenaAltas = "INSERT INTO public.\"Rubros\" (\"NomRub\") VALUES ";
    String cadenaListar = "SELECT * FROM public.\"Rubros\"";
    PreparedStatement sentencia =  null;
    Conexion con = null;
    Connection conne = null;
    
    public void agregar_rubro(RubrosDTO ru){
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + ru.getIDRubro() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet listarRubros(){
        ResultSet rs;
        rs = null;
        cadenaListar = cadenaListar + ";";
        con = new Conexion();
        conne = con.getConexion();
        try{
            sentencia = conne.prepareStatement(cadenaListar);
            rs = sentencia.executeQuery();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){    
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
}
