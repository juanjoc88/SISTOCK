
package DAO;

import Objetos.PedidosCDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sistock.Conexion;

public class PedidosCDAO {
    
    PreparedStatement sentencia = null;
    String cadenaBuscar = "SELECT * FROM public.\"PedidosC\"";
    String cadenaAltas = "INSERT INTO public.\"PedidosC\"(\"CodCliente\", \"Fecha\", \"MedioDePago\", \"MontoTotal\", \"EstadoEntrega\")VALUES";
    String cadenaActualizar = "UPDATE public.\"PedidosC\" SET ";
    
    public PedidosCDAO() {
    }
    
    public void agregar_PC(PedidosCDTO pc){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "(" + pc.getCodCliente() + ",'" + pc.getFecha() + "','" + pc.getMedioDePago() + 
                                        "'," + pc.getMontoTotal() + ",'" + pc.getEstadoEntrega() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();     
            conne.close();
            con.desconectar();
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
            sentencia = conne.prepareStatement("SELECT MAX(\"NroPedidoC\") FROM public.\"PedidosC\"");
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
    
    public void actualizar(int npc, String mdp, float mt){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaActualizar = cadenaActualizar + "\"MedioDePago\"='" + mdp + "',\"MontoTotal\"=" + mt + "WHERE \"NroPedidoC\" =" + npc +";";
            sentencia = conne.prepareStatement(cadenaActualizar);
            sentencia.execute();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet listarPedidosPend(){
        ResultSet rs = null;
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaBuscar = "SELECT \"NroPedidoC\",\"Fecha\",\"NomApe\", \"Domicilio\",\"EstadoEntrega\" FROM public.\"PedidosC\"" +
                           "INNER JOIN public.\"Clientes\""
                           + "ON \"PedidosC\".\"CodCliente\" = \"Clientes\".\"CodCliente\" And \"EstadoEntrega\" = 'PENDIENTE';";
            sentencia = conne.prepareStatement(cadenaBuscar);
            rs = sentencia.executeQuery();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }    
    
    public void setEnviado(String npc){
        Conexion con = new Conexion();
        Connection conne = con.getConexion();
        try{
            cadenaActualizar = cadenaActualizar + "\"EstadoEntrega\"= 'Entregado' WHERE \"NroPedidoC\" =" + npc +";";
            sentencia = conne.prepareStatement(cadenaActualizar);
            sentencia.execute();
            ProdPedidosCDAO abmppc = new ProdPedidosCDAO();
            abmppc.descontarProductos(npc);                   
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}