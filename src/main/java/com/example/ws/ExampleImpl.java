package com.example.ws;

import com.example.model.Session;
import com.example.model.UserId;
import com.example.model.result.Method1Result;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public class ExampleImpl implements Example {
    /*
     * This is a comment example for method1
     */
    @Override
    public Method1Result method1(
            @WebParam(name = "session") @XmlElement(required = true) Session session,
            @WebParam(name = "userId") @XmlElement(required = true) UserId userId) {
            return null;
    }

}
