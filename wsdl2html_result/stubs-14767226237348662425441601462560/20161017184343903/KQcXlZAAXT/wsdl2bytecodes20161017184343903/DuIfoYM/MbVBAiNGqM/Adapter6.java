
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter6
    extends XmlAdapter<String, Byte>
{


    public Byte unmarshal(String value) {
        return ((byte)javax.xml.bind.DatatypeConverter.parseByte(value));
    }

    public String marshal(Byte value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printByte((byte)(byte)value));
    }

}
