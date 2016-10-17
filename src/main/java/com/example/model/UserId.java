package com.example.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class UserId {
    /**
     * Id which identifies uniquely the User
     */
    @XmlElement( required = true )
    @NotNull
    public String id;
}
