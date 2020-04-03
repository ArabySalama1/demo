package com.flairstech.com.exception;

/**
 * The Class ResourceNotFoundException.
 */
public class ResourceNotFoundException extends TaskException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1;

	/**
	 * Instantiates a new resource not found exception.
	 */
	public ResourceNotFoundException() {
		super(500, "internal server error");
	}

	/**
	 * Instantiates a new resource not found exception.
	 *
	 * @param message the message
	 */
	public ResourceNotFoundException(String message) {
		super(500, message);
	}
}
