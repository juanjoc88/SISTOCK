
package Interfaces;

import DAO.PedidosCDAO;
import DAO.PedidosPDAO;
import DAO.ProdPedidosPDAO;
import DAO.ProductosDAO;
import DAO.ProveedoresDAO;
import DAO.RemitosDAO;
import Objetos.PedidosPDTO;
import Objetos.ProdPedidosPDTO;
import Objetos.RemitosDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class VentanaEmpleado extends javax.swing.JFrame {


    
    String Nombre;
    String Cod;
    int filat2;
    int filat3;
    Calendar calendario = Calendar.getInstance();
    String año = String.valueOf(calendario.get(Calendar.YEAR)) ;
    String mes = String.valueOf(calendario.get(Calendar.MONTH));
    String dia = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
    String fecha = dia +"/"+mes+"/"+año;
    
    public VentanaEmpleado(ResultSet rc) {
        try{
            rc.next();
            Nombre = rc.getString("NomApe");
            Cod = rc.getString("CodEmpleado");
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e);
        }
        initComponents();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelBienv = new javax.swing.JLabel();
        jLabelNomb = new javax.swing.JLabel();
        jLabelCodEmp = new javax.swing.JLabel();
        jButtonNotas = new javax.swing.JButton();
        jButtonPedido = new javax.swing.JButton();
        jButtonRemito = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelLi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(830, 481));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 472));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.jpg"))); // NOI18N

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

        jLabelBienv.setBackground(new java.awt.Color(0, 0, 255));
        jLabelBienv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelBienv.setForeground(new java.awt.Color(0, 0, 255));
        jLabelBienv.setText("¡Bienvenido!");

        jLabelNomb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNomb.setText(Nombre);

        jLabelCodEmp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCodEmp.setText(Cod);

        jButtonNotas.setText("Enviar Notas");
        jButtonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNotasActionPerformed(evt);
            }
        });

        jButtonPedido.setText("Enviar Pedido");
        jButtonPedido.setToolTipText("");
        jButtonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPedidoActionPerformed(evt);
            }
        });

        jButtonRemito.setText("Cargar Remito");
        jButtonRemito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemitoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelLi.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLi.setText("Lista de Pedidos");

        jPanel2.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelLi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(467, 279));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(385, 251));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel2.setText("Productos sin Stock");

        jLabel3.setText("Proveedores");

        jPanel3.setVisible(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 102, 255));
        jPanel4.setVisible(false);

        jLabel4.setText("Numero de Remito:");

        jLabel5.setText("Nombre del Proveedor:");

        jLabel6.setText("Fecha de pedido: ");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jScrollPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane4MouseClicked(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod. Prod.", "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(jButtonBuscar))
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabelBienv))
                            .addComponent(jLabelNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(228, Short.MAX_VALUE)
                        .addComponent(jButtonNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonRemito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelBienv)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNotas)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonPedido)
                        .addComponent(jButtonRemito)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 178, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Agregar Proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Agregar Producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaRegistrarProv nvprov = new VentanaRegistrarProv();
        nvprov.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VentanaRegistrarProd nvrprod = new VentanaRegistrarProd();
        nvrprod.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNotasActionPerformed
        jPanel2.setVisible(false);
        jPanel2.setVisible(true);
        buscarPedidos();
    }//GEN-LAST:event_jButtonNotasActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int op = jOptionPane1.showConfirmDialog(null,"¿Envíar Nota a deposito?", "choose one", jOptionPane1.YES_NO_OPTION);
        if (op == 0){
            int fila = jTable1.rowAtPoint(evt.getPoint());
            String NPCS = String.valueOf(jTable1.getValueAt(fila, 0));
            PedidosCDAO abmp = new PedidosCDAO();
            abmp.setEnviado(NPCS);
            buscarPedidos();
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPedidoActionPerformed
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        buscarProdYProv();
//        buscarProv();
    }//GEN-LAST:event_jButtonPedidoActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        filat2 = jTable2.rowAtPoint(evt.getPoint());
        jOptionPane1.showMessageDialog(null, "Seleccione proveedor");
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        filat3 = jTable3.rowAtPoint(evt.getPoint());
        int rubro1 = (int) jTable2.getValueAt(filat2, 3);
        int rubro2 = (int) jTable3.getValueAt(filat3, 3);
        if(rubro1 == rubro2){
            PedidosPDTO pedidop = new PedidosPDTO();
            ProdPedidosPDTO prodped = new ProdPedidosPDTO();
            RemitosDTO rem = new RemitosDTO();
            PedidosPDAO abmpp = new PedidosPDAO();
            ProdPedidosPDAO abmppp = new ProdPedidosPDAO();
            RemitosDAO abmr = new RemitosDAO();
            
            int np = abmpp.siguentePedido();
            int cp = (int) jTable2.getValueAt(filat2, 0);
            int can = Integer.parseInt(jOptionPane1.showInputDialog("Ingrese la cantidad"));
            pedidop.setNroPedidoP(np);
            pedidop.setFecha(fecha);
            pedidop.setMontoTotal(1);
            pedidop.setEstadoEntrega("PENDIENTE");
            pedidop.setCodProveedor((int)jTable3.getValueAt(filat3, 0));
            abmpp.guardarPedidoP(pedidop);
            
            prodped.setNroPedidoP(np);
            prodped.setCodProd(cp);
            prodped.setCantidad(can);
            prodped.setPrecio(1);
            abmppp.agregar_PPC(prodped);
            
            int nr = abmr.siguenteRemito();
            rem.setNroPedidoP(np);
            rem.setFecha(fecha);
            rem.setCodRemito(nr);
            abmr.agregarRemito(rem);
            jOptionPane1.showMessageDialog(null, "Se ha agregado el remito: " + nr);
        }    
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        RemitosDAO abmr = new RemitosDAO();
        ResultSet rr = abmr.BuscarRemitos(jTextFieldNumero.getText());
        DefaultTableModel modeloRem = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};
        jTable4.setModel(modeloRem);
        modeloRem.setColumnIdentifiers(new Object[] {"Codigo de Producto", "Cantidad", "Precio"});
        try{
            while(rr.next()){
                modeloRem.addRow(new Object[] {rr.getInt("CodProd"),rr.getInt("Cantidad"),rr.getInt("Precio")});
            }
        jTable4.setVisible(true);
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonRemitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemitoActionPerformed
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
    }//GEN-LAST:event_jButtonRemitoActionPerformed

    private void jScrollPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane4MouseClicked
        int fila = jTable4.rowAtPoint(evt.getPoint());
        int cod = (int)jTable4.getValueAt(fila, 1);
        int cant = (int) jTable4.getValueAt(fila, 2);
        ProductosDAO abmp = new ProductosDAO();
        abmp.Actualizar(cod, cant);
        jOptionPane1.showMessageDialog(null, "Se han agregado " + cant + " productos");
    }//GEN-LAST:event_jScrollPane4MouseClicked

    public void buscarPedidos(){
        PedidosCDAO abmp = new PedidosCDAO();
        ResultSet rp = abmp.listarPedidosPend();
        DefaultTableModel modeloPed = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};
        jTable1.setModel(modeloPed);
        modeloPed.setColumnIdentifiers(new Object[] {"Nro. de Pedido", "Fecha", "Cliente", "Domicilio", "Estado"});
        try{
            while(rp.next()){
                modeloPed.addRow(new Object[] {rp.getInt("NroPedidoC"),rp.getString("Fecha"), rp.getString("NomApe"),
                                                rp.getString("Domicilio"),rp.getString("EstadoEntrega")});
            }
        jTable1.setVisible(true);
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e);
        }
    }
    
    public void buscarProdYProv(){
        ProductosDAO abmprod = new ProductosDAO();
        ResultSet rp = abmprod.BuscarProductos("",2);
        ResultSet rpv = null;
        DefaultTableModel modeloProd = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};
        DefaultTableModel modeloProv = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};
        jTable2.setModel(modeloProd);
        jTable3.setModel(modeloProv);
        modeloProd.setColumnIdentifiers(new Object[] {"Cod. de Producto", "Nombre", "Cantidad actual", "Rubro"});
        modeloProv.setColumnIdentifiers(new Object[] {"Cod. de Proveedor", "Nombre", "Correo", "Rubro"});
        try{
            while(rp.next()){
                modeloProd.addRow(new Object[] {rp.getInt("CodProd"),rp.getString("Nombre"), rp.getInt("Stock"), rp.getInt("Rubro")});
                ProveedoresDAO abmprov = new ProveedoresDAO();
                rpv = abmprov.listarProveedores(rp.getInt("Rubro"));
                while(rpv.next()){
                    modeloProv.addRow(new Object[] {rpv.getInt("CodProveedor"),rpv.getString("NomApe"), rpv.getString("Correo"),rpv.getInt("Rubro")});
                }
            }
        jTable1.setVisible(true);
        }
        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e);
        }

    }
    
    
/*    public void buscarProv(){
        ResultSet rpv = null;
        DefaultTableModel modeloProv = new DefaultTableModel(){@Override public boolean isCellEditable(int row, int column){return false;}};
        jTable2.setModel(modeloProv);
        modeloProv.setColumnIdentifiers(new Object[] {"Cod. de Proveedor", "Nombre", "Correo", "Rubro"});
        try{
            ProveedoresDAO abmprov = new ProveedoresDAO();
            rpv = abmprov.listarProveedores();
            while(rpv.next()){
                modeloProv.addRow(new Object[] {rpv.getInt("CodProveedor"),rpv.getString("NomApe"), rpv.getString("Correo"),rpv.getInt("Rubro")});
            }
            jTable2.setVisible(true);
        }

        catch(SQLException e){
            jOptionPane1.showMessageDialog(null, e);
        }
    }*/


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonNotas;
    private javax.swing.JButton jButtonPedido;
    private javax.swing.JButton jButtonRemito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBienv;
    private javax.swing.JLabel jLabelCodEmp;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLi;
    private javax.swing.JLabel jLabelNomb;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
