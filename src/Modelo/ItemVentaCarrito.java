package Modelo;

public class ItemVentaCarrito {
    
    private String codigoProducto;   
    private String nombreProducto;   
    private int cantidad;            
    private double precioUnitario;   
    private double subtotal;         

    public ItemVentaCarrito() {
    }

    public ItemVentaCarrito(String codigoProducto, String nombreProducto, int cantidad, double precioUnitario) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
}

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Si cambia la cantidad, el subtotal se vuelve a calcular
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = cantidad * precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    // Si cambia el precio, el subtotal se vuelve a calcular
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.subtotal = cantidad * precioUnitario;
    }

    // Sin setter: el subtotal siempre se calcula, nunca se escribe a mano
    public double getSubtotal() {
        return subtotal;
    }
}
