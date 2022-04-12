
package Objetos;

public class ProdPedidosCDTO {
    
    private int NroPedidoC;
    private int CodProd;
    private int Cantidad;
    private float precio;
    private String Nom;
    
    public ProdPedidosCDTO(){
    }

    public int getNroPedidoC() {
        return NroPedidoC;
    }

    public int getCodProd() {
        return CodProd;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNom() {
        return Nom;
    }
    

    public void setNroPedidoC(int NroPedidoC) {
        this.NroPedidoC = NroPedidoC;
    }

    public void setCodProd(int CodProd) {
        this.CodProd = CodProd;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
        
}
