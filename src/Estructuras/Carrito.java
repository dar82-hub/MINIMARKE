package Estructuras;

import Modelo.ItemVentaCarrito;
import java.util.ArrayList;

public class Carrito {
    
    private ArrayList<ItemVentaCarrito> items;
    
    public Carrito() {
        items = new ArrayList<>();
    }
    
    //agrega productos al carrito
    public void agregar(ItemVentaCarrito nuevo) {
        for (ItemVentaCarrito item : items) {
            if (item.getCodigoProducto().equals(nuevo.getCodigoProducto())) {
                item.setCantidad(item.getCantidad() + nuevo.getCantidad());
            return; 
        }
    }
    items.add(nuevo); 
}
 
    // quita la fila en la posición indicada 
    public void eliminar(int indice) {
        if (indice >= 0 && indice < items.size()) {
            items.remove(indice);
        }
    }
 
    // Devuelve la lista para que la ventana pueda dibujar la tabla
    public ArrayList<ItemVentaCarrito> getItems() {
        return items;
    }
 
    // Suma el subtotal de todas las filas
    public double calcularSubtotal() {
        double suma = 0;
        for (ItemVentaCarrito item : items) {
            suma = suma + item.getSubtotal();
        }
        return suma;
    }

}
