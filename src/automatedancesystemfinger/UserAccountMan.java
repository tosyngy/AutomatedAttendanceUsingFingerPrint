package automatedancesystemfinger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserAccountMan extends javax.swing.JFrame {

    Class cls;
    Connection con;
    DriverManager drm;
    Statement stm;
    ResultSet rst;
    String query = new String();
//    final String drive=new String("sun.jdbc.odbc.JdbcOdbcDriver"),connect=new String("Jdbc:Odbc:attend");
    Boolean t = Boolean.TRUE;
    Integer ver;
    int u;
    JOptionPane jp = new JOptionPane();
    Integer yesno = jp.YES_NO_OPTION, confirm = jp.QUESTION_MESSAGE, sure = jp.YES_OPTION, never = jp.NO_OPTION, erm = jp.ERROR_MESSAGE, warm = jp.WARNING_MESSAGE;

    public UserAccountMan() {
        initComponents();
        jLabel11.setVisible(false);
        jComboBox5.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jLabel9.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
        jComboBox2.setVisible(false);
    }

    private void clear() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Users Management Form");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Management");
        jLabel3.setToolTipText("");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-2, 0, 720, 50);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setText("Fullname:");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 140, 112, 29);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel5.setText("Username:");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(220, 180, 112, 33);

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel6.setText("Password:");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 220, 112, 33);

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(630, 440, 84, 30);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(-1, 446, 60, 30);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(350, 140, 200, 29);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(350, 180, 200, 33);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(350, 220, 200, 33);

        jButton3.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jButton3.setText("Add User");
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.MatteBorder(null)));
        buttonGroup2.add(jButton3);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(50, 140, 130, 40);

        jButton4.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jButton4.setText("Edit User");
        jButton4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.MatteBorder(null)));
        buttonGroup2.add(jButton4);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(50, 190, 130, 40);

        jButton5.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jButton5.setText("Remove User");
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.MatteBorder(null)));
        buttonGroup2.add(jButton5);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(50, 240, 132, 40);

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(290, 370, 170, 40);

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel7.setText("Course Code:");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 300, 112, 33);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(350, 300, 200, 33);

        jButton7.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(290, 370, 170, 40);

        jButton8.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(290, 370, 170, 40);

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel8.setText("Recovery Text:");
        jLabel8.setOpaque(true);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 260, 112, 33);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(350, 260, 200, 33);

        jLabel9.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel9.setText("Matric Number:");
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(220, 300, 112, 33);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(350, 300, 196, 33);

        jComboBox2.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(350, 140, 200, 30);

        jComboBox3.setFont(new java.awt.Font("DejaVu Sans", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(350, 180, 200, 34);

        jComboBox4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(350, 300, 200, 34);

        jComboBox5.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox5);
        jComboBox5.setBounds(350, 180, 200, 34);

        jLabel11.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel11.setText("Matric Number:");
        jLabel11.setOpaque(true);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 180, 112, 33);
        setVisible(false);

        jLabel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Control"));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 120, 150, 180);

        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 100, 710, 330);

        jButton10.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton10.setText("Manage Class Rep");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(0, 60, 140, 40);

        jButton11.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton11.setText("Manage Admin");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(570, 60, 140, 40);

        jButton12.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jButton12.setText("Manage Lecturer");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(290, 60, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 480);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-734)/2, (screenSize.height-522)/2, 734, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exit();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    String fullName, userName, password, matricNumber, courseCode, recoveryText;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            if (u==1) {
                fullName = jTextField1.getText().toLowerCase();
                userName = jTextField2.getText().toLowerCase();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                matricNumber = jTextField6.getText().toLowerCase();
                query = "INSERT INTO classreps (FullName, UserName, Password, RecoveryText, MatricNumber) VALUES ('" + fullName + "','" + userName + "','" + password + "','"
                        + recoveryText + "','" + matricNumber + "');";
                if (fullName.isEmpty() || userName.isEmpty() || password.isEmpty() || recoveryText.isEmpty() || matricNumber.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
                } else {
                    stm.executeUpdate(query);
                    jp.showMessageDialog(rootPane, "User Successfully Added");
                }
                clear();
                classRep();
            }
            if (u==2) {
                fullName = jTextField1.getText().toLowerCase();
                userName = jTextField2.getText().toLowerCase();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                courseCode = jTextField4.getText().toLowerCase();
                String percent = jp.showInputDialog(rootPane, "Enter Required Percentage For Attendance\n In Integer Format e.g. 70:\n", "Request", confirm);
                query = "INSERT INTO lecturers (FullName, UserName, Password, RecoveryText, CourseCode, Percentage) VALUES ('" + fullName + "','" + userName + "','" + password + "','"
                        + recoveryText + "','" + courseCode + "','" + percent + "');";
                if (fullName.isEmpty() || userName.isEmpty() || password.isEmpty() || recoveryText.isEmpty() || courseCode.isEmpty() || percent.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
                } else {
                    stm.executeUpdate(query);
                    jp.showMessageDialog(rootPane, "User Successfully Added");
                }
                clear();
                Lecturers();
            }
            if (u==3) {
                fullName = jTextField1.getText().toLowerCase();
                userName = jTextField2.getText().toLowerCase();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                query = "INSERT INTO userTable (FullName, UserName, Password, RecoveryText) VALUES ('" + fullName + "','" + userName + "','" + password + "','"
                        + recoveryText + "');";
                if (fullName.isEmpty() || userName.isEmpty() || password.isEmpty() || recoveryText.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
                } else {
                    stm.executeUpdate(query);
                    jp.showMessageDialog(rootPane, "User Successfully Added");
                }
                clear();
                UserS();
            }




            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (u==1) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField4.setVisible(false);
            jLabel7.setVisible(false);
            jComboBox2.setVisible(false);
            jComboBox3.setVisible(false);
            jLabel4.setVisible(true);
            jLabel9.setVisible(false);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel9.setVisible(true);
            jLabel8.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField6.setVisible(true);
            jTextField5.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox4.setVisible(false);
        }
        if (u==2) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel9.setVisible(false);
            jComboBox2.setVisible(false);
            jComboBox3.setVisible(false);
            jLabel4.setVisible(true);
            jLabel9.setVisible(false);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jComboBox4.setVisible(false);
        }
        if (u==3) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel9.setVisible(false);
            jComboBox2.setVisible(false);
            jComboBox3.setVisible(false);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(false);
            jLabel8.setVisible(true);
            jTextField1.setVisible(true);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jComboBox5.setVisible(false);
            jComboBox4.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void classRep() {
        try {
            jComboBox2.removeAllItems();
            jComboBox4.removeAllItems();
            jComboBox5.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT FullName, MatricNumber FROM ClassReps;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox2.addItem(rst.getString(1));
                jComboBox4.addItem(rst.getString(2));
                jComboBox5.addItem(rst.getString(2));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }
    private void Lecturers() {
        jLabel9.setVisible(false);
        jTextField6.setVisible(false);
        try {
            jComboBox2.removeAllItems();
            jComboBox3.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT FullName, UserName FROM Lecturers;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox2.addItem(rst.getString(1));
                jComboBox3.addItem(rst.getString(2));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }    private void UserS() {
        try {
            jComboBox2.removeAllItems();
            jComboBox3.removeAllItems();
            connection();
            stm = con.createStatement();
            query = "SELECT FullName, UserName FROM UserTable;";
            rst = stm.executeQuery(query);
            while (rst.next()) {
                jComboBox2.addItem(rst.getString(1));
                jComboBox3.addItem(rst.getString(2));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (u==1) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField4.setVisible(false);
            jLabel7.setVisible(false);
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(false);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel9.setVisible(true);
            jLabel8.setVisible(true);
            jTextField1.setVisible(false);
            jTextField2.setVisible(true);
            jTextField3.setVisible(true);
            jTextField6.setVisible(false);
            jTextField5.setVisible(true);
            jButton8.setVisible(true);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            jComboBox4.setVisible(true);
        }
        if (u==2) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel9.setVisible(false);
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(true);
            jLabel8.setVisible(true);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(true);
            jTextField5.setVisible(true);
            jButton8.setVisible(true);
            jButton7.setVisible(false);
            jButton6.setVisible(false);
            jComboBox4.setVisible(false);
        }
        if (u==3) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel9.setVisible(false);
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            jLabel7.setVisible(false);
            jLabel8.setVisible(true);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(true);
            jTextField4.setVisible(false);
            jTextField5.setVisible(true);
            jButton8.setVisible(true);
            jButton7.setVisible(false);
            jButton6.setVisible(false);
            jComboBox4.setVisible(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (u==1) {
            jTextField4.setVisible(false);
            jLabel7.setVisible(false);
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(false);
            jLabel4.setVisible(true);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            jLabel11.setVisible(true);
            jLabel9.setVisible(false);
            jLabel8.setVisible(false);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField6.setVisible(false);
            jTextField5.setVisible(false);
            jButton7.setVisible(true);
            jButton6.setVisible(false);
            jButton8.setVisible(false);
            jComboBox4.setVisible(false);
            jComboBox5.setVisible(true);
        }
        if (u==2) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel9.setVisible(false);
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jButton7.setVisible(true);
            jButton6.setVisible(false);
            jButton8.setVisible(false);
            jComboBox4.setVisible(false);
        }
        if (u==3) {
            jLabel11.setVisible(false);
            jComboBox5.setVisible(false);
            jTextField6.setVisible(false);
            jLabel9.setVisible(false);
            jComboBox2.setVisible(true);
            jComboBox3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel8.setVisible(false);
            jTextField1.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jTextField4.setVisible(false);
            jTextField5.setVisible(false);
            jButton7.setVisible(true);
            jButton6.setVisible(false);
            jButton8.setVisible(false);
            jComboBox4.setVisible(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            if (u==1) {
                fullName = jComboBox2.getSelectedItem().toString();
                matricNumber = jComboBox4.getSelectedItem().toString();
                userName = jTextField2.getText().toLowerCase();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                query = "UPDATE classReps SET UserName='" + userName + "',Password='" + password + "',RecoveryText='" + recoveryText + "' WHERE FullName='" + fullName
                        + "' AND MatricNumber='" + matricNumber + "';";
                if (userName.isEmpty() || password.isEmpty() || recoveryText.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
                } else {
                    stm.executeUpdate(query);
                    jp.showMessageDialog(rootPane, "User Successfully Updated");
                }
                clear();
                classRep();
            }
            if (u==2) {
                fullName = jComboBox2.getSelectedItem().toString();
                userName = jComboBox3.getSelectedItem().toString();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                courseCode = jTextField4.getText().toLowerCase();
                query = "UPDATE lecturers SET Password='" + password + "',CourseCode='" + courseCode + "',RecoveryText='" + recoveryText + "' WHERE FullName='"
                        + fullName + "' AND UserName='" + userName + "';";
                if (courseCode.isEmpty() || password.isEmpty() || recoveryText.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
                } else {
                    stm.executeUpdate(query);
                    jp.showMessageDialog(rootPane, "User Successfully Updated");
                }
                clear();
                Lecturers();
            }
            if (u==3) {
                fullName = jComboBox2.getSelectedItem().toString();
                userName = jComboBox3.getSelectedItem().toString();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                query = "UPDATE userTable SET Password='" + password + "',RecoveryText='" + recoveryText + "' WHERE FullName='"
                        + fullName + "' AND UserName='" + userName + "';";
                if (password.isEmpty() || recoveryText.isEmpty()) {
                    jp.showMessageDialog(rootPane, "Empty Fields Cannot Be Submitted to the Database");
                } else {
                    stm.executeUpdate(query);
                    jp.showMessageDialog(rootPane, "User Successfully Updated");
                }
                clear();
                UserS();
            }

            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            connection();
            stm = con.createStatement();
            if (u==1) {
                fullName = jComboBox2.getSelectedItem().toString();
                matricNumber = jComboBox5.getSelectedItem().toString();
                userName = jTextField2.getText().toLowerCase();
                password = jTextField3.getText().toLowerCase();
                recoveryText = jTextField5.getText().toLowerCase();
                query = "DELETE FROM classReps WHERE FullName='" + fullName + "' AND MatricNumber='" + matricNumber + "';";

                stm.executeUpdate(query);
                jp.showMessageDialog(rootPane, "User Successfully Deleted");
                classRep();
                clear();
            }
            if (u==2) {
                fullName = jComboBox2.getSelectedItem().toString();
                userName = jComboBox3.getSelectedItem().toString();
                query = "DELETE FROM lecturers  WHERE FullName='" + fullName + "' AND UserName='" + userName + "';";

                stm.executeUpdate(query);
                jp.showMessageDialog(rootPane, "User Successfully Deleted");
                Lecturers();
                clear();
            }
            if (u==3) {
                fullName = jComboBox2.getSelectedItem().toString();
                userName = jComboBox3.getSelectedItem().toString();
                query = "DELETE FROM userTable WHERE FullName='" + fullName + "' AND UserName='" + userName + "';";

                stm.executeUpdate(query);
                jp.showMessageDialog(rootPane, "User Successfully Deleted");
                clear();
                UserS();

            }
            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        classRep();
        u=1;
        jLabel11.setVisible(false);
        jComboBox5.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jComboBox5.setVisible(false);
        jComboBox4.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel9.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
u=3;
        UserS();
        jLabel11.setVisible(false);
        jComboBox5.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox5.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jComboBox3.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
u=2;
        Lecturers();
        jLabel11.setVisible(false);
        jComboBox5.setVisible(false);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jTextField6.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox2.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jComboBox3.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesno, confirm);
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
            java.util.logging.Logger.getLogger(UserAccountMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAccountMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAccountMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAccountMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAccountMan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
