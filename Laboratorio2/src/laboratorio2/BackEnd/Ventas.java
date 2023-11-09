package laboratorio2.BackEnd;

public class Ventas {
    
    private long NumVenta;  //Numero de factura
    private long IdComprador;
    private String AutoVendido; //Vector de placas de los autos vendidos 
    private String NombreDelVendedor;
    private String FechaYhoraDeLaVenta;
    private double PagoTotal;
    private double Balance;

    public long getNumVenta() {
        return NumVenta;
    }

    public void setNumVenta(long NumVenta) {
        this.NumVenta = NumVenta;
    }

    public long getIdComprador() {
        return IdComprador;
    }

    public void setIdComprador(long IdComprador) {
        this.IdComprador = IdComprador;
    }

    public String getAutoVendido() {
        return AutoVendido;
    }

    public void setAutoVendido(String AutoVendido) {
        this.AutoVendido = AutoVendido;
    }

    public String getNombreDelVendedor() {
        return NombreDelVendedor;
    }

    public void setNombreDelVendedor(String NombreDelVendedor) {
        this.NombreDelVendedor = NombreDelVendedor;
    }

    public String getFechaYhoraDeLaVenta() {
        return FechaYhoraDeLaVenta;
    }

    public void setFechaYhoraDeLaVenta(String FechaYhoraDeLaVenta) {
        this.FechaYhoraDeLaVenta = FechaYhoraDeLaVenta;
    }

    public double getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(double PagoTotal) {
        this.PagoTotal = PagoTotal;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }
    
}
