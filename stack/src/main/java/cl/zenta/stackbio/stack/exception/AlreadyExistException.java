package cl.zenta.stackbio.stack.exception;

public class AlreadyExistException extends Exception {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5075785085487259075L;

	/**
	 * Instantiates a new already exist exception.
	 */
	public AlreadyExistException() {
		super();
	}

	/**
	 * Instantiates a new already exist exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public AlreadyExistException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new already exist exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public AlreadyExistException(String message, Exception cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new already exist exception.
	 *
	 * @param message the message
	 */
	public AlreadyExistException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new already exist exception.
	 *
	 * @param cause the cause
	 */
	public AlreadyExistException(Exception cause) {
		super(cause);
	}

}
