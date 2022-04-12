
package Objetos;

public class ProveedoresDTO {
    
    private int CodProveedor;
    private String NomApe;
    private String Domicilio;
    private String Telefono;
    private String Correo;
    private String Fax;
    private String Cuit;
    private int Rubro;
    
    public ProveedoresDTO(){
    }

    public int getCodProveedor() {
        return CodProveedor;
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

    public String getFax() {
        return Fax;
    }
    
    public String getCuit() {
        return Cuit;
    }

    public int getRubro() {
        return Rubro;
    }

    public void setCodProveedor(int CodProveedor) {
        this.CodProveedor = CodProveedor;
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

    public void setFax(String Fax) {
        this.Fax = Fax.toUpperCase();
    }
    
    public void setCuit(String Cuit) {
        this.Cuit = Cuit;
    }

    public void setRubro(int Rubro) {
        this.Rubro = Rubro;
    }
    
    
    
}
