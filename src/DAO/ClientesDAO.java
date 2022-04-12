package DAO;

import Objetos.ClientesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistock.Conexion;

public class ClientesDAO {
    
    public ClientesDAO() {
    }
    
    String cadenaAltas = "INSERT INTO public.\"Clientes\" VALUES ";
    String cadenaListar = "SELECT * FROM public.\"Clientes\"";
    PreparedStatement sentencia =  null;
    Conexion con = null;
    Connection conne = null;
    
    public void agregar_cliente(ClientesDTO cli){
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + cli.getNomApe() + "','" + cli.getDomicilio() + "','" + cli.getTelefono()
                                      + "','" + cli.getCorreo() + "','" + cli.getNombreComercial()+ "','" + cli.getDNI() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();     
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
   }
    
    public ResultSet buscarCliente (int DNI){
        con = new Conexion();
        conne = con.getConexion();
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
