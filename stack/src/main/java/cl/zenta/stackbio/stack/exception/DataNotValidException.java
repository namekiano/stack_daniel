package cl.zenta.stackbio.stack.exception;

public class DataNotValidException extends Exception{
	
	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6423261468072160986L;

    /**
     * Instantiates a new DataNotValid exception.
     */
    public DataNotValidException() {
        super();
    }

    /**
     * Instantiates a new DataNotValid exception.
     *
     * @param message the message
     * @param cause the cause
     * @param enableSuppression the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public DataNotValidException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * Instantiates a new DataNotValid exception.
     *
     * @param message the message
     * @param cause the cause
     */
    public DataNotValidException(String message, Exception cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new DataNotValid exception.
     *
     * @param message the message
     */
    public DataNotValidException(String message) {
        super(message);
    }

    /**
     * Instantiates a new DataNotValid exception.
     *
     * @param cause the cause
     */
    public DataNotValidException(Exception cause) {
        super(cause);
    }

}
