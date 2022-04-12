
package Interfaces;

import DAO.ProdPedidosCDAO;
import DAO.ProductosDAO;
import Objetos.ProdPedidosCDTO;
import Objetos.ProductosDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class VentanaAñadirProducto extends javax.swing.JFrame {
    
    int NroPedidoC;
    ProductosDTO prod = new ProductosDTO();
    ResultSet rp = null;

    public VentanaAñadirProducto(String nom, int NroPedidoC){
        ProductosDAO abmp = new ProductosDAO();
        this.NroPedidoC = NroPedidoC;
        this.rp = abmp.BuscarProductos(nom, 1);
        try{
            while(rp.next()){
                prod.setCodProd(rp.getInt("CodProd"));
                prod.setNombre(rp.getString("Nombre"));
                prod.setDescripcion(rp.getString("Descripcion"));
                prod.setPrecio(rp.getFloat("Precio"));
                prod.setStock(rp.getInt("Stock"));
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNombreP = new javax.swing.JLabel();
        jLabelDesc = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelCant = new javax.swing.JLabel();
        jTextFieldCant = new javax.swing.JTextField();
        jLabelMonto = new javax.swing.JLabel();
        jLabelCalcMont = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabelNombreP.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreP.setText(prod.getNombre());

        jLabelDesc.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDesc.setText(prod.getDescripcion());

        jLabelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecio.setText("Precio por unidad: " + prod.getPrecio());

        jLabelCant.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCant.setText("Cantidad de unidades:");

        jLabelMonto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMonto.setText("Moto total:");

        jButtonCancelar.setText("Cancelar");

        jButtonAñadir.setText("Añadir al carrito");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(jLabelNombreP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonCancelar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                            .addComponent(jButtonAñadir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelCant, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldCant, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(jLabelCalcMont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCant, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCalcMont, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAñadir))
                .addGap(22, 22, 22))
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

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        ProdPedidosCDTO ppc = new ProdPedidosCDTO();
        ProdPedidosCDAO abmppc = new ProdPedidosCDAO();
        int cant = Integer.parseInt(jTextFieldCant.getText());
        if(prod.getStock() >= cant){
            ppc.setNroPedidoC(NroPedidoC);
            ppc.setCodProd(prod.getCodProd());
            ppc.setCantidad(cant);
            ppc.setNom(prod.getNombre());
            float monto = cant * prod.getPrecio();
            ppc.setPrecio(monto);
            abmppc.agregar_PPC(ppc);
        }
        else JOptionPane.showMessageDialog(null, "El Stock es suficiente o nulo, ingrese una cantidad menor");
        this.dispose();
    }//GEN-LAST:event_jButtonAñadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelCalcMont;
    private javax.swing.JLabel jLabelCant;
    private javax.swing.JLabel jLabelDesc;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelNombreP;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCant;
    // End of variables declaration//GEN-END:variables
}
