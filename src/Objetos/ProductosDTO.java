
package Objetos;

public class ProductosDTO {
    
    private int CodProd;
    private String Nombre;
    private String Descripcion;
    private float Precio ;
    private int Stock;
    private int CantidadMinima;
    private int Rubro;
    
    public ProductosDTO(){
    }

    public int getCodProd() {
        return CodProd;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public float getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public int getCantidadMinima() {
        return CantidadMinima;
    }

    public int getRubro() {
        return Rubro;
    }
    
    public void setCodProd(int CodProd) {
        this.CodProd = CodProd;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre.toUpperCase();
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion.toUpperCase();
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setCantidadMinima(int CantidadMinima) {
        this.CantidadMinima = CantidadMinima;
    }
    
    public void setRubro(int Rubro) {
        this.Rubro = Rubro;
    }
    
}
