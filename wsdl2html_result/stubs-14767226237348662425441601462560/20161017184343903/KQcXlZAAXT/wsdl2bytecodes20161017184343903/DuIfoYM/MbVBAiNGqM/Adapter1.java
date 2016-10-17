
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Float>
{


    public Float unmarshal(String value) {
        return ((float)javax.xml.bind.DatatypeConverter.parseFloat(value));
    }

    public String marshal(Float value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printFloat((float)(float)value));
    }

}
