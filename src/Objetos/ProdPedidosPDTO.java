
package Objetos;


public class ProdPedidosPDTO {
    
   private int NroPedidoP;
    private int CodProd;
    private int Cantidad;
    private float precio;
    
    public ProdPedidosPDTO(){
    }

    public int getNroPedidoP() {
        return NroPedidoP;
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

    public void setNroPedidoP(int NroPedidoP) {
        this.NroPedidoP = NroPedidoP;
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
    
}
