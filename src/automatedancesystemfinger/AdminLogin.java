package automatedancesystemfinger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame {

    JOptionPane jp = new JOptionPane();
    Integer ver, sure = jp.YES_OPTION, never = jp.NO_OPTION, confirm = jp.QUESTION_MESSAGE, yesNo = jp.YES_NO_OPTION, erm = jp.ERROR_MESSAGE, inf = jp.INFORMATION_MESSAGE;
    Integer warm = jp.WARNING_MESSAGE;
    Class cls;
    Connection con;
    DriverManager drm;
    Statement stm;
    ResultSet rst;
    String query = new String();
    final String drive = new String("sun.jdbc.odbc.JdbcOdbcDriver"), connect = new String("Jdbc:Odbc:attend");
    public static String matricNumber, userName, courseCode, password, table;
    int u;

    public AdminLogin() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jTextField1.setVisible(false);
        jPasswordField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox1.setVisible(false);
        loadCourse();
        jButton4ActionPerformed(null);
    }

    private void loadCourse() {
        try {
            jComboBox1.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT CourseCode FROM CourseTable;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox1.addItem(rst.getString(1));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Form");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 469));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 469));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 82, 20));

        jButton2.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 360, 50));

        jLabel2.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Access Login");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 640, 60));

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel3.setText("USERNAME:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 90, 27));

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel4.setText("PASSWORD:");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 105, 23));

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel5.setText("COURSE CODE:");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 105, 40));

        jLabel8.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel8.setText("Who Are You?");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 105, 27));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 240, 40));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 240, 40));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 240, 40));

        jToggleButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jToggleButton1.setText("Recover Password");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 130, 20));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Administrative");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Lecturer");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Class Representative");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 240, 40));

        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 250));

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 450, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-656)/2, (screenSize.height-350)/2, 656, 350);
    }// </editor-fold>//GEN-END:initComponents
    String matnum, usname, passw;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            if (u == 1) {

                matricNumber = jTextField2.getText();
                userName = jTextField1.getText();
                password = jPasswordField1.getText();
                if (userName.isEmpty() || password.isEmpty() || matricNumber.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Field is Not Allowed", "WARNING", warm);
                } else {
                    query = "SELECT UserName, Password, MatricNumber FROM classReps WHERE UserName='" + userName + "'AND Password='" + password + "'AND MatricNumber='"
                            + matricNumber + "';";
                    rst = stm.executeQuery(query);
                    while (rst.next()) {
                        usname = rst.getString(1);
                        passw = rst.getString(2);
                        matnum = rst.getString(3);
                        if (password.equals(passw)) {
                            this.dispose();
                            StudentTable stb = new StudentTable();
                            stb.setVisible(true);
                            stb.jButton8.setVisible(true);
                            stb.jButton10.setVisible(false);
                            stb.jButton11.setVisible(false);
                            stb.jButton9.setVisible(true);
                            stb.jLabel9.setVisible(true);
                            stb.jButton4.setVisible(false);
                            return;
                        }
                    }

                    jp.showMessageDialog(rootPane, "Invalid Username  or Password Supplied", "WARNING", warm);

                }
            }
            if (u == 2) {
                courseCode = jComboBox1.getSelectedItem().toString();
                userName = jTextField1.getText();
                password = jPasswordField1.getText();
                if (userName.isEmpty() || password.isEmpty() || courseCode.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Field is Not Allowed", "WARNING", warm);
                } else {
                    query = "SELECT UserName, Password, CourseCode FROM lecturers WHERE UserName='" + userName + "'AND Password='" + password + "'AND CourseCode='"
                            + courseCode + "';";
                    rst = stm.executeQuery(query);
                    while (rst.next()) {
                        usname = rst.getString(1);
                        passw = rst.getString(2);
                        matnum = rst.getString(3);
                        if (password.equals(passw)) {
                            this.dispose();
                            StudentTable stb = new StudentTable();
                            stb.setVisible(true);
                            stb.jButton8.setVisible(true);
                            stb.jButton10.setVisible(false);
                            stb.jButton11.setVisible(false);
                            stb.jButton9.setVisible(false);
                            stb.jLabel9.setVisible(false);
                            stb.jButton4.setVisible(true);
                            return;
                        }
                    }

                    jp.showMessageDialog(rootPane, "Invalid Username  or Password Supplied", "WARNING", warm);

                }
            }
            if (u == 3) {
                userName = jTextField1.getText();
                password = jPasswordField1.getText();
                if (userName.isEmpty() || password.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Field is Not Allowed", "WARNING", warm);
                } else {
                    query = "SELECT UserName, Password FROM userTable WHERE UserName='" + userName + "'AND Password='" + password + "';";
                    rst = stm.executeQuery(query);
                    while (rst.next()) {
                        usname = rst.getString(1);
                        passw = rst.getString(2);
                        if (password.equals(passw)) {
                            this.dispose();
                            StudentTable stb = new StudentTable();

                            stb.jButton8.setVisible(true);
                            stb.jButton9.setVisible(true);
                            stb.jButton10.setVisible(true);
                            stb.jButton11.setVisible(true);

                            stb.jLabel9.setVisible(true);
                            stb.jButton4.setVisible(false);
                            stb.setVisible(true);
                            return;
                        }
                    }
                    jp.showMessageDialog(rootPane, "Invalid Username  or Password Supplied", "WARNING", warm);

                }
            }
            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesNo, confirm);
        if (ver.equals(sure)) {
            System.exit(0);
        } else if (ver == never) {
            return;
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed
    String hint;
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            if (u == 1) {

                matricNumber = jp.showInputDialog(rootPane, "Enter Matric number in format (10690001):", "Request", confirm);
                hint = jp.showInputDialog(rootPane, "EnterRecovery text:", "Request", confirm);

                if (hint.isEmpty() && matricNumber.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Field is Not Allowed", "WARNING", warm);
                } else {
                    query = "SELECT UserName, Password, MatricNumber FROM classReps WHERE MatricNumber='" + matricNumber + "' AND RecoveryText='" + hint + "';";
                    rst = stm.executeQuery(query);
                    while (rst.next()) {
                        usname = rst.getString(1);
                        passw = rst.getString(2);
                        matnum = rst.getString(3);
                    }
                    if (matricNumber.equalsIgnoreCase(matnum)) {
                        jp.showMessageDialog(rootPane, "Your  Username is " + usname + "\n AND Your Password is " + passw, "Request", inf);
                    } else {
                        jp.showMessageDialog(rootPane, "Invalid Recovery Text  and Matric Number Supplied", "WARNING", warm);
                    }
                }
            } else if (u == 2) {
                courseCode = jp.showInputDialog(rootPane, "Enter Course Code in format (com111):", "Request", confirm);
                hint = jp.showInputDialog(rootPane, "Enter Recovery Text:", "Request", confirm);
                if (hint.isEmpty() && courseCode.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Field is Not Allowed", "WARNING", warm);
                } else {
                    query = "SELECT UserName, Password, CourseCode FROM lecturers WHERE CourseCode='" + courseCode + "' AND RecovertText='" + hint + "';";
                    rst = stm.executeQuery(query);
                    while (rst.next()) {
                        usname = rst.getString(1);
                        passw = rst.getString(2);
                        matnum = rst.getString(3);
                    }
                    if (courseCode.equalsIgnoreCase(matnum)) {
                        jp.showMessageDialog(rootPane, "Your  Username is " + usname + "\n AND Your Password is " + passw, "Request", inf);
                    } else {
                        jp.showMessageDialog(rootPane, "Invalid Course Code  and Recovery Text Supplied", "WARNING", warm);
                    }
                }
            } else if (u == 3) {
                userName = jp.showInputDialog(rootPane, "Enter Recovery Text:", "Request", confirm);
                if (userName.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Field is Not Allowed", "WARNING", warm);
                } else {
                    query = "SELECT UserName, Password, RecoveryText FROM userTable WHERE RecoveryText='" + userName + "';";
                    rst = stm.executeQuery(query);
                    while (rst.next()) {
                        usname = rst.getString(1);
                        passw = rst.getString(2);
                        hint = rst.getString(3);
                    }
                    if (userName.equalsIgnoreCase(hint)) {
                        jp.showMessageDialog(rootPane, "Your  Username is " + usname + "\n AND Your Password is " + passw, "Request", inf);
                    } else {
                        jp.showMessageDialog(rootPane, "Invalid Recovery Text Supplied", "WARNING", warm);
                    }
                }
            } else {
                jp.showMessageDialog(rootPane, "You must choose a login type form the provided radio buttons", "Request", inf);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        u = 1;
        jLabel5.setText("Matric Number:");
        jTextField2.setVisible(true);
        jTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jLabel5.setVisible(true);
        jLabel4.setVisible(true);
        jLabel3.setVisible(true);
        jComboBox1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        u = 2;
        jLabel5.setText("Course Code");
        jTextField2.setVisible(false);
        jTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jLabel5.setVisible(true);
        jLabel4.setVisible(true);
        jLabel3.setVisible(true);
        jComboBox1.setVisible(true);
        loadCourse();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        u = 3;
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        jTextField1.setVisible(true);
        jPasswordField1.setVisible(true);
        jLabel4.setVisible(true);
        jLabel3.setVisible(true);
        jComboBox1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    private void connection() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "attend";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url + dbName, userName, password);
            stm = con.createStatement();
            //System.out.println("Connected to the database");
        } catch (Exception e) {
            int chk = jp.showConfirmDialog(null, "Connection Off: Click Yes to Reconnect\nIf you are rounning on localhost\nMake sure server has been started", "RE-CONNECT", jp.YES_NO_CANCEL_OPTION);
            if (chk == 0) {
                new DbConnect();
            } else {
                System.exit(0);
            }
        }
    }
}