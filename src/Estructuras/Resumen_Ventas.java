    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import Modelo.ItemVentaCarrito;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author darwi
 */
public class Resumen_Ventas {
     private HashMap<String, Integer> productosVendidos;

    public Resumen_Ventas() {
        this.productosVendidos = new HashMap();
    }
        public void acumular(ItemVentaCarrito item) {
        String nombre = item.getNombreProducto();
        int cantidad = item.getCantidad();

        productosVendidos.merge(nombre, cantidad, Integer::sum);
    }

    public void acumularItems(ArrayList<ItemVentaCarrito> items) {
        for (ItemVentaCarrito item : items) {
            acumular(item);
        }
    }

    public HashMap<String, Integer> getProductosVendidos() {
        return productosVendidos;
    }
    
}
