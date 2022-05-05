
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
        MAKKA_DIS.setText("किड नियंत्रण :- \n-----------------------------------------------------------------------------------------------------\n1. खोडकिड :\n\nअ) शास्त्रीय नाव : कायलो पार्टेलस\nब) किडीची वैशिष्ठे :\ni. अळीच्या पाठीवर काळ्या ठिपक्यांचे पट्टे.\nii. डोक्यावर गडद तपकिरी रंग.\niii. पानावर समान रेषेत छिद्रे.\niv. पोंगा पूर्ण वाळतो.\n\nक) किडीस बळी पडणारी पिकाची अवस्था : रोपावस्था\nड) भौतिक नियंत्रण :\ni. वाळलेल्या सुरळ्या अळ्या सहित उपटून जाळून टाकाव्यात.\nii. शेत स्वच्छ ठेवावे.\niii. प्रकाश सापळा वापरावा\n\nइ) रासायनिक नियंत्रण :\ni. कार्बारील ८५% डब्ल्यूपी १७६४ ग्रॅम/हेक्टरी ५०० ते १००० लिटर पाण्यातून फवारावे.\nii. किंवा फोरेट १० जी. १० ते १२ किग्रॅ/हेक्टरी प्रमाणे जमिनीत मिसळावे.\niii. किंवा डायामिथोयेट ३० ईसी. १.२ मिली. १ पाण्यातून फवारावे.\n\nई) जैविक कीड नियंत्रण :\ni. ट्रायकोग्रामा चीलोनिस या परोपजीवीचे अंडी असलेले ८ कार्ड प्रती हेक्टरी लावावेत.\nii. निंबोळी अर्क ५% उगवणीनंतर १५ दिवसांनी फवारावे.\n\n-----------------------------------------------------------------------------------------------------\n2. गुलाबी अळी :\nअ) शास्त्रीय नाव : सेसामिया.कहबनु.४च इंफेरंस\n\nब) किडीची वैशिष्ठे :\ni. अळी गुलाबी रंगाची असते.\nii. डोके फिकट तपकिरी रंगाचे.\niii. पानावर लांब निमुळते छिद्र पडते.\n\nक) किडीस बळी पडणारी पिकाची अवस्था : सर्व अवस्था\n\nड) भौतिक नियंत्रण :\ni. पूर्ण वाळलेली सुरळी उपटून नष्ट करावी.\nii. शेत स्वच्छ ठेवावे.\niii. प्रकाश सापळा\n\nइ) जैविक कीड नियंत्रण : ट्रायकोग्रामा चीलोनिस या परोपजीवीचे अंडी असलेले ८ कार्ड प्रती हेक्टरी लावावेत.\n\n-----------------------------------------------------------------------------------------------------\n3. कणसे पोखरणारी अळी :\n\nअ) शास्त्रीय नाव : हेलीकोव्हरपा आर्मिजेरा\nब) किडीची वैशिष्ठे : सुरवातीला कणसाचे स्त्रीकेसर खाते. त्यानंतर कणसाच्या आत शिरून दाणे खाते.\n\nक) किडीस बळी पडणारी पिकाची अवस्था : केशर अवस्था\ni. एक मादी सुमारे ३५० अंडी किंवा त्यापेक्षा जास्त अंडी घालते.\nii. अंड्यातुन ४-५ दिवसात अळ्या बाहेर येतात.\niii. अळीची पुर्ण वाढ कणसामध्ये १५ ते ३५ दिवसात होते.\nई) जैविक कीड नियंत्रण :\ni. ट्रायकोग्रामा चीलोनिस या परोपजीवीचे अंडी असलेले ८ कार्ड प्रती हेक्टरी लावावेत.\nii. निंबोळी अर्क ५% उगवणीनंतर १५ दिवसांनी फवारावे.\n\n-----------------------------------------------------------------------------------------------------\n4. मावा :\n\nअ) शास्त्रीय नाव : ओपोलोसिफम मेडिस\nब) किडीची वैशिष्ठे : लहान माव्याच्या असंख्य किडी पानावर आढळून येतात.पानावर चिकट सतरावा आढळतो.\nक) किडीस बळी पडणारी पिकाची अवस्था :\nड) भौतिक नियंत्रण :\nइ) रासायनिक नियंत्रण :\nई) जैविक कीड नियंत्रण : क्रायसोपा कार्निया परोपजीवीचे ५००० अंडी प्रती हेक्टरी सोडावेत.\n\n-----------------------------------------------------------------------------------------------------\n\n5. अमेरीकन लष्करी अळी :\n\nअ) उगम व प्रसार :\ni. अमरीकन लष्करी अळी (Spodoptera frugiperda) ही मूळ अमरिकेतील कीड आहे.\nii. अमरीकेच्या उष्ण व समशितोष्ण कटिबधात ही कीड आढळते.\niii. या किडीची अळी मका, भात, ज्वारी, ऊस, भाजीपाला व कपाशी सारखी 80 पेक्षा जास्त पिकावर प्रादुर्भाव \n    आढळुन येतो.\niv. सन 2016 मध्य या किडीचा अफ्रीका खंडात सर्वप्रथम प्रादुर्भावदिसून आला.\nv.जानेवारी 2018 पर्यंत ही कीड सर्व साधारणपणे संपुर्ण आफ्रीका खंडात परसली होती. तसेच नजीकच्या इजिप्त व  \n   लिबीया या खंडातही कीड आढळून आली.\nvi. सन 2018 मध्य ही किड भारत व श्रीलंकेत आढळून आली आहे.\n\nब) किडीची ओळख व प्रादुर्भावाची लक्षणे किडीच्या चार अवस्था आहेत :\ni. अंडी (2 ते 3 दिवस)\nii. अळी (12 ते 20 दिवस) : (सहा अवस्था)\niii. कोष (12 ते 14 दिवस)\niv. पतंग (14 ते 21 दिवस)\n \n-----------------------------------------------------------------------------------------------------\n-----------------------------------------------------------------------------------------------------\nकिडीच्या वाढीचा कालावधी हवामान व इतर घटकांवर अवलंबून आहे.\n\n1. पहिली अवस्था : अंडी------>\ni. अंडी (2 ते 3 दिवस)\nii. अंडीसमुहात पानावर किंवा खोडावर सुद्धा घातलीजातात,\niii. परंतू सर्वसाधारणपणे पानाच्या खालच्या बाजुने खोडाजवळ घातली जातात.\niv. त्यावर पतंगाच्या पांढ-या केसांचा थर दिला जातो.\n\n2. दुसरी अवस्था : अळी------>\ni. अळी(12 ते 20 दिवस) - (सहा अवस्था),\nii. पहिल्या अवस्थेतील अळी पानाचा पृष्ठभाग खरवडून खाते. त्यामुळे पानांवर पारदर्शक / पांढरा पॅच दिसतो त्यास \n    विंडो (खिडकी) असे म्हणतात.\niii. प्रथम अवस्थेतील अळी पानाच्या खाली चिकट धाग्याच्या सहाय्याने लोंबकळते व वा-याने  उडून नजीकच्या \n     झाडावर पोहचते.त्यास Ballooning असे म्हणतात.\niv. अळीच्या डोक्यावर उलटा Y आकाराचे चिन्ह दिसते व शेपटाकडील शेवटून दुस-या भागावर काळ ठिपके समान \n     अंतरावर (चौरसासारखे) दिसतात.\nv.  उर्वरीत शरिरावरील ठिपके अनुक्रमे दोन जवळ व नंतरचे दोन दुर असे असतात.\nvi. अळी कोवळी पाने पोंग्यात शिरून खाते. त्यामुळ पाने कुरतडल्या सारखी दिसतात.अळीची विष्ठा पोंग्यात \n     मोठ्या प्रमाणात दिसून यत. वाळलेली विष्ठा लाकडाच्या भुश्यासारखी दिसते.\nvii. पिकाच्या वाढीच्या नंतरच्या कालावधीत अळी कणसाभोवतीची कोवळी पाने खाते व त्यानंतर कोवळे दाणेखाते.\n\n3. तिसरी अवस्था : कोष ------>\ni.कोष (12 ते 14 दिवस)\nii. सहाव्या अवस्थेतील अळी त्यानंतर पीकावरून जमीनीवर पडते व जमीनीखाली कोषात जाते.\niii. जमीन घट्ट असेल तर जमीनीवर पीकांचे अवशेष लपेटून तेथेच कोषात जाते.\niv. कणसातील अळी कणसातच कोषात जाऊ शकते.\nv. जमीनीतील अळी कोषा भोवती मातीचा थर लपेटून घेते.\nvi. कोष सर्वसाधारणपणे 15 मिमी लांबीचा असतो व मातीच्या आवरणासहीत 20 ते 25 मिमी लांबीचा असतो.\n\n4. चौथी अवस्था : पतंग ------>\ni. पतंग (14 ते 21 दिवस)\nii. पतंग रात्री सक्रीय असतात व दिवसा लपून बसतात. दिवसा पीकाच्या पानांच्या मध्ये पतंग लपून बसलेले असू शकतात.\niii. पतंग एका रात्रीत 100 किमी पर्यत उडत जाऊ शकतो.\niv. मादी पुंजक्यात अंडी घालते एका पुंजक्यात 100 ते 200 अंडी असू शकतात.\nv. मादी पतंग 6 ते 10 पुंजक्यात अंडी घालते.\nvi. एक मादी 2 ते 3 आठवड्यात सर्वसाधारणपणे 1500 ते 2000 अंडी घालते.\n\n--------------------------------------------------------------------------------------------------------\n--------------------------------------------------------------------------------------------------------\nएकात्मिक किड नियंत्रण\n\n1. पिक पद्धती :\nअ) आंतरपीक : किडीला सलग मका पिकावर अंडी घालावयास आवडते. किडीस बळी न पडणा-या आंतरपिकाचा \n     वापर केल्यास उपद्रव टाळता येऊ शकतो.\nब) फेरपालट : एकाच शेतावर सलग हंगामात किडीला बळी पडणारी पिक घेणे टाळावे. मका पिक सलग \n     (खरीप- रबी-उन्हाळी) हंगामात घेणे टाळावे. एकदल व द्विदल पीकाची फेरपालट करावी.\n\n2. मशागत :\nअ) खोल नांगरणी\ni. कीड जमीनी खाली 2 ते8 सेमी खोल कोषावस्थत जाते.\nii. हा कोष नांगरीने जमीनीवर आल्यास परभक्षी किटक व पक्षी कीडीचे कोष खाऊ टाकतात. त्यामुळे कीड नष्ट होते.\nब) पिकाचे अवशेष नष्ट करणे :\ni. ज्या ठिकाणी जमीन घट्ट असेल व कीड जमीनीत शिरू शकत नाही तेव्हा अळी जमीनीवर पिकाचे अवशेष (पान) \n    स्वत:भोवती गुंडाळून कोषावस्थत जाते.\nii.  तसेच कणासातील अळी कणसातच कोषावस्थत जाते. त्यामुळे काढणीनंतर लगेच पिकाचे अवशेष नष्ट करावेत.\n\n3. पेरणी :\nअ) पेरणीची वेळ :\ni. एकाच क्षेत्रावर वेगवेगळ्या वेळी पेरणी केल्यास कीडीला सलग कोवळी पिक मिळते त्यामुळे उपद्रव वाढतो.\nii. एकाच क्षेत्रावर (गावात) ऐकाच वेळी पेरणी केल्यास कीडीचा उपद्रव कमी होतो.\niii. तसेच उशिराने पेरणी केल्यास कीडीचा उपद्रव जास्त होण्याची शक्यता असते.\niv. त्यामुळे उशिराने पेरणी करू नये तसेच एका गावात शक्यतो एकाच वेळी पेरणी करावी.\n\nब) बीज प्रक्रीया :\ni. उगवणीनंतर लगेच किडींचा प्रादुर्भाव झाल्यास पिकाचे मोठे नुकसान होऊ शकते.\nii. हे नुकसान कीडनाशकाची व बुरशीनाशकाची बीजप्रक्रीया केल्यास टाळता येऊ शकते.\niii. त्यामुळे बियाण्यास किटकनाशकाची व बुरशीनाशकाची बिजप्रक्रीया करूनच पेरणी करावी.\n\n4. किडीचे नियंत्रण : किडीचा प्रादुर्भाव वेळेत रोखा व किडीचा प्रसार थांबवा\ni. वनस्पतीजन्य कीडनाशके-निंबोळी अर्क\nii. अंडी व अळ्या वेचून नष्ट करा .\niii. पक्षी थांबे : पक्षी कीडीच्या अळ्या व कोष खातात. पक्ष्यासाठी पिकात पक्षी थांबे उभे करा.\niv. परभक्षी कीटक : उदा. Earwigs, Ladybird beetles, Ground beetles, Ants, Birds and bats\nv. परोपजीवी कीटक Telenomusremus, Chelonus insularis, Cotesiamarginiventris, Trichogramma \n     (T. pretiosum and T. atopovirilia), Archytas, Winthemia and Lespesia\nvi. जैविक कीडनाशक\n • विषाणू (Viruses) : Nuclear Polyhedrosis Virus (NPVs) such as the Spodoptera Frugi \n    perda Multicapsid Nucleopolyhedrovirus (SEMNPV)\n • बुरशी (Fungi) : Metarhizium anisopliae, Metarhiziumrileyi, Beauveriabassiana\n • जिवाणू (Bacteria) : Bacillus thuringiensis (Bt)\n • Nematodes\n • Protozoa\n\nvii .कामगंध सापळा\n • किडीच्या पूर्वसचनेसाठी एकरी एका कामगध सापळ्याचा वापर करा.\n • सापळ्यात अमेरीकन लष्करी अळीसाठीच्या कामगंध ल्युरचाच (गोळी) वापर करा.\n • सापळ्यात अडकलेले पतंग नष्ट करा व सापळा स्वच्छ ठेवा.\n • विहीत कालावधीनंतर सापळ्यातील ल्युर (गोळी) बदला.\n\nviii. रासायनीक कीडनाशक :\n कीड आर्थीक नुकसान पातळीवर पोहचल्यानंतर शिफारशीनुसार रासायनीक किडनाशकांची फवारणी करावी.\n\n------------------------------------------------------------------------------------------------------------\n------------------------------------------------------------------------------------------------------------\nरोग नियंत्रण\n\n1. फुलोऱ्यापूर्वीचा खोड कुजव्या रोग :\n\nअ) कारणीभूत जीव : पिथीयम अफॅनीडरमॅटम | इर्विनिया क्रीसांथेम.\nब) अनुकूल हवामान : अधिक उष्णता व अधिक आद्रता युक्त हवामान.\n\nक) लक्षणे :\ni. पिथीयम खोडकुजव्या रोगामध्ये लागण झालेला खोडाचा भाग तपकिरी रंगाचा, आकसलेला, मऊ झाल्याचे दिसून येते.\nii. तसेच जमीन व पहिल्या पेराच्या ठिकाणी पीळ बसून झाड कोलमडते.\niii. याविरुद्ध, जीवाणूजन्य खोडकुजव्या रोगामध्ये रोगाची लागण झाडाच्या कोणत्याही पेरात होऊन त्या ठीकाणचा \n    रंग गडद तपकिरी होतो. तसेच पानाचा देठ व खोडयांवर चिरा दिसून येतात व तद्ननंतर झाड ताबडतोब खाली \n     पडून शेतामध्ये विखुरलेले आढळते.\niv. रोगग्रस्त खोड मधून उभे चिरले असता आतमध्ये रंगहीन तसेच पेराच्या ठिकाणी मऊ झाल्याचे निदर्शनास येईल.\n     तसेच मऊ पडलेल्या उतींमधून दुर्गंधी येते.\nv. तसेच रोगग्रस्त झाडाचा शेंडा झाडापासून सहज वेगळा करता येतो.\n\nड) रोगाची लागण न होणेसाठी घ्यावयाची काळजी : उत्तम निचऱ्याची जमीन मका लागवडीसाठी निवडावी, पेरणी \n    योग्य वेळत करावी व प्रती हेक्टरी झाडांची संख्या योग्य प्रमाणात ठेवावी.\nइ) उपाय :\nरोगाची लक्षणे दिसून येताच ७५% कॅप्टन १२ ग्रॅम प्रती१००लिटर पाणी प्रमाणात जमिनीतून दिल्यास \nपिथीयम खोडकुजव्या रोगाचे नियंत्रण करणे शक्य होते.\n\n------------------------------------------------------------------------------------------------------------\n\n2. फुलोन्यानंतरचा खोड कुजव्या रोग :\n\nअ) कारणीभूत जीव : फ्युजारियममोनिलीफॉर्म। मॅक्रोफोमिन्काऊजिओलिना\nब) लक्षणे :\ni. पिक फुलोऱ्यात येताना या रोगाची लागण होते.\nii. या रोगाचा प्रादुर्भाव प्रामुख्याने मूळ, शेंडा आणि खालील पेरे यांच्यावर होतो.\niii. खोदाचा उभा छेद घेतल्यास आतील भाग गुलाबी-जांभळा किंवा काळ्या रंगाचा झाल्याचे दिसून येईल.\n\nक) रोगाची लागण न होणेसाठी घ्यावयाची काळजी:\ni. पिक फुलोऱ्यात असताना पाण्याचा ताण पडणार नाही याची काळजी घ्यावी.\nii. नत्र, स्फुरद व पालाश यांचा शिफारशीत योग्य वापर करावा .\niii. पिकांची फेरपालट करावी.\n\nड) उपाय :\nरोगाची लक्षणे दिसून येताच १० ग्रॅम ट्रायकोडर्मा बुरशी १ किलो शेणखत या प्रमाणात मिसळून मिश्रण १० दिवसांनी \nसरी-वरंब्या मध्ये टाकावे.\n\n------------------------------------------------------------------------------------------------------------\n3. टर्सिकम पर्ण करपा :\n\nअ) कारणीभूत जीव : एक्सेरोहिलम टर्सिकम\nब) अनुकूल हवामान : थंड व अधिक आद्रतायुक्त हवामान.\n\nक) लक्षणे :\ni. पानांवर लांब अंडाकृती, करड्या-हिरव्या रंगाच्या २.५ ते १५ सेमी. चिरा दिसून येतात\nii. सुरवातीस याचा प्रादुर्भाव झाडाच्या खालील पानांवर दिसून येतो व नंतर वरपर्यंत पसरत जातो.\n\nड) उपाय : रोगाची लक्षणे दिसून येताच आवश्यकतेनुसार मॅन्कोझेब २.५ ग्रॅम प्रती लिटर पाणी या प्रमाणात ८-१० \n     दिवसांच्या अंतराने फवारावे.\n\n------------------------------------------------------------------------------------------------------------\n4. मेडिस पर्ण करपा :\n\nअ) कारणीभूत जीव : ड्रेस्क्लेरा मेडिस\nब) अनुकूल हवामान : उष्ण दमट, थंड हवामान.\nक) लक्षणे : पानांच्या शिरांमध्ये लांबट तपकिरी किंवा गडद लालसर-तपकिरी रंगाच्या चिरा दिसून येतात.\nड) उपाय: रोगाची लक्षणे दिसून येताच आवश्यकतेनुसार मॅन्कोझेब | झायनेब २.५ ग्रॅम प्रती लिटर पाणी या प्रमाणात फवारावे.\n\nकाढणी, मळणी व साठवणूक\ni. धान्यासाठी मका पिकाची काढणी कणसावरील आवरण पिवळसर पांढरे आणि दाणे टणक झाल्यावर करावी.\nii. त्यासाठी ताटे न कापता प्रथम कणसे सोलून खुडून घ्यावीत आणि सोललेली कणसे दोन तीन दिवस उन्हात \n    चांगली वाळवावीत.\niii. त्यानंतर कणसातील दाणे काढण्यासाठी मका सोलणी यंत्राचा वापर करावा.\niv.सोलणी यंत्राने दाणे काढल्यानंतर मका दाण्यात ओलाव्याचे प्रमाण १०-१२ टक्के इतके होईपर्यंत उन्हात चांगले \n     वाळवावे म्हणजे साठवणुकीत किडीमुळे नुकसान होत नाही.\nv. मका काढणी पीक पूर्ण पक्व होण्यापूर्वी म्हणजे दाण्यात २५-३० टक्के पर्यंत ओलाव्याचे प्रमाण (फिजिओलोजिकल \n    मच्यूरिटी) असताना करता येते.\nvi. अशी काढणीची अवस्था पीक पूर्ण पक्व होण्याच्या १०-१५ दिवस अगोदर येते.\nvii.अशी काढणी केल्यामुळे उत्पन्नात घट येत नाही मात्र कणसे चांगली वाळवावी लागतात. तसेच अश्या प्रकारच्या \n     काढणीमुळे हिरवी ताटे जनावरांना खाण्यास वापरता येतात.\n\n------------------------------------------------------------------------------------------------------------\nउत्पादन :-\n\nसर्वसाधारणपणे संमिश्रवाणांपासून हेक्टरी ५० क्विटल व संकरीत वाणांपासून हेक्टरी ९५- ते १०० क्विटल उत्पादन मिळते.");
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
