package com.data.service.error;

/**
 * Created by juan.delgado on 31/05/2016.
 */
public class CanceledTaskException extends Exception {

    public CanceledTaskException(String msg) {
        super(msg);
    }

    public CanceledTaskException() {
        super();
    }


}
