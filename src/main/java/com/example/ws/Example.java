package com.example.ws;

import com.example.model.Session;
import com.example.model.UserId;
import com.example.model.result.Method1Result;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlElement;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,
        use=SOAPBinding.Use.LITERAL,
        parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface Example {

    @WebMethod
    Method1Result method1(
            @WebParam(name="session") @XmlElement(required = true) Session session,
            @WebParam(name = "userId") @XmlElement(required = true) UserId userId);


}
