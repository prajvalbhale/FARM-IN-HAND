
import java.awt.Color;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class MAKKA_DIS extends javax.swing.JFrame {

    /**
     * Creates new form MAKKA_DIS
     */
    public MAKKA_DIS() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border cd = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        BACK.setBorder(cd);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WALL = new javax.swing.JPanel();
        BACK = new javax.swing.JLabel();
        PRINT_TEXT = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MAKKA_DIS = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        WALL.setBackground(new java.awt.Color(153, 255, 153));

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

        PRINT_TEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/printer-24.png"))); // NOI18N
        PRINT_TEXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRINT_TEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRINT_TEXTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PRINT_TEXTMouseEntered(evt);
            }
        });

        MAKKA_DIS.setEditable(false);
        MAKKA_DIS.setColumns(20);
        MAKKA_DIS.setRows(5);
        MAKKA_DIS.setText("????????? ???????????????????????? :- \n-----------------------------------------------------------------------------------------------------\n1. ?????????????????? :\n\n???) ??????????????????????????? ????????? : ??????????????? ????????????????????????\n???) ?????????????????? ???????????????????????? :\ni. ????????????????????? ?????????????????? ?????????????????? ?????????????????????????????? ???????????????.\nii. ???????????????????????? ????????? ?????????????????? ?????????.\niii. ?????????????????? ???????????? ??????????????? ??????????????????.\niv. ??????????????? ??????????????? ???????????????.\n\n???) ??????????????? ????????? ?????????????????? ?????????????????? ?????????????????? : ???????????????????????????\n???) ??????????????? ???????????????????????? :\ni. ??????????????????????????? ????????????????????? ??????????????? ???????????? ??????????????? ??????????????? ???????????????????????????.\nii. ????????? ?????????????????? ??????????????????.\niii. ?????????????????? ??????????????? ?????????????????????\n\n???) ???????????????????????? ???????????????????????? :\ni. ??????????????????????????? ??????% ??????????????????????????? ???????????? ???????????????/????????????????????? ????????? ?????? ???????????? ???????????? ??????????????????????????? ?????????????????????.\nii. ??????????????? ??????????????? ?????? ??????. ?????? ?????? ?????? ??????????????????/????????????????????? ????????????????????? ?????????????????? ?????????????????????.\niii. ??????????????? ????????????????????????????????? ?????? ?????????. ???.??? ????????????. ??? ??????????????????????????? ?????????????????????.\n\n???) ??????????????? ????????? ???????????????????????? :\ni. ??????????????????????????????????????? ????????????????????? ?????? ?????????????????????????????? ???????????? ?????????????????? ??? ??????????????? ??????????????? ????????????????????? ?????????????????????.\nii. ????????????????????? ???????????? ???% ??????????????????????????? ?????? ???????????????????????? ?????????????????????.\n\n-----------------------------------------------------------------------------------------------------\n2. ?????????????????? ????????? :\n???) ??????????????????????????? ????????? : ????????????????????????.???????????????.?????? ?????????????????????\n\n???) ?????????????????? ???????????????????????? :\ni. ????????? ?????????????????? ?????????????????? ????????????.\nii. ???????????? ???????????? ?????????????????? ??????????????????.\niii. ?????????????????? ???????????? ????????????????????? ??????????????? ????????????.\n\n???) ??????????????? ????????? ?????????????????? ?????????????????? ?????????????????? : ???????????? ??????????????????\n\n???) ??????????????? ???????????????????????? :\ni. ??????????????? ????????????????????? ??????????????? ??????????????? ???????????? ???????????????.\nii. ????????? ?????????????????? ??????????????????.\niii. ?????????????????? ???????????????\n\n???) ??????????????? ????????? ???????????????????????? : ??????????????????????????????????????? ????????????????????? ?????? ?????????????????????????????? ???????????? ?????????????????? ??? ??????????????? ??????????????? ????????????????????? ?????????????????????.\n\n-----------------------------------------------------------------------------------------------------\n3. ???????????? ???????????????????????? ????????? :\n\n???) ??????????????????????????? ????????? : ???????????????????????????????????? ???????????????????????????\n???) ?????????????????? ???????????????????????? : ??????????????????????????? ?????????????????? ?????????????????????????????? ????????????. ???????????????????????? ???????????????????????? ?????? ??????????????? ???????????? ????????????.\n\n???) ??????????????? ????????? ?????????????????? ?????????????????? ?????????????????? : ???????????? ??????????????????\ni. ?????? ???????????? ?????????????????? ????????? ???????????? ??????????????? ?????????????????????????????? ??????????????? ???????????? ???????????????.\nii. ??????????????????????????? ???-??? ?????????????????? ??????????????? ??????????????? ???????????????.\niii. ??????????????? ??????????????? ????????? ??????????????????????????? ?????? ?????? ?????? ?????????????????? ????????????.\n???) ??????????????? ????????? ???????????????????????? :\ni. ??????????????????????????????????????? ????????????????????? ?????? ?????????????????????????????? ???????????? ?????????????????? ??? ??????????????? ??????????????? ????????????????????? ?????????????????????.\nii. ????????????????????? ???????????? ???% ??????????????????????????? ?????? ???????????????????????? ?????????????????????.\n\n-----------------------------------------------------------------------------------------------------\n4. ???????????? :\n\n???) ??????????????????????????? ????????? : ??????????????????????????? ???????????????\n???) ?????????????????? ???????????????????????? : ???????????? ?????????????????????????????? ?????????????????? ???????????? ?????????????????? ??????????????? ???????????????.?????????????????? ???????????? ?????????????????? ???????????????.\n???) ??????????????? ????????? ?????????????????? ?????????????????? ?????????????????? :\n???) ??????????????? ???????????????????????? :\n???) ???????????????????????? ???????????????????????? :\n???) ??????????????? ????????? ???????????????????????? : ??????????????????????????? ???????????????????????? ?????????????????????????????? ???????????? ???????????? ??????????????? ????????????????????? ?????????????????????.\n\n-----------------------------------------------------------------------------------------------------\n\n5. ????????????????????? ?????????????????? ????????? :\n\n???) ????????? ??? ?????????????????? :\ni. ?????????????????? ?????????????????? ????????? (Spodoptera frugiperda) ?????? ????????? ??????????????????????????? ????????? ?????????.\nii. ?????????????????????????????? ???????????? ??? ??????????????????????????? ????????????????????? ?????? ????????? ???????????????.\niii. ?????? ?????????????????? ????????? ?????????, ?????????, ??????????????????, ??????, ???????????????????????? ??? ??????????????? ??????????????? 80 ?????????????????? ??????????????? ?????????????????? ????????????????????????????????? \n    ??????????????? ????????????.\niv. ?????? 2016 ???????????? ?????? ?????????????????? ????????????????????? ??????????????? ??????????????????????????? ???????????????????????????????????????????????? ?????????.\nv.???????????????????????? 2018 ?????????????????? ?????? ????????? ???????????? ??????????????????????????? ????????????????????? ????????????????????? ??????????????? ??????????????? ????????????. ???????????? ???????????????????????? ?????????????????? ???  \n   ?????????????????? ?????? ????????????????????? ????????? ??????????????? ?????????.\nvi. ?????? 2018 ???????????? ?????? ????????? ???????????? ??? ??????????????????????????? ??????????????? ????????? ?????????.\n\n???) ?????????????????? ????????? ??? ?????????????????????????????????????????? ?????????????????? ???????????????????????? ????????? ?????????????????? ???????????? :\ni. ???????????? (2 ?????? 3 ????????????)\nii. ????????? (12 ?????? 20 ????????????) : (????????? ??????????????????)\niii. ????????? (12 ?????? 14 ????????????)\niv. ???????????? (14 ?????? 21 ????????????)\n \n-----------------------------------------------------------------------------------------------------\n-----------------------------------------------------------------------------------------------------\n???????????????????????? ?????????????????? ????????????????????? ?????????????????? ??? ????????? ????????????????????? ????????????????????? ?????????.\n\n1. ??????????????? ?????????????????? : ????????????------>\ni. ???????????? (2 ?????? 3 ????????????)\nii. ?????????????????????????????? ?????????????????? ??????????????? ?????????????????? ?????????????????? ??????????????????????????????,\niii. ??????????????? ??????????????????????????????????????? ???????????????????????? ????????????????????? ?????????????????? ????????????????????? ??????????????? ???????????????.\niv. ?????????????????? ??????????????????????????? ????????????-?????? ????????????????????? ?????? ???????????? ????????????.\n\n2. ??????????????? ?????????????????? : ?????????------>\ni. ?????????(12 ?????? 20 ????????????) - (????????? ??????????????????),\nii. ????????????????????? ??????????????????????????? ????????? ?????????????????? ???????????????????????? ?????????????????? ????????????. ???????????????????????? ????????????????????? ???????????????????????? / ?????????????????? ????????? ??????????????? ??????????????? \n    ??????????????? (???????????????) ????????? ?????????????????????.\niii. ??????????????? ??????????????????????????? ????????? ???????????????????????? ???????????? ???????????? ?????????????????????????????? ??????????????????????????? ???????????????????????? ??? ??????-????????????  ???????????? ???????????????????????? \n     ?????????????????? ??????????????????.??????????????? Ballooning ????????? ?????????????????????.\niv. ????????????????????? ???????????????????????? ???????????? Y ????????????????????? ??????????????? ??????????????? ??? ??????????????????????????? ?????????????????? ?????????-?????? ?????????????????? ????????? ??????????????? ???????????? \n     ????????????????????? (??????????????????????????????) ??????????????????.\nv.  ????????????????????? ??????????????????????????? ??????????????? ???????????????????????? ????????? ????????? ??? ?????????????????? ????????? ????????? ????????? ???????????????.\nvi. ????????? ??????????????? ???????????? ???????????????????????? ??????????????? ????????????. ????????????????????? ???????????? ??????????????????????????? ??????????????? ??????????????????.??????????????? ?????????????????? ???????????????????????? \n     ?????????????????? ???????????????????????? ??????????????? ??????. ????????????????????? ?????????????????? ??????????????????????????? ????????????????????????????????? ???????????????.\nvii. ???????????????????????? ???????????????????????? ???????????????????????? ???????????????????????? ????????? ????????????????????????????????? ??????????????? ???????????? ???????????? ??? ???????????????????????? ??????????????? ????????????????????????.\n\n3. ??????????????? ?????????????????? : ????????? ------>\ni.????????? (12 ?????? 14 ????????????)\nii. ????????????????????? ??????????????????????????? ????????? ???????????????????????? ???????????????????????? ????????????????????? ???????????? ??? ??????????????????????????? ??????????????? ????????????.\niii. ???????????? ???????????? ???????????? ?????? ????????????????????? ????????????????????? ??????????????? ?????????????????? ??????????????? ??????????????? ????????????.\niv. ????????????????????? ????????? ?????????????????? ??????????????? ????????? ????????????.\nv. ???????????????????????? ????????? ???????????? ??????????????? ?????????????????? ?????? ?????????????????? ????????????.\nvi. ????????? ??????????????????????????????????????? 15 ???????????? ????????????????????? ???????????? ??? ???????????????????????? ??????????????????????????? 20 ?????? 25 ???????????? ????????????????????? ????????????.\n\n4. ???????????? ?????????????????? : ???????????? ------>\ni. ???????????? (14 ?????? 21 ????????????)\nii. ???????????? ?????????????????? ?????????????????? ??????????????? ??? ??????????????? ???????????? ???????????????. ??????????????? ???????????????????????? ??????????????????????????? ??????????????? ???????????? ???????????? ?????????????????? ????????? ???????????????.\niii. ???????????? ????????? ????????????????????? 100 ???????????? ??????????????? ????????? ????????? ????????????.\niv. ???????????? ??????????????????????????? ???????????? ??????????????? ????????? ??????????????????????????? 100 ?????? 200 ???????????? ????????? ???????????????.\nv. ???????????? ???????????? 6 ?????? 10 ??????????????????????????? ???????????? ???????????????.\nvi. ?????? ???????????? 2 ?????? 3 ???????????????????????? ??????????????????????????????????????? 1500 ?????? 2000 ???????????? ???????????????.\n\n--------------------------------------------------------------------------------------------------------\n--------------------------------------------------------------------------------------------------------\n???????????????????????? ????????? ????????????????????????\n\n1. ????????? ?????????????????? :\n???) ????????????????????? : ?????????????????? ????????? ????????? ?????????????????? ???????????? ???????????????????????? ???????????????. ??????????????? ????????? ??? ????????????-?????? ?????????????????????????????? \n     ???????????? ????????????????????? ?????????????????? ??????????????? ????????? ????????????.\n???) ????????????????????? : ???????????? ?????????????????? ????????? ????????????????????? ?????????????????? ????????? ?????????????????? ????????? ???????????? ??????????????????. ????????? ????????? ????????? \n     (????????????- ?????????-?????????????????????) ????????????????????? ???????????? ??????????????????. ???????????? ??? ?????????????????? ?????????????????? ????????????????????? ???????????????.\n\n2. ??????????????? :\n???) ????????? ?????????????????????\ni. ????????? ??????????????? ???????????? 2 ??????8 ???????????? ????????? ??????????????????????????? ????????????.\nii. ?????? ????????? ???????????????????????? ????????????????????? ?????????????????? ????????????????????? ???????????? ??? ??????????????? ?????????????????? ????????? ????????? ??????????????????. ???????????????????????? ????????? ???????????? ????????????.\n???) ?????????????????? ??????????????? ???????????? ???????????? :\ni. ???????????? ?????????????????? ???????????? ???????????? ???????????? ??? ????????? ?????????????????? ???????????? ????????? ???????????? ?????????????????? ????????? ????????????????????? ?????????????????? ??????????????? (?????????) \n    ????????????:??????????????? ???????????????????????? ??????????????????????????? ????????????.\nii.  ???????????? ???????????????????????? ????????? ?????????????????? ??????????????????????????? ????????????. ???????????????????????? ??????????????????????????? ???????????? ?????????????????? ??????????????? ???????????? ??????????????????.\n\n3. ??????????????? :\n???) ????????????????????? ????????? :\ni. ???????????? ?????????????????????????????? ?????????????????????????????? ???????????? ??????????????? ????????????????????? ?????????????????? ????????? ??????????????? ????????? ??????????????? ???????????????????????? ?????????????????? ???????????????.\nii. ???????????? ?????????????????????????????? (???????????????) ???????????? ???????????? ??????????????? ????????????????????? ?????????????????? ?????????????????? ????????? ????????????.\niii. ???????????? ????????????????????? ??????????????? ????????????????????? ?????????????????? ?????????????????? ??????????????? ???????????????????????? ?????????????????? ????????????.\niv. ???????????????????????? ????????????????????? ??????????????? ????????? ????????? ???????????? ????????? ??????????????? ?????????????????? ???????????? ???????????? ??????????????? ???????????????.\n\n???) ????????? ??????????????????????????? :\ni. ??????????????????????????? ???????????? ????????????????????? ????????????????????????????????? ????????????????????? ?????????????????? ???????????? ?????????????????? ????????? ????????????.\nii. ?????? ?????????????????? ?????????????????????????????? ??? ???????????????????????????????????? ???????????????????????????????????? ????????????????????? ??????????????? ????????? ????????????.\niii. ???????????????????????? ??????????????????????????? ????????????????????????????????? ??? ???????????????????????????????????? ???????????????????????????????????? ??????????????? ??????????????? ???????????????.\n\n4. ?????????????????? ???????????????????????? : ?????????????????? ????????????????????????????????? ??????????????? ???????????? ??? ?????????????????? ?????????????????? ??????????????????\ni. ????????????????????????????????? ????????????????????????-????????????????????? ????????????\nii. ???????????? ??? ??????????????? ??????????????? ???????????? ????????? .\niii. ??????????????? ??????????????? : ??????????????? ???????????????????????? ??????????????? ??? ????????? ???????????????. ????????????????????????????????? ??????????????? ??????????????? ??????????????? ????????? ?????????.\niv. ????????????????????? ???????????? : ?????????. Earwigs, Ladybird beetles, Ground beetles, Ants, Birds and bats\nv. ???????????????????????? ???????????? Telenomusremus, Chelonus insularis, Cotesiamarginiventris, Trichogramma \n     (T. pretiosum and T. atopovirilia), Archytas, Winthemia and Lespesia\nvi. ??????????????? ?????????????????????\n ??? ?????????????????? (Viruses) : Nuclear Polyhedrosis Virus (NPVs) such as the Spodoptera Frugi \n    perda Multicapsid Nucleopolyhedrovirus (SEMNPV)\n ??? ??????????????? (Fungi) : Metarhizium anisopliae, Metarhiziumrileyi, Beauveriabassiana\n ??? ?????????????????? (Bacteria) : Bacillus thuringiensis (Bt)\n ??? Nematodes\n ??? Protozoa\n\nvii .?????????????????? ???????????????\n ??? ???????????????????????? ??????????????????????????????????????? ???????????? ????????? ??????????????? ??????????????????????????? ???????????? ?????????.\n ??? ???????????????????????? ????????????????????? ?????????????????? ????????????????????????????????? ?????????????????? ???????????????????????? (????????????) ???????????? ?????????.\n ??? ???????????????????????? ????????????????????? ???????????? ???????????? ????????? ??? ??????????????? ?????????????????? ????????????.\n ??? ??????????????? ????????????????????????????????? ?????????????????????????????? ??????????????? (????????????) ????????????.\n\nviii. ???????????????????????? ????????????????????? :\n ????????? ?????????????????? ?????????????????? ????????????????????? ???????????????????????????????????? ???????????????????????????????????? ???????????????????????? ????????????????????????????????? ?????????????????? ???????????????.\n\n------------------------------------------------------------------------------------------------------------\n------------------------------------------------------------------------------------------------------------\n????????? ????????????????????????\n\n1. ???????????????????????????????????????????????? ????????? ????????????????????? ????????? :\n\n???) ???????????????????????? ????????? : ?????????????????? ????????????????????????????????? | ??????????????????????????? ??????????????????????????????.\n???) ?????????????????? ?????????????????? : ???????????? ?????????????????? ??? ???????????? ?????????????????? ??????????????? ??????????????????.\n\n???) ?????????????????? :\ni. ?????????????????? ?????????????????????????????? ??????????????????????????? ???????????? ?????????????????? ?????????????????? ????????? ?????????????????? ??????????????????, ?????????????????????, ?????? ???????????????????????? ??????????????? ????????????.\nii. ???????????? ???????????? ??? ????????????????????? ???????????????????????? ?????????????????? ????????? ???????????? ????????? ?????????????????????.\niii. ???????????????????????????, ?????????????????????????????? ?????????????????????????????? ??????????????????????????? ?????????????????? ???????????? ???????????????????????? ??????????????????????????? ??????????????? ???????????? ???????????? ????????????????????? \n    ????????? ????????? ?????????????????? ????????????. ???????????? ?????????????????? ????????? ??? ???????????????????????? ???????????? ??????????????? ??????????????? ??? ???????????????????????? ????????? ????????????????????? ???????????? \n     ???????????? ??????????????????????????? ??????????????????????????? ???????????????.\niv. ??????????????????????????? ????????? ???????????? ????????? ??????????????? ???????????? ????????????????????? ?????????????????? ???????????? ???????????????????????? ?????????????????? ?????? ???????????????????????? ??????????????????????????? ????????????.\n     ???????????? ?????? ???????????????????????? ???????????????????????? ???????????????????????? ????????????.\nv. ???????????? ??????????????????????????? ?????????????????? ??????????????? ??????????????????????????? ????????? ??????????????? ???????????? ????????????.\n\n???) ?????????????????? ???????????? ??? ???????????????????????? ??????????????????????????? ??????????????? : ??????????????? ??????????????????????????? ???????????? ????????? ?????????????????????????????? ?????????????????????, ??????????????? \n    ??????????????? ???????????? ??????????????? ??? ??????????????? ????????????????????? ????????????????????? ?????????????????? ??????????????? ???????????????????????? ??????????????????.\n???) ???????????? :\n?????????????????? ?????????????????? ??????????????? ??????????????? ??????% ?????????????????? ?????? ??????????????? ???????????????????????????????????? ???????????? ???????????????????????? ???????????????????????? ????????????????????? \n?????????????????? ?????????????????????????????? ?????????????????? ???????????????????????? ???????????? ???????????? ????????????.\n\n------------------------------------------------------------------------------------------------------------\n\n2. ?????????????????????????????????????????? ????????? ????????????????????? ????????? :\n\n???) ???????????????????????? ????????? : ?????????????????????????????????????????????????????????????????? ??????????????????????????????????????????????????????????????????\n???) ?????????????????? :\ni. ????????? ??????????????????????????? ?????????????????? ?????? ?????????????????? ???????????? ????????????.\nii. ?????? ?????????????????? ????????????????????????????????? ???????????????????????????????????? ?????????, ??????????????? ????????? ??????????????? ???????????? ??????????????????????????? ????????????.\niii. ?????????????????? ????????? ????????? ???????????????????????? ???????????? ????????? ??????????????????-?????????????????? ??????????????? ?????????????????? ?????????????????? ???????????????????????? ??????????????? ????????????.\n\n???) ?????????????????? ???????????? ??? ???????????????????????? ??????????????????????????? ???????????????:\ni. ????????? ??????????????????????????? ?????????????????? ???????????????????????? ????????? ??????????????? ???????????? ???????????? ??????????????? ??????????????????.\nii. ????????????, ?????????????????? ??? ??????????????? ??????????????? ???????????????????????? ??????????????? ???????????? ??????????????? .\niii. ????????????????????? ????????????????????? ???????????????.\n\n???) ???????????? :\n?????????????????? ?????????????????? ??????????????? ??????????????? ?????? ??????????????? ???????????????????????????????????? ??????????????? ??? ???????????? ??????????????? ?????? ???????????????????????? ?????????????????? ?????????????????? ?????? ???????????????????????? \n?????????-????????????????????? ??????????????? ??????????????????.\n\n------------------------------------------------------------------------------------------------------------\n3. ????????????????????? ???????????? ???????????? :\n\n???) ???????????????????????? ????????? : ????????????????????????????????? ?????????????????????\n???) ?????????????????? ?????????????????? : ????????? ??? ???????????? ????????????????????????????????? ??????????????????.\n\n???) ?????????????????? :\ni. ????????????????????? ???????????? ????????????????????????, ??????????????????-????????????????????? ???????????????????????? ???.??? ?????? ?????? ????????????. ???????????? ??????????????? ???????????????\nii. ???????????????????????? ???????????? ????????????????????????????????? ???????????????????????? ??????????????? ????????????????????? ??????????????? ???????????? ??? ???????????? ???????????????????????? ???????????? ????????????.\n\n???) ???????????? : ?????????????????? ?????????????????? ??????????????? ??????????????? ??????????????????????????????????????? ??????????????????????????? ???.??? ??????????????? ??????????????? ???????????? ???????????? ?????? ???????????????????????? ???-?????? \n     ?????????????????????????????? ????????????????????? ?????????????????????.\n\n------------------------------------------------------------------------------------------------------------\n4. ??????????????? ???????????? ???????????? :\n\n???) ???????????????????????? ????????? : ???????????????????????????????????? ???????????????\n???) ?????????????????? ?????????????????? : ???????????? ?????????, ????????? ??????????????????.\n???) ?????????????????? : ??????????????????????????? ?????????????????????????????? ??????????????? ?????????????????? ??????????????? ????????? ???????????????-?????????????????? ???????????????????????? ???????????? ??????????????? ???????????????.\n???) ????????????: ?????????????????? ?????????????????? ??????????????? ??????????????? ??????????????????????????????????????? ??????????????????????????? | ?????????????????? ???.??? ??????????????? ??????????????? ???????????? ???????????? ?????? ???????????????????????? ?????????????????????.\n\n???????????????, ???????????? ??? ?????????????????????\ni. ?????????????????????????????? ????????? ?????????????????? ??????????????? ???????????????????????? ???????????? ?????????????????? ?????????????????? ????????? ???????????? ????????? ???????????????????????? ???????????????.\nii. ???????????????????????? ???????????? ??? ??????????????? ??????????????? ???????????? ??????????????? ??????????????? ????????????????????? ????????? ????????????????????? ???????????? ????????? ????????? ???????????? ?????????????????? \n    ?????????????????? ????????????????????????.\niii. ???????????????????????? ????????????????????? ???????????? ????????????????????????????????? ????????? ??????????????? ???????????????????????? ???????????? ???????????????.\niv.??????????????? ???????????????????????? ???????????? ????????????????????????????????? ????????? ????????????????????? ??????????????????????????? ?????????????????? ??????-?????? ??????????????? ???????????? ??????????????????????????? ?????????????????? ?????????????????? \n     ????????????????????? ?????????????????? ??????????????????????????? ???????????????????????? ?????????????????? ????????? ????????????.\nv. ????????? ??????????????? ????????? ??????????????? ???????????? ???????????????????????????????????? ?????????????????? ????????????????????? ??????-?????? ??????????????? ?????????????????? ??????????????????????????? ?????????????????? (????????????????????????????????? \n    ???????????????????????????) ?????????????????? ???????????? ????????????.\nvi. ????????? ????????????????????? ?????????????????? ????????? ??????????????? ???????????? ?????????????????????????????? ??????-?????? ???????????? ??????????????? ????????????.\nvii.????????? ??????????????? ?????????????????????????????? ??????????????????????????? ?????? ????????? ???????????? ??????????????? ???????????? ?????????????????? ????????????????????? ??????????????????. ???????????? ??????????????? ?????????????????????????????? \n     ??????????????????????????? ??????????????? ???????????? ??????????????????????????? ????????????????????? ?????????????????? ???????????????.\n\n------------------------------------------------------------------------------------------------------------\n????????????????????? :-\n\n??????????????????????????????????????? ??????????????????????????????????????????????????? ????????????????????? ?????? ?????????????????? ??? ?????????????????? ?????????????????????????????? ????????????????????? ??????- ?????? ????????? ?????????????????? ????????????????????? ???????????????.");
        jScrollPane1.setViewportView(MAKKA_DIS);

        javax.swing.GroupLayout WALLLayout = new javax.swing.GroupLayout(WALL);
        WALL.setLayout(WALLLayout);
        WALLLayout.setHorizontalGroup(
            WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WALLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BACK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PRINT_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        WALLLayout.setVerticalGroup(
            WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WALLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PRINT_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(650, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        DISEASE LG = new DISEASE();
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

    private void PRINT_TEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINT_TEXTMouseClicked
        try {
            Boolean pp = MAKKA_DIS.print();
            if(pp)
            {
                JOptionPane.showMessageDialog(null,"Done");
                dispose();
            }
        } catch (PrinterException ex) {
            Logger.getLogger(MAKKA_DIS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PRINT_TEXTMouseClicked

    private void PRINT_TEXTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINT_TEXTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PRINT_TEXTMouseEntered

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
            java.util.logging.Logger.getLogger(MAKKA_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAKKA_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAKKA_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAKKA_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAKKA_DIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JTextArea MAKKA_DIS;
    private javax.swing.JLabel PRINT_TEXT;
    private javax.swing.JPanel WALL;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
