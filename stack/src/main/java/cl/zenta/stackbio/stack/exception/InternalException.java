package cl.zenta.stackbio.stack.exception;

public class InternalException extends Exception{
	
	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2969518002634364652L;

    /**
     * Instantiates a new URI not found exception.
     */
    public InternalException() {
        super();
    }

    /**
     * Instantiates a new URI not found exception.
     *
     * @param message the message
     * @param cause the cause
     * @param enableSuppression the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public InternalException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new URI not found exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public InternalException(String message, Exception cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new URI not found exception.
     *
     * @param message the message
     */
    public InternalException(String message) {
        super(message);
    }

    /**
     * Instantiates a new URI not found exception.
     *
     * @param cause the cause
     */
    public InternalException(Exception cause) {
        super(cause);
    }

}
