/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import controller.CuentaController;
import javax.swing.JOptionPane;
import modelo.Cuenta;
import modelo.CuentaEspecial;
import view.CuentaView;

/**
 *
 * @author The Ice
 */
public class CrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form CrearCuenta
     */
    public CrearCuenta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jButtonmenucc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        teltxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nacimientotxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fechaaperturatxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        codclientetxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        montotxt = new javax.swing.JTextField();
        jButtonenviarcc = new javax.swing.JButton();
        jButtoncancelarcc = new javax.swing.JButton();
        tipotxt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Crear Cuenta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 150, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));
        getContentPane().add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 350, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, 30));
        getContentPane().add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 270, 30));

        jButtonmenucc.setBackground(new java.awt.Color(153, 153, 255));
        jButtonmenucc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonmenucc.setText("Menu");
        jButtonmenucc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmenuccActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonmenucc, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        teltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teltxtActionPerformed(evt);
            }
        });
        getContentPane().add(teltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 180, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Direcciòn: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 30));
        getContentPane().add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 400, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        getContentPane().add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 280, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, 30));

        nacimientotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacimientotxtActionPerformed(evt);
            }
        });
        getContentPane().add(nacimientotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 220, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de Apertura: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 30));
        getContentPane().add(fechaaperturatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 220, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Tipo de Cuenta:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Codigo de Cliente:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, 30));
        getContentPane().add(codclientetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 220, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Monto Inicial:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, 30));
        getContentPane().add(montotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 220, 30));

        jButtonenviarcc.setBackground(new java.awt.Color(153, 153, 255));
        jButtonenviarcc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonenviarcc.setText("Enviar");
        jButtonenviarcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonenviarccActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonenviarcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 90, 40));

        jButtoncancelarcc.setBackground(new java.awt.Color(153, 153, 255));
        jButtoncancelarcc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtoncancelarcc.setText("Cancelar");
        getContentPane().add(jButtoncancelarcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 100, 40));

        tipotxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Navidena", "Especial", "Aportaciones", "Estudiante" }));
        tipotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipotxtActionPerformed(evt);
            }
        });
        getContentPane().add(tipotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonmenuccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmenuccActionPerformed
        Inicio cc= new Inicio();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonmenuccActionPerformed

    private void teltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teltxtActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void nacimientotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacimientotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacimientotxtActionPerformed

    private void jButtonenviarccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonenviarccActionPerformed
        // TODO add your handling code here:
        String nombre , id, codcliente,telefono,direccion,email,nacimiento,apertura,tipo,monto;
        
        CuentaEspecial ce = new CuentaEspecial();
        
        nombre=nombretxt.getText();
        id=idtxt.getText();
        codcliente=codclientetxt.getText();
        telefono=teltxt.getText();
        direccion=direcciontxt.getText();
        email=emailtxt.getText();
        nacimiento=nacimientotxt.getText();
        apertura=fechaaperturatxt.getText();
        tipo=tipo=tipotxt.getSelectedItem().toString();
        monto=montotxt.getText();
        
        
        
        CuentaView vistacuenta = new CuentaView();
        Cuenta modelocuenta = new Cuenta() {
            @Override
            public boolean depositar(double cantidad) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public boolean retirar(double cantidadRetirar) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public double consultar() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        CuentaController controladorcuenta = new CuentaController(modelocuenta, vistacuenta);
        
        
        
        controladorcuenta.setId(id);
        controladorcuenta.setNombre(nombre);
        controladorcuenta.setCodigoCliente(codcliente);
        controladorcuenta.setTelefono(telefono);
        controladorcuenta.setNacimiento(nacimiento);
        controladorcuenta.setDireccion(direccion);
        controladorcuenta.setEmail(email);
        controladorcuenta.setMonto(Double.parseDouble(monto));
        controladorcuenta.setFechaApertura(apertura);
        
        controladorcuenta.AperturarCuenta();
        
        
    }//GEN-LAST:event_jButtonenviarccActionPerformed

    private void tipotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipotxtActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codclientetxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JTextField fechaaperturatxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButtoncancelarcc;
    private javax.swing.JButton jButtonenviarcc;
    private javax.swing.JButton jButtonmenucc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField montotxt;
    private javax.swing.JTextField nacimientotxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField teltxt;
    private javax.swing.JComboBox<String> tipotxt;
    // End of variables declaration//GEN-END:variables
}
