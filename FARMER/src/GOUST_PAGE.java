
import com.sun.glass.events.KeyEvent;
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
public class GOUST_PAGE extends javax.swing.JFrame {

    PreparedStatement pst;
    ResultSet rs;
    Connection con;
    
    public GOUST_PAGE() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
        Border firs = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        NAME.setBorder(firs);
        PHONE.setBorder(firs);
        GENDER.setBorder(firs);
        CLOSE.setBorder(firs);
        MIN.setBorder(firs);
        //FEMALE.setBorder(firs);
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
        jLabel1 = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        PHONE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CONTACTUS = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        GENDER = new javax.swing.JTextField();
        CLOSE = new javax.swing.JLabel();
        MIN = new javax.swing.JLabel();
        MAINWALL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 90));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("Name :");

        NAME.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        NAME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NAMEMouseClicked(evt);
            }
        });
        NAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NAMEKeyPressed(evt);
            }
        });

        PHONE.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        PHONE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PHONEKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("Phone No :");

        CONTACTUS.setBackground(new java.awt.Color(153, 153, 153));
        CONTACTUS.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        CONTACTUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/phone-24.png"))); // NOI18N
        CONTACTUS.setText(" Contact Us");
        CONTACTUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CONTACTUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CONTACTUSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CONTACTUSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CONTACTUSMouseExited(evt);
            }
        });
        CONTACTUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTACTUSActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setText("GENDER :");

        GENDER.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        GENDER.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GENDERKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CONTACTUS, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GENDER, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(CONTACTUS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 250));

        CLOSE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
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
        getContentPane().add(CLOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        MIN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MINIM.png"))); // NOI18N
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
        getContentPane().add(MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        MAINWALL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/FARMOX.png"))); // NOI18N
        getContentPane().add(MAINWALL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 510));

        setSize(new java.awt.Dimension(449, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CONTACTUSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONTACTUSMouseEntered
        Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        CONTACTUS.setBorder(firs);
        CONTACTUS.setBackground(Color.GREEN);
    }//GEN-LAST:event_CONTACTUSMouseEntered

    private void CONTACTUSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONTACTUSMouseExited
        Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY);
        CONTACTUS.setBorder(firs);
        CONTACTUS.setBackground(Color.GRAY);
    }//GEN-LAST:event_CONTACTUSMouseExited

    public boolean verify()
    {
        if (NAME.getText().equals("") || PHONE.getText().equals("")) //|| GENDER.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "ALL FIELD'S ARE REQUIRED TO FILL!!");
            return false;            
        } 

        else if (NAME.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"USER NAME NOT FIELD");
           return false;
        } 
        else if (PHONE.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"PHONE NUMBER IS NOT FIELD");
            return false;
        }
        else if(GENDER.getText().equals(" "))
            {
                JOptionPane.showMessageDialog(this,"GENDER IS NOT MENTIONED");
                return false;
            }
        else
            {
                return true;
            }
        
    }
    
    private void CONTACTUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTACTUSActionPerformed
        
        if (verify())
        {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farm in hand","root","");
            String sql = "INSERT INTO `gust_data`(`NAME`, `PHONE`, `GENDER`) VALUES (?,?,?)";
            pst = con.prepareStatement(sql);

            pst.setString(1, NAME.getText());
            pst.setString(2, PHONE.getText());
            pst.setString(3, GENDER.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,NAME.getText()+" "+ " WE CONTACT YOU SOON!! \n THANK YOU...");
            HOMESCREEN LOGSC = new HOMESCREEN();
            LOGSC.show(true);
        }

        catch (Exception e)
        {}
        //LOGINSCR LOGSC = new LOGINSCR();
        //LOGSC.show();
        this.dispose();
    }//GEN-LAST:event_CONTACTUSActionPerformed
    }
    private void NAMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAMEMouseClicked
        
        
    }//GEN-LAST:event_NAMEMouseClicked

    private void CONTACTUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CONTACTUSMouseClicked
        
    }//GEN-LAST:event_CONTACTUSMouseClicked

    private void NAMEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NAMEKeyPressed
        char d = evt.getKeyChar();
        
        if (Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d))
        {
            NAME.setEditable(true);
        }else
        {
            //JOptionPane.showMessageDialog(this," ADRESS WILL BE SHORT","",JOptionPane.ERROR_MESSAGE);
            NAME.setEditable(false);
        }
    }//GEN-LAST:event_NAMEKeyPressed

    private void PHONEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PHONEKeyPressed
        String phoneno =  PHONE.getText();
       int length = phoneno.length();
       char c = evt.getKeyChar();
       if (evt.getKeyChar() >= '0' && evt.getKeyChar()<='9')
       {
           if (length<10)
           {
               PHONE.setEditable(true);
           }else
           {
               PHONE.setEditable(false);
           }
       }else
       {
           if (evt.getExtendedKeyCode() == KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
           {
               PHONE.setEditable(true);
           }else
           {
               PHONE.setEditable(false);
           }
       }
    }//GEN-LAST:event_PHONEKeyPressed

    private void GENDERKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GENDERKeyPressed
        char d = evt.getKeyChar();
        
        if (Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d))
        {
            GENDER.setEditable(true);
        }else
        {
            //JOptionPane.showMessageDialog(this," ADRESS WILL BE SHORT","",JOptionPane.ERROR_MESSAGE);
            GENDER.setEditable(false);
        }
    }//GEN-LAST:event_GENDERKeyPressed

    private void CLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseClicked
        this.dispose();
    }//GEN-LAST:event_CLOSEMouseClicked

    private void CLOSEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseEntered
        Border panelclosES = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red);
        CLOSE.setBorder(panelclosES);
    }//GEN-LAST:event_CLOSEMouseEntered

    private void CLOSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CLOSEMouseExited
        Border panelclosES = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        CLOSE.setBorder(panelclosES);
    }//GEN-LAST:event_CLOSEMouseExited

    private void MINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseEntered
        Border panelmini = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.gray);
        MIN.setBorder(panelmini);
    }//GEN-LAST:event_MINMouseEntered

    private void MINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseExited
        Border panelmini = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        MIN.setBorder(panelmini);
    }//GEN-LAST:event_MINMouseExited

    private void MINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINMouseClicked
        this.setExtendedState(GOUST_PAGE.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_MINMouseClicked

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
            java.util.logging.Logger.getLogger(GOUST_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GOUST_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GOUST_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GOUST_PAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GOUST_PAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLOSE;
    private javax.swing.JButton CONTACTUS;
    private javax.swing.JTextField GENDER;
    private javax.swing.JLabel MAINWALL;
    private javax.swing.JLabel MIN;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField PHONE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
