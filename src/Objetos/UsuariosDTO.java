
package Objetos;

public class UsuariosDTO {
    
    private int DNI;
    private String Usuario;
    private String Contraseña;
    private int Tipo;

    public UsuariosDTO() {
    }

    public int getDNI() {
        return DNI;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }
    
}
