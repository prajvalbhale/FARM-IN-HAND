import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class RAGISTER extends javax.swing.JFrame {

    PreparedStatement p;
    ResultSet R;
    
    public RAGISTER() {
        initComponents();
        
        
        
        
        this.setLocationRelativeTo(null);  // FORM COMES IN CENTRE
        
        // BORDER ACTION'S START
        
        Border panelit = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jPanel_MAIN.setBorder(panelit);
        //jPanel_SUB.setBorder(panelit);
        jTextField_ID.setBorder(panelit);
        jTextField_PHONE.setBorder(panelit);
        jTextField_ADD.setBorder(panelit);
        jPasswordField_passw.setBorder(panelit);
        jPasswordField_passw2.setBorder(panelit);
        jTextField_STATE.setBorder(panelit);
        jTextField_DIST.setBorder(panelit);
        jTextField_TALUKA.setBorder(panelit);
        jTextField_VILLEGE.setBorder(panelit);
        jTextField_PINCOD.setBorder(panelit);
        jRadioButton_MALE.setBorder(panelit);
        jRadioButton_FEMALE.setBorder(panelit);
        jLabel_MIN.setBorder(panelit);
        jLabel_CLOSE.setBorder(panelit);
        
        Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY);
        jButton_RAGISTER.setBorder(firs);
        jButton_RAGISTER.setBackground(Color.GRAY);
        
        // BORDER ACTION'S END
        
        jLabel_CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/redclose.png")));  // GIVE ICON TO CLOSE
        
        jLabel_MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/MINIM.png")));  // GIVE ICON TO MINIMIZE
        
        jLabel_USERID.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/userid.png")));  // GIVE ICON TO USER_ID
        
        jLabel_ADDRESS.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/home.png")));  // GIVE ICON TO ADDRESS
        
        jLabel_PHONE.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/phone.png")));  // GIVE ICON TO PHONE
        
        jLabel_PASS.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/lock.png")));  // GIVE ICON TO PASSWORD
        
        jLabel_CONFORM.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/conpass.png")));  // GIVE ICON TO CONFORM_PASSWORD
        
        //jLabel_ADDRESS.setIcon(new javax.swing.ImageIcon(getClass().getResource("IMEAGES/home.png")));  // GIVE ICON TO jLabel_PHONE
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel_MAIN = new javax.swing.JPanel();
        jPanel_SUB = new javax.swing.JPanel();
        jLabel_CLOSE = new javax.swing.JLabel();
        jLabel_MIN = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_USERID = new javax.swing.JLabel();
        jLabel_ADDRESS = new javax.swing.JLabel();
        jLabel_PHONE = new javax.swing.JLabel();
        jLabel_ADDRESS3 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_PHONE = new javax.swing.JTextField();
        jTextField_ADD = new javax.swing.JTextField();
        jTextField_STATE = new javax.swing.JTextField();
        jLabel_ADDRESS4 = new javax.swing.JLabel();
        jTextField_DIST = new javax.swing.JTextField();
        jLabel_ADDRESS5 = new javax.swing.JLabel();
        jTextField_TALUKA = new javax.swing.JTextField();
        jTextField_VILLEGE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel_PASS = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_CONFORM = new javax.swing.JLabel();
        jButton_RAGISTER = new javax.swing.JButton();
        jComboBox_CODE = new javax.swing.JComboBox<>();
        jPasswordField_passw = new javax.swing.JPasswordField();
        jPasswordField_passw2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_PINCOD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton_MALE = new javax.swing.JRadioButton();
        jRadioButton_FEMALE = new javax.swing.JRadioButton();
        CREATEAC = new javax.swing.JLabel();
        GUST = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel_MAIN.setBackground(new java.awt.Color(221, 160, 221));
        jPanel_MAIN.setInheritsPopupMenu(true);

        jLabel_CLOSE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_CLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/redclose.png"))); // NOI18N
        jLabel_CLOSE.setText("  X");
        jLabel_CLOSE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CLOSEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_CLOSEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_CLOSEMouseExited(evt);
            }
        });

        jLabel_MIN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_MIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/MINIM.png"))); // NOI18N
        jLabel_MIN.setText("  -");
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

        jLabel2.setFont(new java.awt.Font("Cambria Math", 3, 48)); // NOI18N
        jLabel2.setText("Register Here");

        javax.swing.GroupLayout jPanel_SUBLayout = new javax.swing.GroupLayout(jPanel_SUB);
        jPanel_SUB.setLayout(jPanel_SUBLayout);
        jPanel_SUBLayout.setHorizontalGroup(
            jPanel_SUBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SUBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel_MIN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_SUBLayout.setVerticalGroup(
            jPanel_SUBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SUBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SUBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_CLOSE, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_MIN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SUBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        jLabel_USERID.setBackground(new java.awt.Color(221, 160, 221));
        jLabel_USERID.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_USERID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/userid.png"))); // NOI18N
        jLabel_USERID.setOpaque(true);

        jLabel_ADDRESS.setBackground(new java.awt.Color(221, 160, 221));
        jLabel_ADDRESS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/home.png"))); // NOI18N
        jLabel_ADDRESS.setOpaque(true);

        jLabel_PHONE.setBackground(new java.awt.Color(221, 160, 221));
        jLabel_PHONE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/phone.png"))); // NOI18N
        jLabel_PHONE.setOpaque(true);

        jLabel_ADDRESS3.setBackground(new java.awt.Color(221, 160, 221));
        jLabel_ADDRESS3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel_ADDRESS3.setText("STATE");
        jLabel_ADDRESS3.setOpaque(true);

        jTextField_ID.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_IDKeyPressed(evt);
            }
        });

        jTextField_PHONE.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_PHONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PHONEActionPerformed(evt);
            }
        });
        jTextField_PHONE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_PHONEKeyPressed(evt);
            }
        });

        jTextField_ADD.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_ADD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_ADDKeyPressed(evt);
            }
        });

        jTextField_STATE.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_STATE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_STATEKeyPressed(evt);
            }
        });

        jLabel_ADDRESS4.setBackground(new java.awt.Color(221, 160, 221));
        jLabel_ADDRESS4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel_ADDRESS4.setText("DIST");
        jLabel_ADDRESS4.setOpaque(true);

        jTextField_DIST.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_DIST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_DISTKeyPressed(evt);
            }
        });

        jLabel_ADDRESS5.setBackground(new java.awt.Color(221, 160, 221));
        jLabel_ADDRESS5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel_ADDRESS5.setText("TALUKA");
        jLabel_ADDRESS5.setOpaque(true);

        jTextField_TALUKA.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_TALUKA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_TALUKAKeyPressed(evt);
            }
        });

        jTextField_VILLEGE.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_VILLEGE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_VILLEGEKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setText("VILLEAGE");

        jLabel_PASS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/lock.png"))); // NOI18N

        jLabel_CONFORM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMEAGES/conpass.png"))); // NOI18N

        jButton_RAGISTER.setBackground(new java.awt.Color(102, 102, 255));
        jButton_RAGISTER.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jButton_RAGISTER.setText("Register");
        jButton_RAGISTER.setBorder(null);
        jButton_RAGISTER.setBorderPainted(false);
        jButton_RAGISTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_RAGISTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_RAGISTERMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RAGISTERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RAGISTERMouseExited(evt);
            }
        });
        jButton_RAGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RAGISTERActionPerformed(evt);
            }
        });

        jComboBox_CODE.setFont(new java.awt.Font("Cambria Math", 1, 10)); // NOI18N
        jComboBox_CODE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IND (+91)", "USA (+21)", "UK  (+11)", "AUS (+34)" }));
        jComboBox_CODE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPasswordField_passw.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jPasswordField_passw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_passwKeyPressed(evt);
            }
        });

        jPasswordField_passw2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setText("PIN CODE");

        jTextField_PINCOD.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextField_PINCOD.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_PINCOD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_PINCODKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setText("GENDER");

        jRadioButton_MALE.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jRadioButton_MALE.setText("Male");
        jRadioButton_MALE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton_MALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MALEActionPerformed(evt);
            }
        });

        jRadioButton_FEMALE.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jRadioButton_FEMALE.setText("Female");
        jRadioButton_FEMALE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton_FEMALE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FEMALEActionPerformed(evt);
            }
        });

        CREATEAC.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        CREATEAC.setForeground(new java.awt.Color(255, 255, 255));
        CREATEAC.setText("I Already Have Account");
        CREATEAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CREATEAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREATEACMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CREATEACMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CREATEACMouseExited(evt);
            }
        });

        GUST.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        GUST.setForeground(new java.awt.Color(255, 255, 255));
        GUST.setText("Gust ?");
        GUST.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GUST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GUSTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GUSTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GUSTMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MAINLayout = new javax.swing.GroupLayout(jPanel_MAIN);
        jPanel_MAIN.setLayout(jPanel_MAINLayout);
        jPanel_MAINLayout.setHorizontalGroup(
            jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MAINLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                .addComponent(jLabel_ADDRESS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_PINCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                            .addComponent(jLabel_USERID)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_ID))
                                        .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                            .addComponent(jLabel_PASS)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jPasswordField_passw, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(82, 82, 82)
                                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel_PHONE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel_CONFORM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField_passw2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                            .addComponent(jComboBox_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_PHONE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_VILLEGE, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel_ADDRESS4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_DIST, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 98, Short.MAX_VALUE))
                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                        .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                .addComponent(jLabel_ADDRESS3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_STATE, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_MAINLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel_ADDRESS5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_TALUKA, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_SUB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel_MAINLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_MALE)
                .addGap(10, 10, 10)
                .addComponent(jRadioButton_FEMALE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MAINLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CREATEAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GUST))
                    .addComponent(jButton_RAGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );
        jPanel_MAINLayout.setVerticalGroup(
            jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MAINLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_SUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_USERID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_CODE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_PASS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordField_passw, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_CONFORM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_passw2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_PINCOD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4))
                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                        .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_STATE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ADDRESS3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_TALUKA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ADDRESS5)))
                    .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_DIST, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_ADDRESS4))
                    .addGroup(jPanel_MAINLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_VILLEGE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(37, 37, 37)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_MALE)
                    .addComponent(jRadioButton_FEMALE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton_RAGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MAINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CREATEAC, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(GUST))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MAIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MAIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CLOSEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSEMouseEntered
        Border panelclosES = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.red);
        jLabel_CLOSE.setBorder(panelclosES);
    }//GEN-LAST:event_jLabel_CLOSEMouseEntered

    private void jLabel_CLOSEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSEMouseExited
        Border panelclosES = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_CLOSE.setBorder(panelclosES);

    }//GEN-LAST:event_jLabel_CLOSEMouseExited

    private void jLabel_CLOSEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CLOSEMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CLOSEMouseClicked

    private void jLabel_MINMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MINMouseEntered
        Border panelmini = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.white);
        jLabel_MIN.setBorder(panelmini);
    }//GEN-LAST:event_jLabel_MINMouseEntered

    private void jLabel_MINMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MINMouseExited
        Border panelmini = BorderFactory.createMatteBorder(2, 2, 2, 2, Color.black);
        jLabel_MIN.setBorder(panelmini);
    }//GEN-LAST:event_jLabel_MINMouseExited

    private void jTextField_PHONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PHONEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PHONEActionPerformed

    
    
