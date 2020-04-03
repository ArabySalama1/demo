package com.flairstech.com.exception;

import lombok.Getter;

/**
 * The Class TaskException.
 */

/**
 * Gets the code.
 *
 * @return the code
 */
@Getter
public class TaskException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1;

	/** The message. */
	private final String message;

	/** The code. */
	private final Integer code;

	/**
	 * Instantiates a new task exception.
	 *
	 * @param code    the code
	 * @param message the message
	 */
	public TaskException(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

}
