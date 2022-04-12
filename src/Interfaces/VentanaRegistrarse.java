
package Interfaces;

import DAO.ClientesDAO;
import DAO.EmpleadosDAO;
//import DAO.ABMTipoDeUsuario;
import DAO.UsuarioDAO;
import Objetos.ClientesDTO;
import Objetos.EmpleadosDTO;
//import Objetos.TipoUsuario;
import Objetos.UsuariosDTO;
import javax.swing.JOptionPane;
import sistock.Control;
//import java.util.ArrayList;

public class VentanaRegistrarse extends javax.swing.JFrame {
    
 
    public VentanaRegistrarse() {
        initComponents();
        llenarComboBox();
        jTextFieldCodEmpleado.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Datos = new javax.swing.JLabel();
        jLabelApeNom = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelComercio = new javax.swing.JLabel();
        jLabelDomicilio = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldApeNom = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldComercio = new javax.swing.JTextField();
        jTextFieldDomicilio = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelTDU = new javax.swing.JLabel();
        jLabelCodEmp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodEmpleado = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonRegistrarse = new javax.swing.JButton();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        Datos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Datos.setText("Datos de Usuario:");

        jLabelApeNom.setText("Apellido y Nombre:");

        jLabelDNI.setText("DNI:");

        jLabelEmail.setText("E-mail:");

        jLabelComercio.setText("Comercio:");

        jLabelDomicilio.setText("Domicilio:");

        jLabelTelefono.setText("Teléfono:");

        jLabelTDU.setText("Tipo de Usuario:");

        jLabelCodEmp.setText("Cod. Empleado:");

        jLabel2.setText("Usuario:");

        jLabel3.setText("Contraseña:");

        jLabel4.setText("Repetir Contraseña:");

        jTextFieldCodEmpleado.setEnabled(false);

        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRegistrarse)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCodEmp, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTDU, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCodEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)
                            .addComponent(jPasswordField2))))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabelDomicilio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTelefono)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jTextFieldTelefono)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Datos)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelApeNom)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldApeNom, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelEmail))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelComercio)
                                            .addGap(12, 12, 12)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                        .addComponent(jTextFieldDNI)
                                        .addComponent(jTextFieldComercio, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Datos)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApeNom)
                    .addComponent(jTextFieldApeNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDNI)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelComercio)
                    .addComponent(jTextFieldComercio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDomicilio))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addGap(39, 39, 39)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTDU)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodEmp))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarse)
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        String t = jComboBoxTipo.getSelectedItem().toString();
        if("Seleccione".equalsIgnoreCase(t)){
            JOptionPane.showMessageDialog(null, "Seleccione un tipo de usuario");
            jComboBoxTipo.requestFocus();
        }
        else{
            if("Cliente".equals(t)){
                AgregarC(); 
            }
            else{
                AgregarE(t);
            }
        }
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        String t = jComboBoxTipo.getSelectedItem().toString();
        if(t.equalsIgnoreCase("Empleado") || t.equalsIgnoreCase("Gerente")){
        jTextFieldCodEmpleado.setEnabled(true);}
        else{
            jTextFieldCodEmpleado.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    
    private void AgregarE(String t){
        EmpleadosDTO empleado = new EmpleadosDTO();
        EmpleadosDAO abmEmpleado = new EmpleadosDAO();
        Control con = new Control();
        if(con.CadenaNoNula(jTextFieldApeNom.getText())){
            if(con.DNIValido(Integer.parseInt(jTextFieldDNI.getText()))){
                if(con.validarEmail(jTextFieldEmail.getText())){
                    if(con.CadenaNoNula(jTextFieldComercio.getText())){
                        if(con.CadenaNoNula(jTextFieldDomicilio.getText())){
                            if(con.CadenaNoNula(jTextFieldTelefono.getText())){
                                if(con.validarCodE(Integer.parseInt(jTextFieldCodEmpleado.getText()))){
                                    empleado.setNomApe(jTextFieldApeNom.getText());
                                    empleado.setDNI(Integer.parseInt(jTextFieldDNI.getText()));
                                    empleado.setCorreo(jTextFieldEmail.getText());
                                    empleado.setComercio(jTextFieldComercio.getText());
                                    empleado.setDomicilio(jTextFieldDomicilio.getText());
                                    empleado.setTelefono(jTextFieldTelefono.getText());
                                    empleado.setCodEmpleado(Integer.parseInt(jTextFieldCodEmpleado.getText()));
                                    abmEmpleado.agregar_Empleado(empleado);
                                    if("Gerente".equalsIgnoreCase(t)){
                                        AgregarU(1);
                                    }
                                    else{
                                        AgregarU(2);
                                    }
                                }
                                else{ JOptionPane.showMessageDialog(null, "Ingrese un código valido (entre 1000 y 99999)");
                                jTextFieldCodEmpleado.requestFocus();}
                            }
                            else {JOptionPane.showMessageDialog(null, "Ingrese un teléfono valido");
                            jTextFieldTelefono.requestFocus();}
                        }
                        else {JOptionPane.showMessageDialog(null, "Ingrese un domicilio valido");
                        jTextFieldDomicilio.requestFocus();}
                    }
                    else {JOptionPane.showMessageDialog(null, "Ingrese un comercio valido");
                    jTextFieldComercio.requestFocus();}
                }
                else {JOptionPane.showMessageDialog(null, "Ingrese un e-mail valido");
                jTextFieldEmail.requestFocus();}
            }
            else {JOptionPane.showMessageDialog(null, "Ingrese un DNI valido");
            jTextFieldDNI.requestFocus();}
        }
        else {JOptionPane.showMessageDialog(null, "Ingrese un apellido y nombre validos");
        jTextFieldApeNom.requestFocus();}
    }
    
    private void AgregarC(){
        ClientesDTO cliente = new ClientesDTO();
        ClientesDAO abmCliente = new ClientesDAO();
        Control con = new Control();
        boolean b = false;
        if(con.CadenaNoNula(jTextFieldApeNom.getText())){
            if(con.DNIValido(Integer.parseInt(jTextFieldDNI.getText()))){
                if(con.validarEmail(jTextFieldEmail.getText())){
                    if(con.CadenaNoNula(jTextFieldComercio.getText())){
                        if(con.CadenaNoNula(jTextFieldDomicilio.getText())){
                            if(con.CadenaNoNula(jTextFieldTelefono.getText())){
                                cliente.setNomApe(jTextFieldApeNom.getText());
                                cliente.setDNI(Integer.parseInt(jTextFieldDNI.getText()));
                                cliente.setCorreo(jTextFieldEmail.getText());
                                cliente.setNombreComercial(jTextFieldComercio.getText());
                                cliente.setDomicilio(jTextFieldDomicilio.getText());
                                cliente.setTelefono(jTextFieldTelefono.getText());
                                abmCliente.agregar_cliente(cliente);
                                AgregarU(3);
                                b = true;
                            }
                            else {JOptionPane.showMessageDialog(null, "Ingrese un teléfono valido");
                            jTextFieldTelefono.requestFocus();}
                        }
                        else {JOptionPane.showMessageDialog(null, "Ingrese un domicilio valido");
                        jTextFieldDomicilio.requestFocus();}
                    }
                    else {JOptionPane.showMessageDialog(null, "Ingrese un comercio valido");
                    jTextFieldComercio.requestFocus();}
                }
                else {JOptionPane.showMessageDialog(null, "Ingrese un e-mail valido");
                jTextFieldEmail.requestFocus();}
            }
            else {JOptionPane.showMessageDialog(null, "Ingrese un DNI valido");
            jTextFieldDNI.requestFocus();}
        }
        else {JOptionPane.showMessageDialog(null, "Ingrese un apellido y nombre validos");
        jTextFieldApeNom.requestFocus();}
    }
    
    private void AgregarU(int tipo){
        UsuariosDTO usuario = new UsuariosDTO();
        UsuarioDAO abmUsuario = new UsuarioDAO();
        usuario.setDNI(Integer.parseInt(jTextFieldDNI.getText()));
        usuario.setUsuario(jTextFieldUsuario.getText());
        char[] cont1 = jPasswordField1.getPassword();
        char[] cont2 = jPasswordField2.getPassword();
        String s1 = String.valueOf(cont1);
        String s2 = String.valueOf(cont2);
        if(s1.equals(s2)){
            usuario.setContraseña(s1);
            usuario.setTipo(tipo);
            abmUsuario.agregar_Usuario(usuario);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        jPasswordField1.requestFocus();
        }
    }

    private void llenarComboBox(){
//        ABMTipoDeUsuario abmtdu = new ABMTipoDeUsuario();
//       ArrayList<TipoUsuario> atdu = abmtdu.listarTipos();
//        for(int i=0; i<atdu.size(); i++){
//            jComboBoxTipo.addItem(atdu.get(i).getTipoDeUsuario());
        jComboBoxTipo.addItem("Seleccione");        
        jComboBoxTipo.addItem("Gerente");
        jComboBoxTipo.addItem("Empleado");
        jComboBoxTipo.addItem("Cliente");  

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datos;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelApeNom;
    private javax.swing.JLabel jLabelCodEmp;
    private javax.swing.JLabel jLabelComercio;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelDomicilio;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelTDU;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldApeNom;
    private javax.swing.JTextField jTextFieldCodEmpleado;
    private javax.swing.JTextField jTextFieldComercio;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDomicilio;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