public boolean verifydata()
    {
        
        if(jTextField_ID.getText().equals("") && jTextField_PHONE.getText().equals("") && jTextField_ADD.getText().equals("") && jPasswordField_passw.getText().equals("") && jPasswordField_passw2.getText().equals("")&& jTextField_STATE.getText().equals("")&& jTextField_DIST.getText().equals("") && jTextField_TALUKA.getText().equals("")&& jTextField_VILLEGE.getText().equals("")&& jTextField_PINCOD.getText().equals(""))
            {
            JOptionPane.showMessageDialog(this, "ALL FIELD'S ARE REQUIRED");
            return false;
            }
                else if (jTextField_ID.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"USER NAME IS REQUIRED");
                         return false;
                    }
                  else if (jTextField_PHONE.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PLEAES ENTER YOUR PHONE NUMBER");
                         return false;
                    }
                  else if(jPasswordField_passw.getText().equals(""))
                    {
                        JOptionPane.showMessageDialog(this,"FILL YOUR PASSWORD");
                        return false;
                    }
                 else if (jPasswordField_passw2.getText().equals(""))
                     {
                          JOptionPane.showMessageDialog(this,"CONFORM YOUR PASSWORD");
                          return false;
                      }      
                    else if(!jPasswordField_passw.getText().equals(jPasswordField_passw2.getText()))
                        {
                           JOptionPane.showMessageDialog(this,"PASSWORD IS NOT MATCH");
                           return false;
                         } 
                   else if (jTextField_ADD.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PLEAES ENTER YOUR ADRESS");
                         return false;
                    }
                   else if (jTextField_PINCOD.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PIN CODE IS MUST REQUIRED");
                         return false;
                    }
                    else if (jTextField_STATE.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PLEASE ENTER YOUR STATE");
                         return false;
                    }
                    else if (jTextField_DIST.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PLEAES ENTER YOUR DISTRICT");
                         return false;
                    }
                    else if (jTextField_TALUKA.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PLEASE ENTER YOUR TALUKA");
                         return false;
                    }
                    else if (jTextField_VILLEGE.getText().equals(""))
                    {
                         JOptionPane.showMessageDialog(this,"PLEASE ENTER YOUR VILLEGE NAME");
                         return false;
                    }
