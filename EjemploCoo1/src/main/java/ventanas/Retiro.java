/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import controller.CuentaController;
import modelo.CuentaAportaciones;
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
import unah.ejemplocrud1.ConectarBD;
import view.CuentaView;

/**
 *
 * @author The Ice
 */
public class Retiro extends javax.swing.JFrame {
    private boolean exito;
    private Statement st;
    private Connection cn;
    private ResultSet rs;
    private String sql;
    PreparedStatement ps;
    /**
     * 
     * Creates new form Retiro
     */
    
    public Retiro() {
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

        jLabel1 = new javax.swing.JLabel();
        idctxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        montotxt = new javax.swing.JTextField();
        jButtonenviarrt = new javax.swing.JButton();
        jButtoncancelarrt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fechatxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tiporetirotxt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Numero de cuenta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 30));
        getContentPane().add(idctxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 162, 410, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Monto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));
        getContentPane().add(montotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 30));

        jButtonenviarrt.setBackground(new java.awt.Color(153, 153, 255));
        jButtonenviarrt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonenviarrt.setText("Enviar");
        jButtonenviarrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonenviarrtActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonenviarrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, -1, -1));

        jButtoncancelarrt.setBackground(new java.awt.Color(153, 153, 255));
        jButtoncancelarrt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtoncancelarrt.setText("Cancelar");
        getContentPane().add(jButtoncancelarrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Retiro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        fechatxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechatxtMouseClicked(evt);
            }
        });
        getContentPane().add(fechatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 170, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Tipo de cuenta:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        tiporetirotxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Navidena", "Aportaciones", "Especial", "Estudiante" }));
        getContentPane().add(tiporetirotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonenviarrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonenviarrtActionPerformed
        // TODO add your handling code here:
        
        String numerodecuenta, monto, fecha, tipo;
        
       
        
        numerodecuenta= idctxt.getText();
        monto=montotxt.getText();
        fecha=fechatxt.getText();
        tipo=tiporetirotxt.getSelectedItem().toString();
        
        if(tipo.equals("Especial")){
       String montoh=JOptionPane.showInputDialog("Ingrese el monto de ahorro esperado");
        try{
        
        sql="Select Sum(monto) as summonto from cuenta where id = ?";
        cn= ConectarBD.Conectar();
        ps=cn.prepareStatement(sql);
        ps.setString(1, numerodecuenta);
        rs=ps.executeQuery();
        if(rs.next()){
        String sum=rs.getString("summonto");
        
        if(sum.equals(montoh)){
         Cuenta cuentadepositar = new Cuenta(tipo,numerodecuenta,Double.parseDouble(monto),fecha) {
            @Override
            public boolean depositar(double cantidad) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody 
            }
            @Override
            public boolean retirar(double cantidadRetirar) {
                if (cantidadRetirar <= 0) {
            return false;
        } else {
            this.Monto += cantidadRetirar;
            return true;
        }
            }

            @Override
            public double consultar() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        CuentaView vistacuenta = new CuentaView();
        CuentaController controladorcuenta = new CuentaController(cuentadepositar, vistacuenta);
      //  if(cuentadepositar.buscarTipoCuenta(numerodecuenta)!=null){
        
        cuentadepositar.setNumeroC(numerodecuenta);
        cuentadepositar.setTipo(tipo);
        cuentadepositar.retirar(Double.parseDouble(monto));
        cuentadepositar.setFechaApertura(fecha);
        cuentadepositar.setMonto(cuentadepositar.getMonto());
        
        controladorcuenta.InsertarRetiro();
      
        
        }else{
        JOptionPane.showMessageDialog(null, "No se ha alcanzado el monto esperado");
        }
        
        }
        }catch(Exception e){
        System.out.println("error I-I");
        }
       
        
        }
        
        
        
        
        
        if(tipo.equals("Navidena")&&fecha.equals("diciembre")){
            
            Cuenta cuentadepositar = new Cuenta(tipo,numerodecuenta,Double.parseDouble(monto),fecha) {
            @Override
            public boolean depositar(double cantidad) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody 
            }
            @Override
            public boolean retirar(double cantidadRetirar) {
                if (cantidadRetirar <= 0) {
            return false;
        } else {
            this.Monto += cantidadRetirar;
            return true;
        }
            }

            @Override
            public double consultar() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        CuentaView vistacuenta = new CuentaView();
        CuentaController controladorcuenta = new CuentaController(cuentadepositar, vistacuenta);
      //  if(cuentadepositar.buscarTipoCuenta(numerodecuenta)!=null){
        
        cuentadepositar.setNumeroC(numerodecuenta);
        cuentadepositar.setTipo(tipo);
        cuentadepositar.retirar(Double.parseDouble(monto));
        cuentadepositar.setFechaApertura(fecha);
        cuentadepositar.setMonto(cuentadepositar.getMonto());
        
        controladorcuenta.InsertarRetiro();
       
        
        
        }else if(tipo.equals("Estudiante")&& fecha.equals("enero")||fecha.equals("febrero")||fecha.equals("septiembre")||fecha.equals("agosto")){
        
         
         Cuenta cuentadepositar = new Cuenta(tipo,numerodecuenta,Double.parseDouble(monto),fecha) {
            @Override
            public boolean depositar(double cantidad) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody 
            }
            @Override
            public boolean retirar(double cantidadRetirar) {
                if (cantidadRetirar <= 0) {
            return false;
        } else {
            this.Monto += cantidadRetirar;
            return true;
        }
            }

            @Override
            public double consultar() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        CuentaView vistacuenta = new CuentaView();
        CuentaController controladorcuenta = new CuentaController(cuentadepositar, vistacuenta);
      //  if(cuentadepositar.buscarTipoCuenta(numerodecuenta)!=null){
        
        cuentadepositar.setNumeroC(numerodecuenta);
        cuentadepositar.setTipo(tipo);
        cuentadepositar.retirar(Double.parseDouble(monto));
        cuentadepositar.setFechaApertura(fecha);
        cuentadepositar.setMonto(cuentadepositar.getMonto());
        
        controladorcuenta.InsertarRetiro();
        
        
        }else if(tipo.equals("Aportaciones")){
        
        JOptionPane.showMessageDialog(null, "Se eliminara la respectiva Cuenta y se procedera a retirar");
         CuentaAportaciones ca= new    CuentaAportaciones();
         Cuenta cuentadepositar = new Cuenta(tipo,numerodecuenta,Double.parseDouble(monto),fecha) {
            @Override
            public boolean depositar(double cantidad) {
               throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody 
            }
            @Override
            public boolean retirar(double cantidadRetirar) {
                if (cantidadRetirar <= 0) {
            return false;
        } else {
            this.Monto += cantidadRetirar;
            return true;
        }
            }

            @Override
            public double consultar() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        CuentaView vistacuenta = new CuentaView();
        CuentaController controladorcuenta = new CuentaController(cuentadepositar, vistacuenta);
      //  if(cuentadepositar.buscarTipoCuenta(numerodecuenta)!=null){
        
        cuentadepositar.setNumeroC(numerodecuenta);
        cuentadepositar.setTipo(tipo);
        ca.retirar(Double.parseDouble(monto));
        cuentadepositar.setFechaApertura(fecha);
        cuentadepositar.setMonto(cuentadepositar.getMonto());
        
        controladorcuenta.InsertarRetiro();
       
        
        }else {
        JOptionPane.showMessageDialog(null, "Su cuenta y su fecha de retiro no coinciden");
        }
        
        
        
    }//GEN-LAST:event_jButtonenviarrtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Transacciones retiro=new Transacciones();
        retiro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fechatxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechatxtMouseClicked
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "Ingrese la fecha como mes en minuscula \n ejemplo(diciembre)");
    }//GEN-LAST:event_fechatxtMouseClicked

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
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Retiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechatxt;
    private javax.swing.JTextField idctxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtoncancelarrt;
    private javax.swing.JButton jButtonenviarrt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField montotxt;
    private javax.swing.JComboBox<String> tiporetirotxt;
    // End of variables declaration//GEN-END:variables
}
