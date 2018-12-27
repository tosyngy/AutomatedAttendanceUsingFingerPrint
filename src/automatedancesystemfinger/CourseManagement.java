package automatedancesystemfinger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CourseManagement extends javax.swing.JFrame {

    Class cls;
    Connection con;
    DriverManager drm;
    Statement stm;
    ResultSet rst;
    String query = new String();
    final String drive = new String("sun.jdbc.odbc.JdbcOdbcDriver"), connect = new String("Jdbc:Odbc:attend");
    JOptionPane jp = new JOptionPane();
    Integer ver, sure = jp.YES_OPTION, never = jp.NO_OPTION, confirm = jp.QUESTION_MESSAGE, yesNo = jp.YES_NO_OPTION, erm = jp.ERROR_MESSAGE, inf = jp.INFORMATION_MESSAGE;
    Integer warm = jp.WARNING_MESSAGE;
    int u;

    public CourseManagement() {
        initComponents();
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel11.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
        jComboBox6.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        loadlec();
        jTextField1.removeAll();
        jTextField2.removeAll();
    }

    private void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
        jComboBox6.setSelectedIndex(0);
    }

    private void loadlec() {
        try {
            jComboBox4.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT FullName FROM Lecturers;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox4.addItem(rst.getString(1));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Course Management Form");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Course");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 60);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel3.setText("COURSE CODE");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 80, 100, 30);

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel4.setText("COURSE TITLE");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 120, 100, 30);

        jLabel5.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel5.setText("COURSE UNIT");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 160, 100, 30);

        jLabel6.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel6.setText("COURSE TYPE");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 200, 100, 30);

        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel7.setText("LEVEL");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 240, 100, 30);

        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 380, 90, 30);

        jButton2.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 380, 70, 30);

        jButton3.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(240, 320, 250, 40);

        jButton4.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(240, 320, 250, 40);

        jButton5.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(240, 320, 250, 40);

        jTextField1.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jPanel1.add(jTextField1);
        jTextField1.setBounds(330, 80, 180, 30);

        jTextField2.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(330, 120, 180, 30);

        jButton6.setText("Remove Course");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 280, 130, 60);

        jButton7.setText("Edit Course");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(30, 190, 130, 60);

        jButton8.setText("Add Course");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(30, 100, 130, 60);

        jComboBox1.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(330, 160, 180, 30);

        jComboBox2.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Core", "Elective" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(330, 200, 180, 30);

        jComboBox3.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(330, 240, 180, 30);

        jComboBox4.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(330, 280, 180, 30);

        jComboBox5.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(330, 80, 180, 30);

        jComboBox6.setFont(new java.awt.Font("Droid Sans", 0, 13)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox6);
        jComboBox6.setBounds(330, 120, 180, 30);

        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 60, 190, 310);

        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(190, 60, 350, 310);

        jLabel11.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jLabel11.setText("LECTURER");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 280, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, -4, 540, 420);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-554)/2, (screenSize.height-449)/2, 554, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void loadCourse() {
        try {
            jComboBox5.removeAllItems();
            jComboBox6.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT CourseCode, CourseTitle FROM CourseTable;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox5.addItem(rst.getString(1));
                jComboBox6.addItem(rst.getString(2));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exit();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    String courseCode, courseTitle, courseType, lecturer, year;
    Integer courseUnit;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            courseCode = jTextField1.getText().toLowerCase();
            courseTitle = jTextField2.getText().toLowerCase();
            courseUnit = Integer.valueOf(jComboBox1.getSelectedItem().toString());
            courseType = jComboBox2.getSelectedItem().toString().toLowerCase();
            year = jComboBox3.getSelectedItem().toString().toLowerCase();
            lecturer = jComboBox4.getSelectedItem().toString().toLowerCase();
            if (courseCode.isEmpty() || courseTitle.isEmpty()) {
                jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
            } else {
                query = "INSERT INTO CourseTable (CourseCode, CourseTitle, CourseUnit, CourseType, Year, Lecturer) VALUES ( '" + courseCode + "','" + courseTitle
                        + "','" + courseUnit + "','" + courseType + "','" + year + "','" + lecturer + "');";
                stm.executeUpdate(query);
                stm = con.createStatement();
                query = "ALTER TABLE Students ADD `" + courseCode.toUpperCase() + "` INT(10) NOT NULL DEFAULT  '0';";
                stm.execute(query);
//                      con.commit();
                jp.showMessageDialog(rootPane, "Course Successfully Added");
                clear();
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            courseCode = jComboBox5.getSelectedItem().toString().toLowerCase();
            courseTitle = jComboBox6.getSelectedItem().toString().toLowerCase();
            courseUnit = Integer.valueOf(jComboBox1.getSelectedItem().toString());
            courseType = jComboBox2.getSelectedItem().toString().toLowerCase();
            year = jComboBox3.getSelectedItem().toString().toLowerCase();
            lecturer = jComboBox4.getSelectedItem().toString().toLowerCase();
            if (courseCode.isEmpty() || courseTitle.isEmpty()) {
                jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
            } else {
                query = "UPDATE CourseTable SET CourseUnit='" + courseUnit + "', CourseType='" + courseType + "', Year='" + year + "', Lecturer='" + lecturer
                        + "' WHERE CourseCode='" + courseCode + "'AND CourseTitle='" + courseTitle + "'";
                stm.executeUpdate(query);
                jp.showMessageDialog(rootPane, "Course Successfully Updated");
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
        loadCourse();
        loadlec();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            courseCode = jComboBox5.getSelectedItem().toString().toLowerCase();
            courseTitle = jComboBox6.getSelectedItem().toString().toLowerCase();
            courseUnit = Integer.valueOf(jComboBox1.getSelectedItem().toString());
            courseType = jComboBox2.getSelectedItem().toString().toLowerCase();
            year = jComboBox3.getSelectedItem().toString().toLowerCase();
            lecturer = jComboBox4.getSelectedItem().toString().toLowerCase();
            if (courseCode.isEmpty() || courseTitle.isEmpty()) {
                jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
            } else {
                query = "DELETE FROM courseTable  WHERE CourseCode='" + courseCode + "'AND CourseTitle='" + courseTitle + "'";
                stm.executeUpdate(query);
                stm = con.createStatement();
                query = "ALTER TABLE Students DROP `" + courseCode.toUpperCase() + "`;";
                stm.execute(query);
                con.commit();
                jp.showMessageDialog(rootPane, "Course Successfully Removed");
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
        loadCourse();
        loadlec();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        u = 3;

        jComboBox5.setVisible(true);
        jComboBox6.setVisible(true);
        jButton3.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel11.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(true);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        loadCourse();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        u = 2;

        jComboBox5.setVisible(true);
        jComboBox6.setVisible(true);
        jButton3.setVisible(false);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        //  jLabel8.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        jComboBox4.setVisible(true);
        loadCourse();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        u = 1;
        jComboBox5.setVisible(false);
        jComboBox6.setVisible(false);
        jButton3.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel11.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
        jComboBox4.setVisible(true);
        loadlec();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesNo, confirm);
        if (ver.equals(sure)) {
            System.exit(0);
        } else if (ver == never) {
            return;
        }
    }

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
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseManagement().setVisible(true);
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
