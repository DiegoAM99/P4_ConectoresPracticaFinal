package codigo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xp
 */
public class Conectores extends javax.swing.JFrame {
    GestorConexion gc = new GestorConexion();
    PoolConexiones pc = new PoolConexiones();
    /**
     * Creates new form Conectores
     */
    public Conectores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonMostrarTablaClientes = new javax.swing.JButton();
        jButtonMostrarTablaCliente_Producto = new javax.swing.JButton();
        jButtonMostrarTablaProducto = new javax.swing.JButton();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldNum_Contacto = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldDNI_Cliente = new javax.swing.JTextField();
        jTextFieldID_Producto = new javax.swing.JTextField();
        jTextFieldMarca_Producto = new javax.swing.JTextField();
        jTextFieldNombre_Producto = new javax.swing.JTextField();
        jTextFieldFecha_Venta = new javax.swing.JTextField();
        jTextFieldID_producto = new javax.swing.JTextField();
        jTextFieldnombre_producto = new javax.swing.JTextField();
        jTextFieldmarca = new javax.swing.JTextField();
        jTextFieldfecha_venta = new javax.swing.JTextField();
        jButtonAnnadir_Cliente = new javax.swing.JButton();
        jButtonModificar_Cliente = new javax.swing.JButton();
        jButtonEliminar_Cliente = new javax.swing.JButton();
        jButtonAnnadir_Producto = new javax.swing.JButton();
        jButtonModificar_Producto = new javax.swing.JButton();
        jButtonEliminar_Producto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonMostrarTablaClientes.setText("Mostrar Tabla Clientes");
        jButtonMostrarTablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMostrarTablaClientesMousePressed(evt);
            }
        });

        jButtonMostrarTablaCliente_Producto.setText("Mostrar Tabla Cliente_Producto");
        jButtonMostrarTablaCliente_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMostrarTablaCliente_ProductoMousePressed(evt);
            }
        });

        jButtonMostrarTablaProducto.setText("Mostrar Tabla Producto");
        jButtonMostrarTablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMostrarTablaProductoMousePressed(evt);
            }
        });

        jTextFieldDNI.setText("DNI");

        jTextFieldNombre.setText("Nombre");

        jTextFieldApellidos.setText("Apellidos");

        jTextFieldCorreo.setText("Correo");

        jTextFieldNum_Contacto.setText("num_Contacto");

        jTextFieldDireccion.setText("Direccion");

        jTextFieldDNI_Cliente.setText("DNI_cliente");

        jTextFieldID_Producto.setText("id_producto");

        jTextFieldMarca_Producto.setText("marca_producto");

        jTextFieldNombre_Producto.setText("nombre_producto");

        jTextFieldFecha_Venta.setText("fecha_venta");

        jTextFieldID_producto.setText("id_producto");

        jTextFieldnombre_producto.setText("nombre_producto");

        jTextFieldmarca.setText("marca");

        jTextFieldfecha_venta.setText("fecha_venta");

        jButtonAnnadir_Cliente.setText("Añadir Cliente");
        jButtonAnnadir_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAnnadir_ClienteMousePressed(evt);
            }
        });

        jButtonModificar_Cliente.setText("Modificar Cliente");
        jButtonModificar_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonModificar_ClienteMousePressed(evt);
            }
        });

        jButtonEliminar_Cliente.setText("Eliminar Cliente");
        jButtonEliminar_Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonEliminar_ClienteMousePressed(evt);
            }
        });

        jButtonAnnadir_Producto.setText("Añadir Producto");
        jButtonAnnadir_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAnnadir_ProductoMousePressed(evt);
            }
        });

        jButtonModificar_Producto.setText("Modificar Producto");
        jButtonModificar_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonModificar_ProductoMousePressed(evt);
            }
        });

        jButtonEliminar_Producto.setText("Eliminar Producto");
        jButtonEliminar_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonEliminar_ProductoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNum_Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDNI_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMarca_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonAnnadir_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(jButtonModificar_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonEliminar_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldfecha_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jTextFieldmarca, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jTextFieldnombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jTextFieldID_producto)
                            .addComponent(jButtonAnnadir_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonModificar_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEliminar_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMostrarTablaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMostrarTablaCliente_Producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonMostrarTablaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDNI_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldID_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldnombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarTablaClientes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldMarca_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonMostrarTablaCliente_Producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldfecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonMostrarTablaProducto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNum_Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldFecha_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAnnadir_Producto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar_Producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAnnadir_Cliente)
                    .addComponent(jButtonEliminar_Producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar_Cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar_Cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarTablaClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaClientesMousePressed
        ResultSet rs = gc.Mostrar_TablaClientes();
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        try{
            modelo.addColumn("DNI");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Correo");
            modelo.addColumn("num_Contacto");
            modelo.addColumn("Direccion");
            
            while(rs.next()){
                Object[] obj1 = new Object[6];
                obj1[0] = (rs.getInt(1));
                obj1[1] = (rs.getString(2));
                obj1[2] = (rs.getString(3));
                obj1[3] = (rs.getBlob(4));
                obj1[3] = (rs.getBlob(5));
                obj1[3] = (rs.getBlob(6));
                
                modelo.addRow(obj1);
                obj1 = null;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonMostrarTablaClientesMousePressed

    private void jButtonMostrarTablaCliente_ProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaCliente_ProductoMousePressed
        ResultSet rs = gc.Mostrar_TablaClientes();
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        try{
            modelo.addColumn("DNI_cliente");
            modelo.addColumn("id_producto");
            modelo.addColumn("marca_producto");
            modelo.addColumn("nombre_producto");
            modelo.addColumn("fecha_venta");
            modelo.addColumn("Direccion");
            
            while(rs.next()){
                Object[] obj1 = new Object[6];
                obj1[0] = (rs.getInt(1));
                obj1[1] = (rs.getString(2));
                obj1[2] = (rs.getString(3));
                obj1[3] = (rs.getString(4));
                obj1[4] = (rs.getString(5));
                obj1[5] = (rs.getString(6));
                
                modelo.addRow(obj1);
                obj1 = null;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonMostrarTablaCliente_ProductoMousePressed

    private void jButtonMostrarTablaProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMostrarTablaProductoMousePressed
        ResultSet rs = gc.Mostrar_TablaClientes();
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        try{
            modelo.addColumn("id_producto");
            modelo.addColumn("nombre_producto");
            modelo.addColumn("marca");
            modelo.addColumn("fecha_venta");
            
            
            while(rs.next()){
                Object[] obj1 = new Object[4];
                obj1[0] = (rs.getInt(1));
                obj1[1] = (rs.getString(2));
                obj1[2] = (rs.getString(3));
                obj1[3] = (rs.getBlob(4));
              
                
                modelo.addRow(obj1);
                obj1 = null;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonMostrarTablaProductoMousePressed

    private void jButtonAnnadir_ClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnnadir_ClienteMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("INSERT INTO clientes (DNI, Nombre, Apellidos, Correo, num_Contacto, Direccion) VALUES(?,?,?,?,?,?)");
            pst.setString(1, jTextFieldDNI.getText());
            pst.setString(2, jTextFieldNombre.getText());
            pst.setString(3, jTextFieldApellidos.getText());
            pst.setString(4, jTextFieldCorreo.getText());
            pst.setString(5, jTextFieldNum_Contacto.getText());
            pst.setString(6, jTextFieldDireccion.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Guardado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al hacer un INSERT");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cliente Duplicado");
    }  
    }//GEN-LAST:event_jButtonAnnadir_ClienteMousePressed

    private void jButtonModificar_ClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificar_ClienteMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("Update clientes  SET  Nombre =?, Apellidos =?, Correo =?, num_Contacto =?, Direccion =?  WHERE DNI=?");
            pst.setString(1, jTextFieldNombre.getText());
            pst.setString(2, jTextFieldApellidos.getText());
            pst.setString(3, jTextFieldCorreo.getText());
            pst.setString(4, jTextFieldNum_Contacto.getText());
            pst.setString(5, jTextFieldDireccion.getText());
            pst.setString(6, jTextFieldDNI.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Modificado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Modificar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cliente No Modificado");
    }
    }//GEN-LAST:event_jButtonModificar_ClienteMousePressed

    private void jButtonEliminar_ClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminar_ClienteMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("DELETE FROM clientes  WHERE DNI=?");
            pst.setInt(1, Integer.parseInt(jTextFieldDNI.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Borrado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Borrar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cliente No Eliminado");
    }
    }//GEN-LAST:event_jButtonEliminar_ClienteMousePressed

    private void jButtonAnnadir_ProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAnnadir_ProductoMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("INSERT INTO producto (id_producto, nombre_producto, marca, fecha_venta) VALUES(?,?,?,?)");
            pst.setString(1, jTextFieldID_producto.getText());
            pst.setString(2, jTextFieldnombre_producto.getText());
            pst.setString(3, jTextFieldmarca.getText());
            pst.setString(4, jTextFieldfecha_venta.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Guardado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al hacer un INSERT");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Producto Duplicado");
    }
    }//GEN-LAST:event_jButtonAnnadir_ProductoMousePressed

    private void jButtonModificar_ProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificar_ProductoMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("Update producto  SET  nombre_producto =?, marca =?, fecha_venta =?,  WHERE id_producto =?");
            pst.setString(1, jTextFieldnombre_producto.getText());
            pst.setString(2, jTextFieldmarca.getText());
            pst.setString(3, jTextFieldfecha_venta.getText());
            pst.setString(4, jTextFieldNum_Contacto.getText());
            pst.setString(5, jTextFieldID_producto.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto Modificado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Modificar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Producto No Modificado");
    }
    }//GEN-LAST:event_jButtonModificar_ProductoMousePressed

    private void jButtonEliminar_ProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminar_ProductoMousePressed
        try{
            gc.conn1.setAutoCommit(false);
            PreparedStatement pst;
            pst = gc.conn1.prepareStatement("DELETE FROM producto  WHERE id_producto=?");
            pst.setInt(1, Integer.parseInt(jTextFieldID_producto.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Borrado");
            gc.conn1.commit();
        }
    catch(SQLException ex){
            System.out.println("ERROR: al Borrar");
            try{
                if(gc.conn1!=null)
                    gc.conn1.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Cliente No Eliminado");
    }
    }//GEN-LAST:event_jButtonEliminar_ProductoMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conectores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conectores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnadir_Cliente;
    private javax.swing.JButton jButtonAnnadir_Producto;
    private javax.swing.JButton jButtonEliminar_Cliente;
    private javax.swing.JButton jButtonEliminar_Producto;
    private javax.swing.JButton jButtonModificar_Cliente;
    private javax.swing.JButton jButtonModificar_Producto;
    private javax.swing.JButton jButtonMostrarTablaCliente_Producto;
    private javax.swing.JButton jButtonMostrarTablaClientes;
    private javax.swing.JButton jButtonMostrarTablaProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDNI_Cliente;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFecha_Venta;
    private javax.swing.JTextField jTextFieldID_Producto;
    private javax.swing.JTextField jTextFieldID_producto;
    private javax.swing.JTextField jTextFieldMarca_Producto;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombre_Producto;
    private javax.swing.JTextField jTextFieldNum_Contacto;
    private javax.swing.JTextField jTextFieldfecha_venta;
    private javax.swing.JTextField jTextFieldmarca;
    private javax.swing.JTextField jTextFieldnombre_producto;
    // End of variables declaration//GEN-END:variables
}
