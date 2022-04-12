
package DAO;

import Objetos.EmpleadosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistock.Conexion;

public class EmpleadosDAO {
    
    String cadenaAltas = "INSERT INTO public.\"Empleados\" VALUES ";
    String cadenaListar = "SELECT * FROM public.\"Empleados\"";
    PreparedStatement sentencia =  null;

    public EmpleadosDAO() {
    }
       
    public void agregar_Empleado(EmpleadosDTO emp){
        //Objetos de la clase conexion.
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + emp.getDNI() + "','" + emp.getNomApe() + "','" + emp.getDomicilio()
                                      + "','" + emp.getTelefono() + "','" + emp.getCorreo() + "','" + emp.getComercio() 
                                      + "','" + emp.getCodEmpleado() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            conne.close();
            con.desconectar();              
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet buscarEmpleado (int DNI){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        cadenaListar = cadenaListar + "WHERE \"DNI\" = " + DNI + ";";
        ResultSet rs = null;
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
