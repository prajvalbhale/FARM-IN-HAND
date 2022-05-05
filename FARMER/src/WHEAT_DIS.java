
import java.awt.Color;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class WHEAT_DIS extends javax.swing.JFrame {

    public WHEAT_DIS() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border cd = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        BACK.setBorder(cd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WALL = new javax.swing.JPanel();
        BACK = new javax.swing.JLabel();
        PRINT_TEXT2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WHEAT_DI = new javax.swing.JTextArea();

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

        PRINT_TEXT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/printer-24.png"))); // NOI18N
        PRINT_TEXT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PRINT_TEXT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRINT_TEXT2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PRINT_TEXT2MouseEntered(evt);
            }
        });

        WHEAT_DI.setEditable(false);
        WHEAT_DI.setColumns(20);
        WHEAT_DI.setRows(5);
        WHEAT_DI.setText("गव्हावरील रोग\n\nगव्हावर प्रामुख्याने तांबेरा (गेरवा) काजळी किंवा कानी करपा, मर, मुळकुज, खोडकुज आणि कर्नाल \nबंट या रोगाचा प्रादुर्भाव होत असतो.\nगव्हावर येणारा प्रमुख आणि नुकसान कारक रोग म्हणजे तांबेरा. खोडावरचा काळा तांबेरा, \nपानावरचा नारंगी तांबेरा, पिवळा तांबेरा या तांबेर्याचा प्रसार होत असतो.\nखोडावरचा काळा तांबेरा हा बुरशीजन्य रोग असून वक्सीनिया ग्रामिनिस, ट्रिटीसी या बुरशीमुळे होतो. \nरोगाचा प्रादुर्भाव झाल्यानंतर खोडावर फोड़ येतात.हेच फोड़ पुढे काळसर होतात.सम्पूर्ण खोड काळसर होते.\nनिलगिरी पर्वत आणि पलनी टेकड्यावरून वार्याबरोबर आणि त्या वेळी पडणार्या पावसमुळे हे रोग फैलावतात.\nपानावरचा नारंगी तांबेरा हा वक्सीनिया रीकांडीट नावाच्या बुरशीमुळे होतो.गव्हाच्या पानावर नारंगी ठिपके \nअसतात आणि नंतर फोड़ दिसतात.१८ ते २० टक्के तापमान आणि ८ टक्के आर्द्रता या रोगास पोषक असते.\nया दोन्ही रोगांना प्रतिबंधात्मक उपाय म्हणून रोगप्रतिकारक जाती पेराव्यात.\nत्याचप्रमाणे गव्हाची पेरणी हंगामापुर्वी किंवा उशिरा करू नये.\nजादा पाणी देऊ नये.\nढगाळ हवामान, पाउस अगर कडाक्याची ठंडी पडली, तर प्रतिबंधात्मक उपाय म्हणून ३ ग्राम झायनेब \nआणि १ लिटर पाणी यांची फवारणी करावी.\nप्रादुर्भाव झाल्यानंतर ३ ग्राम झायनेब किंवा मन्कोझेब आणि १ लिटर पाणी यांच्या फवारण्या आलटून पालटून कराव्या.\nकाजळी किंवा काणी हा रोग युस्टिलगो, ट्रिटसी या बुराशीमुळे होतो.ही बुरशी फुलावर वाढते.दाण्याऐवजी काळी भुकटी \nतयार होते.ही काळी भुकटी म्हणजेच काणी.ठंड आणि आर्द्र हवामानात वाढ होते.\n\nरोगमुक्त बियाणे वापरावे.\n\nउभ्या पिकातल्या रोगट ओंब्या काळजीपूर्वक काढून नष्ट कराव्यात.\n३ ग्राम कार्बेनडझिम अगर थायरम १ किलो बियाण्यास चोळावे.म्हणजे या रोगाचे नियंत्रण होऊ शकते.\n   करपा या गहू पिकावरच्या रोगाची लागण अल्टरनेरिया ट्रिटीसिना नावाच्या बुरशीमुळे होतो.\n\nकोरडवाहू पेक्षा बागायती गव्हावर जास्त प्रमाणात अल्टरनेरियाकरपा येतो. रोगाचे प्रमाण जास्त वाढल्यास करप्याचे \nठिपके एकत्र मिसळतात आणि संपूर्ण पान करपते. १९ ते २० सेल्सियस तापमान सतत दमट हवामानात या \nरोगाचा प्रसार होतो.३ ग्राम थायरमची बिजप्रक्रिया करावी आणि उभ्या पिकावर २५ ग्राम झायनेब अगर \nमन्कोझेब १ लिटर पाण्यातून फवारावे.\n\nगव्हावर फ्युजारिम या बुरशीमुळे मुळकुज तर रायझोक्टोनिया या बुरशीमुळे खोडकुज या रोगाचा प्रादुर्भाव होतो.\nया रोगांचा एकत्रित परिणाम म्हणजे रोपे पिवळी पडून सुकायाला लागतात आणि शेवटी मरतात. खोडाचा \nजमीनीलगताचा भाग आणि मुळे कुजतात आणि झाडे कोलमडून पडतात.याच्यावर उपाय म्हणजे अशी झाडे \nउपटून टाकावित आणि सुरवातीला थायरमची बीजप्रक्रिया करावी.\n\nकर्नाल ब्रंट हा रोग टिर्लोश इंडिका नावाच्या बुराशिमुले होतो.अत्यंत भयानक रोग आहे.गव्हाच्या ओंब्या \nआणि दाने काळे पडतात.\n\nत्याच्या मासळीच्या वासासारखा अतिशय घाणरडा वास येतो. त्यामुळे असा गहू खाण्यास योग्य राहतच नाही. \nउत्तर भारतात याचे प्रमाण जास्त आहे. आपल्याकडे अजुन नाही.\n\nहा रोग बियाण्याद्वारे पसरतो.\nम्हणून थायरमची बीजप्रक्रिया करावी.\nरोगमुक्त प्रामाणित बियाणे वापरावे.\nरोगट अवशेष गोळा करुन जाळून टाकावे.\nजमिनिताल्या बुरशीच्या नायानाटासाठी खोल नांगरटकरावी. अशा पद्धतीने घाण वास येणार्या (कर्नाल ब्रंट)\nया रोगाच्या नियंत्रनाचे उपाय योजवेत.\nनिरोगी गहू उत्पादनासाठी नुकसानकारक अशा या रोगाचे निर्मूलन करावे आणि अपेक्षित उत्पादन मिळवावे.");
        jScrollPane1.setViewportView(WHEAT_DI);

        javax.swing.GroupLayout WALLLayout = new javax.swing.GroupLayout(WALL);
        WALL.setLayout(WALLLayout);
        WALLLayout.setHorizontalGroup(
            WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WALLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BACK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PRINT_TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        WALLLayout.setVerticalGroup(
            WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WALLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PRINT_TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void PRINT_TEXT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINT_TEXT2MouseClicked
        try {
            Boolean pp = WHEAT_DI.print();
            if(pp)
            {
                JOptionPane.showMessageDialog(null,"Done");
                dispose();
            }
        } catch (PrinterException ex) {
            Logger.getLogger(WHEAT_DIS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PRINT_TEXT2MouseClicked

    private void PRINT_TEXT2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINT_TEXT2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PRINT_TEXT2MouseEntered

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
            java.util.logging.Logger.getLogger(WHEAT_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WHEAT_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WHEAT_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WHEAT_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WHEAT_DIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JLabel PRINT_TEXT2;
    private javax.swing.JPanel WALL;
    private javax.swing.JTextArea WHEAT_DI;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
