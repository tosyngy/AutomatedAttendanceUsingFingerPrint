package fingerprint;

import automatedancesystemfinger.DbConnect;
import automatedancesystemfinger.Variables;
import com.digitalpersona.onetouch.*;
import com.digitalpersona.onetouch.verification.*;
import java.awt.*;
import java.io.InputStream;
import javax.swing.JOptionPane;

public class VerificationForm extends CaptureForm {

    DbConnect db;
    private DPFPVerification verificator = DPFPGlobal.getVerificationFactory().createVerification();

    public VerificationForm(Frame owner) {
        super(owner);
        db = new DbConnect();
    }

    @Override
    protected void init() {
        //    System.out.println("type " + Main.type);
        super.init();
        setTitle("Finger Print Capturer");
        //    updateStatus(0);
    }
    int one = 0;
    public int whr;
    public String code="";
    static String bringcard, comp, sur, gende, add, username, geno, dob, type, timeIn;
    DPFPVerificationResult result;
    DPFPVerificationResult result2;

    @Override
    protected void process(DPFPSample sample) {
        super.process(sample);
        try {
            byte[] dby;
            DPFPFeatureSet features = null;
            DPFPFeatureSet features2 = null;
            String SQLCommand2 = "select id,thumb_finger,index_finger from register";
            db.rs = db.st.executeQuery(SQLCommand2);

            while (db.rs.next()) {

                try (InputStream stream = db.rs.getBinaryStream(2);) {
                    dby = new byte[stream.available()];
                    stream.read(dby);
                }
                t = DPFPGlobal.getTemplateFactory().createTemplate();
                t.deserialize(dby);
                setTemplate(t);
                features = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);



                // Check quality of the sample and start verification if it's good
                if (features != null) {
                    // Compare the feature set with our template
                    DPFPTemplate ms = getTemplate();
                    // JOptionPane.showMessageDialog(rootPane, Main.cardno);
                    result = verificator.verify(features, ms);
                    //  System.out.println("na d result b dix " + result.getFalseAcceptRate());
                    if (result.isVerified()) {
                        setPrompt("VERIFICATION SUCCESSFUL");
                        one = 0;
                        log.setText("");
                        var.setFing(db.rs.getInt("id"));
                        makeReport(db.rs.getString("id"));
                        System.out.println("username " + db.rs.getString(1));
                        System.out.println("thumb_print " + db.rs.getBinaryStream(2));
                        System.out.println("finger_print " + db.rs.getBinaryStream(3));
                        if (whr == 1) {
                            userLogin(db.rs.getString(1));
                        } else {
                            JOptionPane.showMessageDialog(this, "User already Registered\nThis System will now terminate");
                            setVisible(false);
                            // System.exit(0);
                        }

                        break;
                        //}
                    } else {
                        try (InputStream stream2 = db.rs.getBinaryStream(3);) {
                            dby = new byte[stream2.available()];
                            stream2.read(dby);
                        }
                        t2 = DPFPGlobal.getTemplateFactory().createTemplate();
                        t2.deserialize(dby);
                        setTemplate(t2);
                        features2 = extractFeatures(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);
                        if (features2 != null) {
                            // Compare the feature set with our template
                            ms = getTemplate();
                            // JOptionPane.showMessageDialog(rootPane, Main.cardno);
                            result = verificator.verify(features2, ms);
                            System.out.println("na d result b dix " + result.getFalseAcceptRate());
                            if (result.isVerified()) {
                                setPrompt("VERIFICATION SUCCESSFUL");
                                one = 0;
                                log.setText("");
                                var.setFing(db.rs.getInt("id"));
                                makeReport(db.rs.getString("id"));
                                System.out.println("username " + db.rs.getString(1));
                                System.out.println("thumb_print " + db.rs.getBinaryStream(2));
                                System.out.println("finger_print " + db.rs.getBinaryStream(3));
                                if (whr == 1) {
                                    userLogin(db.rs.getString(1));
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "User already Registered\nThe System will now terminate");
                                    setVisible(false);
                                    // System.exit(0);
                                }
                                break;
                            } else {
                                if (db.rs.isLast()) {
                                    // System.out.println("no match");
                                    setVisible(false);
                                    JOptionPane.showMessageDialog(rootPane, "No match found\nProceed to registeration");
                                    new UserReg().setVisible(true);
                                    break;
                                }
                            }
                        }
                    }
                }


            }
            // db.con.close();
        } catch (Exception v) {
            System.err.println("ok na verification error " + v);
        }
        // Process the sample and create a feature set for the enrollment purpose.

    }

    void userLogin(String id) {
        try {
            String sqlQuery = "insert into attendance (user_id,code) values(?,?)";
            db.ps = db.con.prepareStatement(sqlQuery);
            db.ps.setString(1, id);//finger print stuff
            db.ps.setString(2, code);//finger print stuff
            db.ps.executeUpdate();
           
            if (db.rs.next()) {

                JOptionPane.showMessageDialog(rootPane, "user confirmed");
                return;

            } else {
                JOptionPane.showMessageDialog(rootPane, "Invalid Info Supply");
                setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "There was a Problem retrying this data");
            e.printStackTrace();
        }

    }
    public static String TEMPLATE_PROPERTY = "template";
    public static DPFPTemplate template;

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
        this.template = template;
        firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }
    public static DPFPTemplate t;
    public static DPFPTemplate t2;

    public static void main(String[] args) {
        Variables var = new Variables();
        var.setFing(0);
        VerificationForm f = new VerificationForm(new javax.swing.JFrame());
        f.whr = 0;
        f.setVisible(true);
    }
}
