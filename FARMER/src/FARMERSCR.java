
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author R K PC
 */
public class FARMERSCR extends javax.swing.JFrame {

    /**
     * Creates new form FARMERSCR
     */
    public FARMERSCR() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        // BORDER FOR CLOSE 
        Border Clo = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_CLOS.setBorder(Clo);
        BACK.setBorder(Clo);
        
        // BORDER FOR CLOSE 
        Border min = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabelMIN.setBorder(min);
        
        // BORDER FOR MAIZE
        Border minT = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        WHEAT.setBorder(minT);
        
        // BORDER FOR WHEAT
        Border minET = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        MAKKA.setBorder(minET);
        
        // BORDER FOR COTTON
        Border minAT = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        COTTON.setBorder(minAT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        COTTON = new javax.swing.JLabel();
        MAKKA = new javax.swing.JLabel();
        WHEAT = new javax.swing.JLabel();
        jLabel_CLOS = new javax.swing.JLabel();
        jLabelMIN = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jLabel_MAINWALL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 90));

        COTTON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/cotton_green.jpg"))); // NOI18N
        COTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COTTONMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                COTTONMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                COTTONMouseExited(evt);
            }
        });

        MAKKA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/makka.jpg"))); // NOI18N
        MAKKA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MAKKAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MAKKAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MAKKAMouseExited(evt);
            }
        });

        WHEAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/WH.jpg"))); // NOI18N
        WHEAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WHEATMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WHEATMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WHEATMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(COTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MAKKA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WHEAT, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(COTTON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MAKKA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WHEAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 290, 110));

        jLabel_CLOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
        jLabel_CLOS.setText("x");
        jLabel_CLOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CLOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CLOSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CLOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CLOSMouseExited(evt);
            }
        });
        getContentPane().add(jLabel_CLOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 27, 27));

        jLabelMIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MINIM.png"))); // NOI18N
        jLabelMIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelMINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelMINMouseExited(evt);
            }
        });
        getContentPane().add(jLabelMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 27, 27));

        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/arrow-98-24.png"))); // NOI18N
        BACK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BACKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BACKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BACKMouseExited(evt);
            }
        });
        getContentPane().add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel_MAINWALL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/FARMERLAND.jpg"))); // NOI18N
        jLabel_MAINWALL.setOpaque(true);
        getContentPane().add(jLabel_MAINWALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CLOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red);
        jLabel_CLOS.setBorder(panelCE);
    }//GEN-LAST:event_jLabel_CLOSMouseEntered

    private void jLabel_CLOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_CLOS.setBorder(panelCE);
    }//GEN-LAST:event_jLabel_CLOSMouseExited

    private void jLabel_CLOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CLOSMouseClicked

    private void WHEATMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHEATMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        WHEAT.setBorder(panelCE);
    }//GEN-LAST:event_WHEATMouseEntered

    private void WHEATMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHEATMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        WHEAT.setBorder(panelCE);
    }//GEN-LAST:event_WHEATMouseExited

    private void MAKKAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKKAMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        MAKKA.setBorder(panelCE);
    }//GEN-LAST:event_MAKKAMouseEntered

    private void MAKKAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKKAMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        MAKKA.setBorder(panelCE);
    }//GEN-LAST:event_MAKKAMouseExited

    private void COTTONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COTTONMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        COTTON.setBorder(panelCE);
    }//GEN-LAST:event_COTTONMouseEntered

    private void COTTONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COTTONMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        COTTON.setBorder(panelCE);
    }//GEN-LAST:event_COTTONMouseExited

    private void jLabelMINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMINMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        jLabelMIN.setBorder(panelCE);
    }//GEN-LAST:event_jLabelMINMouseEntered

    private void jLabelMINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMINMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        jLabelMIN.setBorder(panelCE);
    }//GEN-LAST:event_jLabelMINMouseExited

    private void COTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COTTONMouseClicked
       COTTONINFO CTI = new COTTONINFO();
       CTI.show();
       dispose();
    }//GEN-LAST:event_COTTONMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        HOMESCREEN LG = new HOMESCREEN();
        LG.show();
        dispose();
    }//GEN-LAST:event_BACKMouseClicked

    private void BACKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseEntered
        Border panelm = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        BACK.setBorder(panelm);
    }//GEN-LAST:event_BACKMouseEntered

    private void BACKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseExited
        Border panelm = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        BACK.setBorder(panelm);
    }//GEN-LAST:event_BACKMouseExited

    private void MAKKAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKKAMouseClicked
        MAKKA_INFO WI = new MAKKA_INFO();
        WI.show();
       dispose();
    }//GEN-LAST:event_MAKKAMouseClicked

    private void WHEATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHEATMouseClicked
        WHEAT_INFO WIS = new WHEAT_INFO();
        WIS.show();
        dispose();
    }//GEN-LAST:event_WHEATMouseClicked

    private void jLabelMINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMINMouseClicked
        this.setExtendedState(FARMERSCR.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_jLabelMINMouseClicked

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
            java.util.logging.Logger.getLogger(FARMERSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FARMERSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FARMERSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FARMERSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FARMERSCR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JLabel COTTON;
    private javax.swing.JLabel MAKKA;
    private javax.swing.JLabel WHEAT;
    private javax.swing.JLabel jLabelMIN;
    private javax.swing.JLabel jLabel_CLOS;
    private javax.swing.JLabel jLabel_MAINWALL;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
