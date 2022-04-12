
package DAO;

import Objetos.ProveedoresDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistock.Conexion;


public class ProveedoresDAO {
    
    String cadenaAltas = "INSERT INTO public.\"Proveedores\" VALUES ";
    String cadenaBuscar = "SELECT * FROM public.\"Proveedores\"";
    PreparedStatement sentencia =  null;
    Conexion con = null;
    Connection conne = null;
    
    public ProveedoresDAO(){
    }
    
    public void agregar_proveedor(ProveedoresDTO prov){
        //Objetos de la clase conexion.
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + prov.getNomApe() + "','" + prov.getDomicilio() + "','"
                                      + prov.getTelefono() + "','" + prov.getCorreo() + "','" + prov.getFax() + "','" 
                                      + prov.getCuit() + "','" + prov.getRubro() + "','" + prov.getCodProveedor() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public ResultSet listarProveedores(int codr){
        con = new Conexion();
        conne = con.getConexion();
        ResultSet rp = null;
        try{
            cadenaBuscar = cadenaBuscar + "WHERE \"Rubro\" =" + codr+ ";";
            sentencia = conne.prepareStatement(cadenaBuscar);
            rp = sentencia.executeQuery();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rp;
    }
}
