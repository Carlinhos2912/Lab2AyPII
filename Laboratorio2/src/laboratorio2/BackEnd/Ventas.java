package laboratorio2.BackEnd;

public class Ventas {
    
    private long NumVenta;  //Numero de factura
    private int IdComprador;
    private String AutoVendido; //Vector de placas de los autos vendidos 
    private String NombreDelVendedor;
    private String FechaYhoraDeLaVenta;
    private double ValorTotal; //Monto total de la venta

    public long getNumVenta() {
        return NumVenta;
    }

    public void setNumVenta(long NumVenta) {
        this.NumVenta = NumVenta;
    }

    public int getIdComprador() {
        return IdComprador;
    }

    public void setIdComprador(int IdComprador) {
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

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
    
}
