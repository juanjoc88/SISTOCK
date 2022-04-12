
package DAO;

import Objetos.ProductosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import sistock.Conexion;


public class ProductosDAO {
    
    String cadenaAltas = "INSERT INTO public.\"Productos\" VALUES ";
    String cadenaBuscar = "SELECT * FROM public.\"Productos\"";
    PreparedStatement sentencia =  null;
    Conexion con = null;
    Connection conne = null;
    
    public ProductosDAO(){
    }
    
    public void agregar_producto(ProductosDTO prod){
        con = new Conexion();
        conne = con.getConexion();
        try{
            cadenaAltas = cadenaAltas + "('" + prod.getCodProd() + "','" + prod.getNombre() + "','" + prod.getDescripcion() + "','"
                                      + prod.getPrecio() + "','" + prod.getStock() + "','" + prod.getCantidadMinima() + "','"
                                      + prod.getRubro() + "');";
            sentencia = conne.prepareStatement(cadenaAltas);
            sentencia.execute();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public ResultSet listarProductos(int r, int op) {
        con = new Conexion();
        conne = con.getConexion();
        ResultSet rs = null;
        cadenaBuscar = cadenaBuscar + "WHERE \"Rubro\" =" + r;
        if(op == 1) cadenaBuscar = cadenaBuscar + "\"Stock\" < \"CantidadMinima\"";
        cadenaBuscar = cadenaBuscar + ";";
        try{
            sentencia = conne.prepareStatement(cadenaBuscar);
            rs = sentencia.executeQuery();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    return rs;
    }
    
    public ResultSet BuscarProductos(String nom, int op) {
        con = new Conexion();
        conne = con.getConexion();
        ResultSet rs = null;
        if(op == 1) cadenaBuscar = cadenaBuscar + "WHERE \"Nombre\" ='" + nom + "';";
        else cadenaBuscar = cadenaBuscar + "WHERE \"Stock\" < \"CantidadMinima\";";
        try{
        sentencia = conne.prepareStatement(cadenaBuscar);
        rs = sentencia.executeQuery();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
    
    public void Actualizar(int a, int b){
        con = new Conexion();
        conne = con.getConexion();
        try{
            String cadenaUpdate = "UPDATE public.\"Productos\" SET  \"Stock\"=" + b + "	WHERE \"CodProd\" =" + a + ";" ;
            sentencia = conne.prepareStatement(cadenaUpdate);
            sentencia.execute();
            conne.close();
            con.desconectar();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
