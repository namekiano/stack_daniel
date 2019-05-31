package cl.zenta.stackbio.stack.exception;

public class TimeOutException extends Exception{
	
	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1433075437413298778L;

    /**
     * Instantiates a new time out exception.
     */
    public TimeOutException() {
        super();
    }

    /**
     * Instantiates a new time out exception.
     *
     * @param message the message
     * @param cause the cause
     * @param enableSuppression the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public TimeOutException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new time out exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public TimeOutException(String message, Exception cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new time out exception.
     *
     * @param message the message
     */
    public TimeOutException(String message) {
        super(message);
    }

    /**
     * Instantiates a new time out exception.
     *
     * @param cause the cause
     */
    public TimeOutException(Exception cause) {
        super(cause);
    }

}
