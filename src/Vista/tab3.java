/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.ClienteDao;
import Modelo.Detalle;
import Modelo.Productos;
import Modelo.ProductosDao;
import Modelo.Proveedor;
import Modelo.ProveedorDao;
import Modelo.Venta;
import Modelo.VentaDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivant
 */
public class tab3 extends javax.swing.JPanel {

   Cliente cl = new Cliente();
    ClienteDao client = new ClienteDao();
    Proveedor pr = new Proveedor();
    ProveedorDao prDao = new ProveedorDao();
    Productos pro = new Productos();
    ProductosDao proDao = new ProductosDao();
    Venta v = new Venta();
    VentaDao vDao = new VentaDao();
    Detalle dv = new Detalle();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();
    int item;
    
    public tab3() throws ClassNotFoundException, SQLException {
        initComponents();
        txtIdProveedor.setVisible(false);
        LimpiarTable();
        ListarProveedor();
    }

    public JTable getTableProveedor() {
        return TableProveedor;
    }

    public void setTableProveedor(JTable TableProveedor) {
        this.TableProveedor = TableProveedor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtDNIProveedor = new javax.swing.JTextField();
        txtNombreProveedor = new javax.swing.JTextField();
        txtTelefonoProveedor = new javax.swing.JTextField();
        txtDireccionProveedor = new javax.swing.JTextField();
        txtRazonProveedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableProveedor = new javax.swing.JTable();
        btnGuardarProveedor = new javax.swing.JButton();
        btnEditarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnNuevoProveedor = new javax.swing.JButton();
        txtIdProveedor = new javax.swing.JTextField();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DNI:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre:");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel19.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Teléfono:");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel20.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Dirección:");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel21.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Motivo:");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        add(txtDNIProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 100, -1));
        add(txtNombreProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 130, -1));
        add(txtTelefonoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, -1));
        add(txtDireccionProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, -1));
        add(txtRazonProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, -1));

        TableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "TELÉFONO", "DIRECCIÓN", "MOTIVO"
            }
        ));
        TableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProveedorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableProveedor);
        if (TableProveedor.getColumnModel().getColumnCount() > 0) {
            TableProveedor.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 590, 350));

        btnGuardarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-archivo.png"))); // NOI18N
        btnGuardarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProveedorActionPerformed(evt);
            }
        });
        add(btnGuardarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 50, 50));

        btnEditarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProveedorActionPerformed(evt);
            }
        });
        add(btnEditarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 50, 50));

        btnEliminarProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_1.png"))); // NOI18N
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 50, 50));

        btnNuevoProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });
        add(btnNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, 50));

        txtIdProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProveedorActionPerformed(evt);
            }
        });
        add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void TableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProveedorMouseClicked
        int fila = TableProveedor.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(TableProveedor.getValueAt(fila, 0).toString());
        txtDNIProveedor.setText(TableProveedor.getValueAt(fila, 1).toString());
        txtNombreProveedor.setText(TableProveedor.getValueAt(fila, 2).toString());
        txtTelefonoProveedor.setText(TableProveedor.getValueAt(fila, 3).toString());
        txtDireccionProveedor.setText(TableProveedor.getValueAt(fila, 4).toString());
        txtRazonProveedor.setText(TableProveedor.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_TableProveedorMouseClicked

    private void btnGuardarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProveedorActionPerformed
        if(!"".equals(txtDNIProveedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())){
            pr.setDni(txtDNIProveedor.getText());
            pr.setNombre(txtNombreProveedor.getText());
            pr.setTelefono(Integer.parseInt(txtTelefonoProveedor.getText()));
            pr.setDireccion(txtDireccionProveedor.getText());
            pr.setRazon(txtRazonProveedor.getText());
            try {
                prDao.RegistrarProveedor(pr);
                JOptionPane.showMessageDialog(null, "Proveedor Guardado");
                LimpiarTable();
                ListarProveedor();
                LimpiarProveedor();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Ssitema.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Los campos están vacios");
        }
    }//GEN-LAST:event_btnGuardarProveedorActionPerformed

    private void btnEditarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProveedorActionPerformed
        if("".equals(txtIdProveedor.getText())){
            JOptionPane.showMessageDialog(null,"Seleccione una fila");
        }else{
            if(!"".equals(txtDNIProveedor.getText()) || !"".equals(txtNombreProveedor.getText()) || !"".equals(txtTelefonoProveedor.getText()) || !"".equals(txtDireccionProveedor.getText())){
                pr.setDni(txtDNIProveedor.getText());
                pr.setNombre(txtNombreProveedor.getText());
                pr.setTelefono(Integer.parseInt(txtTelefonoProveedor.getText()));
                pr.setDireccion(txtDireccionProveedor.getText());
                pr.setRazon(txtRazonProveedor.getText());
                pr.setId(Integer.parseInt(txtIdProveedor.getText()));
                try {
                    prDao.ModificarProveedor(pr);
                    JOptionPane.showMessageDialog(null, "Proveedor Modificado");
                    LimpiarTable();
                    LimpiarProveedor();
                    ListarProveedor();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ssitema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            }
        }
    }//GEN-LAST:event_btnEditarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        if(!"".equals(txtIdProveedor.getText())){
            int pregunta = JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres eliminarlo?");
            if(pregunta == 0){
                try {
                    int id = Integer.parseInt(txtIdProveedor.getText());
                    prDao.EliminarProveedor(id);
                    LimpiarTable();
                    ListarProveedor();
                    LimpiarProveedor();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Ssitema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecciona una fila");
        }
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        LimpiarProveedor();
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void txtIdProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableProveedor;
    private javax.swing.JButton btnEditarProveedor;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGuardarProveedor;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtDNIProveedor;
    private javax.swing.JTextField txtDireccionProveedor;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtRazonProveedor;
    private javax.swing.JTextField txtTelefonoProveedor;
    // End of variables declaration//GEN-END:variables
    
    public void LimpiarProveedor(){
        txtIdProveedor.setText("");
        txtDNIProveedor.setText("");
        txtNombreProveedor.setText("");
        txtTelefonoProveedor.setText("");
        txtDireccionProveedor.setText("");
        txtRazonProveedor.setText("");
    }
    
        public void ListarProveedor() throws ClassNotFoundException{
        List<Proveedor> ListarPr = prDao.ListarProveedor();
        modelo = (DefaultTableModel) getTableProveedor().getModel();
        Object[] ob = new Object[6];
        for(int i=0; i<ListarPr.size(); i++){
            ob[0] = ListarPr.get(i).getId();
            ob[1] = ListarPr.get(i).getDni();
            ob[2] = ListarPr.get(i).getNombre();
            ob[3] = ListarPr.get(i).getTelefono();
            ob[4] = ListarPr.get(i).getDireccion();
            ob[5] = ListarPr.get(i).getRazon();
            modelo.addRow(ob);
        }
        getTableProveedor().setModel(modelo);
    }
        
    public void LimpiarTable(){
        int aux = modelo.getRowCount();
        for(int i=0; i<aux; aux--){
            modelo.removeRow(aux-1);
        }
    }
}
