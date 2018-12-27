package automatedancesystemfinger;

import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;
import javax.swing.*;

public class LoaderForm extends javax.swing.JFrame implements PropertyChangeListener {

    private Task task;

    public LoaderForm() {
        initComponents();
    }
    Boolean t = Boolean.TRUE;
    Integer ver;
    JOptionPane jp = new JOptionPane();
    Integer yesno = jp.YES_NO_OPTION, confirm = jp.QUESTION_MESSAGE, sure = jp.YES_OPTION, never = jp.NO_OPTION;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Progress Frame");
        setAlwaysOnTop(true);
        setName("AAS Loader"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Finger Print Attendance System");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 490, 40);

        jProgressBar1.setFont(new java.awt.Font("Georgia", 1, 11)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(51, 0, 255));
        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jProgressBar1.setRequestFocusEnabled(false);
        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(20, 80, 490, 50);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Your hand, Your pass");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 50, 190, 20);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("loading. . .");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(440, 130, 80, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 528, 163));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-528)/2, (screenSize.height-163)/2, 528, 163);
    }// </editor-fold>//GEN-END:initComponents

       public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
        int progress = (Integer) evt.getNewValue();
    jProgressBar1.setValue(progress); //Set value
    //progressBarSplash.repaint(); //Refresh graphics
//    lblpercent.setText(String.format(
//                    "%d%%", task.getProgress()));

        }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown
//    private void exit() {
//        ver = jp.showConfirmDialog(rootPane, "Are You Sure to Exit This Application?", "Confirmation", yesno, confirm);
//        if (ver.equals(sure)) {
//            System.exit(0);
//        } else if (ver == never) {
//            return;
//        }
//    }

    public static void main(String args[]) {
//        try { 
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
//        } catch (Exception ex) { 
//            ex.printStackTrace(); 
//        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoaderForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

    class Task extends SwingWorker<Void, Void> {
        /*
         * Main task. Executed in background thread.
         */

        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            //Initialize progress property.
            setProgress(0);
            while (progress < 100) {
                //Sleep for up to one second.
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignore) {
                }
                //Make random progress.
                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
            return null;
        }
        /*
         * Executed in event dispatching thread
         */

        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            setCursor(null); //turn off the wait cursor
            new AdminLogin().setVisible(true);
            dispose();
        }
    }
}
