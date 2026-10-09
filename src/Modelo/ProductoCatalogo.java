package Modelo;

public class ProductoCatalogo {
    
    private String codigo;            
    private String nombre;            
    private int cantidad;             
    private double precio;            
    private String fechaVencimiento;  

    public ProductoCatalogo() {
    }

    public ProductoCatalogo(String codigo, String nombre, int cantidad, double precio, String fechaVencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
    // Texto que se muestra cuando este producto está dentro del JList de sugerencias.
    // Solo se ve el nombre, aunque el objeto guarde los 5 datos.
    @Override
    public String toString() {
        return nombre;
    }
}
