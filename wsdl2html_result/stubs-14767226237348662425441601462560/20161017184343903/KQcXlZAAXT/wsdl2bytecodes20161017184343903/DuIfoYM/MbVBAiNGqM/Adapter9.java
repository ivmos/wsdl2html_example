
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter9
    extends XmlAdapter<String, Long>
{


    public Long unmarshal(String value) {
        return new Long(value);
    }

    public String marshal(Long value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
