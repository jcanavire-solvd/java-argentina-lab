public class Value {
    private String fecha;
    private Double compra;
    private Double venta;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getCompra() {
        return compra;
    }

    public void setCompra(Double compra) {
        this.compra = compra;
    }

    public Double getVenta() {
        return venta;
    }

    public void setVenta(Double venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "{" +
                "fecha='" + fecha + '\'' +
                ", compra=" + compra +
                ", venta=" + venta +
                '}';
    }
}
