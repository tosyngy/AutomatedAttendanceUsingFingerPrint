/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedancesystemfinger;

import javax.swing.UIManager;

/**
 *
 * @author Oginni
 */
public class AutomatedAttendanceSystem {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
               try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch (Exception ex) { 
            ex.printStackTrace(); 
        }
        new LoaderForm().setVisible(true);
   }
}
