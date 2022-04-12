package Objetos;

public class ClientesDTO {
    
    private String NomApe;
    private String Domicilio;
    private String Telefono;
    private String Correo;
    private String NombreComercial;
    private int DNI;
    
    public ClientesDTO(){
    }

    public String getNomApe() {
        return NomApe;
    }

    public int getDNI(){
        return DNI;
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

    public String getNombreComercial() {
        return NombreComercial;
    }

    public void setNomApe(String NomApe) {
        this.NomApe = NomApe.toUpperCase();
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public void setNombreComercial(String NombreComercial) {
        this.NombreComercial = NombreComercial.toUpperCase();
    }

}
