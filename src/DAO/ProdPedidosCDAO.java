
package DAO;

import Objetos.ProdPedidosCDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sistock.Conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ProdPedidosCDAO {
    
    PreparedStatement sentencia = null;
    String cadenaBuscar = "SELECT * FROM public.\"ProdPedidosC\"";
    String cadenaAltas = "INSERT INTO public.\"ProdPedidosC\" VALUES";
    
    public void agregar_PPC(ProdPedidosCDTO ppc){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + ppc.getNroPedidoC() + "','" + ppc.getCodProd() + "','" + ppc.getCantidad()
                                      + "','" + ppc.getPrecio()+ "','" + ppc.getNom() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();     
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }      
        
    public ResultSet listarPPC(int NroPedidoC){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        ResultSet rp = null;
        cadenaBuscar = cadenaBuscar + "WHERE \"NroPedidoC\" =" + NroPedidoC + ";";
        try{
            sentencia = conne.prepareStatement(cadenaBuscar);
            rp = sentencia.executeQuery();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    return rp;
    }
    
    public void descontarProductos(String npc){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        ResultSet rpp = null;
        ResultSet rp = null;
        try{
            sentencia = conne.prepareStatement("SELECT \"CodProd\", \"Cantidad\" FROM public.\"ProdPedidosC\" WHERE \"NroPedidoC\" = '" + npc + "';");
            rpp = sentencia.executeQuery();
            while(rpp.next()){
                sentencia = conne.prepareStatement("SELECT \"Stock\" FROM public.\"Productos\" WHERE \"CodProd\" = '" + rpp.getString("CodProd") + "';");
                rp = sentencia.executeQuery();
                rp.next();
                int c = rp.getInt("Stock") - rpp.getInt("Cantidad");
                sentencia = conne.prepareStatement("UPDATE public.\"Productos\" SET \"Stock\"=" + c + "WHERE \"CodProd\" ='" + rpp.getString("CodProd") + "';");
                sentencia.execute();
            }
        conne.close();
        con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
