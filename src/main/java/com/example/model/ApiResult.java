package com.example.model;

import com.example.model.ErrorResult;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public abstract class ApiResult<T> {
    /**
     * Flag which indicates whether response contains an error or result
     */
    @XmlElement( required = true )
    @NotNull
    public boolean success;

    /**
     * Error returned.
     */
    @XmlElement( required = false )
    public ErrorResult error;

    public T getResult() {
        return null;
    }

}
