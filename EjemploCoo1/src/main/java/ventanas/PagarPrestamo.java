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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Depositar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo de prestamo");

        jLabel2.setText("Monto a depositar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(codtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(montotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(montotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(42, 42, 42))
        );

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField montotxt;
    // End of variables declaration//GEN-END:variables
}