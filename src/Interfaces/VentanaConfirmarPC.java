
package Interfaces;

import DAO.PedidosCDAO;
import sistock.Control;

public class VentanaConfirmarPC extends javax.swing.JFrame {
    
    int NroPedidoC;
    String MedioDePago;
    float MontoTotal;
    String con;
    
    public VentanaConfirmarPC(int npc, float mt, String con) {
        this.NroPedidoC = npc;
        this.MontoTotal = mt;
        this.con = con;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelPagoDelPedido = new javax.swing.JLabel();
        jLabelNroPedido = new javax.swing.JLabel();
        jLabelMedioDePago = new javax.swing.JLabel();
        jComboBoxMedioDePago = new javax.swing.JComboBox<>();
        jLabelTarjeta = new javax.swing.JLabel();
        jComboBoxTarjeta = new javax.swing.JComboBox<>();
        jLabelCuotas = new javax.swing.JLabel();
        jComboBoxCuotas = new javax.swing.JComboBox<>();
        jLabelClave = new javax.swing.JLabel();
        jTextFieldClave = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelPagoDelPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelPagoDelPedido.setText("Pago del Pedido");

        jLabelNroPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNroPedido.setText(String.valueOf(NroPedidoC));

        jLabelMedioDePago.setText("Medio de Pago");

        jComboBoxMedioDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En efectivo", "Tarjeta de Credito", "Tarjeta de Debito", " " }));

        jLabelTarjeta.setText("Tarjeta");

        jComboBoxTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "Mastercard", "Naranja", "MercadoPago", "Santander" }));

        jLabelCuotas.setText("Cuotas");

        jComboBoxCuotas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "6", "10", "12" }));

        jLabelClave.setText("Clave");

        jButtonCancelar.setText("Cancelar");

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelar)
                    .addComponent(jLabelClave)
                    .addComponent(jLabelCuotas)
                    .addComponent(jLabelTarjeta)
                    .addComponent(jLabelMedioDePago)
                    .addComponent(jLabelPagoDelPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxMedioDePago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxTarjeta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxCuotas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonConfirmar))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPagoDelPedido)
                    .addComponent(jLabelNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMedioDePago)
                    .addComponent(jComboBoxMedioDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTarjeta)
                    .addComponent(jComboBoxTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCuotas)
                    .addComponent(jComboBoxCuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClave)
                    .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConfirmar))
                .addGap(19, 19, 19))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        Control ct = new Control();
        String contra = jTextFieldClave.getText();
        if(ct.CadenaNoNula(contra)){
//            System.out.println(contra);
//            System.out.println(con);
//            if(con == contra){
                MedioDePago = String.valueOf(jComboBoxMedioDePago.getSelectedItem());
                PedidosCDAO abmpc = new PedidosCDAO();
                abmpc.actualizar(NroPedidoC,MedioDePago,MontoTotal);
                jOptionPane1.showMessageDialog(null, "El Pedio se realizó con exito");
                this.dispose();
//            }
//            else jOptionPane1.showMessageDialog(null, "La contraseña no coincide");
        }
        else jOptionPane1.showMessageDialog(null, "Debe ingresar un valor");
    }//GEN-LAST:event_jButtonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxCuotas;
    private javax.swing.JComboBox<String> jComboBoxMedioDePago;
    private javax.swing.JComboBox<String> jComboBoxTarjeta;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelCuotas;
    private javax.swing.JLabel jLabelMedioDePago;
    private javax.swing.JLabel jLabelNroPedido;
    private javax.swing.JLabel jLabelPagoDelPedido;
    private javax.swing.JLabel jLabelTarjeta;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldClave;
    // End of variables declaration//GEN-END:variables
}
