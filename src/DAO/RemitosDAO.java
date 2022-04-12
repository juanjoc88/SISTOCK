
package DAO;

import Objetos.RemitosDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistock.Conexion;

public class RemitosDAO {
    PreparedStatement sentencia = null;
    String cadenaBuscar = "SELECT * FROM public.\"Remitos\"";
    String cadenaAltas = "INSERT INTO public.\"Remitos\" VALUES";
    PreparedStatement sentencia2 = null;
    
    public void agregarRemito(RemitosDTO rem){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "(" + rem.getNroPedidoP() + ",'" + rem.getFecha() + "'," + rem.getCodRemito()+ ");";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();     
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    } 
    
    
    public int siguenteRemito(){
        int np = 1;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            sentencia = conne.prepareStatement("SELECT MAX(\"CodRemito\") FROM public.\"Remitos\"");
            rs = sentencia.executeQuery();
            while(rs.next()){
                np = rs.getInt("max");
            }
            conne.close();
            con.desconectar();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        np ++;
        return np;
    }
    
     public ResultSet BuscarRemitos(String nr) {
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        ResultSet rs = null;
        ResultSet rp = null;
        cadenaBuscar = cadenaBuscar + "WHERE \"CodRemito\" =" + nr + ";";
        try{
            sentencia = conne.prepareStatement(cadenaBuscar);
            rs = sentencia.executeQuery();           
            while(rs.next()){
                sentencia2 = conne.prepareStatement("SELECT * FROM public.\"ProdPedidosP\" WHERE \"NroPedidoP\" =" + rs.getInt("NroPedidoP"));
                rp = sentencia2.executeQuery();
        }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rp;
    }
    
}