//                    else if (jRadioButton_MALE.isSelected())
//                    {
//                        JOptionPane.showMessageDialog(this,"PLEASE DESCRIBE YOUR GENDER");
//                        return false;
//                    }
                    else 
                    {
                         return true;
                    }
       // return false;
    }
    
    private void jButton_RAGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RAGISTERActionPerformed
             
             
if (verifydata()){                       
// DATABASE ACTION START'S

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
            String sql = "INSERT INTO `user_register`(`USER_NAME`, `PHONE`, `ADDRESS`, `PASSWORD`, `CON_PASSWORD`, `STATE`, `DISTRICT`, `TALUKA`, `VILLEAGE`, `PIN_CODE`, `GENDER`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            p = con.prepareStatement(sql);
            
            p.setString(1, jTextField_ID.getText());
            p.setString(2, jTextField_PHONE.getText());
            p.setString(3, jTextField_ADD.getText());
            p.setString(4, jPasswordField_passw.getText());
            p.setString(5, jPasswordField_passw2.getText());
            p.setString(6, jTextField_STATE.getText());
            p.setString(7, jTextField_DIST.getText());
            p.setString(8, jTextField_TALUKA.getText());
            p.setString(9, jTextField_VILLEGE.getText());
            p.setString(10,jTextField_PINCOD.getText());
                    
            String Gender = "";
            if (jRadioButton_MALE.isSelected())
            {
                Gender="Male";
            }
            else 
                if (jRadioButton_FEMALE.isSelected())
            {
                Gender="Female";
            }
            
            p.setString(11,Gender);
            p.executeUpdate();
            JOptionPane.showMessageDialog(this,jTextField_ID.getText() + " IS SUCESSFULLY RAGISTERED!!! \n GO BACK TO LOGIN");
            LOGINSCR LOGSC = new LOGINSCR();
            LOGSC.show(true);
        }
        
        catch (Exception e)
        {}
       
        this.dispose();
}
    }//GEN-LAST:event_jButton_RAGISTERActionPerformed

