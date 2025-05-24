
package modelos;


public class Factura {

    private int Id;
    private int numeroFactura;
    private CitaMedica citaMedica;
    private double TotalPagar;
    
    public Factura(){
        
    }

    
    public Factura(int Id, int numeroFactura, CitaMedica citaMedica, double TotalPagar) {
        this.Id = Id;
        this.numeroFactura = numeroFactura;
        this.citaMedica = citaMedica;
        this.TotalPagar = TotalPagar;
    }
    
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public CitaMedica getCitaMedica() {
        return citaMedica;
    }

    public void setCitaMedica(CitaMedica citaMedica) {
        this.citaMedica = citaMedica;
    }

    public double getTotalPagar() {
        return TotalPagar;
    }

    public void setTotalPagar(double TotalPagar) {
        this.TotalPagar = TotalPagar;
    }

    
    
    
    
}
