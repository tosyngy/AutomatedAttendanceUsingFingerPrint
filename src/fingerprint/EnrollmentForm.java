package fingerprint;

import com.digitalpersona.onetouch.*;
import com.digitalpersona.onetouch.processing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import automatedancesystemfinger.Variables;
import automatedancesystemfinger.DbConnect;

public class EnrollmentForm extends CaptureFormEnrolling {

    private DPFPEnrollment enroller = DPFPGlobal.getEnrollmentFactory().createEnrollment();
    public static byte print[];
    public static byte print2[];
    Variables var;

    EnrollmentForm(Frame owner) {
        super(owner);
        var = new Variables();
    }

    @Override
    protected void init() {
        super.init();
               setTitle("Finger Print Capturer");
        updateStatus();
    }
    UserReg m = new UserReg();

    @Override
    protected void process(DPFPSample sample) {
        super.process(sample);
        // Process the sample and create a feature set for the enrollment purpose.
        DPFPFeatureSet features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);
        // Check quality of the sample and add to enroller if it's good
        if (features != null) {
            try {
                makeReport("Print Capture Completed.");
                //makeReport("The fingerprint feature set was created.");
                enroller.addFeatures(features);		// Add feature set to template.
            } catch (DPFPImageQualityException ex) {
                //System.out.println("i hia u " + ex);
            } finally {
                updateStatus();
                // Check if template has been created.
                switch (enroller.getTemplateStatus()) {
                    case TEMPLATE_STATUS_READY:	// report success and stop capturing
                        stop();
                        m.setTemplate(enroller.getTemplate());
                        if (var.getFing() == 1) {
                            print = new byte[m.getTemplate().serialize().length];
                            print = m.getTemplate().serialize();
                         //   System.err.println("This is ur thumb print bytes <><<<???? " + print);
                        } else {
                            print2 = new byte[m.getTemplate().serialize().length];
                            print2 = m.getTemplate().serialize();
                          //  System.err.println("This is ur index print bytes <><<<???? " + print2);
                        }
//                        if(var.getFing() == 2){
//                         CaptureForm.log.setText("");
//                        CaptureForm.picture.setIcon(null);
//                        var.setVoterID("");
//                        VerificationForm f = new VerificationForm(new javax.swing.JFrame());
//                        f.whr = 3;
//                        f.setVisible(true);
//                        }
                        setPrompt("Check for Verification");
                        break;

                    case TEMPLATE_STATUS_FAILED:	// report failure and restart capturing
                        enroller.clear();
                        stop();
                        updateStatus();
                        m.setTemplate(null);
                        // JOptionPane.showMessageDialog(EnrollmentForm.this, "The fingerprint template is not valid. Repeat fingerprint enrollment.", "Fingerprint Enrollment", JOptionPane.ERROR_MESSAGE);
                        JOptionPane.showMessageDialog(EnrollmentForm.this, "This is not a valid Finger Print.", "Fingerprint Report", JOptionPane.ERROR_MESSAGE);
                        start();
                        break;
                }
            }
        }
    }

    private void updateStatus() {
        // Show number of samples needed.
        //System.out.println("seeeee "+enroller.getFeaturesNeeded());
        setStatus(String.format("This process will be repeated %1$s times", enroller.getFeaturesNeeded()));
        if(enroller.getFeaturesNeeded()==0){
        setVisible(false);
        }
        //    setStatus(String.format("Fingerprint samples needed: %1$s", enroller.getFeaturesNeeded()));
    }
     public static void main(String[] args) {
         Variables var= new Variables();
          var.setFing(0);
        EnrollmentForm f = new EnrollmentForm(new javax.swing.JFrame());
        f.setVisible(true);
     }
}
