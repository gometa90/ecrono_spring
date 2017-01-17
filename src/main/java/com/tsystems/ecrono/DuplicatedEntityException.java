package com.tsystems.ecrono;

public class DuplicatedEntityException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public DuplicatedEntityException() {
	super();
    }

    public DuplicatedEntityException(String message, Throwable cause, boolean enableSuppression,
	    boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }

    public DuplicatedEntityException(String message, Throwable cause) {
	super(message, cause);
    }

    public DuplicatedEntityException(String message) {
	super(message);
    }

    public DuplicatedEntityException(Throwable cause) {
	super(cause);
    }

}
