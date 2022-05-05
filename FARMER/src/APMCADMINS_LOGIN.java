
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
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
public class APMCADMINS_LOGIN extends javax.swing.JFrame {

    public APMCADMINS_LOGIN() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Border firs = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        ADMINID.setBorder(firs);
        ADMINPASS.setBorder(firs);
        CLOSE.setBorder(firs);
        MINI.setBorder(firs);
        
        Border BR = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        LOGIN_PANEAL.setBorder(BR);
        
        //Border BRw = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.gray);
        //KEY.setBorder(BRw);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FIRST = new javax.swing.JLabel();
        LOGIN_PANEAL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        KEY = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ADMINID = new javax.swing.JTextField();
        ADMINLOG = new javax.swing.JButton();
        CLOSE = new javax.swing.JLabel();
        MINI = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();
        ADMINPASS = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FIRST.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/manager-350.png"))); // NOI18N
        getContentPane().add(FIRST, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 400));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setText("Admin Panel");

        KEY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/key-4-64.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel3.setText("ID :");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setText("PASSWORD :");

        ADMINID.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        ADMINID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADMINIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADMINIDMouseExited(evt);
            }
        });
        ADMINID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINIDActionPerformed(evt);
            }
        });

        ADMINLOG.setBackground(new java.awt.Color(128, 128, 128));
        ADMINLOG.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        ADMINLOG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/administrator-24.png"))); // NOI18N
        ADMINLOG.setText("Log In");
        ADMINLOG.setBorder(null);
        ADMINLOG.setBorderPainted(false);
        ADMINLOG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADMINLOG.setOpaque(false);
        ADMINLOG.setSelected(true);
        ADMINLOG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ADMINLOGFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ADMINLOGFocusLost(evt);
            }
        });
        ADMINLOG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADMINLOGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADMINLOGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADMINLOGMouseExited(evt);
            }
        });
        ADMINLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINLOGActionPerformed(evt);
            }
        });

        CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
        CLOSE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CLOSEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CLOSEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CLOSEMouseExited(evt);
            }
        });

        MINI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MINIM.png"))); // NOI18N
        MINI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MINIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MINIMouseExited(evt);
            }
        });

        BACK.setBackground(new java.awt.Color(128, 128, 128));
        BACK.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/arrow-98-24.png"))); // NOI18N
        BACK.setText(" Back");
        BACK.setBorder(null);
        BACK.setBorderPainted(false);
        BACK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BACK.setOpaque(false);
        BACK.setSelected(true);
        BACK.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BACKFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BACKFocusLost(evt);
            }
        });
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
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        ADMINPASS.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        ADMINPASS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADMINPASSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADMINPASSMouseExited(evt);
            }
        });
        ADMINPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMINPASSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LOGIN_PANEALLayout = new javax.swing.GroupLayout(LOGIN_PANEAL);
        LOGIN_PANEAL.setLayout(LOGIN_PANEALLayout);
        LOGIN_PANEALLayout.setHorizontalGroup(
            LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_PANEALLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_PANEALLayout.createSequentialGroup()
                        .addComponent(KEY)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_PANEALLayout.createSequentialGroup()
                        .addComponent(MINI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(LOGIN_PANEALLayout.createSequentialGroup()
                .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LOGIN_PANEALLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(LOGIN_PANEALLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ADMINID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ADMINPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LOGIN_PANEALLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ADMINLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        LOGIN_PANEALLayout.setVerticalGroup(
            LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LOGIN_PANEALLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MINI, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(KEY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADMINID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADMINPASS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(LOGIN_PANEALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADMINLOG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(LOGIN_PANEAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 350, 400));

        setSize(new java.awt.Dimension(700, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADMINLOGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ADMINLOGFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINLOGFocusGained

    private void ADMINLOGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ADMINLOGFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINLOGFocusLost
    
    
    private void ADMINLOGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINLOGMouseClicked

    
    }//GEN-LAST:event_ADMINLOGMouseClicked
    
    private void ADMINLOGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINLOGMouseEntered
        Border panelA = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
        ADMINLOG.setBorder(panelA);
        ADMINLOG.setBackground(Color.GREEN);
    }//GEN-LAST:event_ADMINLOGMouseEntered

    private void ADMINLOGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINLOGMouseExited
        Border panelm = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray);
        ADMINLOG.setBorder(panelm);
        ADMINLOG.setBackground(Color.gray);
    }//GEN-LAST:event_ADMINLOGMouseExited

    
    public boolean verify()
    {
        if (ADMINID.getText().equals("") || ADMINPASS.getText().equals(""))
        {
                    JOptionPane.showMessageDialog(null,"ALL FIELD'S ARE REQUIRED TO FILL","",JOptionPane.ERROR_MESSAGE);
                    return false;
        }
        else if (ADMINID.getText().equals(" "))
                {
                    JOptionPane.showMessageDialog(this,"USER ID IS NOT FIELD","",JOptionPane.ERROR_MESSAGE);
                    return false;
                } 
             else if (ADMINPASS.getText().equals(" "))
                    {
                       JOptionPane.showMessageDialog(this,"PASSWORD IS NOT FIELD","",JOptionPane.ERROR_MESSAGE);                       
                       return false;
                    }
                else 
                    {
                      return true;  
                    }
    }
    
    
    
    
    private void ADMINLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINLOGActionPerformed
   if (verify())
        {
//FOR INDAPUR ADMIN
if (ADMINID.getText().equals("RAJUBHALE") && ADMINPASS.getText().equals("9503530100"))
{
    JOptionPane.showMessageDialog(this,"Login Succesfull");
    INDAPURAPMC_UPDATE IU = new INDAPURAPMC_UPDATE();
    IU.show();
    this.dispose();
}else


//FOR AKLUJ ADMIN
if (ADMINID.getText().equals("ANIKETBHALE") && ADMINPASS.getText().equals("7757960401"))
{
    JOptionPane.showMessageDialog(this,"Login Succesfull");
    AKLUJ_UPDATE IU1 = new AKLUJ_UPDATE();
    IU1.show();
        this.dispose();
}else

//FOR BARAMATI ADMIN
if (ADMINID.getText().equals("ABC") && ADMINPASS.getText().equals("1234"))
{
    JOptionPane.showMessageDialog(this,"Login Succesfull");
    BMT_UPDATE IU2 = new BMT_UPDATE();
    IU2.show();
        this.dispose();
}else

//FOR APPLYER PAGE
if (ADMINID.getText().equals("ABCDE") && ADMINPASS.getText().equals("123456"))
{
    JOptionPane.showMessageDialog(this,"Login Succesfull");
    APPLYERS_DATA IU3 = new APPLYERS_DATA();
    IU3.show();
        this.dispose();
}else
{
    JOptionPane.showMessageDialog(null,"INVALID LOGIN");
}
}
    }//GEN-LAST:event_ADMINLOGActionPerformed

    private void ADMINIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINIDActionPerformed
        
    }//GEN-LAST:event_ADMINIDActionPerformed

    private void CLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseClicked
        this.dispose();
    }//GEN-LAST:event_CLOSEMouseClicked

    private void CLOSEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red);
        CLOSE.setBorder(panelCE);
    }//GEN-LAST:event_CLOSEMouseEntered

    private void CLOSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        CLOSE.setBorder(panelCE);
    }//GEN-LAST:event_CLOSEMouseExited

    private void MINIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMouseEntered
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GRAY);
        MINI.setBorder(panelCE);
    }//GEN-LAST:event_MINIMouseEntered

    private void MINIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMouseExited
        Border panelCE = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        MINI.setBorder(panelCE);
    }//GEN-LAST:event_MINIMouseExited

    private void BACKFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BACKFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BACKFocusGained

    private void BACKFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BACKFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_BACKFocusLost

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        APMCS AP = new APMCS();
        AP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BACKMouseClicked

    private void BACKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseEntered
        Border panelA = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GREEN);
        BACK.setBorder(panelA);
        BACK.setBackground(Color.GREEN);
    }//GEN-LAST:event_BACKMouseEntered

    private void BACKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseExited
        Border panelA = BorderFactory.createMatteBorder(3, 3, 3, 3, Color.GRAY);
        BACK.setBorder(panelA);
        BACK.setBackground(Color.GRAY);
    }//GEN-LAST:event_BACKMouseExited

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BACKActionPerformed

    private void ADMINPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMINPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADMINPASSActionPerformed

    private void ADMINIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINIDMouseEntered
        Border firs = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue);
        ADMINID.setBorder(firs);
        ADMINID.setBackground(Color.white);
    }//GEN-LAST:event_ADMINIDMouseEntered

    private void ADMINIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINIDMouseExited
        Border firs = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        ADMINID.setBorder(firs);
        ADMINID.setBackground(Color.white);
    }//GEN-LAST:event_ADMINIDMouseExited

    private void ADMINPASSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINPASSMouseEntered
        Border firs = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.blue);
        ADMINPASS.setBorder(firs);
        ADMINPASS.setBackground(Color.white);
    }//GEN-LAST:event_ADMINPASSMouseEntered

    private void ADMINPASSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADMINPASSMouseExited
       Border firs = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        ADMINPASS.setBorder(firs);
        ADMINPASS.setBackground(Color.white);
    }//GEN-LAST:event_ADMINPASSMouseExited

    private void MINIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMouseClicked
        this.setExtendedState(APMCADMINS_LOGIN.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_MINIMouseClicked

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
            java.util.logging.Logger.getLogger(APMCADMINS_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APMCADMINS_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APMCADMINS_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APMCADMINS_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APMCADMINS_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADMINID;
    private javax.swing.JButton ADMINLOG;
    private javax.swing.JPasswordField ADMINPASS;
    private javax.swing.JButton BACK;
    private javax.swing.JLabel CLOSE;
    private javax.swing.JLabel FIRST;
    private javax.swing.JLabel KEY;
    private javax.swing.JPanel LOGIN_PANEAL;
    private javax.swing.JLabel MINI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}