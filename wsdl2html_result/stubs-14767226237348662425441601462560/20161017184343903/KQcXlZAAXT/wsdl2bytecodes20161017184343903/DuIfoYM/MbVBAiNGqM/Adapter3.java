
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Short>
{


    public Short unmarshal(String value) {
        return new Short(value);
    }

    public String marshal(Short value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
