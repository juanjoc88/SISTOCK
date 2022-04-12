
package Objetos;

public class EmpleadosDTO {
    
    private int DNI;
    private String NomApe;
    private String Domicilio;
    private String Telefono;
    private String Correo;
    private String Comercio;
    private int CodEmpleado;

    public EmpleadosDTO() {
    }

    
    public int getDNI() {
        return DNI;
    }
    
    public String getNomApe() {
        return NomApe;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getComercio() {
        return Comercio;
    }

    public int getCodEmpleado() {
        return CodEmpleado;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    public void setNomApe(String NomApe) {
        this.NomApe = NomApe.toUpperCase();
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio.toUpperCase();
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono.toUpperCase();
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo.toUpperCase();
    }

    public void setComercio(String Comercio) {
        this.Comercio = Comercio.toUpperCase();
    }

    public void setCodEmpleado(int CodEmpleado) {
        this.CodEmpleado = CodEmpleado;
    }
    
}
