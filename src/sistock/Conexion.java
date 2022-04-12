
package sistock;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
//Parametros para la conexion con al base de datos apuntda
    String URL = "jdbc:postgresql://localhost:5432/SISTOCK";
    String usuario = "postgres";
    String contraseña = "root";
    Connection conexion = null;
    
//Este metodo se conecta    
    public Conexion(){
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, usuario, contraseña);
        }
        catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
//Este metodo devuelve la conexion a las clases que lo necesiten.    
    public Connection getConexion() {
        return conexion;
    }
//Este metodo desconecta.    
    public void desconectar(){
        conexion = null;
    }
    
}
