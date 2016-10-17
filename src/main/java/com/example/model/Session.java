package com.example.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class Session {
    /**
     * Session id
     */
    @XmlElement( required = true )
    @NotNull
    public String id;
}
