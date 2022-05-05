
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
public class SCHEME_1 extends javax.swing.JFrame {

    /**
     * Creates new form SCHEME_1
     */
    public SCHEME_1() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        CLOS.setBorder(panelCE);
        MIN.setBorder(panelCE);
        BACK.setBorder(panelCE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CLOS = new javax.swing.JLabel();
        MIN = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        MAINWALL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CLOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
        CLOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLOSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CLOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CLOSMouseExited(evt);
            }
        });
        getContentPane().add(CLOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MINIM.png"))); // NOI18N
        MIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MINMouseExited(evt);
            }
        });
        getContentPane().add(MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

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

        MAINWALL.setBackground(new java.awt.Color(255, 228, 181));
        getContentPane().add(MAINWALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSMouseClicked
        this.dispose();
    }//GEN-LAST:event_CLOSMouseClicked

    private void CLOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red);
        CLOS.setBorder(panelCE);
    }//GEN-LAST:event_CLOSMouseEntered

    private void CLOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        CLOS.setBorder(panelCE);
    }//GEN-LAST:event_CLOSMouseExited

    private void MINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseClicked
        this.setExtendedState(BMT_UPDATE.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_MINMouseClicked

    private void MINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        MIN.setBorder(panelCE);
    }//GEN-LAST:event_MINMouseEntered

    private void MINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        MIN.setBorder(panelCE);
    }//GEN-LAST:event_MINMouseExited

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        SCHEMES_PAGE LG = new SCHEMES_PAGE();
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
            java.util.logging.Logger.getLogger(SCHEME_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCHEME_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCHEME_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCHEME_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCHEME_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JLabel CLOS;
    private javax.swing.JLabel MAINWALL;
    private javax.swing.JLabel MIN;
    // End of variables declaration//GEN-END:variables
}
