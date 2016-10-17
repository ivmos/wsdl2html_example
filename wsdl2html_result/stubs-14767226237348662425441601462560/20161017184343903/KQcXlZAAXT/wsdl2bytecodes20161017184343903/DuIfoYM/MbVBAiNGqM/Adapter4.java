
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return new Integer(value);
    }

    public String marshal(Integer value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
