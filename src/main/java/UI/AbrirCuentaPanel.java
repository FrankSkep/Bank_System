package UI;

import Autenticacion.SesionUsuario;
import DAO.CuentaBancariaDAO;
import Entidades.CuentaBancaria;
import Entidades.Usuario;
import javax.swing.JOptionPane;

public class AbrirCuentaPanel extends javax.swing.JPanel {

    private Usuario usuario;
    private int idCliente;

    public AbrirCuentaPanel() {
        initComponents();

        // Obtener el usuario
        usuario = SesionUsuario.getInstance().getUsuario();

        idCliente = usuario.getClienteId();

        idClienteTF.setText(String.valueOf(idCliente));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abrirCuenta = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numCuentaTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saldoTF = new javax.swing.JTextField();
        idClienteLabel = new javax.swing.JLabel();
        abrirCuentaBtn = new javax.swing.JButton();
        idClienteTF = new javax.swing.JTextField();
        labelAbrirCuenta = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Numero de cuenta asignado:");

        numCuentaTF.setEditable(false);
        numCuentaTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Saldo inicial:");

        saldoTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        idClienteLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idClienteLabel.setText("ID Cliente:");

        abrirCuentaBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        abrirCuentaBtn.setText("Abrir cuenta");
        abrirCuentaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCuentaBtnActionPerformed(evt);
            }
        });

        idClienteTF.setEditable(false);
        idClienteTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(abrirCuentaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(171, 171, 171))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(idClienteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(360, 360, 360)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idClienteTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldoTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numCuentaTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(idClienteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idClienteTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numCuentaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(abrirCuentaBtn)
                .addGap(41, 41, 41))
        );

        labelAbrirCuenta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelAbrirCuenta.setText("Abrir cuenta bancaria");

        javax.swing.GroupLayout abrirCuentaLayout = new javax.swing.GroupLayout(abrirCuenta);
        abrirCuenta.setLayout(abrirCuentaLayout);
        abrirCuentaLayout.setHorizontalGroup(
            abrirCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abrirCuentaLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addGroup(abrirCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abrirCuentaLayout.createSequentialGroup()
                        .addComponent(labelAbrirCuenta)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abrirCuentaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(287, 287, 287))))
        );
        abrirCuentaLayout.setVerticalGroup(
            abrirCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abrirCuentaLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(labelAbrirCuenta)
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abrirCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCuentaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCuentaBtnActionPerformed

        String saldo = saldoTF.getText();

        if (!Tools.esNumerico(saldo)) {
            JOptionPane.showMessageDialog(null, "Ingresa solo numeros", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        CuentaBancaria cuenta = new CuentaBancaria(Double.parseDouble(saldo), idCliente);

        CuentaBancariaDAO db = CuentaBancariaDAO.getInstance();

        db.guardarCuenta(cuenta);

        numCuentaTF.setText(String.valueOf(cuenta.getNumeroCuenta()));

        JOptionPane.showMessageDialog(null, "Se ha creado la cuenta bancaria correctamente", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_abrirCuentaBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abrirCuenta;
    private javax.swing.JButton abrirCuentaBtn;
    private javax.swing.JLabel idClienteLabel;
    private javax.swing.JTextField idClienteTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAbrirCuenta;
    private javax.swing.JTextField numCuentaTF;
    private javax.swing.JTextField saldoTF;
    // End of variables declaration//GEN-END:variables
}
