
package DAO;

import Objetos.PedidosPDTO;
import java.sql.Connection;
import sistock.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PedidosPDAO {

    private String cadenaAltas = "INSERT INTO public.\"PedidosP\"(\"NroPedidoP\",\"Fecha\", \"MontoTotal\", \"EstadoEntrega\", \"CodProveedor\") VALUES ";
    Conexion con = null;
    Connection conne = null;
    PreparedStatement sentencia = null;  
    
    public PedidosPDAO() {
    }
    
    public void guardarPedidoP(PedidosPDTO pedidop){
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "("+ pedidop.getNroPedidoP()+ ",'" + pedidop.getFecha() + "'," + pedidop.getMontoTotal() + ",'" + pedidop.getEstadoEntrega() 
                            + "'," + pedidop.getCodProveedor() + ");";
                            //+ " WHERE NOT EXIST (SELECT * FROM public.\"PedidosPDTO\" WHERE \"Fecha\" ='" + pedidop.getFecha()
                            //+ "' AND \"CodProveedor\" = " + pedidop.getCodProveedor() + ";";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            con.desconectar();
            conne.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
        public int siguentePedido(){
        int np = 0;
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            sentencia = conne.prepareStatement("SELECT MAX(\"NroPedidoP\") FROM public.\"PedidosP\"");
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
    
}
