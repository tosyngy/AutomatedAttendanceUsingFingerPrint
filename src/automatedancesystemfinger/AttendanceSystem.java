package automatedancesystemfinger;

import javax.swing.UIManager;

public class AttendanceSystem {
   public static void main(String[] args) {
               try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        new LoaderForm().setVisible(true);
   }
}
