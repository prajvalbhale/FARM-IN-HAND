
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
public class WHEAT_INFO extends javax.swing.JFrame {

    /**
     * Creates new form WHEAT_INFO
     */
    public WHEAT_INFO() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Border panelk = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        BACK.setBorder(panelk);
    
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
        PRINT_TEXT2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WHEAT_IN = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        WHEAT_IN.setEditable(false);
        WHEAT_IN.setColumns(20);
        WHEAT_IN.setRows(5);
        WHEAT_IN.setText("गहू हे भारतातील महत्त्वाचे अन्नधान्य पीक आहे.\n\nजगातील गहू पिकाचे एकूण क्षेत्र व उत्पादनामध्ये भारताचा जगात दुसरा क्रमांक लागतो.\n1964-65 मधील 122.6 लाख मे. टन उत्पादनापासून 2013-14 च्या रब्बी हंगामात \n959.1 लाख मे. टनांपर्यंत पोचले आहे. आपला देश गहू उत्पादनात स्वयंपूर्ण होऊन निर्यातही \nकरू लागला आहे. गहू उत्पादनात भारताने अमेरिकेलासुद्धा मागे टाकले आहे.\nमात्र, भारताच्या तुलनेत महाराष्ट्रातील प्रतिहेक्‍टरी गहू उत्पादकता कमी आहे. \n2013-14 च्या रब्बी हंगामात सरासरी प्रतिहेक्‍टरी गव्हाचे उत्पादन हे भारत देशाचे 30.61 क्विंटल, \nतर महाराष्ट्र राज्याचे 15.21 क्विंटल होते.\nगहू पिकाखालील क्षेत्र व उत्पादनात उत्तर प्रदेश, तर प्रतिहेक्‍टरी उत्पादकतेत पंजाबचे स्थान नेहमीच \nअव्वल राहिले आहे.\n\nजमीन :- \nमध्यम ते भारी, पाण्याचा चांगला निचरा असणारी जमीन गहू पिकास मानवते. बागायती गव्हासाठी \nभारी व खोल जमीन निवडावी.\nमध्यम प्रकारच्या जमिनीत रासायनिक खतांसोबत भरखते जमिनीत मिसळल्यास गव्हाचे चांगले \nउत्पादन घेता येते. जिरायत गहू घेत असताना तो भारी जमिनीतच घ्यावा म्हणजे पावसाच्या \nपाण्याचा ओलावा जास्तीत जास्त काळ टिकून राहतो व अधिक उत्पादन मिळण्यास मदत होते.\nशक्‍यतो हलक्‍या जमिनीत गव्हाची लागवड करणे टाळावे.\n\nहवामान\nथंड, कोरडे आणि स्वच्छ सूर्यप्रकाश असणारे हवामान गहू पिकासाठी उपयुक्त असते.\n\nपूर्वमशागत\nगहू पिकाच्या मुळ्या 60 ते 65 सें.मी. खोलवर जात असल्याने, चांगली भुसभुशीत जमीन असणे गरजेचे असते. \n- खरीप पीककाढणीनंतर जमिनीची 15 ते 20 सें.मी. खोलवर नांगरट करावी. \n- हेक्‍टरी 25 ते 30 बैलगाड्या चांगले कुजलेले शेणखत अथवा कंपोस्ट खत शेतात पसरून टाकावे. \n   त्यानंतर कुळवाच्या 3 ते 4 पाळ्या द्याव्यात.\n\nपेरणीची वेळ\nबागायती गव्हाची पेरणी नोव्हेंबर महिन्याच्या पहिल्या पंधरवड्यात करावी. बागायतीची उशिरा पेरणी \n16 नोव्हेंबर ते 15 डिसेंबरदरम्यान करता येते; मात्र, उशीर झालेल्या प्रत्येक पंधरवड्यानंतर \nउत्पादनात 2.5 क्विंटल घट येते. उशिरा पेरणी केलेले पीक तांबेरा या घातक रोगास बळी पडून \nजास्त नुकसान होते. - 5 डिसेंबरनंतर पेरलेल्या गव्हाचे उत्पादन फायदेशीर ठरत नाही. \nम्हणून गव्हाची लागवड करताना पेरणीची योग्य वेळ साधणे अत्यंत गरजेचे असते.\n\nयोग्य जातींची निवड\n- महाराष्ट्रातील बागायती वेळेवर पेरणी (1 ते 15 नोव्हेंबर), तसेच उशिरा पेरणी (16 नोव्हेंबर ते 15 डिसेंबर), \n   पेरणीसाठी सरबती गव्हाच्या \"समाधान' (एनआयएडब्ल्यू 1994) या नवीन वाणाची शिफारस करण्यात आलेली आहे. \nआ) बागायती उशिरा पेरणीसाठी - एनआयएडब्ल्यू 34 (बागायती उशिरा पेरणीसाठी उत्तम, \n      दाणे मध्यम व आकर्षक, चपातीसाठी उत्तम, प्रतिहेक्‍टरी उत्पादनक्षमता - 35 ते 40 क्विंटल).\n\nहेक्‍टरी बियाणे - \nहेक्‍टरी 20 ते 22 लाख इतकी रोपांची संख्या शेतात असणे आवश्‍यक असते. \nरोपांचे हे प्रमाण राखण्यासाठी बागायती वेळेवर पेरणी ः 100 ते 125 किलो, तर उशिरा पेरणी - 125 ते 150 किलो \nबियाणे लागते.\n\nबीजप्रक्रिया\nकॅप्टन किंवा थायरम3 ग्रॅम प्रति किलो या प्रमाणात बीजप्रक्रिया करावी. तसेच प्रति 10 किलो \nबियाण्यास 250 ग्रॅम ऍझोटोबॅक्‍टर व 250 ग्रॅम पीएसबी या जिवाणुसंवर्धन खताची बीजप्रक्रिया करावी. \nयामुळे उत्पादनात 10 ते 15 टक्‍क्‍यांपर्यंत वाढ होते.\n\nपेरणी\nजमिनीत पुरेशी ओल असताना पेरणी करावी.\nपेरणी शक्‍यतो दक्षिणोत्तर करावी. बागायत पिकाची वेळेवर पेरणी दोन ओळींत 22.5 सें.मी. व उशिरा \nपेरणी 18 सें.मी. अंतर ठेवून करावी. - गव्हाची पेरणी उथळ म्हणजे 5 ते 6 सें.मी. खोलीवर करावी. \nत्यामुळे उगवण चांगली होते.\nजिरायती गव्हाची पेरणी दोन ओळींत 20 सें.मी. अंतर ठेवून करावी. बियाणे झाकण्यासाठी कुळव उलटा \nकरून चालवावा म्हणजे बी व्यवस्थित जमिनीत दबून मातीने झाकले जाते.\nजमिनीचा उतार लक्षात घेऊन गव्हासाठी 2.5 ते 4 मीटर रुंदीचे व 7 ते 25 मीटर लांब या आकाराचे सारे पडावेत.\n\nखत व्यवस्थापन\nअ) बागायती गव्हाच्या वेळेवर पेरणीसाठी हेक्‍टरी 120 किलो नत्र, 60 किलो स्फुरद व 40 किलो पालाश द्यावे.    \n     पेरणीच्या  वेळी नत्राची अर्धी मात्रा आणि स्फुरद व पालाशची संपूर्ण मात्रा द्यावी. उरलेली नत्राची अर्धी मात्रा \n      पेरणीनंतर तीन आठवड्यांनी खुरपणी झाल्यानंतर मुकुटमुळे फुटण्याच्या अवस्थेत द्यावी. \nआ) बागायती गव्हाच्या उशिरा पेरणीसाठी हेक्‍टरी 80 किलो नत्र, 40 किलो स्फुरद व 40 किलो पालाश द्यावे. \n      पेरणीच्या वेळी नत्राची अर्धी मात्रा आणि स्फुरद व पालाशची संपूर्ण मात्रा द्यावी. उरलेली नत्राची अर्धी मात्रा \n       पेरणीनंतर तीन आठवड्यांनी द्यावी. \nइ) जिरायती गव्हासाठी हेक्‍टरी 40 किलो नत्र व 20 किलो स्फुरद पेरून द्यावे. याशिवाय 2 टक्के युरियाच्या \n     द्रावणाची फवारणी दाणे भरण्याच्या अवस्थेत म्हणजे 65 ते 70 दिवसांनी करावी. या फवारणीमुळे दाण्याचा \n      आकार वाढतो, वजन वाढते व दाण्यास चकाकी प्राप्त होते.\n\nपाण्याचे नियोजन\nसाधारणपणे दर 18 ते 21 दिवसांच्या अंतराने पाण्याच्या पाळ्या द्याव्यात, मध्यम ते भारी जमिनीत पीक तयार \nहोण्यासाठी 4 ते 5 पाण्याच्या पाळ्या देण्याची गरज असते. \nगहू पिकाच्या पाण्याच्या पाळीसाठी संवदेनशील अवस्था. पेरणीनंतर दिवस ः \t\nपाण्याची उपलब्धता कमी असल्यास,\n1) केवळ एकच पाणी देणे शक्‍य असल्यास - पेरणीनंतर 40 ते 42 दिवसांनी द्यावे.\n2) दोन पाणी देणे शक्‍य असल्यास - पहिले पाणी पेरणीनंतर 20 ते 22 दिवसांनी व दुसरे पाणी 60 ते 65 दिवसांनी द्यावे. \n3) तीन पाणी देणे शक्‍य असल्यास - पहिले पाणी पेरणीनंतर 20 ते 22 दिवसांनी व दुसरे पाणी 40 ते 42 दिवसांनी व \n    तिसरे पाणी 60 ते 65 दिवसांनी द्यावे. \nअपुरा पाणीपुरवठा परिस्थितीत एक किंवा दोन पाणी शक्‍य आहे अशा क्षेत्रात शक्‍यतो पंचवटी (एनआयडीडब्ल्यू 15) \nहा गव्हाचा वाण पेरावा.\n\nआंतरमशागत :-\nतणांचे नियंत्रण करण्यासोबतच आंतरमशागतीमुळे जमिनीत ओलावा टिकून राहण्यास मदत होते. \nगव्हात चांदवेल, हरळी, दुधाणी, लव्हाळा इत्यादी तणांचा मोठ्या प्रमाणात प्रादुर्भाव होत असतो. \nत्याकरिता एक किंवा दोन वेळा खुरपणी, तसेच कोळपणी करून जमीन मोकळी करावी.\nवरीलप्रमाणे बागायती गव्हाची वेळेवर लागवड केल्यास हेक्‍टरी 45 ते 50 क्विंटल, बागायती गव्हाची  उशिरा लागवड \nकेल्यास हेक्‍टरी 35 ते 40 क्विंटल व जिरायत लागवड केल्यास हेक्‍टरी 12 ते 15 क्विंटल उत्पादन मिळते.");
        jScrollPane1.setViewportView(WHEAT_IN);

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

        setSize(new java.awt.Dimension(666, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BACKMouseClicked
        FARMERSCR LG = new FARMERSCR();
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
            Boolean pp = WHEAT_IN.print();
            if(pp)
            {
                JOptionPane.showMessageDialog(null,"Done");
                dispose();
            }
        } catch (PrinterException ex) {
            Logger.getLogger(WHEAT_INFO.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(WHEAT_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WHEAT_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WHEAT_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WHEAT_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WHEAT_INFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACK;
    private javax.swing.JLabel PRINT_TEXT2;
    private javax.swing.JPanel WALL;
    private javax.swing.JTextArea WHEAT_IN;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}