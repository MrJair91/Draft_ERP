
package com.mycompany.draft_erp;

import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author mrjai
 */
public class Orden_compra extends javax.swing.JFrame {

    String productos[]={"Hr Consultoria Tecnica","Hr Asesoria Juridica","Papeleria"};
    double precios[]={100000,150000,50000};
    double precio=0;
    int cantidad=0;
    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Compra> listaCompra=new ArrayList<Compra>();
    
    
    
    
    
    
    
    public Orden_compra() {
        initComponents();
        this.setTitle("Orden de compra");
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(productos);
        cbo_producto.setModel(comboModel);
        modelo.addColumn("Descripción");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Importe");
        actualizarTabla();
        clacularPrecio();
      
                
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        cbo_producto = new javax.swing.JComboBox<>();
        spn_cantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();
        lbl_precio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_subtotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_iva = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_importe = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden de Compra"));

        jLabel1.setText("Producto o servicio");

        jLabel2.setText("Cantidad");

        jLabel3.setText("Precio");

        jLabel4.setText("Importe");

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        cbo_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_productoActionPerformed(evt);
            }
        });

        spn_cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));
        spn_cantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_cantidadStateChanged(evt);
            }
        });

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_productos);

        lbl_precio.setText("5.0Cop");

        jLabel6.setText("subtotal");

        jLabel7.setText("Total");

        lbl_subtotal.setText("5.0Cop");

        jLabel9.setText("IVA");

        lbl_iva.setText("5.0Cop");

        lbl_total.setText("5.0Cop");

        lbl_importe.setText("5.0Cop");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btn_agregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_subtotal)
                    .addComponent(lbl_iva)
                    .addComponent(lbl_total))
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(66, 66, 66)
                                .addComponent(spn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_importe)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 22, Short.MAX_VALUE)
                                .addComponent(lbl_precio)
                                .addGap(63, 63, 63))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(cbo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_precio))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_importe)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(spn_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_subtotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_iva)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total)
                    .addComponent(jLabel7))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        Compra compra=new Compra();
        compra.setId(cbo_producto.getSelectedIndex());
        compra.setDescripcion(cbo_producto.getSelectedItem().toString());
        compra.setPrecio(precio);
        compra.setCantidad(cantidad);
        compra.setImporte(cantidad*precio);
        if(!buscarCompra(compra)){
        listaCompra.add(compra);
        }
        actualizarTabla();
        borrarVenta();
        
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    public boolean buscarCompra(Compra nueva){
        for (Compra c:listaCompra){
        if (c.getId()==nueva.getId()){
            int nuevaCantidad =c.getCantidad()+nueva.getCantidad();
            c.setCantidad(nuevaCantidad);
            c.setImporte(c.getPrecio()*nuevaCantidad);
            return true;
            }
        }
        return false;
    }
    
            
    public void borrarVenta(){
        precio=0;
        cantidad=1;
        lbl_precio.setText(aMoneda(0));
        lbl_importe.setText(aMoneda(0));
        cbo_producto.setSelectedIndex(0);
        spn_cantidad.setValue(1);
        clacularPrecio();
        
    }
    private void cbo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_productoActionPerformed
        clacularPrecio();
    }//GEN-LAST:event_cbo_productoActionPerformed

    private void spn_cantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_cantidadStateChanged
        clacularPrecio();
    }//GEN-LAST:event_spn_cantidadStateChanged

    public void clacularPrecio(){
        precio=precios[cbo_producto.getSelectedIndex()];
        cantidad=Integer.parseInt(spn_cantidad.getValue().toString());
        lbl_precio.setText(aMoneda(precio));
        lbl_importe.setText(aMoneda(precio*cantidad));
        
    }
   
    public String aMoneda(double precio) {
        return "$ " +Math.round(precio*100.0)/100.0+ " COP";
    }
    
    public void actualizarTabla(){
        while(modelo.getRowCount()>0){
        modelo.removeRow(0);
        }
        double subtotal=0;
        for (Compra c: listaCompra){
        Object x[]=new Object[4];                
        x[0]=c.getDescripcion();
        x[1]=aMoneda(c.getPrecio());
        x[2]=c.getCantidad();
        x[3]=aMoneda(c.getImporte());
        subtotal+=c.getImporte();
        modelo.addRow(x);
        double iva=(subtotal*0.19);
        double total=(subtotal+iva);
        lbl_subtotal.setText(aMoneda(subtotal));
        lbl_iva.setText(aMoneda(iva));
        lbl_total.setText(aMoneda(total));
        
        }
        
        tbl_productos.setModel(modelo);
    
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orden_compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JComboBox<String> cbo_producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_importe;
    private javax.swing.JLabel lbl_iva;
    private javax.swing.JLabel lbl_precio;
    private javax.swing.JLabel lbl_subtotal;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JSpinner spn_cantidad;
    private javax.swing.JTable tbl_productos;
    // End of variables declaration//GEN-END:variables
}
