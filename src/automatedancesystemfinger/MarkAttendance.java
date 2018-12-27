package automatedancesystemfinger;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import fingerprint.CaptureForm;
import fingerprint.EnrollmentForm;
import fingerprint.VerificationForm;

public class MarkAttendance extends javax.swing.JFrame {

    Variables var = new Variables();

    public MarkAttendance() {
        initComponents();

        var.setFing(0);
        try {
            courseCode = AdminLogin.courseCode.trim();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "Invalid Course Code Error Code:" + e, "ERROR MESSAGE", erm);
        }
        jLabel3.setText(jLabel3.getText() + ": " + courseCode);
        jComboBox1.setVisible(false);
        jButton5.setVisible(true);
        jLabel4.setVisible(false);
        jComboBox1.removeAllItems();
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jLabel7.setVisible(true);
        jButton6.setVisible(false);
    }
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
    String stream, year, matricNumber, courseCode, progress;
    Integer counter = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Take Attendance");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 450, 60);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel3.setText("Course Code:");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 70, 150, 20);

        jComboBox1.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(210, 170, 200, 40);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 270, 100, 40);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton2.setText("Decline");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 270, 90, 40);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setText("Matric Number(s):");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 130, 160, 40);

        jButton3.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(100, 300, 70, 30);

        jButton4.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 300, 70, 30);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setText("Date: ");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 70, 250, 19);

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel7.setText("Level:");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 140, 80, 20);

        jComboBox3.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(30, 160, 130, 40);

        jButton5.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jButton5.setText("Load");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 210, 130, 70);

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jButton6.setText("Authenticate User");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(230, 230, 160, 30);

        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(190, 90, 260, 240);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 90, 190, 200);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel6.setText("Proceed to Mark Attendance");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 100, 220, 20);

        jLabel10.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel10.setText("Select Level");
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 100, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-466)/2, (screenSize.height-376)/2, 466, 376);
    }// </editor-fold>//GEN-END:initComponents

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
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton6.setVisible(false);
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Start Attendance Marking?\n Proceeding will affect Progress and Cannot be Terminated!!!",
                "Confirmation", yesNo, confirm);
        if (ver.equals(sure)) {
            jComboBox1.setVisible(true);
            jButton5.setVisible(false);
            jLabel4.setVisible(true);
            jComboBox1.removeAllItems();
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jComboBox3.disable();
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
            try {
//                stream = jComboBox2.getSelectedItem().toString().toLowerCase();
                year = jComboBox3.getSelectedItem().toString().toLowerCase();
                if (year.equalsIgnoreCase("100")) {
                    progress = "Progress1";
                }
                if (year.equalsIgnoreCase("200")) {
                    progress = "Progress2";
                }
                if (year.equalsIgnoreCase("300")) {
                    progress = "Progress3";
                }
                if (year.equalsIgnoreCase("400")) {
                    progress = "Progress4";
                }
                if (year.equalsIgnoreCase("500")) {
                    progress = "Progress5";
                }

                connection();
                stm = con.createStatement();
                query = "SELECT MatricNumber FROM Students where Year='" + year + "';";
                rst = stm.executeQuery(query);
                while (rst.next()) {
                    jComboBox1.addItem(rst.getString(1));
                    jButton6.setVisible(true);
                }
                con.close();
                connection();
                stm = con.createStatement();
                query = "SELECT " + progress + " FROM Lecturers WHERE CourseCode='" + courseCode + "';";
                rst = stm.executeQuery(query);
                while (rst.next()) {
                    counter = rst.getInt(1);
                }
                counter += 1;
                stm = con.createStatement();
                query = "UPDATE Lecturers SET " + progress + "='" + counter + "' WHERE CourseCode='" + courseCode + "';";
                stm.executeUpdate(query);
            } catch (Exception e) {
                jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
                e.printStackTrace();
            }
        } else if (ver == never) {
            return;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exit();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Close This Interface? ", "Confirmation", yesNo, confirm);
        if (ver.equals(sure)) {
            this.dispose();
        } else if (ver == never) {
            return;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (var.getFing() == 0) {
            JOptionPane.showMessageDialog(rootPane, "biometric has not been authenticated");
            return;
        }
        if (jComboBox1.getItemCount() != 0) {
            matricNumber = jComboBox1.getSelectedItem().toString();
        }



        try {
            if (matricNumber == null || matricNumber.equals("") || jComboBox1.getSelectedIndex() < 0) {
                jp.showMessageDialog(rootPane, "Attendance Marking Completed", "MESSAGE", inf);
                jComboBox3.enable();
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
                jComboBox1.disable();
            } else {
                connection();
                stm = con.createStatement();
                query = "SELECT `" + courseCode.toUpperCase() + "` FROM Students WHERE MatricNumber='" + matricNumber + "';";
                rst = stm.executeQuery(query);
                while (rst.next()) {
                    counter = rst.getInt(1);
                }
                counter += 1;
                con.close();
                connection();
                stm = con.createStatement();
                query = "UPDATE Students SET `" + courseCode.toUpperCase() + "`='" + counter + "' WHERE MatricNumber='" + matricNumber + "'";
                stm.executeUpdate(query);
                con.close();
                jp.showMessageDialog(rootPane, "Attendance Successfully Marked", "Message", inf);
                jComboBox1.removeItemAt(jComboBox1.getSelectedIndex());
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
        var.setFing(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        var.setFing(0);
        try {
            matricNumber = jComboBox1.getSelectedItem().toString();
        } catch (Exception ex) {
        }
        if (matricNumber == null || matricNumber.isEmpty() || jComboBox1.getSelectedIndex() < 0) {
            jp.showMessageDialog(rootPane, "Attendance Marking Completed", "MESSAGE", inf);
            jComboBox3.enable();
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
            jComboBox1.disable();
        } else {
            ver = jp.showConfirmDialog(rootPane, "Are You Sure to Decline Attendance?", "Confirmation", yesNo, confirm);
            if (ver.equals(sure)) {
                jComboBox1.removeItemAt(jComboBox1.getSelectedIndex());
            } else if (ver == never) {
                return;
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// new ThumbPrintConfirmation(new javax.swing.JFrame(), true).setVisible(true); 
        try {
            setVisible(false);
            CaptureForm.log.setText("");
            CaptureForm.picture.setIcon(null);
            var.setFing(0);
            VerificationForm f = new VerificationForm(new javax.swing.JFrame());
            f.whr = 1;
            f.setVisible(true);
            setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Digital Persona Thumb Print Scanner\nNot Detected ");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed
    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesNo, confirm);
        if (ver.equals(sure)) {
            System.exit(0);
        } else if (ver == never) {
            return;
        }
    }

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
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarkAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarkAttendance().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
