package com.example.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class ErrorResult {
    /**
     * Error code.
     */
    @XmlElement( required = true )
    @NotNull
    public int code;

    /**
     * Error message. Must be short.
     */
    @XmlElement( required = true )
    @NotNull
    public String message;

    /**
     * Extra info related to the error.
     */
    @XmlElement( required = false)
    public String data;
}
