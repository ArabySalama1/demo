package com.flairstech.com.exception;

/**
 * The Class DatabaseDownException.
 */
public class DatabaseDownException extends TaskException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1;

	/**
	 * Instantiates a new database down exception.
	 */
	public DatabaseDownException() {
		super(500, "internal server error");
	}

	/**
	 * Instantiates a new database down exception.
	 *
	 * @param message the message
	 */
	public DatabaseDownException(String message) {
		super(500, message);
	}
}
