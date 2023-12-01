/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logincentral;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Garcia Vicente
 */
public class Principal extends javax.swing.JFrame {

  /**
   * Creates new form Principal
   */
  public Principal() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    nombrelogin = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    contraseñatf = new javax.swing.JPasswordField();
    panelbotonacceder = new javax.swing.JPanel();
    acceder = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(0, 102, 153));

    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.login-2.png"))); // NOI18N
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 37));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel4.setText("INCIAR SESION");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 20));

    jLabel2.setText("Usuario");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

    nombrelogin.setText("name@yahoo.es");
    nombrelogin.setBorder(null);
    nombrelogin.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        nombreloginMouseClicked(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        nombreloginMousePressed(evt);
      }
    });
    nombrelogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        nombreloginActionPerformed(evt);
      }
    });
    jPanel2.add(nombrelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 140, 20));

    jLabel3.setText("Contraseña");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 130, 20));

    contraseñatf.setText("contraseña");
    contraseñatf.setBorder(null);
    contraseñatf.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        contraseñatfMouseClicked(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        contraseñatfMouseExited(evt);
      }
      public void mousePressed(java.awt.event.MouseEvent evt) {
        contraseñatfMousePressed(evt);
      }
    });
    jPanel2.add(contraseñatf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 140, 20));

    panelbotonacceder.setBackground(new java.awt.Color(0, 102, 102));
    panelbotonacceder.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        panelbotonaccederMouseEntered(evt);
      }
    });

    acceder.setBackground(new java.awt.Color(0, 102, 102));
    acceder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    acceder.setText("ACCEDER");
    acceder.setBorder(null);
    acceder.setBorderPainted(false);
    acceder.setContentAreaFilled(false);
    acceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    acceder.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        accederMouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        accederMouseExited(evt);
      }
    });
    acceder.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        accederActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelbotonaccederLayout = new javax.swing.GroupLayout(panelbotonacceder);
    panelbotonacceder.setLayout(panelbotonaccederLayout);
    panelbotonaccederLayout.setHorizontalGroup(
      panelbotonaccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelbotonaccederLayout.createSequentialGroup()
        .addGap(54, 54, 54)
        .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(56, Short.MAX_VALUE))
    );
    panelbotonaccederLayout.setVerticalGroup(
      panelbotonaccederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelbotonaccederLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel2.add(panelbotonacceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 250, 40));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
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
  }// </editor-fold>//GEN-END:initComponents

  private void nombreloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreloginMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_nombreloginMouseClicked

  private void nombreloginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreloginMousePressed
    // TODO add your handling code here:
    if (nombrelogin.getText().equals("name@yahoo.es")) {
      nombrelogin.setText("");
      nombrelogin.setForeground(Color.black);

    }
    if (String.valueOf(contraseñatf.getPassword()).isEmpty()) {
      contraseñatf.setText("******");
      contraseñatf.setForeground(Color.gray);

    }
  }//GEN-LAST:event_nombreloginMousePressed

  private void contraseñatfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñatfMouseClicked
    // TODO add your handling code here:
    if (contraseñatf.getPassword().length > 5) {
      contraseñatf.setText("");
    }
  }//GEN-LAST:event_contraseñatfMouseClicked

  private void contraseñatfMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñatfMouseExited
    // TODO add your handling code here:
  }//GEN-LAST:event_contraseñatfMouseExited

  private void contraseñatfMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñatfMousePressed
    // TODO add your handling code here:
    if (String.valueOf(contraseñatf.getPassword()).equals("******")) {
      contraseñatf.setText("");
      contraseñatf.setForeground(Color.black);
    }
    if (nombrelogin.getText().isEmpty()) {
      nombrelogin.setText("name@yahoo.es");
      nombrelogin.setForeground(Color.gray);
    }
  }//GEN-LAST:event_contraseñatfMousePressed

  private void accederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accederMouseEntered
    // TODO add your handling code here:
    panelbotonacceder.setBackground(Color.red);
  }//GEN-LAST:event_accederMouseEntered

  private void accederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accederMouseExited
    // TODO add your handling code here:
    panelbotonacceder.setBackground(new Color(0, 102, 102));
  }//GEN-LAST:event_accederMouseExited

  private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed
    // TODO add your handling code here:
    boolean aceptable = true;
    if (nombrelogin.equals("name@yahoo.es")) {

      JOptionPane.showMessageDialog(rootPane, "Introduce un usuario");
      aceptable = false;
    }

    if (nombrelogin.getText().isEmpty()) {

      JOptionPane.showMessageDialog(rootPane, "El usuario esta vacio");
      aceptable = false;
    }

    if (String.valueOf(contraseñatf.getPassword()).equalsIgnoreCase("contraseña")) {

      JOptionPane.showMessageDialog(rootPane, "Introduce una password");
      aceptable = false;
    }

    if (String.valueOf(contraseñatf.getPassword()).isEmpty()) {

      JOptionPane.showMessageDialog(rootPane, "La password esta vacia");
      aceptable = false;
    }

    if (aceptable) {
      JOptionPane.showMessageDialog(rootPane, "Todo correcto");
    }
  }//GEN-LAST:event_accederActionPerformed

  private void panelbotonaccederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelbotonaccederMouseEntered
    // TODO add your handling code here:
    acceder.setBackground(Color.red);
  }//GEN-LAST:event_panelbotonaccederMouseEntered

  private void nombreloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreloginActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_nombreloginActionPerformed

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
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Principal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton acceder;
  private javax.swing.JPasswordField contraseñatf;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField nombrelogin;
  private javax.swing.JPanel panelbotonacceder;
  // End of variables declaration//GEN-END:variables
}
