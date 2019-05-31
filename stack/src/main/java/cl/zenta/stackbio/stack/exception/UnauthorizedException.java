package cl.zenta.stackbio.stack.exception;

public class UnauthorizedException extends Exception {
	
	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6423261468072160986L;

    /**
     * Instantiates a new unauthorized exception.
     */
    public UnauthorizedException() {
        super();
    }

    /**
     * Instantiates a new unauthorized exception.
     *
     * @param message the message
     * @param cause the cause
     * @param enableSuppression the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public UnauthorizedException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new unauthorized exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public UnauthorizedException(String message, Exception cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new unauthorized exception.
     *
     * @param message the message
     */
    public UnauthorizedException(String message) {
        super(message);
    }

    /**
     * Instantiates a new unauthorized exception.
     *
     * @param cause the cause
     */
    public UnauthorizedException(Exception cause) {
        super(cause);
    }

}
