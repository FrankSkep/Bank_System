package UI;

import Autenticacion.SesionUsuario;
import Entidades.Usuario;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class HistorialTransaccPNL extends javax.swing.JPanel {

    private Usuario usuario;

    public HistorialTransaccPNL() {
        initComponents();

        // Obtener el usuario autenticado
        usuario = SesionUsuario.getInstance().getUsuario();

        // Fuente header tabla
        JTableHeader header = tablaTransacciones.getTableHeader();
        Font headerFont = new Font("Segoe UI", Font.BOLD, 14);
        header.setFont(headerFont);

        // Crear un renderizador para centrar el texto del encabezado
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);

        // Enlistar transacciones
        Tools.entablarTransacciones(tablaTransacciones, usuario.getClienteId());

        labelClienteName.setText("CLIENTE : " + usuario.getUsername());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelClienteName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTransacciones = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        labelClienteName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelClienteName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClienteName.setText("CLIENTE : ");
        labelClienteName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tablaTransacciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FECHA", "TIPO", "MONTO", "DESCRIPCION", "ID CUENTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaTransacciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaTransacciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaTransacciones);
        if (tablaTransacciones.getColumnModel().getColumnCount() > 0) {
            tablaTransacciones.getColumnModel().getColumn(0).setMinWidth(145);
            tablaTransacciones.getColumnModel().getColumn(0).setPreferredWidth(145);
            tablaTransacciones.getColumnModel().getColumn(0).setMaxWidth(145);
            tablaTransacciones.getColumnModel().getColumn(1).setMinWidth(145);
            tablaTransacciones.getColumnModel().getColumn(1).setPreferredWidth(145);
            tablaTransacciones.getColumnModel().getColumn(1).setMaxWidth(145);
            tablaTransacciones.getColumnModel().getColumn(2).setMinWidth(140);
            tablaTransacciones.getColumnModel().getColumn(2).setPreferredWidth(140);
            tablaTransacciones.getColumnModel().getColumn(2).setMaxWidth(140);
            tablaTransacciones.getColumnModel().getColumn(4).setMinWidth(100);
            tablaTransacciones.getColumnModel().getColumn(4).setPreferredWidth(100);
            tablaTransacciones.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HISTORIAL DE TRANSACCIONES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(labelClienteName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelClienteName)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelClienteName;
    private javax.swing.JTable tablaTransacciones;
    // End of variables declaration//GEN-END:variables
}
