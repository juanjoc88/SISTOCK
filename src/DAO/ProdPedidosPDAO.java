
package DAO;

import Objetos.ProdPedidosPDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistock.Conexion;


public class ProdPedidosPDAO {
    
    
    PreparedStatement sentencia = null;
    String cadenaBuscar = "SELECT * FROM public.\"ProdPedidosP\"";
    String cadenaAltas = "INSERT INTO public.\"ProdPedidosP\" VALUES";
    
    public void agregar_PPC(ProdPedidosPDTO ppp){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + ppp.getNroPedidoP() + "','" + ppp.getCodProd() + "','" + ppp.getCantidad()
                                      + "','" + ppp.getPrecio()+ "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();     
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }      
}
