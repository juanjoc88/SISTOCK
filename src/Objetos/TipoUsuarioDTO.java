
package Objetos;

public class TipoUsuarioDTO {
    
    private int IDTipo;
    private String TipoDeUsuario;

    public TipoUsuarioDTO() {
    }

    public int getIDTipo() {
        return IDTipo;
    }

    public String getTipoDeUsuario() {
        return TipoDeUsuario;
    }

    public void setIDTipo(int IDTipo) {
        this.IDTipo = IDTipo;
    }

    public void setTipoDeUsuario(String TipoDeUsuario) {
        this.TipoDeUsuario = TipoDeUsuario;
    }
    
}
