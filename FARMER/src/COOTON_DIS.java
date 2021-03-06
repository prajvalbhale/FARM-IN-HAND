
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
public class COOTON_DIS extends javax.swing.JFrame {

    /**
     * Creates new form DISEASE_PAGE
     */
    public COOTON_DIS() {
        initComponents();
        this.setLocationRelativeTo(null);
        Border cd = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        BACK.setBorder(cd);  //.setBoreder(cd);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTWALL = new javax.swing.JTextArea();
        PRINT_TEXT = new javax.swing.JLabel();

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

        TEXTWALL.setEditable(false);
        TEXTWALL.setColumns(20);
        TEXTWALL.setRows(5);
        TEXTWALL.setTabSize(9);
        TEXTWALL.setText("\t       कापसावरील रोग आणि त्यांचे निदान :\n\n--------------------------------------------------------------------------------\n\n१) कवडी रोग (ऍन्थ्रकनोज) :- \nहा रोग कोलेटोट्रिकम इंडीकम या बुरशीमुळे होतो. \nरोगाची लक्षणे पिकाच्या सर्व अवस्थेत  आढळतात. रोगट बियाण्यांपासून निघालेली रोपे कुजतात. \nपानांवर तपकिरी काळ्या रंगाचे ठिपके दिसतात, \nअशी पाने गळतात जमिनीलगतच्या कोवळ्या देठावर चट्टे येऊन रोपे मरतात. \nकापूस घट्ट चिकटून राहतो. कवडीसारख्या गुठळीत रूपांतरित होते. म्हणून याला कवडी रोग म्हणतात. \nअसा कापूस आणि त्याचे बी निरुपयोगी होते. \nकापसाचा रंग पिवळसर तपकिरी होऊन त्याची धाग्याची प्रत बिघडते. \nया रोगाचा प्रसार दूषित व रोगट बियाणे तसेच जमिनीतील रोगट झाडांच्या अवशेषांपासून होतो. \nदुय्यम प्रसार बुरशीच्या बीजाणूद्वारे हवा व जमिनीतून होतो.  \nअतिवृष्टी, थंड हवामानात आणि विशेषतः बागायती कपाशीवर या रोगाचा प्रादुर्भाव दिसतो. \nहा रोग कपाशीच्या अमेरिकन व देशी अशा दोन्ही जातींवर आढळून येतो.\n\nरोगाचे नियंत्रण-  \nरोगाचा प्रादुर्भाव होऊ नये, यासाठी बियाण्यास शिफारस केलेल्या रसायनांची प्रक्रिया करावी. \nयामुळे रोगाचा प्राथमिक प्रसार कमी करता येतो. शेतातील पिकांचे रोगट अवशेष जाळून नष्ट करावेत. \nरोग व्यवस्थापनासाठी बियाण्यास ३ ग्रॅम थायरम प्रति १ किलो बियाणे या प्रमाणात पेरणीपूर्वी बीजप्रक्रिया करावी. \nबोंडे पक्व होण्याच्या काळात २५ ग्रॅम कॉपर ऑक्सीक्लोराईड १० लिटर पाण्यात अथवा २५ ग्रॅम झायनेब \n१० लिटर पाण्यात मिसळून आवश्यकतेनुसार दोन ते तीन वेळा फवारावे.\n------------------------------------------------------------------------------\n\n२) दहिया रोग ( ग्रे मिल्ड्यू) - \nहा रोग रॅमुलेरिया ऍरिओला या बुरशीमुळे होतो.  \nया रोगांचा प्रादुर्भाव देशी, अमेरिकन, संकरित व  संकरित बीटी कपाशीवर आढळून येतो. \nरोगट पानांवर खालील बाजूने पांढरे, कोनाकृती ठिपके दिसतात. \nहे ठिपके पसरून झाडावर दही शिंपडल्यासारखे डाग दिसतात. यामुळे या रोगास दहिया हे नाव पडले आहे. \nया बुरशीच्या प्रादुर्भावाने पाने, फुले व बोंडे गळतात. \nया रोगांची बीजे जमिनीत पडलेल्या रोगट अवशेषामध्ये सुप्तावस्थेत राहतात आणि पुढील वर्षी \nऑगस्ट-सप्टेंबर महिन्यात पोषक हवामानात पुन्हा सक्रिय होऊन कपाशीवर रोगांची लागण होते. \nरोगांचा पुढील प्रसार हवेतून होतो. \nऑगस्ट-सप्टेंबर महिन्यांत जास्त पाऊस आणि सारखे ढगाळ वातावरण असल्यास रोगाची लागण मोठ्या प्रमाणात होते.\n\nरोगाचे नियंत्रण- \nशेतातील रोगग्रस्त अवशेषांचा नायनाट करावा. पिकांची फेरपालट करावी. \nपेरणीनंतर ३०, ६० व ९० दिवसांनी प्रादुर्भाव दिसून येताच ३०० मेश पोताची गंधक भुकटीची \nहेक्टरी २० किलो ग्रॅम या प्रमाणात धुरळणी करावी किंवा \nकार्बेन्डाझिम या बुरशीनाशकांची १० ग्रॅम / १० लिटर पाणी किंवा पाण्यात मिसळणारे गंधक \n२५ ग्रॅम प्रति १० लिटर पाणी या प्रमाणात फवारावे.\n\n------------------------------------------------------------------------------\n\n३) मर रोग :- \nहा रोग फ्युजारियम ऑक्‍सिस्पोरम फॉ. स्पे. वासिन्फेक्‍टम या जमिनीत वाढणाऱ्या बुरशीमुळे होतो. \nदेशी कपाशीचे वाण या रोगाला जास्त प्रमाणात बळी पडतात. \nजमिनीचे २४ ते २८ सेल्सिअस तापमान व ४० ते ६० टक्के आर्द्रतेचे प्रमाण असताना, \nया रोगाचा प्रादुर्भाव आढळतो. हा रोग पिकांच्या वाढीच्या सर्व अवस्थेत होऊ शकतो. \nरोगट झाडाची पाने कोमेजतात, मलूल होतात, लोंबतात व पिवळी पडून वाळतात. \nरोगाला संपूर्ण झाड किंवा काही फांद्या बळी पडतात. \nरोगट झाडांचा आणि मुख्य मुळाचा भाग मधोमध उभा चिरल्यास आतील भागात काळपट पट्टे दिसतात. \nया रोगकारक बुरशीचा प्रसार प्रामुख्याने जमिनीतून होतो. \nया रोगामुळे उत्पादनात ५० ते ६० टक्के घट येते.\n\nरोगाचे नियंत्रण-  \nपेरणीपूर्वी  बियाण्यास १.५ ग्रॅम कार्बेन्डाझिम + ३ ग्रॅम थायरम प्रति किलो या प्रमाणात बीजप्रक्रिया करावी. \nरोग प्रतिबंधक वाणांची लागवड करावी.\n\n------------------------------------------------------------------------------\n\n४) पानावरील ठिपके/ अल्टरनेरिया करपा (अल्टरनेरिया लिफ स्पॉट): - \nहा बुरशीजन्य रोग असून मुख्यत्वे करून पानांवर येतो.  \nअल्टरनेरिया या बुरशीमुळे पानांवर ठिपके किंवा मोठे चट्टे आढळून येतात. \nरोगाची बुरशी पालापाचोळ्यावर असते. \nती पुढील हंगामातील पिकास रोग होण्यास कारणीभूत ठरते. \nदुय्यम प्रसार बुरशीच्या बीजाणूद्वारे हवेतून होतो. अमेरिकन जातीवर या रोगाचे प्रमाण जास्त असते.\n\nनियंत्रण :- \nवेळीच रोगट व गळालेली पाने वेचून जाळून टाकावीत. \nपेरणीपूर्वी १० ग्रॅम सुडोमोनास फ्लुरोसन्सची प्रति किलो बियाण्यास बीजप्रक्रिया करावी. \nनियंत्रणासाठी २० मि.लि. सुडोमोनास फ्लुरोसन्स प्रति १० लिटर पाण्यात मिसळून पेरणीनंतर ३०, ६० व ९० दिवसांनी \nफवारणी करावी. यामुळे जिवाणूजन्य करपा व ठिपके या दोन्ही रोगांचे नियंत्रण होते. \nरोगाचा प्रादुर्भाव दिसताच पायरॅक्लोस्ट्राबीन (२० टक्के डब्ल्यूजी) १० ग्रॅम किंवा मॅनकोझेब २५ ग्रॅम किंवा \nकॉपर ऑक्सिक्लोराईड २५ ग्रॅम प्रति १०  लिटर पाणी किंवा कार्बेन्डाझिम २५० ग्रॅम प्रति ७५० लिटर पाण्यात मिसळून \nप्रति हेक्टर फवारणी करावी.\n\n------------------------------------------------------------------------------\n\n5) करपा- \nहा रोग झॅन्थोमोनास ऑक्सेनोपोडीस पॅथोव्हर मालव्हेसीरम या जिवाणूंमुळे होतो.\n\nअ) पानावरील कोनाकार ठिपके-:- सुरुवातीस पानांच्या खालच्या बाजूने तेलकट कोनात्मक तांबड्या काळपट रंगाचे ठिपके दिसतात. \n     रोगाची सुरुवात साधारणतः ऑगस्टच्या दुसऱ्या आठवड्यात सुरू होते. \n     जवळपास सर्वच जातींवर या रोगाचा प्रादुर्भाव दिसतो.\n\nब) पानाच्या शिरेवरील करपा :- पानाच्या मुख्य व उपशिरांवर रोगाचा प्रादुर्भाव दिसतो. \n     यामुळे पानाच्या शिरा काळपट किंवा तांबड्या रंगाच्या दिसतात.\n\nक) देठावरील करपा :- फांद्यांवर काळपट रंगाचे ठिपके दिसतात व फांद्या काळपट पडतात.\n\nड) बोंड सड (रॉट) :- बोंडावर तेलकट, काळपट ठिपके पडतात.");
        TEXTWALL.setBorder(null);
        jScrollPane1.setViewportView(TEXTWALL);

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

        javax.swing.GroupLayout WALLLayout = new javax.swing.GroupLayout(WALL);
        WALL.setLayout(WALLLayout);
        WALLLayout.setHorizontalGroup(
            WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(WALLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BACK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PRINT_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        WALLLayout.setVerticalGroup(
            WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WALLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BACK)
                    .addComponent(PRINT_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(650, 537));
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
            Boolean pp = TEXTWALL.print();
            if(pp)
            {
                JOptionPane.showMessageDialog(null,"Done");
                dispose();
            }
        } catch (PrinterException ex) {
            Logger.getLogger(COOTON_DIS.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(COOTON_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COOTON_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COOTON_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COOTON_DIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COOTON_DIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JLabel PRINT_TEXT;
    private javax.swing.JTextArea TEXTWALL;
    private javax.swing.JPanel WALL;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
