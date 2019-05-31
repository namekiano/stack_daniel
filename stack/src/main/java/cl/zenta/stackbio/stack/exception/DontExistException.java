package cl.zenta.stackbio.stack.exception;

public class DontExistException extends Exception{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5012940157548500113L;

	/**
	 * Instantiates a new dont exist exception.
	 */
	public DontExistException() {
		super();
	}

	/**
	 * Instantiates a new dont exist exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public DontExistException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new dont exist exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public DontExistException(String message, Exception cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new already exist exception.
	 *
	 * @param message the message
	 */
	public DontExistException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new dont exist exception.
	 *
	 * @param cause the cause
	 */
	public DontExistException(Exception cause) {
		super(cause);
	}

}
