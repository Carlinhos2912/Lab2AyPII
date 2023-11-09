package laboratorio2.BackEnd;

import java.text.DecimalFormat;

public class Autos {

    private String Placa;   //Formato XXX000
    private String Color;   //Color primario del automovil
    private String Modelo; //Año de salida al mercado del automovil
    private double PrecioDeVenta;  //Precio de venta del automovil
    private double PrecioDeCompra;

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public double getPrecioDeVenta() {
        return PrecioDeVenta;
    }

    public void setPrecioDeVenta(double PrecioDeVenta) {
        this.PrecioDeVenta = PrecioDeVenta;
    }

    public double getPrecioDeCompra() {
        return PrecioDeCompra;
    }

    public void setPrecioDeCompra(double PrecioDeCompra) {
        this.PrecioDeCompra = PrecioDeCompra;
    }

    public static Object[] createTableItem(Autos item, Object[] NewCarsRow) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        NewCarsRow[0] = item.getPlaca();
        NewCarsRow[1] = item.getModelo();
        NewCarsRow[2] = item.getColor();
        NewCarsRow[3] = df.format(item.getPrecioDeVenta());
        return NewCarsRow;
    }

}
