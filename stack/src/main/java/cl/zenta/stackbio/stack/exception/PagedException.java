package cl.zenta.stackbio.stack.exception;

public class PagedException extends Exception{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7591098117637835208L;

	/**
	 * Instantiates a new page ilegal argument exception.
	 */
	public PagedException() {
		super();
	}

	/**
	 * Instantiates a new page ilegal argument exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 * @param enableSuppression the enable suppression
	 * @param writableStackTrace the writable stack trace
	 */
	public PagedException(String message, Exception cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * Instantiates a new page ilegal argument exception.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public PagedException(String message, Exception cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new page ilegal argument exception.
	 *
	 * @param message the message
	 */
	public PagedException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new page ilegal argument exception.
	 *
	 * @param cause the cause
	 */
	public PagedException(Exception cause) {
		super(cause);
	}

}
