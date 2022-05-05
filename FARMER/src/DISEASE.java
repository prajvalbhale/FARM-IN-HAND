
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
public class DISEASE extends javax.swing.JFrame {

    /**
     * Creates new form DISEASE
     */
    public DISEASE() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border nb = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        BACK.setBorder(nb);
        COTTON.setBorder(nb);
        MAKKA.setBorder(nb);
        WHEAT.setBorder(nb);
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
        BACK = new javax.swing.JLabel();
        WALL = new javax.swing.JLabel();

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

        WALL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/crop_dise.jpg"))); // NOI18N
        getContentPane().add(WALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        setSize(new java.awt.Dimension(900, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void COTTONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COTTONMouseClicked
                COOTON_DIS CTI = new COOTON_DIS();
                CTI.show();
                dispose();
    }//GEN-LAST:event_COTTONMouseClicked

    private void COTTONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COTTONMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        COTTON.setBorder(panelCE);
    }//GEN-LAST:event_COTTONMouseEntered

    private void COTTONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COTTONMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        COTTON.setBorder(panelCE);
    }//GEN-LAST:event_COTTONMouseExited

    private void MAKKAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKKAMouseClicked
                MAKKA_DIS WI = new MAKKA_DIS();
                WI.show();
                dispose();
    }//GEN-LAST:event_MAKKAMouseClicked

    private void MAKKAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKKAMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        MAKKA.setBorder(panelCE);
    }//GEN-LAST:event_MAKKAMouseEntered

    private void MAKKAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MAKKAMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        MAKKA.setBorder(panelCE);
    }//GEN-LAST:event_MAKKAMouseExited

    private void WHEATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHEATMouseClicked
                WHEAT_DIS WIS = new WHEAT_DIS();
                WIS.show();
                dispose();
    }//GEN-LAST:event_WHEATMouseClicked

    private void WHEATMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHEATMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN);
        WHEAT.setBorder(panelCE);
    }//GEN-LAST:event_WHEATMouseEntered

    private void WHEATMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WHEATMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        WHEAT.setBorder(panelCE);
    }//GEN-LAST:event_WHEATMouseExited

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        HOMESCREEN LG = new HOMESCREEN();
        LG.show();
        this.dispose();
    }//GEN-LAST:event_BACKMouseClicked

    private void BACKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseEntered
        Border panelm = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        BACK.setBorder(panelm);
    }//GEN-LAST:event_BACKMouseEntered

    private void BACKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseExited
        Border panelm = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        BACK.setBorder(panelm);
    }//GEN-LAST:event_BACKMouseExited

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
            java.util.logging.Logger.getLogger(DISEASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISEASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISEASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISEASE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISEASE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JLabel COTTON;
    private javax.swing.JLabel MAKKA;
    private javax.swing.JLabel WALL;
    private javax.swing.JLabel WHEAT;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
