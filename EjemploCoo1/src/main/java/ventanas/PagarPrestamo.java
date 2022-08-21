/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import controller.PrestamoController;
import javax.swing.JOptionPane;
import unah.ejemplocrud1.ConectarBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Cuenta;
import modelo.Prestamo;
import unah.ejemplocrud1.ConectarBD;
import view.CuentaView;
import view.PrestamoView;
/**
 *
 * @author cris
 */
public class PagarPrestamo extends javax.swing.JFrame {
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    private String sql2;
    PreparedStatement ps;
    /**
     * Creates new form PagarPrestamo
     */
    public PagarPrestamo() {
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

        codtxt = new javax.swing.JTextField();
        montotxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(codtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 204, 376, -1));
        getContentPane().add(montotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 286, 376, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Depositar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 356, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Codigo de prestamo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 204, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Monto a depositar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 286, -1, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Cancelar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 356, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Pago a Prestamo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String codigo,monto,sumapagos = null;
        double monto_de_prestamo = 0,restapagar;
        
        Prestamo modeloprestamo = new Prestamo();
        PrestamoView vistaprestamo = new PrestamoView();
        PrestamoController controladorprestamo = new PrestamoController(vistaprestamo, modeloprestamo);
        codigo=codtxt.getText();
        monto=montotxt.getText();
        
         try{
        
        sql="Select monto_de_prestamo from prestamos where codigo_prestamo = ?";
        cn= ConectarBD.Conectar();
        ps=cn.prepareStatement(sql);
        ps.setString(1, codigo);
        rs=ps.executeQuery();
        if(rs.next()){
         monto_de_prestamo=rs.getDouble("monto_de_prestamo");
            
        // sumapago=rs.getString("sumpago");
        //txt_sum.setText(sum);
        
        JOptionPane.showMessageDialog(null,"La cantidad del prestamo fue de " + monto_de_prestamo);
        
        
        
        
        }
        
        }catch(Exception e){
        System.out.println("error I-I");
        }
          try{
        
        sql2="Select Sum(monto_restante) as restpago from prestamos where codigo_prestamo = ?";
        cn= ConectarBD.Conectar();
        ps=cn.prepareStatement(sql2);
        ps.setString(1, codigo);
        rs=ps.executeQuery();
        if(rs.next()){
         sumapagos=rs.getString("restpago");
        //txt_sum.setText(sum);
        
        JOptionPane.showMessageDialog(null,"La cantidad de dinero pagado hasta ahora  " + sumapagos);
        
        
        
        
        }
        
        }catch(Exception e){
        System.out.println("error I-I");
        }
        
         restapagar=monto_de_prestamo-(Double.parseDouble(sumapagos)+Double.parseDouble(monto));
        JOptionPane.showMessageDialog(null,"El monto pagado hoy fue de  " + monto);
         
         JOptionPane.showMessageDialog(null,"El monto restante a pagar es " + restapagar);
         
         modeloprestamo.setMonto(restapagar);
         controladorprestamo.ActualizarmontoPrestamo(codigo);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio ini2= new Inicio();
        ini2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PagarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagarPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField montotxt;
    // End of variables declaration//GEN-END:variables
}
