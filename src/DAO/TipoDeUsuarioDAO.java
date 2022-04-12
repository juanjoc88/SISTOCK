
package DAO;

import Objetos.TipoUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistock.Conexion;


public class TipoDeUsuarioDAO {
    
    String cadenaBuscar = "SELECT * FROM public.\"TipoUsuario\";";
    PreparedStatement sentencia =  null;
    Conexion con = new Conexion();
    Connection conne = con.getConexion();
    TipoUsuarioDTO tdu = new TipoUsuarioDTO();

    public TipoDeUsuarioDAO() {
    }
    
    public ArrayList<TipoUsuarioDTO> listarTipos() {
        ArrayList<TipoUsuarioDTO> atdu = new ArrayList<TipoUsuarioDTO>();
        try{
            sentencia = conne.prepareStatement(cadenaBuscar);
            ResultSet rs = sentencia.executeQuery();
            while(rs.next()){
                tdu.setIDTipo(rs.getInt("IDTipo"));
                tdu.setTipoDeUsuario(rs.getString("TipoDeUsuario"));
                atdu.add(tdu);
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return atdu;
    }
    
       
}
