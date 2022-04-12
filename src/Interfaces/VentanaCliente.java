
package Interfaces;

import DAO.PedidosCDAO;
import DAO.ProductosDAO;
import Objetos.PedidosCDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class VentanaCliente extends javax.swing.JFrame {
    
    PedidosCDTO pedidoc = new PedidosCDTO();
    ResultSet rc = null;
    String con;
    ProductosDAO abmProd = null;
    int NroPedidoC;
    int CodCliente;
    Calendar calendario = Calendar.getInstance();
    String año = String.valueOf(calendario.get(Calendar.YEAR)) ;
    String mes = String.valueOf(calendario.get(Calendar.MONTH));
    String dia = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
    String fecha = dia +"/"+mes+"/"+año;
    
    public VentanaCliente(ResultSet rcli, String con) {
        this.rc = rcli;
        this.con = con;
        PedidosCDAO abmp = new PedidosCDAO();
        NroPedidoC = abmp.siguentePedido();
        initComponents();
        try{
            while(rc.next()){
            jLabelNomb.setText(rc.getString("NomApe"));
            jLabelCodCli.setText(rc.getString("CodCliente"));
            this.CodCliente = rc.getInt("codCliente");
            }
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e.getMessage());
            jOptionPane1.setVisible(true);
        }
        jLabelNomb.setVisible(true);
        jLabelCodCli.setVisible(true);
        crearPedido();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelBienv = new javax.swing.JLabel();
        jLabelNomb = new javax.swing.JLabel();
        jLabelCodCli = new javax.swing.JLabel();
        jButtonCarrito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 251, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acces.jpg"))); // NOI18N
        jButton1.setText("Cerrar\nSesion");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 100, 100));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pisos", "Aromatizantes", "Limpieza de baños", "Jabones", "Limpieza de indumentaria", "Limpieza de cocina", "Esponjas", "Cepillos", "Lavandinas", "Limpieza de autos", "Franelas", "Barnices", "Escobas", "Escobillones", "Araganes", "Trapillos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 290));

        jLabel2.setText("Categoría de Productos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Producto", "Descripcion", "Precio"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 600, 290));

        jLabelBienv.setBackground(new java.awt.Color(0, 0, 255));
        jLabelBienv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelBienv.setForeground(new java.awt.Color(0, 0, 255));
        jLabelBienv.setText("¡Bienvenido!");
        jPanel1.add(jLabelBienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jLabelNomb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabelNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 150, 20));

        jLabelCodCli.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabelCodCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 150, 20));

        jButtonCarrito.setText("Ver Carrito");
        jButtonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void crearPedido(){
        PedidosCDAO abmp = new PedidosCDAO();
        pedidoc.setCodCliente(CodCliente);
        pedidoc.setFecha(fecha);
        pedidoc.setMedioDePago(" ");
        pedidoc.setMontoTotal(1);
        pedidoc.setEstadoEntrega("PENDIENTE");
        abmp.agregar_PC(pedidoc);
    }
    
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        abmProd = new ProductosDAO();
        String ru = jList1.getSelectedValue();
        ResultSet rs = null;
        switch(ru){
            case "Pisos":
                rs = abmProd.listarProductos(1,0);
                break;
            case "Aromatizantes":
                rs = abmProd.listarProductos(2,0);
                break;
            case "Limpieza de baños":
                rs = abmProd.listarProductos(3,0);
                break;
            case "Jabones":
                rs = abmProd.listarProductos(4,0);
                break;
            case "Limpieza de indumentaria":
                rs = abmProd.listarProductos(5,0);
                break;
            case "Limpieza de cocina":
                rs = abmProd.listarProductos(6,0);
                break;
            case "Esponjas":
                rs = abmProd.listarProductos(7,0);
                break;
            case "Cepillos":
                rs = abmProd.listarProductos(8,0);
                break;
            case "Lavandinas":
                rs = abmProd.listarProductos(9,0);
                break;
            case "Limpieza de autos":
                rs = abmProd.listarProductos(10,0);
                break;
            case "Franelas":
                rs = abmProd.listarProductos(11,0);
                break;
            case "Barnices":
                rs = abmProd.listarProductos(12,0);
                break;
            case "Escobas":
                rs = abmProd.listarProductos(13,0);
                break;
            case "Escobillones":
                rs = abmProd.listarProductos(14,0);
                break;
            case "Araganes":
                rs = abmProd.listarProductos(15,0);
                break;
            case "Trapillos":
                rs = abmProd.listarProductos(16,0);
                break;
        }
        DefaultTableModel modeloProd = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};
        jTable1.setModel(modeloProd);
        modeloProd.setColumnIdentifiers(new Object[] {"Nombre del Producto","Descripcion", "Precio"});
        try{
            while(rs.next()){
                modeloProd.addRow(new Object[] {rs.getString("Nombre"),rs.getString("Descripcion"),rs.getFloat("Precio")});
            }
        jTable1.setVisible(true);
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e);
            jOptionPane1.setVisible(true);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.rowAtPoint(evt.getPoint());
        String Nom = String.valueOf(jTable1.getValueAt(fila, 0));
        VentanaAñadirProducto vap = new VentanaAñadirProducto(Nom, NroPedidoC);
        vap.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarritoActionPerformed
        VentanaCarrito vc = new VentanaCarrito(NroPedidoC, con);
        vc.setVisible(true);
    }//GEN-LAST:event_jButtonCarritoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienv;
    private javax.swing.JLabel jLabelCodCli;
    private javax.swing.JLabel jLabelNomb;
    private javax.swing.JList<String> jList1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
