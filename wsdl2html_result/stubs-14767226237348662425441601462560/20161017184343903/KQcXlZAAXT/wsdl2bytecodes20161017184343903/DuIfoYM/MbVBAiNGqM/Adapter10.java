
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter10
    extends XmlAdapter<String, Short>
{


    public Short unmarshal(String value) {
        return ((short)javax.xml.bind.DatatypeConverter.parseShort(value));
    }

    public String marshal(Short value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printShort((short)(short)value));
    }

}
