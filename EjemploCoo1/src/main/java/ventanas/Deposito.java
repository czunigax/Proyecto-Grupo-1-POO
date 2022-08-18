/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import controller.CuentaController;
import modelo.Cuenta;
import static ventanas.Inicio.vistacuenta;
import view.CuentaView;

/**
 *
 * @author The Ice
 */
public class Deposito extends javax.swing.JFrame {

    /**
     * Creates new form Deposito
     */
    public Deposito() {
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

        jLabellogodp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numerotxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        montotxt = new javax.swing.JTextField();
        jbenviar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fechatxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipotxt = new javax.swing.JTextField();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabellogodp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logomenu.png"))); // NOI18N
        getContentPane().add(jLabellogodp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Numero de cuenta:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));
        getContentPane().add(numerotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 440, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Monto:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));
        getContentPane().add(montotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 150, 30));

        jbenviar.setBackground(new java.awt.Color(153, 153, 255));
        jbenviar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbenviar.setText("Enviar");
        jbenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbenviarActionPerformed(evt);
            }
        });
        getContentPane().add(jbenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Deposito");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));
        getContentPane().add(fechatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de cuenta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));
        getContentPane().add(tipotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 440, 30));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/white wallpaper (30)-991074_800.jpeg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbenviarActionPerformed
        // TODO add your handling code here:
        String numerodecuenta, monto, fecha, tipo;
        
        numerodecuenta= numerotxt.getText();
        monto=montotxt.getText();
        fecha=fechatxt.getText();
        tipo=tipotxt.getText();
        
        Cuenta cuentadepositar = new Cuenta(tipo,numerodecuenta,Double.parseDouble(monto),fecha);
        CuentaView vistacuenta = new CuentaView();
        CuentaController controladorcuenta = new CuentaController(cuentadepositar, vistacuenta);
        if(controladorcuenta.Buscar(numerodecuenta)== true){
        cuentadepositar.setTipo(tipo);
        cuentadepositar.setNumeroC(numerodecuenta);
        cuentadepositar.depositar(Double.parseDouble(monto));
        
        
        controladorcuenta.Actualizarmonto(numerodecuenta);
        }else{
        System.out.println("Error carajo");
        }
       
               
        
    }//GEN-LAST:event_jbenviarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Transacciones deposito= new Transacciones();
        deposito.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechatxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JLabel jLabellogodp;
    private javax.swing.JButton jbenviar;
    private javax.swing.JTextField montotxt;
    private javax.swing.JTextField numerotxt;
    private javax.swing.JTextField tipotxt;
    // End of variables declaration//GEN-END:variables
}
