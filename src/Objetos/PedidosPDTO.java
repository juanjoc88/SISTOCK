
package Objetos;

public class PedidosPDTO {
    
    private int NroPedidoP;
    private int CodProveedor;
    private String fecha;
    private float MontoTotal;
    private String EstadoEntrega;

    public PedidosPDTO(){
    }

    public int getNroPedidoP() {
        return NroPedidoP;
    }

    public int getCodProveedor() {
        return CodProveedor;
    }

    public String getFecha() {
        return fecha;
    }

    public float getMontoTotal() {
        return MontoTotal;
    }

    public String getEstadoEntrega() {
        return EstadoEntrega;
    }

    public void setNroPedidoP(int NroPedidoP) {
        this.NroPedidoP = NroPedidoP;
    }

    public void setCodProveedor(int CodProveedor) {
        this.CodProveedor = CodProveedor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMontoTotal(float MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public void setEstadoEntrega(String EstadoEntrega) {
        this.EstadoEntrega = EstadoEntrega.toUpperCase();
    }
    
    

    
}
