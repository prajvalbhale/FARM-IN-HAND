
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
public class _MAINSCR extends javax.swing.JFrame {

    /**
     * Creates new form _MAINSCR
     */
    public _MAINSCR() {
        initComponents();
        
        Border gf = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        MIN.setBorder(gf);
        CLOS.setBorder(gf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        START = new javax.swing.JButton();
        CLOS = new javax.swing.JLabel();
        MIN = new javax.swing.JLabel();
        MAIN1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        START.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        START.setText("LET'S START FARMING WITH US ");
        START.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        START.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                STARTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                STARTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                STARTMouseExited(evt);
            }
        });
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });
        getContentPane().add(START, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 330, 60));

        CLOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
        CLOS.setText("x");
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
        getContentPane().add(CLOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 27, 27));

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
        getContentPane().add(MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 27, 27));

        MAIN1.setBackground(new java.awt.Color(51, 255, 204));
        MAIN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MAIN_SCR.jpg"))); // NOI18N
        getContentPane().add(MAIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 730));

        setSize(new java.awt.Dimension(1366, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STARTActionPerformed

    private void STARTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STARTMouseEntered
        
      Border panelm = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
        START.setBorder(panelm);
        START.setBackground(Color.GREEN);
    
        
    }//GEN-LAST:event_STARTMouseEntered

    private void STARTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STARTMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        START.setBorder(panelm);
        START.setBackground(Color.gray);
 
        
    }//GEN-LAST:event_STARTMouseExited

    private void STARTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_STARTMouseClicked
        LOGINSCR AG = new LOGINSCR();
        AG.show();
        
    }//GEN-LAST:event_STARTMouseClicked

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
        this.setExtendedState(AKLUJ_UPDATE.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_MINMouseClicked

    private void MINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        MIN.setBorder(panelCE);
    }//GEN-LAST:event_MINMouseEntered

    private void MINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK);
        MIN.setBorder(panelCE);
    }//GEN-LAST:event_MINMouseExited

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
            java.util.logging.Logger.getLogger(_MAINSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_MAINSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_MAINSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_MAINSCR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _MAINSCR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLOS;
    private javax.swing.JLabel MAIN1;
    private javax.swing.JLabel MIN;
    private javax.swing.JButton START;
    // End of variables declaration//GEN-END:variables
}
