package Visual;

import Estructuras.Carrito;
import Modelo.ItemVentaCarrito;
import Modelo.ProductoCatalogo;
import javax.swing.table.DefaultTableModel;

public class VentanaVentas extends javax.swing.JFrame {
    
    private Carrito carrito = new Carrito();
    
    public VentanaVentas() {
        initComponents();
         setLocationRelativeTo(null);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblBuscarProducto = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        scrollSugerencias = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSugerencias = new javax.swing.JList<>();
        lblCarrito = new javax.swing.JLabel();
        scrollCarrito = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        btnEliminarSeleccionado = new javax.swing.JButton();
        btnVerVentasDia = new javax.swing.JButton();
        btnConfirmarVenta = new javax.swing.JButton();
        lblSubtotal = new javax.swing.JLabel();
        lblIgv = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("Registro de Ventas y Cierre de Caja");

        lblBuscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBuscarProducto.setText("Buscar producto:");

        listSugerencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSugerenciasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listSugerencias);

        scrollSugerencias.setViewportView(jScrollPane1);

        lblCarrito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCarrito.setText("Carrito:");

        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cant.", "Precio", "Subtotal"
            }
        ));
        scrollCarrito.setViewportView(tablaCarrito);

        btnEliminarSeleccionado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEliminarSeleccionado.setText("Eliminar seleccionado");
        btnEliminarSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeleccionadoActionPerformed(evt);
            }
        });

        btnVerVentasDia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerVentasDia.setText("Ver ventas del día");
        btnVerVentasDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVentasDiaActionPerformed(evt);
            }
        });

        btnConfirmarVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirmarVenta.setText("Confirmar venta");

        lblSubtotal.setText("Subtotal: ");

        lblIgv.setText("IGV (18%):");

        lblTotal.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollSugerencias, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(lblBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscador))
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnEliminarSeleccionado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerVentasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnConfirmarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(scrollSugerencias, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerVentasDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnConfirmarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Copia lo que hay en el ArrayList del carrito a la tabla de la pantalla
    private void actualizarTablaCarrito() {
    //Tomamos el modelo de la tabla (las columnas que pusiste en Design)
        DefaultTableModel modelo = (DefaultTableModel) tablaCarrito.getModel();

    //Borramos todas las filas que se ven, para dibujar desde cero
        modelo.setRowCount(0);

    //Recorremos el ArrayList y agregamos una fila por cada producto
        for (ItemVentaCarrito item : carrito.getItems()) {
            modelo.addRow(new Object[]{
                item.getNombreProducto(),   
                item.getCantidad(),         
                item.getPrecioUnitario(),   
                item.getSubtotal()          
            });
        }
    }
    
    // Calcula los montos del carrito y los muestra en los labels
    private void actualizarTotales() {
    //Suma de los subtotales de todas las filas del carrito
        double subtotal = carrito.calcularSubtotal();

    //IGV: 18% del subtotal
        double igv = subtotal * 0.18;

    //Total que paga el cliente
        double total = subtotal + igv;

    //Se muestran en pantalla, con 2 decimales
        lblSubtotal.setText("Subtotal: S/ " + String.format("%.2f", subtotal));
        lblIgv.setText("IGV (18%): S/ " + String.format("%.2f", igv));
        lblTotal.setText("TOTAL: S/ " + String.format("%.2f", total));
}

    private void btnVerVentasDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVentasDiaActionPerformed
        new VentanaResumenDia().setVisible(true);
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVerVentasDiaActionPerformed

    private void listSugerenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSugerenciasMouseClicked
    // El producto en el que hizo clic el empleado
            ProductoCatalogo seleccionado = listSugerencias.getSelectedValue();
    
    // Si hizo clic en un espacio vacío, no hay producto: no hacemos nada
            if (seleccionado == null) {
                return;
            }
    
    //Se crea la fila del carrito con los datos del producto 
            ItemVentaCarrito item = new ItemVentaCarrito(
                seleccionado.getCodigo(),
                seleccionado.getNombre(),
                1,
                seleccionado.getPrecio()
            );
    
    //se agrega al ArrayList del carrito 
            carrito.agregar(item);
            // se ve en la tabla 
            actualizarTablaCarrito(); 
            // se actualizan los labels
            actualizarTotales();
    }//GEN-LAST:event_listSugerenciasMouseClicked

    private void btnEliminarSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionadoActionPerformed
    //Número de la fila que el empleado seleccionó en la tabla 
            int fila = tablaCarrito.getSelectedRow();

    //Si no hay fila seleccionada, no hacemos nada
            if (fila == -1) {
                return;
            }

    //se quita del ArrayList del carrito 
            carrito.eliminar(fila);

    //Se vuelve a dibujar la tabla con lo que quedó en el carrito
            actualizarTablaCarrito();
    // se actualizan los labels
            actualizarTotales();
            
    }//GEN-LAST:event_btnEliminarSeleccionadoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarVenta;
    private javax.swing.JButton btnEliminarSeleccionado;
    private javax.swing.JButton btnVerVentasDia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscarProducto;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblIgv;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<ProductoCatalogo> listSugerencias;
    private javax.swing.JScrollPane scrollCarrito;
    private javax.swing.JScrollPane scrollSugerencias;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}
