
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


/**
 *
 * @author R K PC
 */
public class HOMESCREEN extends javax.swing.JFrame {

    /**
     * Creates new form HOMESCREEN
     */
    public HOMESCREEN() {
        initComponents();
        
        this.setLocationRelativeTo(null);  // FORM COMES IN CENTRE
        
        jLabel_CLOSEIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/redclose.png")));  // GIVE ICON TO DISEASE BUTTON
        jLabel_MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/MINIM.png")));  // GIVE ICON TO WALLPAPER IN HOME SCREEN
        
        // BORDERS ACTION'S START
        Border p = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_CLOSEIN.setBorder(p);  // BORDER FOR CLOSE OPERATION
        jLabel_MIN.setBorder(p); // BORDER FOR MINIMIZE OPERATION
        BACK.setBorder(p);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_WALLUP = new javax.swing.JPanel();
        jButton_FARM = new javax.swing.JButton();
        jButton_PESTI = new javax.swing.JButton();
        jButton_DIS = new javax.swing.JButton();
        jButton_CLI = new javax.swing.JButton();
        jButton_SCH = new javax.swing.JButton();
        jButton_APMC = new javax.swing.JButton();
        jLabel_CLOSEIN = new javax.swing.JLabel();
        jLabel_MIN = new javax.swing.JLabel();
        BACK = new javax.swing.JLabel();
        jLabel_WALLPAPER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DESKTOP");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_WALLUP.setBackground(new java.awt.Color(0, 0, 0, 80));

        jButton_FARM.setBackground(new java.awt.Color(128, 128, 128));
        jButton_FARM.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton_FARM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/tree.png"))); // NOI18N
        jButton_FARM.setText(" FARMING");
        jButton_FARM.setBorder(null);
        jButton_FARM.setBorderPainted(false);
        jButton_FARM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_FARM.setOpaque(false);
        jButton_FARM.setSelected(true);
        jButton_FARM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton_FARMFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jButton_FARMFocusLost(evt);
            }
        });
        jButton_FARM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_FARMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_FARMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_FARMMouseExited(evt);
            }
        });

        jButton_PESTI.setBackground(new java.awt.Color(128, 128, 128));
        jButton_PESTI.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton_PESTI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/sprayRED.png"))); // NOI18N
        jButton_PESTI.setText(" PESTISIDE");
        jButton_PESTI.setBorder(null);
        jButton_PESTI.setBorderPainted(false);
        jButton_PESTI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_PESTI.setOpaque(false);
        jButton_PESTI.setSelected(true);
        jButton_PESTI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_PESTIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_PESTIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_PESTIMouseExited(evt);
            }
        });

        jButton_DIS.setBackground(new java.awt.Color(128, 128, 128));
        jButton_DIS.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton_DIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/carrot.png"))); // NOI18N
        jButton_DIS.setText(" DISEASE");
        jButton_DIS.setBorder(null);
        jButton_DIS.setBorderPainted(false);
        jButton_DIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_DIS.setOpaque(false);
        jButton_DIS.setSelected(true);
        jButton_DIS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_DISMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_DISMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_DISMouseExited(evt);
            }
        });

        jButton_CLI.setBackground(new java.awt.Color(128, 128, 128));
        jButton_CLI.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton_CLI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/cloud.png"))); // NOI18N
        jButton_CLI.setText(" CLIMATE");
        jButton_CLI.setBorder(null);
        jButton_CLI.setBorderPainted(false);
        jButton_CLI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_CLI.setOpaque(false);
        jButton_CLI.setSelected(true);
        jButton_CLI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CLIMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_CLIMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_CLIMouseExited(evt);
            }
        });

        jButton_SCH.setBackground(new java.awt.Color(128, 128, 128));
        jButton_SCH.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton_SCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/inbox-5-24.png"))); // NOI18N
        jButton_SCH.setText(" SCHEMES");
        jButton_SCH.setBorder(null);
        jButton_SCH.setBorderPainted(false);
        jButton_SCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_SCH.setOpaque(false);
        jButton_SCH.setSelected(true);
        jButton_SCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_SCHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_SCHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_SCHMouseExited(evt);
            }
        });

        jButton_APMC.setBackground(new java.awt.Color(128, 128, 128));
        jButton_APMC.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jButton_APMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/globes.png"))); // NOI18N
        jButton_APMC.setText(" ANALYSE APMC");
        jButton_APMC.setBorder(null);
        jButton_APMC.setBorderPainted(false);
        jButton_APMC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_APMC.setOpaque(false);
        jButton_APMC.setSelected(true);
        jButton_APMC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_APMCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_APMCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_APMCMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_WALLUPLayout = new javax.swing.GroupLayout(jPanel_WALLUP);
        jPanel_WALLUP.setLayout(jPanel_WALLUPLayout);
        jPanel_WALLUPLayout.setHorizontalGroup(
            jPanel_WALLUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WALLUPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_WALLUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_FARM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_PESTI, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton_DIS, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton_CLI, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton_SCH, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jButton_APMC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_WALLUPLayout.setVerticalGroup(
            jPanel_WALLUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_WALLUPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_FARM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_PESTI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_DIS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_CLI, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_SCH, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_APMC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        getContentPane().add(jPanel_WALLUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 220, 300));

        jLabel_CLOSEIN.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_CLOSEIN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_CLOSEIN.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_CLOSEIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
        jLabel_CLOSEIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CLOSEIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CLOSEINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CLOSEINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CLOSEINMouseExited(evt);
            }
        });
        getContentPane().add(jLabel_CLOSEIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 27, 27));

        jLabel_MIN.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MINIM.png"))); // NOI18N
        jLabel_MIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MINMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MINMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MINMouseExited(evt);
            }
        });
        getContentPane().add(jLabel_MIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 27, 27));

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

        jLabel_WALLPAPER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/wall.png"))); // NOI18N
        getContentPane().add(jLabel_WALLPAPER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CLOSEINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSEINMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CLOSEINMouseClicked

    private void jLabel_CLOSEINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSEINMouseExited
        Border panelc = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_CLOSEIN.setBorder(panelc);
    }//GEN-LAST:event_jLabel_CLOSEINMouseExited

    private void jLabel_CLOSEINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSEINMouseEntered
        Border panelc = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red);
        jLabel_CLOSEIN.setBorder(panelc);
        jLabel_CLOSEIN.setBackground(Color.red);
    }//GEN-LAST:event_jLabel_CLOSEINMouseEntered

    private void jLabel_MINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MINMouseExited
        Border panelm = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_MIN.setBorder(panelm);
    }//GEN-LAST:event_jLabel_MINMouseExited

    private void jLabel_MINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MINMouseEntered
        Border panelm = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white);
        jLabel_MIN.setBorder(panelm);
    }//GEN-LAST:event_jLabel_MINMouseEntered

    // ACTION START'S FOR BUTTON'S
    
    private void jButton_FARMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FARMMouseEntered
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_FARM.setBorder(panelm);
        jButton_FARM.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_FARMMouseEntered

    private void jButton_FARMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FARMMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        jButton_FARM.setBorder(panelm);
        jButton_FARM.setBackground(Color.gray);
    }//GEN-LAST:event_jButton_FARMMouseExited

    private void jButton_PESTIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PESTIMouseEntered
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_PESTI.setBorder(panelm);
        jButton_PESTI.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_PESTIMouseEntered

    private void jButton_PESTIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PESTIMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        jButton_PESTI.setBorder(panelm);
        jButton_PESTI.setBackground(Color.gray);
    }//GEN-LAST:event_jButton_PESTIMouseExited

    private void jButton_DISMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DISMouseEntered
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_DIS.setBorder(panelm);
        jButton_DIS.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_DISMouseEntered

    private void jButton_DISMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DISMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        jButton_DIS.setBorder(panelm);
        jButton_DIS.setBackground(Color.gray);
    }//GEN-LAST:event_jButton_DISMouseExited

    private void jButton_CLIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CLIMouseEntered
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_CLI.setBorder(panelm);
        jButton_CLI.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_CLIMouseEntered

    private void jButton_CLIMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CLIMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        jButton_CLI.setBorder(panelm);
        jButton_CLI.setBackground(Color.gray);
    }//GEN-LAST:event_jButton_CLIMouseExited

    private void jButton_SCHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SCHMouseEntered
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_SCH.setBorder(panelm);
        jButton_SCH.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_SCHMouseEntered

    private void jButton_SCHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SCHMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        jButton_SCH.setBorder(panelm);
        jButton_SCH.setBackground(Color.gray);
    }//GEN-LAST:event_jButton_SCHMouseExited

    private void jButton_APMCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_APMCMouseEntered
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_APMC.setBorder(panelm);
        jButton_APMC.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_APMCMouseEntered

    private void jButton_APMCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_APMCMouseExited
        
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.gray);
        jButton_APMC.setBorder(panelm);
        jButton_APMC.setBackground(Color.gray);
    }//GEN-LAST:event_jButton_APMCMouseExited

    private void jButton_FARMFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_FARMFocusGained
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY);
        jButton_FARM.setBorder(panelm);
        //jButton_FARM.setBackground(Color.GRAY);
    }//GEN-LAST:event_jButton_FARMFocusGained

    private void jButton_FARMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton_FARMFocusLost
        Border panelm = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_FARM.setBorder(panelm);
        //jButton_FARM.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_FARMFocusLost

    private void jButton_FARMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_FARMMouseClicked
        FARMERSCR FRM = new FARMERSCR();
        FRM.show();
        this.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_FARMMouseClicked

    private void jButton_APMCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_APMCMouseClicked
        APMCS APM = new APMCS();
        APM.show();
        this.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_APMCMouseClicked

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        LOGINSCR LG = new LOGINSCR();
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

    private void jButton_DISMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_DISMouseClicked
        DISEASE BG = new DISEASE();
        BG.show();
        dispose();
    }//GEN-LAST:event_jButton_DISMouseClicked

    private void jButton_PESTIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PESTIMouseClicked
        PESTISIDE_PAGE BH = new PESTISIDE_PAGE();
        BH.show();
        dispose();
    }//GEN-LAST:event_jButton_PESTIMouseClicked

    private void jButton_CLIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CLIMouseClicked
        CLIMATE_PAGE DC = new CLIMATE_PAGE();
        DC.show();
        dispose();
    }//GEN-LAST:event_jButton_CLIMouseClicked

    private void jButton_SCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_SCHMouseClicked
        SCHEMES_PAGE GF = new SCHEMES_PAGE();
        GF.show();
        dispose();
    }//GEN-LAST:event_jButton_SCHMouseClicked

    private void jLabel_MINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MINMouseClicked
        this.setExtendedState(HOMESCREEN.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MINMouseClicked

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
            java.util.logging.Logger.getLogger(HOMESCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOMESCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOMESCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOMESCREEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOMESCREEN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JButton jButton_APMC;
    private javax.swing.JButton jButton_CLI;
    private javax.swing.JButton jButton_DIS;
    private javax.swing.JButton jButton_FARM;
    private javax.swing.JButton jButton_PESTI;
    private javax.swing.JButton jButton_SCH;
    private javax.swing.JLabel jLabel_CLOSEIN;
    private javax.swing.JLabel jLabel_MIN;
    private javax.swing.JLabel jLabel_WALLPAPER;
    private javax.swing.JPanel jPanel_WALLUP;
    // End of variables declaration//GEN-END:variables
}