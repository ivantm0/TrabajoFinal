/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author ivant
 */
public class tab5 extends javax.swing.JPanel {

    /**
     * Creates new form tab5
     */
    public tab5() {
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

        jScrollPane5 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        btnPdfVentas = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "VENDEDOR", "TOTAL"
            }
        ));
        jScrollPane5.setViewportView(TableVentas);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnPdfVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        add(btnPdfVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));
        add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableVentas;
    private javax.swing.JButton btnPdfVentas;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtIdVenta;
    // End of variables declaration//GEN-END:variables
}