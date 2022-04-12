
package Objetos;

public class RemitosDTO {
    
    private int CodRemito;
    private int NroPedidoP;
    private String Fecha;
    
    public RemitosDTO(){
    }

    public int getCodRemito() {
        return CodRemito;
    }

    public int getNroPedidoP() {
        return NroPedidoP;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setCodRemito(int CodRemito) {
        this.CodRemito = CodRemito;
    }

    public void setNroPedidoP(int NroPedidoP) {
        this.NroPedidoP = NroPedidoP;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
