package automatedancesystemfinger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends javax.swing.JFrame {

    private void loadCourse() {
        try {
            jComboBox3.removeAllItems();
            connection();
            st = con.createStatement();
            query = "SELECT CourseCode FROM CourseTable;";
            rs = st.executeQuery(query);
            while (rs.next()) {
                jComboBox3.addItem(rs.getString(1));
            }
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }

    public StudentTable() {
        initComponents();
        loadCourse();
        jInternalFrame1.setVisible(false);
    }
    Class cls;
    Connection con, conn;
    DriverManager drm;
    Statement st, stt;
    ResultSet rs, rss;
    String query = new String();
    Boolean t = Boolean.TRUE;
    JOptionPane jp = new JOptionPane();
    String year;
    Integer i, j;
    Integer ver, sure = jp.YES_OPTION, never = jp.NO_OPTION, confirm = jp.QUESTION_MESSAGE, yesno = jp.YES_NO_OPTION, erm = jp.ERROR_MESSAGE, inf = jp.INFORMATION_MESSAGE;
    Integer warm = jp.WARNING_MESSAGE;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setTitle("Attendance Progress");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Course:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(380, 80, 90, 20);

        jComboBox3.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox3);
        jComboBox3.setBounds(350, 100, 160, 30);

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Year:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(570, 80, 80, 20);

        jComboBox4.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500", " " }));
        jPanel2.add(jComboBox4);
        jComboBox4.setBounds(540, 100, 160, 30);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setFont(new java.awt.Font("DejaVu Serif", 1, 10)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 140, 770, 290);

        jButton6.setFont(new java.awt.Font("DejaVu Sans", 1, 10)); // NOI18N
        jButton6.setText("Fetch");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(710, 100, 60, 30);

        jButton7.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jButton7.setText("Close");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(720, 440, 70, 30);

        jLabel7.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Attendance Details");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 10, 770, 40);

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 50, 770, 90);

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        jPanel1.setBackground(new java.awt.Color(226, 111, 90));
        jPanel1.setMinimumSize(new java.awt.Dimension(1150, 510));
        jPanel1.setName(""); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1150, 510));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 50);

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Droid Sans", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 80, 920, 350);

        jButton1.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jButton1.setText("sign out");
        jButton1.setPreferredSize(new java.awt.Dimension(0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 470, 92, 30);

        jButton2.setFont(new java.awt.Font("Droid Sans", 0, 12)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1050, 470, 80, 32);

        jButton3.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton3.setText("Refresh");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1050, 430, 80, 20);

        jButton5.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton5.setText("Fetch");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(10, 380, 170, 40);

        jComboBox1.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "200", "300", "400", "500" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(10, 320, 170, 40);

        jButton4.setFont(new java.awt.Font("DejaVu Serif", 1, 12)); // NOI18N
        jButton4.setText("Mark Attendance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(520, 460, 240, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Level:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 280, 50, 30);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(830, 430, 217, 22);

        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "filter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Droid Sans", 1, 12))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 260, 190, 170);

        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 450, 1120, 60);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("Attendance Details");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(20, 220, 140, 30);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Manage Course");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(20, 100, 140, 30);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton10.setText("Manage User");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(20, 140, 140, 30);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setText("Manage Students");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(20, 180, 140, 30);

        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Action", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Droid Sans", 1, 12))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 80, 180, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jInternalFrame1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1166)/2, (screenSize.height-549)/2, 1166, 549);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Logout?", "Confirmation", yesno, confirm);
        if (ver.equals(sure)) {
            this.dispose();
            new AdminLogin().setVisible(true);
        } else if (ver == never) {
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        exit();
    }//GEN-LAST:event_jButton2ActionPerformed
    Integer g;
    String courseCodes[];
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection();
            year = jComboBox1.getSelectedItem().toString().toLowerCase();
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            st = con.createStatement();
            rs = st.executeQuery(query);
            g = 0;
            while (rs.next()) {
                g = g + 1;
            }
            courseCodes = new String[g];
            g = 0;
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            rs = st.executeQuery(query);
            while (rs.next()) {
                courseCodes[g] = rs.getString(1);
                g = g + 1;
            }
            query = "SELECT SerialNumber, Name, MatricNumber, Sex, Phone, Year";
            for (int k = 0; k < courseCodes.length; k++) {
                query = query + ", `" + courseCodes[k] + "`";
            }

            query = query + " FROM Students WHERE  Year='" + year + "';";
            DefaultTableModel dm = new DefaultTableModel();
            st = con.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            String c[] = new String[columns];
            for (i = 0; i < columns; i++) {
                c[i] = md.getColumnName(i + 1);
                dm.addColumn(c[i]);
            }
            Object row[] = new Object[columns];
            while (rs.next()) {
                for (j = 0; j < columns; j++) {
                    row[j] = rs.getString(j + 1);
                }
                dm.addRow(row);

            }
            jTable1.setModel(dm);
            int we = jTable1.getRowCount();
            jLabel6.setText("Number or row fetched: " + we);
            con.close();

        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            connection();
            year = jComboBox1.getSelectedItem().toString().toLowerCase();
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            st = con.createStatement();
            rs = st.executeQuery(query);
            g = 0;
            while (rs.next()) {
                g = g + 1;
            }
            courseCodes = new String[g];
            g = 0;
            query = "SELECT CourseCode FROM CourseTable WHERE Year='" + year + "';";
            rs = st.executeQuery(query);
            while (rs.next()) {
                courseCodes[g] = rs.getString(1);
                g = g + 1;
            }
            query = "SELECT SerialNumber, Name, MatricNumber, Sex, Phone, Year";
            for (int k = 0; k < courseCodes.length; k++) {
                query = query + ", `" + courseCodes[k] + "`";
            }

            query = query + " FROM Students WHERE Year='" + year + "';";
            DefaultTableModel dm = new DefaultTableModel();
            st = con.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            String c[] = new String[columns];
            for (i = 0; i < columns; i++) {
                c[i] = md.getColumnName(i + 1);
                dm.addColumn(c[i]);
            }
            Object row[] = new Object[columns];
            while (rs.next()) {
                for (j = 0; j < columns; j++) {
                    row[j] = rs.getString(j + 1);
                }
                dm.addRow(row);

            }
            jTable1.setModel(dm);
            int we = jTable1.getRowCount();
            jLabel6.setText("Number or row fetched: " + we);
            con.close();

        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jInternalFrame1.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new MarkAttendance().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void attendanceProgress() {
        try {
            course = jComboBox3.getSelectedItem().toString().toUpperCase();
            year2 = jComboBox4.getSelectedItem().toString().toLowerCase();
            query = "SELECT SerialNumber,Name,MatricNumber,`" + course + "` FROM Students WHERE Year='" + year2 + "';";
            DefaultTableModel dm = new DefaultTableModel();
            connection();
            st = con.createStatement();
            rs = st.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            String c[] = new String[columns];
            for (i = 0; i < columns; i++) {
                if (i < columns - 1) {
                    c[i] = md.getColumnName(i + 1);
                    dm.addColumn(c[i]);
                } else if (i == columns - 1) {
                    dm.addColumn("Number of Classes Attends");
                }
            }
            dm.addColumn("Required Percent");
            dm.addColumn("Attained Percent");
            dm.addColumn("Number of Classes Held");
            Object row[] = new Object[columns + 3];
            while (rs.next()) {
                String matnu = rs.getString(3);
                for (j = 0; j < columns + 3; j++) {
                    if (j >= columns && j < columns + 3) {
                        try {
                            connectio();
                            stt = conn.createStatement();
                            queryy = "SELECT `" + course + "` FROM Students WHERE MatricNumber ='" + matnu + "'";
                            rss = stt.executeQuery(queryy);
                            while (rss.next()) {
                                mrk = Double.valueOf(rss.getInt(1));
                            }
                            conn.close();
                        } catch (Exception ex) {
                            jp.showMessageDialog(rootPane, "ERROR IN QUERY4 REF: " + ex, " ERRORR MESSAGE", erm);
                        }
                        comp = (mrk / cla) * 100;
                        if (comp.equals(Double.NaN)) {
                            comp = 0.0;
                        }
                        if (j == columns) {
                            row[j] = perc;
                        }
                        if (j == columns + 1) {
                            row[j] = comp;
                        }
                        if (j == columns + 2) {
                            row[j] = cla;
                        }
                    } else {
                        row[j] = rs.getString(j + 1);
                    }
                }
                dm.addRow(row);

            }
            jTable2.setModel(dm);
            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
    }

    private void connectio() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "attend";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
        } catch (Exception ex) {
            jp.showMessageDialog(null, "Error in connection: " + ex, "ERROR MESSAGE:", erm);
        }
    }
    String course, year2, queryy, progress;
    Double mrk, cla, comp;
    Integer perc;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            course = jComboBox3.getSelectedItem().toString().toLowerCase();
            year2 = jComboBox4.getSelectedItem().toString().toLowerCase();
            if (year2.equalsIgnoreCase("100")) {
                progress = "Progress1";
            }
            if (year2.equalsIgnoreCase("200")) {
                progress = "Progress2";
            }
            if (year2.equalsIgnoreCase("300")) {
                progress = "Progress3";
            }
            if (year2.equalsIgnoreCase("400")) {
                progress = "Progress4";
            }
            if (year2.equalsIgnoreCase("500")) {
                progress = "Progress5";
            }
            connection();
            st = con.createStatement();
            query = "SELECT " + progress + ", Percentage FROM Lecturers WHERE CourseCode='" + course + "';";
            rs = st.executeQuery(query);
            while (rs.next()) {
                cla = Double.valueOf(rs.getInt(1));
                perc = rs.getInt(2);
            }
            con.close();
        } catch (Exception e) {
            jp.showMessageDialog(rootPane, "'Error Executing Query' Error Code:" + e, "ERROR MESSAGE", erm);
            e.printStackTrace();
        }
        attendanceProgress();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jInternalFrame1.setVisible(true);
        loadCourse();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new CourseManagement().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new UserAccountMan().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new StudentsManagement().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void exit() {
        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesno, confirm);
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
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
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
            conn = DriverManager.getConnection(url + dbName, userName, password);
            st = con.createStatement();
            stt = con.createStatement();
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
