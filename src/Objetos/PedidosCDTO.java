
package Objetos;


public class PedidosCDTO {
    
    private int CodCliente;
    private String Fecha;
    private String MedioDePago;
    private float MontoTotal;
    private String EstadoEntrega;
    
    public PedidosCDTO(){
    }

    public int getCodCliente() {
        return CodCliente;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getMedioDePago() {
        return MedioDePago;
    }

    public float getMontoTotal() {
        return MontoTotal;
    }

    public String getEstadoEntrega() {
        return EstadoEntrega;
    }

    public void setCodCliente(int CodCliente) {
        this.CodCliente = CodCliente;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setMedioDePago(String MedioDePago) {
        this.MedioDePago = MedioDePago.toUpperCase();
    }

    public void setMontoTotal(float MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public void setEstadoEntrega(String EstadoEntrega) {
        this.EstadoEntrega = EstadoEntrega.toUpperCase();
    }
}
