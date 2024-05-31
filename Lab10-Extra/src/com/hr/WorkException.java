package com.hr;

/*
 *This is a more HR-oriented, higher-level exception type than the
 * other low-level transportation oriented DestinationUnreachableException.
 */
public class WorkException extends Exception{
    public WorkException() {//a super class ctor is always called even here whether we write super() or not.
        super();
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }
}
