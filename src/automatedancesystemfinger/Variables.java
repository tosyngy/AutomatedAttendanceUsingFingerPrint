package automatedancesystemfinger;

/**
 *
 * @author OGINNI
 */
public class Variables {

    private static String courseCode;
    private static String pixPath;
    
    public static long agentId;
    public static int status;
    public static int fing;
    public static int exist;
    public static int threadStarted;

    /**
     * @return the phone
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * @param aPhone the phone to set
     */
    public void setcourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     * @return the phone
     */
   
    /**
     * @return the id
     */
    public long getAgentId() {
        //getStatus();
        return agentId;
    }

    /**
     * @param id the id to set
     */
    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }
   

    /**
     * @return the state
     */
   
    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    /**
     * @return the exist
     */
    public int getExist() {
        return exist;
    }

    /**
     * @param status the exist to set
     */
    public void setExist(int exist) {
        this.exist = exist;
    }
    /**
     * @return the threadStarted
     */
    public int getThreadStarted() {
        return threadStarted;
    }

    /**
     * @param status the threadStarted to set
     */
    public void setThreadStarted(int threadStarted) {
        this.threadStarted = threadStarted;
    }
    /**
     * @return the exist
     */
    public int getFing() {
        return fing;
    }

    /**
     * @param status the fing to set
     */
    public void setFing(int fing) {
        this.fing = fing;
    }
    
    public String getPixPath() {
        return pixPath;
    }

    /**
     * @param pixPath the pixPath to set
     */
    public void setPixPath(String pixPath) {
        this.pixPath = pixPath;
    }
}
