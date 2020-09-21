package com.crm.rest.crmrestservice.exceptions;

public class WrongQueryException extends RuntimeException {

    public WrongQueryException() {
        super();
    }

    public WrongQueryException(String message) {
        super(message);
    }

    public WrongQueryException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongQueryException(Throwable cause) {
        super(cause);
    }
}