// DATABASE ACTION END
    private void jRadioButton_MALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MALEActionPerformed
        if(jRadioButton_MALE.isSelected())
        {jRadioButton_FEMALE.show(false);}
    }//GEN-LAST:event_jRadioButton_MALEActionPerformed

    private void jRadioButton_FEMALEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FEMALEActionPerformed
        if(jRadioButton_FEMALE.isSelected())
        {jRadioButton_MALE.show(false);}
    }//GEN-LAST:event_jRadioButton_FEMALEActionPerformed

    private void jTextField_PHONEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PHONEKeyPressed
       String phoneno =  jTextField_PHONE.getText();
       int length = phoneno.length();
       char c = evt.getKeyChar();
       if (evt.getKeyChar() >= '0' && evt.getKeyChar()<='9')
       {
           if (length<10)
           {
               jTextField_PHONE.setEditable(true);
           }else
           {
               jTextField_PHONE.setEditable(false);
           }
       }else
       {
           if (evt.getExtendedKeyCode() == KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
           {
               jTextField_PHONE.setEditable(true);
           }else
           {
               jTextField_PHONE.setEditable(false);
           }
       }
    }//GEN-LAST:event_jTextField_PHONEKeyPressed

    private void jTextField_PINCODKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PINCODKeyPressed
       String phoneno =  jTextField_PINCOD.getText();
       int length = phoneno.length();
       char c = evt.getKeyChar();
       if (evt.getKeyChar() >= '0' && evt.getKeyChar()<='9')
       {
           if (length<6)
           {
               jTextField_PINCOD.setEditable(true);
           }else
           {
               jTextField_PINCOD.setEditable(false);
           }
       }else
       {
           if (evt.getExtendedKeyCode() == KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE)
           {
               jTextField_PINCOD.setEditable(true);
           }else
           {
               jTextField_PINCOD.setEditable(false);
           }
       }
    }//GEN-LAST:event_jTextField_PINCODKeyPressed

    private void jTextField_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_IDKeyPressed
        
        // THIS CODE IS FOR ONLY CHARACTERS VALUE WILL BE ADDED ONLY
        char c = evt.getKeyChar();
        
        if (Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c))
        {
            jTextField_ID.setEditable(true);
        }else
        {
            //JOptionPane.showMessageDialog(this,"YOU CAN'T USE ANY DIGIT OR SPECIAL SYMBOL\n IT WILL BE CLOSE YOUR CURRENT WINDOW","",JOptionPane.ERROR_MESSAGE);
            //dispose();
            jTextField_ID.setEditable(false);
        }
        
        /* / THIS CODE IS FOR NAME LENGTH
       String usid =  jTextField_ID.getText();
       int length = usid.length();
       char z = evt.getKeyChar();
       if (length<10)
           {
               jTextField_ID.setEditable(true);
           }else
           {
               JOptionPane.showMessageDialog(this,"NAME SHOULD BE SHORT!!!!","",JOptionPane.ERROR_MESSAGE);
               jTextField_ID.setEditable(true);
               jTextField_ID.setEditable(false);
           }*/
    }//GEN-LAST:event_jTextField_IDKeyPressed

    private void jTextField_ADDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ADDKeyPressed
        char d = evt.getKeyChar();
        
        if (Character.isLetter(d) || Character.isWhitespace(d)|| Character.isISOControl(d))
        {
            jTextField_ADD.setEditable(true);
        }else
        {
            //JOptionPane.showMessageDialog(this," ADRESS WILL BE SHORT","",JOptionPane.ERROR_MESSAGE);
            jTextField_ADD.setEditable(false);
        }
        
       /* / THIS CODE IS FOR NAME LENGTH
       String usADD =  jTextField_ADD.getText();
       int length = usADD.length();
       char Y = evt.getKeyChar();
       if (length<15)
           {
               jTextField_ADD.setEditable(true);
           }else
           {
               JOptionPane.showMessageDialog(this,"YOU CROSS YOUR 15 WORD LIMIT","\n STAY WITH IN 15 WORD'S LIMIT",JOptionPane.ERROR_MESSAGE);
               //jTextField_ADD.setEditable(false);
           }*/
    }//GEN-LAST:event_jTextField_ADDKeyPressed

    private void jTextField_STATEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_STATEKeyPressed
         char e = evt.getKeyChar();
        
        if (Character.isLetter(e) || Character.isWhitespace(e)|| Character.isISOControl(e))
        {
            jTextField_STATE.setEditable(true);
        }else
        {
            jTextField_STATE.setEditable(false);
        }
        
        /* / THIS CODE IS FOR NAME LENGTH
       String usSTA =  jTextField_STATE.getText();
       int length = usSTA.length();
       char H = evt.getKeyChar();
       if (length<15)
           {
               jTextField_STATE.setEditable(true);
           }else
           {
               JOptionPane.showMessageDialog(this,"YOU CROSS YOUR 15 WORD LIMIT","\n STAY WITH IN 15 WORD'S LIMIT",JOptionPane.ERROR_MESSAGE);
               //jTextField_STATE.setEditable(false);
           }*/
    }//GEN-LAST:event_jTextField_STATEKeyPressed

    private void jTextField_DISTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DISTKeyPressed
        char f = evt.getKeyChar();
       
        if (Character.isLetter(f) || Character.isWhitespace(f)|| Character.isISOControl(f))
        {
            jTextField_DIST.setEditable(true);
        }else
        {
            jTextField_DIST.setEditable(false);
        }
    }//GEN-LAST:event_jTextField_DISTKeyPressed

    private void jTextField_TALUKAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TALUKAKeyPressed
        char g = evt.getKeyChar();
        
        if (Character.isLetter(g) || Character.isWhitespace(g)|| Character.isISOControl(g))
        {
            jTextField_TALUKA.setEditable(true);
        }else
        {
            jTextField_TALUKA.setEditable(false);
        }
    }//GEN-LAST:event_jTextField_TALUKAKeyPressed

    private void jTextField_VILLEGEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_VILLEGEKeyPressed
        char h = evt.getKeyChar();
        
        if (Character.isLetter(h) || Character.isWhitespace(h)|| Character.isISOControl(h))
        {
            jTextField_VILLEGE.setEditable(true);
        }else
        {
            jTextField_VILLEGE.setEditable(false);
        }
    }//GEN-LAST:event_jTextField_VILLEGEKeyPressed

    private void jPasswordField_passwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_passwKeyPressed
        
       
    }//GEN-LAST:event_jPasswordField_passwKeyPressed

    private void jButton_RAGISTERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RAGISTERMouseEntered
        Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GREEN);
        jButton_RAGISTER.setBorder(firs);
        jButton_RAGISTER.setBackground(Color.GREEN);
    }//GEN-LAST:event_jButton_RAGISTERMouseEntered

    private void jButton_RAGISTERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RAGISTERMouseExited
       Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY);
        jButton_RAGISTER.setBorder(firs);
        jButton_RAGISTER.setBackground(Color.GRAY);
    }//GEN-LAST:event_jButton_RAGISTERMouseExited

    private void jLabel_MINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MINMouseClicked
        this.setExtendedState(RAGISTER.ICONIFIED);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel_MINMouseClicked

    private void jButton_RAGISTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RAGISTERMouseClicked
        
    }//GEN-LAST:event_jButton_RAGISTERMouseClicked

    private void CREATEACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREATEACMouseClicked
        LOGINSCR REG = new LOGINSCR();
        REG.show();
        this.dispose();
    }//GEN-LAST:event_CREATEACMouseClicked

    private void CREATEACMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREATEACMouseEntered
        //[240,230,140]
        Border firs = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        CREATEAC.setBorder(firs);
        CREATEAC.setBackground(Color.white);
    }//GEN-LAST:event_CREATEACMouseEntered

    private void CREATEACMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREATEACMouseExited
        Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black);
        CREATEAC.setBorder(firs);
        CREATEAC.setBackground(Color.white);
    }//GEN-LAST:event_CREATEACMouseExited

    private void GUSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUSTMouseClicked
        GOUST_PAGE GP = new GOUST_PAGE();
        GP.show();
        dispose();
    }//GEN-LAST:event_GUSTMouseClicked

    private void GUSTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUSTMouseEntered
        Border firs = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
        GUST.setBorder(firs);
        GUST.setBackground(Color.white);
    }//GEN-LAST:event_GUSTMouseEntered

    private void GUSTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUSTMouseExited
        Border firs = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.black);
        GUST.setBorder(firs);
        GUST.setBackground(Color.white);
    }//GEN-LAST:event_GUSTMouseExited

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
            java.util.logging.Logger.getLogger(RAGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RAGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RAGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RAGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RAGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CREATEAC;
    private javax.swing.JLabel GUST;
    private javax.swing.JButton jButton_RAGISTER;
    private javax.swing.JComboBox<String> jComboBox_CODE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_ADDRESS;
    private javax.swing.JLabel jLabel_ADDRESS3;
    private javax.swing.JLabel jLabel_ADDRESS4;
    private javax.swing.JLabel jLabel_ADDRESS5;
    private javax.swing.JLabel jLabel_CLOSE;
    private javax.swing.JLabel jLabel_CONFORM;
    private javax.swing.JLabel jLabel_MIN;
    private javax.swing.JLabel jLabel_PASS;
    private javax.swing.JLabel jLabel_PHONE;
    private javax.swing.JLabel jLabel_USERID;
    private javax.swing.JPanel jPanel_MAIN;
    private javax.swing.JPanel jPanel_SUB;
    private javax.swing.JPasswordField jPasswordField_passw;
    private javax.swing.JPasswordField jPasswordField_passw2;
    private javax.swing.JRadioButton jRadioButton_FEMALE;
    private javax.swing.JRadioButton jRadioButton_MALE;
    private javax.swing.JTextField jTextField_ADD;
    private javax.swing.JTextField jTextField_DIST;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_PHONE;
    private javax.swing.JTextField jTextField_PINCOD;
    private javax.swing.JTextField jTextField_STATE;
    private javax.swing.JTextField jTextField_TALUKA;
    private javax.swing.JTextField jTextField_VILLEGE;
    // End of variables declaration//GEN-END:variables
}
